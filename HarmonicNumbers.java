import java.util.Scanner;

public class HarmonicNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number:  ");
        int no = input.nextInt();
        double result = 0.0;

        for (int i = 1; i <= no; i++){
            result += (1.0/i);
        }
        System.out.println(result);
    }
}
