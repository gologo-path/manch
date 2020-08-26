package Server.UDPwork;


import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.ArrayList;

public class UDPserver {

    private ArrayList<UDPuser> users;
    private DatagramSocket socket;
    private DatagramPacket packet;

    public UDPserver(int port){
        try {
            socket = new DatagramSocket(port);
        } catch (SocketException e) {
            e.printStackTrace();
        }
        users = new ArrayList<UDPuser>();
    }

    public void work(int bufferSize){
        try {
            System.out.println("Server start...");
            while (true){
                getUser(bufferSize);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void getUser(int bufferSize) throws IOException {
        byte[] buffer = new byte[bufferSize];
        packet = new DatagramPacket(buffer,buffer.length);
        socket.receive(packet);

        UDPuser tmp = new UDPuser(packet.getAddress(),packet.getPort());
        if (!users.contains(tmp)) {
            users.add(tmp);
        }else{
            // TODO connection user with player
        }



        clear(buffer);
    }

    private void clear(byte[] buffer){
        for(int i=0;i<buffer.length;i+=1){
            buffer[i]=0;
        }
    }
}
