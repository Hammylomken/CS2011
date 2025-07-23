import java.util.Scanner;


public class FinalpProjectDraft {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        int money = 0;
        int hunger = 0;
        int reputation = 0;
        int day = 0;
        String reportCard = "";

        System.out.println("Welcome to a week at college");
        System.out.println(quizScore(Quiztype));
        //while (day < 5) {
        //}
    }

        static int getNumInRange(int min, int max) {
        return (int)(min + Math.random() * (max - min + 1));
        }
    public static void quizScore(int score) {
        int Quiztype = getNumInRange(1, 4);
        if (Quiztype == 1) {
            System.out.println("What class is this project for?");
        } else if (Quiztype == 2) {
            System.out.println("Do you like this class?");
        } else if (Quiztype == 3) {
            System.out.println("Is this True or False?");
        } else {
            System.out.println("no quiz today");
        }
    }
}
