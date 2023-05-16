package az.coders.project.lesson7.Algorithm;

public class Task4
 {


  public static void main(String[] args) {
   System.out.println(decimalToBinary(65));
  }

  public static String decimalToBinary(int decimal) {
   StringBuilder binary = new StringBuilder();
   while (decimal > 0) {
    int remainder = decimal % 2;
    binary.insert(0, remainder);
    decimal = decimal / 2;
   }
   return binary.toString();
  }
}
