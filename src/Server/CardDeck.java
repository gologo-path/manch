package Server;

import java.util.Stack;

public abstract class CardDeck {
    protected Stack<Card> deck;

    public CardDeck(){
        deck = new Stack<Card>();
    }

    public Card takeCard(){
        return deck.pop();
    }
}
