import java.util.Scanner;


public class FinalpProjectDraft {
        int money = 10;
        String reportCard = "";
        int eat = 1;
        
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int hunger = 100;
        String[] answers = {"yes", "no", "maybe"};

        
        System.out.println("Welcome to a week at college");
        System.out.print("Please enter your name: ");
        String UserName = input.nextLine();
        System.out.println("Hello " + UserName + ", let's get started with your first week at college");
        MealTime(answers);
        
        String userAnswer = input.nextLine();
        if (userAnswer.equals("yes")) {
            hunger += 30;
        } else {
            hunger -= 30;
        }
        System.out.println(hunger);
        
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
    
    
    
    static void MealTime(String[] texInfo) {
        String[] mealtime = {"breakfast", "lunch", "dinner"};
        System.out.print("What would you like to eat some " + mealtime[0] + "? " );
    }
}
