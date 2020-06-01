import java.util.Scanner;

public class Colors {

    public static String getFirstLetterOfColor() {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            String letter = scanner.nextLine().trim();
            if (letter.length() == 1) {
                return letter;
            }
            System.out.println("It's not correct. Try again.");
        }
    }
    public static String getUserSelection() {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Select first letter of color (W-white, B-black, R-red, Y-yellow):");
            String letter = scanner.nextLine().trim().toUpperCase();
            switch (letter) {
                case "W" :
                    System.out.println("Your color is white.");
                    break;
                case "B" :
                    System.out.println("Your color is black.");
                    break;
                case "R" :
                    System.out.println("Your color is red.");
                    break;
                case "Y" :
                    System.out.println("Your color is yellow.");
                    break;
                default:
                    System.out.println("Wrong letter, try again.");
            }
        }
    }
}
