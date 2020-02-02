
public class Encrypter {
   public static String number;
   public static int place;
   public static String num;

   public static char[] encrypt (String number) {
       num = "";
       // loop that replaces every number in the string by the new one
       //  that is 7 digits higher & divided by ten
       for (int i = 0; i < 4; i++){
           // add seven then get remainder when dividing by 10
           place = (number.charAt(i) + 9) % 10;
           // adds new number to a new string
           num = num.concat((String.valueOf(place)));
       } 
       // passes new string to have digits swapped
       char ch[] = num.toCharArray();
       int i = 0, j = 2;
       // swaps first and third digits
       char temp = ch[i];
       ch[i] = ch[j];
       ch[j] = temp;
       // swap second and fourth digits
       i = 1; j = 3;
       temp = ch[i];
       ch[i] = ch[j];
       ch[j] = temp;
       System.out.print("Encrypted number: ");
       return (ch);
       }
   }

