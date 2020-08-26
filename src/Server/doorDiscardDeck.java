package Server;

public class doorDiscardDeck extends doorCardDeck{
    public doorDiscardDeck(){
        super();
    }

    public void putCard(doorCard card){
        deck.push(card);
    }
}
