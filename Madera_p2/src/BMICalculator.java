import java.util.Scanner;

public class BMICalculator {

    public static int choice;
    public static int weight;
    public static int height;
    public static float BMI;
    public static Scanner input = new Scanner (System.in);
    
    
    private void readUnitType(){
        //Scanner input = new Scanner(System.in);
        // keeps looping while the input is invalid
        while (choice != 1 && choice !=2 ){
            System.out.println ("Please choose an option");
            System.out.println("1- Pounds / Inches \n2- Kilos / Meters");   
            choice = input.nextInt();
        }
    }
    
    private void readMeasurementData() {
        // uses read metric data or read imperial data
        if (choice == 1){
            readImperialData();
        }        
        if (choice == 2){
            readMetricData();
        }
    }
    private void readMetricData(){
        System.out.print("Enter weight in kilometers: ");
        
        getWeight();
        System.out.print("Enter height in meters: ");
        
        getHeight();
    }
    
    private void readImperialData() {
        System.out.print("Enter weight in pounds: ");
        getWeight();
        System.out.print("Enter height in inches: ");
        getHeight();
    }
    
    private void getWeight(){
        // reads user's weight
        weight = input.nextInt();
        if (weight < 0){
            //negative weight is invalid
            System.out.println("Invalid input");
            System.exit(choice);
        }
    }
    
    private void getHeight(){
        // read user's height
        height = input.nextInt();
        if (height < 0){
            //negative height is invalid
            System.out.println("Invalid input");
            System.exit(choice);          
        }
    }
    
    public void readUserData(){
        choice = 0;
        
        readUnitType();
        readMeasurementData();       
    }
     
    public void calculateBmi(){
        BMI = 0;
        
        if (choice == 1){
            // Imperial system choice
            BMI = (703 * weight) / (height * height);
        }
        else if (choice == 2){
            // Metric system choice
            BMI = (float)(weight) / (float)(height * height);
        }       
    }
    
    public void displayBmi(){
        System.out.printf("Your BMI is: %.1f \n\n", BMI );
        System.out.println("Underweight = <18.5");
        System.out.println("Normal weight = 18.5 - 24.9");
        System.out.println("Overweight = 25 - 29.9");
        System.out.println("Obesity = 30<\n");
        calculateBMICategory();
    }
    
    private static void calculateBMICategory(){
        System.out.print ("You are: ");
        if (BMI < 18.5)
            System.out.println("Underweight");
        else if ((BMI >= 18.5) && (BMI <= 24.9))
            System.out.println ("Normal weight");
        else if (BMI >= 25 && BMI <= 29.9)
            System.out.println ("Overweight");
        else if (BMI > 30)
            System.out.println ("Obese");
    }
    
    public static void main (String[] args){
        BMICalculator app = new BMICalculator();
        app.readUserData();
        app.calculateBmi();
        app.displayBmi();
    }
    
}
