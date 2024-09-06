import java.util.Scanner;

public class Flashcard {
    String front;
    String back;


    public Flashcard(){
        front = "";
        back = "";
    }

    public Flashcard(String f, String b) {
        front = f;
        back = b;
    }

    public void displayCard() {
        System.out.println("Front: " + front);
        System.out.println("Back: " + back);
    }

    public void quizCard() {
        System.out.println("Define: "+ front);
        Scanner myScanner = new Scanner(System.in);
        System.out.print("  Press enter to see answer");
        String _useless = myScanner.nextLine();
        System.out.println(back);
        System.out.println("");

    }



}
