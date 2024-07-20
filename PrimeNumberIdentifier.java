import java.util.Scanner;

public class PrimeNumberIdentifier {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    boolean prime = true;

    System.out.println("Please enter a number");
    int num1 = in .nextInt();

    if(num1<2)
    {
        System.out.println("Number must be bigger than 1");
        return;
    }

    for (int i = 2; i < num1; i = i + 1) {
        if (num1 % i == 0) {
            prime = false;
            break;
        }
    }
    if (prime == true) {
        System.out.println("This is prime");

    }
    if (prime == false) {
        System.out.println("This is composite");

    }
}
}