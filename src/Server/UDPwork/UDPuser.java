package Server.UDPwork;

import java.io.Serializable;
import java.net.InetAddress;

public class UDPuser implements Serializable {
    private InetAddress address;
    private int port;

    UDPuser(InetAddress address, int port){
        this.address = address;
        this.port = port;
    }

    @Override
    public String toString() {
        return "address = " + address +
                ", port = " + port;
    }
}
