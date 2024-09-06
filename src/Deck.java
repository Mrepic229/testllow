import java.util.*;

public class Deck {
    ArrayList<Flashcard> cards;

    public Deck() {
        cards = new ArrayList<Flashcard>();
    }

    public void addFlashCard(Flashcard card) {
        cards.add(card);
    }

    public void displayDeck() {
        for (int i = 0; i<cards.size(); i++) {
            cards.get(i).displayCard();
            System.out.println("");
        }
    }

}
