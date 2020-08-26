package Server;

import java.util.Stack;

public abstract class cardDeck {
    protected Stack<Card> deck;

    public cardDeck(){
        deck = new Stack<Card>();
    }

    public Card takeCard(){
        return deck.pop();
    }
}
