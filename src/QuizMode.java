public class QuizMode {

    public static void enter() {
        Deck chapter1 = new Deck();
        chapter1.addFlashCard(new Flashcard("John Smith", "Helped enforce work in Jamestown"));
        chapter1.addFlashCard(new Flashcard("New Netherlands", "Middle colony settled by Dutch"));

        chapter1.displayDeck();

        for (int i = 0; i < chapter1.cards.size(); i++) {
            chapter1.cards.get(i).quizCard();
        }
    }



}
