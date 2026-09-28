package Part2;
/**
 * Pseudocode
 * Main block:
 * 1. Welcome user.
 * 2. Run recommendation program.
 * * Recommendation block:
 *  1. Ask for name.
 *   2. Ask for age.
 *   3. If age <= 10, recommend educational cartoons.
 *   4. Otherwise ask for favourite genre.
 *   5. If genre is comedy, recommend TED.
 *   6. If age <= 18, recommend a movie for teenagers.
 *   7. If age > 18, recommend a movie for adults.
 * 3. Ask if user wants to continue.
 * 4. If input == "Y", repeat.
 * 5. Say goodbye.

 */
import java.util.Scanner;

public class part2 {


    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //  Main block

        printText("Hello!");

        do {
            recommendations();
        } while (askContinue());

        printText("Thank you for conversation!");

        scanner.close();
    }
    // Own print method

    public static void printText(String message) {

        System.out.println(message);
    }
    // Y/N dialog

    public static boolean askContinue() {

        System.out.print("Do you want to continue? (Y/N): ");

        String answer = scanner.nextLine();

        return answer.equalsIgnoreCase("Y");
    }
    //  Main recommendation method

    public static void recommendations() {

        String name = askName();

        int age = askAge();

        if (age <= 10) {

            recommendforchildren();

        } else {

            String genre = askGenre();

            printText("Thank you " + name);

            makeRecommendation(age, genre);
        }
    }


    // Ask for name name

    public static String askName() {

        System.out.print("What is your name? ");

        return scanner.nextLine();
    }


    // Ask for age

    public static int askAge() {

        System.out.print("How old are you? ");

        while (true) {

            String input = scanner.nextLine();

            try {

                return Integer.parseInt(input);

            } catch (NumberFormatException e) {

                printText("Please enter a valid age.");
                System.out.print("How old are you? ");
            }
        }
    }


    // Ask for favourite genre

    public static String askGenre() {

        System.out.print("What is your favourite movie genre? ");

        return scanner.nextLine();
    }


    // Recommendation for children

    public static void recommendforchildren() {

        printText("I recommend you to watch some educational cartoons");
    }


    // Choose recommendation
    public static void makeRecommendation(int age, String genre) {

        if (genre.equalsIgnoreCase("comedy")) {

            printText("I recommend you to watch TED");

        } else if (age <= 18) {

            recommendforteenager(genre);

        } else {

            recommendforadult(genre);
        }
    }


    // Recommendations for teenagers

    public static void recommendforteenager(String genre) {

        switch (genre.toLowerCase()) {

            case "detective":
                printText("I recommend Sherlock");
                break;

            case "action":
                printText("I recommend Marvel");
                break;

            case "fantasy":
                printText("I recommend Harry Potter");
                break;

            case "historical":
                printText("I recommend Troy");
                break;

            default:
                printText(
                        "I don't have a recommendation for this genre."
                );
        }
    }


    // Recommendations for adults

    public static void recommendforadult(String genre) {

        switch (genre.toLowerCase()) {

            case "detective":
                printText("I recommend Se7en");
                break;

            case "action":
                printText("I recommend Gladiator");
                break;

            case "fantasy":
                printText("I recommend The Lord of the Rings");
                break;

            case "historical":
                printText("I recommend Schindler's List");
                break;

            default:
                printText(
                        "I don't have a recommendation for this genre."
                );
        }
    }
}
