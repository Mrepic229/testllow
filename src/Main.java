import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            int modeNumber = pickMode();

            if (modeNumber == 0) {
                break;
            } else if (modeNumber == 1) {
                new QuizMode().enter();
            }

        }

    }


    static int pickMode() {
        System.out.println("pick a mode");
        System.out.println("1) quiz a deck");
        System.out.println("0) exit program");
        Scanner modePicker = new Scanner(System.in);
        return modePicker.nextInt();
    }

}