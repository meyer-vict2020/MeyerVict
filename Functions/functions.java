import java.util.Scanner;

class Functions {
    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        Scanner scan = new Scanner(System.in);
        if(isValidString(scan)) {
            System.out.println("String Success!");
        }
        else {
            System.out.println("String Failure!");
        }
    }
    public static Boolean isValidString(Scanner scan) {
        try {
            String s = scan.nextLine();
        }
        catch(Exception e) {
            return false; //An error was raised. The user input could not be read as a String.
        }
        return true; //No error was raised. The scanner read it successfully as a String.
     }

}


class Functions {
    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        Scanner scan = new Scanner(System.in);
        if(isValidInt(scan)) {
            System.out.println("Integer Success!");
        }
        else {
            System.out.println("Integer Failure!");
        }
    }
    
    public static Boolean isValidInt(Scanner scan) {
        try {
            Integer s = scan.nextInt();
        }
        catch(Exception e) {
            return false; //An error was raised. The user input could not be read as a String.
        }
        return true; //No error was raised. The scanner read it successfully as a String.
     }
}

class Functions {
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


class Functions {
    public static void main(String[] args) {
        System.out.print("Enter a double: ");
        Scanner scan = new Scanner(System.in);
        if(isValidDouble(scan)) {
            System.out.println("Double Success!");
        }
        else {
            System.out.println("Double Failure!");
        }
    }
    public static Boolean isValidDouble(Scanner scan) {
        try {
            Double s = scan.nextDouble();
        }
        catch(Exception e) {
            return false; //An error was raised. The user input could not be read as a String.
        }
        return true; //No error was raised. The scanner read it successfully as a String.
     }

}