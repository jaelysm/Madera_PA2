
public class Decrypter {
   public static String number;
   public static int place;
   public static String num;
   public static char[] decrypt(String number){
       num = "";
       for (int i = 0; i < 4; i++){
           // subtract 7 and get the remainder when dividing by 10
           place = (number.charAt(i) - 5) % 10;
           // add new number to new string
           num = num.concat((String.valueOf(place)));
       } 
       char ch[] = num.toCharArray();
       int i = 0, j = 2;
       // swap back first and third digits
       char temp = ch[i];
       ch[i] = ch[j];
       ch[j] = temp;
       //swap back second and fourth digits
       i = 1; j = 3;
       temp = ch[i];
       ch[i] = ch[j];
       ch[j] = temp;
       System.out.print("Decrypted number: ");

       return (ch);
   }
}

