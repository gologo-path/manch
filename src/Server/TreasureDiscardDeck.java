package Server;

public class TreasureDiscardDeck extends TreasureCardDeck {

    public TreasureDiscardDeck(){
        super();
    }

    public void putCard(TreasureCard card){
        deck.push(card);
    }
}
