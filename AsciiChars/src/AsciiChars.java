
import java.util.Scanner;
//  importing java util here...

public class AsciiChars {

    // Here we have the 3 Ascii Methods.....
    public static void printNumbers() {
        for (int i = 0; i < 10; i++) {
            int asciiNum = i + 48;
            System.out.println("Valid Numberic Input:" + asciiNum);
        }

    }

    public static void printLowerCase() {
        for (char letters = 'a'; letters <= 'z'; letters++) {
            int alphabet = letters;
            System.out.println("Valid Lowercase Alphabetic Input:" + alphabet);
        }
    }

    public static void printUpperCase() {
        for (char alphabet = 'A'; alphabet <= 'Z'; alphabet++) {
            int alphabetCaps = alphabet;
            System.out.println("Valid Uppercase Alphabetic Values" + alphabetCaps);
        }
    }

    // Questions for user with lottery (not numerical associated questions), here I
    // have an array with questions inside. I used a for loop to iterrate the
    // questions to the user.
    public static void questions() {
        String[] questions = { "Do you have a red car?", "What is the name of your favorite pet?",
                "What is your lucky number?", "Do you have a favorite quarterback? + If so, what is your jersey number",
                "What is the two digit model year of your car",
                "What is the first name of their favorite actor or actress?",
                "Enter a random number between 1 and 50" };

        for (int i = 0; i < questions.length; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.println(questions[i]);
            String userAnswer = scan.nextLine();
            System.out.println(userAnswer);
        }

    }

    public static void main(String[] args) {

        // Calling the ACSII Methods Here
        printNumbers();
        printLowerCase();
        printUpperCase();

        // creating scanner here
        Scanner scan = new Scanner(System.in);

        // Asking for user's name and input/prompt
        System.out.println("Please enter your name:");
        String name = scan.nextLine();
        System.out.println("Hello " + name);
        System.out.println("Would you like to continue to the interactive portion? Y for yes and N for no.");

        String response = scan.nextLine();
        if (response.equals("n") || response.equals("N")) {
            System.out.println("Please return later to complete the survey.");
            return;
        } else if (response.equals("y") || response.equals("Y")) {
            System.out.println(
                    "If you don't mind, we would like to ask your some questions. Those answers could lead to potential winning Powerball numbers");
            questions();
        } else {
            System.out.println("Do not recognize input. Thank you for your participation");
            return;
        }

    }
}
