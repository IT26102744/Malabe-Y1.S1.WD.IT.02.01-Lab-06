import java.util.Scanner;

public class IT26102744Lab6Q2C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 1;

        System.out.println("Please enter 10 numbers:");
        
        String result = "";
        int sum = 0;

        while (i <= 10) {
            System.out.print("Enter number " + i + ": ");
            int num = scanner.nextInt();
            result = result + num + " ";
            sum = sum + num;
            i++;
        }

        double average = sum / 10.0;

        System.out.println();
        System.out.println("The numbers you entered are:");
        System.out.println(result);
        System.out.println("Sum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);

        scanner.close();
    }
}