import java.util.Scanner;

public class Application {       
   public static void main (String[] args) {
       // Take the int from the user & save in number variable
       String number;
       System.out.print ("Enter the 4-digit number: ");
       Scanner input = new Scanner(System.in);
      
       number = input.next();
      
       System.out.println(Encrypter.encrypt(number));
       System.out.println (Decrypter.decrypt(number));  
   }
}

