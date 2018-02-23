import java.util.Scanner;

public class Calculator{
    public static int mode = -1;
    public static double loanAmt = -1;
    public static int loanTerm = -1;
    public static double interestRate = -1;

    public static void main(String[] args) {
        //Read in the loan calculation mode
        Scanner scan;
        while(true) { //Loop the mode selection menu until a valid input is provided
            scan = new Scanner(System.in);
            printModeStatement(); //Call a function to print our mode selection statement
            if(scan.hasNextInt()) { //Check if input provided is a valid integer
                mode = scan.nextInt();
                if(0 < mode && mode < 4) { //Check if input provided is 1, 2, or 3
                    break; //Valid input has been provided. Break out of the while loop
                }
            }
            //If it reaches here, the input was invalid. Loop again.
        }
        System.out.println("You selected mode " + mode);

        while(true) { 
            System.out.print("Original Loan Amount: $"); 
            scan = new Scanner(System.in); 
            if(scan.hasNextInt()) {
                loanAmt = scan.nextInt();  
                    if(loanAmt > 0){
                     break;
                    }
            }   
        }
                
        while(true) { 
            System.out.print("Loan Term (years): ");
            scan = new Scanner(System.in); 
            if(scan.hasNextInt()) {
                loanTerm = scan.nextInt(); 
                    if(loanTerm > 0){
                        break;
                    }  
            }     
        }
       
        while(true) { 
            System.out.print("Interest Rate(%): "); 
            scan = new Scanner(System.in); 
            if(scan.hasNextDouble()) {
                interestRate = scan.nextDouble()/100;
                if(interestRate > 0 && interestRate < 100) {
                     break; 
                } 
            }     
        }  
        
        if(mode == 1) {
            flatInterest();
        }
        else if(mode == 2) {
            compoundingNoPayments();
        }
        else if(mode == 3) {
            compoundingWithPayments();
        }

    }
    
    public static void printModeStatement() {
        System.out.print(
            "Select an interest calculation mode:\n"
            + "(1) Flat Interest\n"
            + "(2) Compounding Interest Without Monthly Payments\n"
            + "(3) Compounding Interest With Monthly Payments\n"
        );
    }


    public static void flatInterest() {
        System.out.print("Interest over term: $");
        double interest = (loanAmt * loanTerm * interestRate);
        System.out.println(interest);
        
        System.out.print("Total cost of loan: $");
        double loanTotal = (loanAmt + interest);
        System.out.println(loanTotal);
        
    }     

    public static void compoundingNoPayments(){
        int monthsRemaining = (loanTerm * 12);
        double loanTotal = loanAmt;
        while(monthsRemaining > 0){
            double interest = (loanAmt * (interestRate / 12));
            loanTotal += interest; 
            monthsRemaining--;
        }

        double interest = (loanTotal - loanAmt);
        System.out.print("Interest over term: $");
        System.out.println(interest);
    
        System.out.print("Total cost of loan: $");
        System.out.println(loanTotal);
    }

    public static void compoundingWithPayments(){
        int monthsRemaining = (loanTerm * 12);
        double loanTotal = loanAmt;
        double ratePerMonth = (interestRate /12);
        double monthlyPayment = (1 + loanAmt * (ratePerMonth / (1 - Math.pow((1 + ratePerMonth), (loanTerm * -12)))));
        while(monthsRemaining > 0){
            double interest = (loanAmt * (interestRate / 12));
            loanTotal += interest; 
            monthsRemaining--;
        }    
        
        System.out.print("Interest over term: $");
        double interest = (loanAmt * (interestRate / 12));
        System.out.println(interest);
    
        System.out.print("Total cost of loan: $");
        double total = (loanAmt + interest);
        System.out.println(total);
        
    }
}