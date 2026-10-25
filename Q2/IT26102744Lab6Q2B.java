import java.util.Scanner;

public class IT26102744Lab6Q2B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 1;

        System.out.println("Please enter 10 numbers:");
        
        String result = "";

        while (i <= 10) {
            System.out.print("Enter number " + i + ": ");
            int num = scanner.nextInt();
            result = result + num + " ";
            i++;
        }

        System.out.println();
        System.out.println("The numbers you entered are:");
        System.out.println(result);

        scanner.close();
    }
}