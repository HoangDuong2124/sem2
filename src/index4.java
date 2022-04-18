import java.util.Scanner;

public class index4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a number:");
            int number = input.nextInt();
            if (number % 3 == 0) {
                System.out.println("Inside Outer If Block");
                if (number % 5 == 0) {
                    System.out.println("Number is divisible by 3 and 5");
                } else {
                    System.out.println("Number is divisible by 3 ,but not by 5");
                }
            } else {
                System.out.println("Number is not divisible by 3");
            }
        }
    }

}
