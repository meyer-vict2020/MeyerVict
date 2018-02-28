import java.util.Scanner;

class Loops{
    public static void main(String[] args){
        //Loops Exercise 1
            //question #1
        int n = 0;
        while(n < 100) {
            System.out.println(n);
            n += 5;
        }

        int n = 19;
        while(n % 2 == 0) {
            System.out.println(n);
            n--;        
        }
        
        int n = 1;
        while(n < 100) {
            System.out.println(n);
            n += n;        
        }
        
        Boolean shouldLoop = true;
        int n = 0;
        while(shouldLoop) {
            if(n == 20) {
                shouldLoop = false;
            }
            System.out.println(n);
            n++;
        }
        
        int n = 0;
        while(true) {
            System.out.println("Hello World");
            n++;
            if(n == 10){
                break;
            }
        }

            //question #2
        int n = 1;
        while(n < 10) {
            System.out.println(n);
            n++;
        }

        Boolean shouldLoop = true;
        int n = 1;
        while(shouldLoop) {
            if(n == 100) {
                System.out.println("100 loop passes occured."); 
                break;  
            }
            n++;
        }

            //question #3
        int n= 100;
        while(n <= 100 && n >=-100){
            System.out.println(n);
            n--;
        }

        int n = 3;
        while(n <= 120){
            System.out.println(n);
            n += 3;
        }

        char alpha = 'a';
        int n = 0;
        while(n < 26){
            System.out.print(alpha + ", ");
            alpha++;
            n++;
        }

        // Loops Exercise 2
            //question #1
        for(int i = 0; i <= 100; i += 2) {
            System.out.println(i);
        }

        for(int i = 0; i <= 100; i += 3) {
            if(i % 2 == 0) {
                System.out.println(i + " is an even number");
            }
            else {
                System.out.println(i + " is an odd number");            
            }
        }

        for(int i = 1; i < 1000; i += i) {
            System.out.println(i);
        }

        for(int i = 100; i > 0; i--) {
            System.out.println(i);
        }

            // question #2
        for(int i = 0; i < 100; i++) {
            System.out.println(i);
        }

        for(int i = 1; i < 20; i *= 2) {
            System.out.println(i);
        }

            // question #3
        for(int i = 0; i < 100; i +=3){
            System.out.println(i);
        }

        for(int i = 1; i < 1025; i *= 2){
            System.out.println(i);
        }

            question #4
        

        for(int i = 0; i < 3; i++){
            System.out.print("Enter an integer: ");
            Scanner scan = new Scanner(System.in);
            if(isValidInt(scan)) {
                System.out.println("Success!");
            }
            else {
                System.out.println("You Fail!");
            }
        }
    } 
}