import java.util.Scanner;

class Booleans {
    public static void main(String[] args) {
        System.out.print("Enter a Boolean (t/f/true/false): ");
        Scanner scan = new Scanner(System.in);
        if(isValidString(scan)) {
            System.out.println("Boolean Success!");
        }
        else {
            System.out.println("Boolean Failure!");
        }
    }
    public static Boolean isValidString(Scanner scan) {
            String s = scan.nextLine().toLowerCase();
            return s.equals("t") || s.equals("f") || s.equals("true") || s.equals("false");
    }
}