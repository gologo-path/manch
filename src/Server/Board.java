package Server;

import javax.swing.*;
import java.awt.*;

public class Board extends JFrame{
    private JPanel mainPanel;
    private JPanel northPlayer;
    private JPanel eastPlayer;
    private JPanel currentPlayer;
    private JPanel westPlayer;
    private JPanel desktop;
    private JPanel hand;
    private JPanel table;

    public Board(){
        super("Gameme");
        setSize(900,600);
        mainPanel = new JPanel(new BorderLayout());
        northPlayer = new JPanel(new FlowLayout());
        eastPlayer = new JPanel(new FlowLayout());
        currentPlayer = new JPanel(new BorderLayout());
        westPlayer = new JPanel(new FlowLayout());
        desktop = new JPanel(new FlowLayout());
        hand = new JPanel(new FlowLayout());
        table = new JPanel(new FlowLayout());

        currentPlayer.add(hand);
        currentPlayer.add(table);
        mainPanel.add(northPlayer);
        mainPanel.add(eastPlayer);
        mainPanel.add(currentPlayer);
        mainPanel.add(westPlayer);
        mainPanel.add(desktop);
        add(mainPanel);

        setVisible(true);
    }

    private void changePanel(){
        // TODO repainting panel when player moves
    }

    public static void main(String[] args) {
        new Board();
    }
}
