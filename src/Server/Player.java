package Server;

import javax.smartcardio.Card;
import java.util.ArrayList;

public class Player {
    private Card [] hand;
    private ArrayList<Card> table;

    Player(Card[] hand){
        this.hand = hand.clone();
        table = new ArrayList<Card>();
    }

}
