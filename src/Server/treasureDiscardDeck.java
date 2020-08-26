package Server;

public class treasureDiscardDeck extends treasureCardDeck{

    public treasureDiscardDeck(){
        super();
    }

    public void putCard(treasureCard card){
        deck.push(card);
    }
}
