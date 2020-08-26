package Server;

public class DoorDiscardDeck extends DoorCardDeck {
    public DoorDiscardDeck(){
        super();
    }

    public void putCard(DoorCard card){
        deck.push(card);
    }
}
