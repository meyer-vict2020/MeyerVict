class Operators {
    public static void main(String args[]) {
    
    String firstName = "Victoriah"; 
    String lastName = "Meyer";
    String fullName = (firstName + " "+ lastName);
 System.out.println(firstName);
 System.out.println("firstName");
 System.out.println(lastName);
 System.out.println("lastName");
 System.out.println(fullName);
 System.out.println("fullName");
 
 //Replace the -1's with values relevant to yourself
 int currentYear = 2018;
 int yearsUntilGraduation = 2;
 int myGradYear = currentYear + yearsUntilGraduation;

 System.out.println(myGradYear);
 System.out.println("myGradYear");
  
//Replace the -1's with values relevant to yourself
    int currentAge = 15;
    int nextAge = currentAge + 1;
    System.out.println(currentAge);
    System.out.println(nextAge);

    int halfCurrentAge = currentAge / 2;
    int halfNextAge = nextAge / 2;
    System.out.println(halfCurrentAge);
    System.out.println(halfNextAge);

 //"Modulo" is the name of the '%' operator.
    int moduloCurrentAge = currentAge % 2;
    int moduloNextAge = nextAge % 2;
    System.out.println(moduloCurrentAge);
    System.out.println(moduloNextAge);
   
   
    double bitcoinsOwned = .000001;
    double bcsCoinsOwned = 2;

    double bitcoinValue = 10000;
    double bcsCoinValue = 0;

    double bitcoinsWorth = bitcoinsOwned * bitcoinValue;
    double bcsCoinsWorth = bcsCoinsOwned * bcsCoinValue;
    System.out.println("My current bitcoins are worth $" + bitcoinsWorth);
    System.out.println("My current BCSCoins are worth $" + bcsCoinsWorth);


    double reward = 5;
    double amtToRedeem = 25;
    bcsCoinValue = reward / amtToRedeem; //Reassign bcsCoinValue to the potential
    System.out.println("One BCSCoin might be worth $" + bcsCoinValue + " later. If so...");

    bcsCoinsWorth = bcsCoinsOwned * bcsCoinValue;
    System.out.println("My current BCSCoins could eventually be worth $" + bcsCoinsWorth);  

    Boolean haveJob = false;
    Boolean lookingForWork = true;
    Boolean canProgram = false;
    int currentSavings = 20;
    //There are some print statements below. Can you guess which ones will print?
    if(!haveJob) {
        if(lookingForWork && canProgram) {
            System.out.println("Your chances as getting a job go up!");
        }
        else {
            System.out.println("You might need to gain more skills before you can get a job.");
        }
    }
    if(currentSavings < 500) {
        System.out.println("You should be saving more money.");
    }
    else {
        System.out.println("Do you need to save more money, still?");
    }

 int targetSavingsGoal = 500;
 int savingsPerMonth = 15;
 int reachYourGoal = targetSavingsGoal / savingsPerMonth;
 System.out.println(reachYourGoal + " Months");

 
  String sp = " ";
    String noun1 = "I";
    String noun2 = "school";
    String noun3 = "food";
    String noun4 = "piano";
    String adj1 = "awsome";
    String adj2 = "boring";
    String adj3 = "fun";
    String vb1 = "eating";
    String vb2 = "walk";
    String vb3 = "am";
    String vb4 = "play";
    String prep1 = "to";
    String prep2 = "around";
    String prep3 = "over";
    String others1 = "also";
    String others2 = "don't";
    String article2 = "the";

    String sent1 = noun1 + sp + others2 + sp + vb2 + sp + prep1 + sp + noun2;
    String sent2 = noun1 + sp + "like" + sp + vb1 + sp + noun3;
    String sent3 = noun1 + sp + others1 + sp + vb4 + sp + article2 + sp + noun4;

    System.out.println(sent1);
    System.out.println(sent2);
    System.out.println(sent3);


 Boolean hasMoney = false;
 Boolean hasJob = false; 
 Boolean lookingForJob = true;

 if(!hasJob) {
    if(!hasMoney && lookingForJob){
        System.out.println("You better find a job soon!");
    }
    else if(hasMoney){
        System.out.println("I guess you'll be fine for a while");
    }
}
else{
    System.out.println("You're good for now!");
}
  

    }
}

