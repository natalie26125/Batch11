package primitives;

public class RemmainderPractice1 {
public static void main(String[]  args) {
// modulus--> % --> remainder (left over after division)
    int number1 = 45;
    int number2 =6;
int remainder1 = number1 % number2;
    System.out.println("Remainder1 is>>" + remainder1);
// Find the sum of digits from given number
 // 123--> 1 + 2 + 3 +6==> sout(sum is >> <sum>)

   int myNumber = 123;
  int digit3 = myNumber % 10;
  myNumber = myNumber / 10;
  int diit2 = myNumber % 10;
  myNumber = myNumber /10;
  int digit1 = myNumber % 10;
    System.out.println("digit1");
    System.out.println("digit2");
    System.out.println("digit3");



}
}
