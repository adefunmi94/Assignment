import  java.util.Scanner;

public class Resversing {

public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    String str = in.nextLine();
    String rev = "";
    for(int s= str.length() -1; s >=0; s--) {
     rev = rev + str .charAt(s);
    }
    System.out.print("reverse String is:"+ rev);
    in.close();
  }

}