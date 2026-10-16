import java.util.Scanner;

public class prac07_3 {
    public static void main(String[] args) {
        Scanner lab = new Scanner(System.in);
        System.out.print("n = ");
        int n = lab.nextInt();

        if (n > 0) {
            for (int number = 1; number <= n; number++)
                System.out.println(number);
        } else if (n < 0) {
            for (int number = -1; number >= n; number--)
                System.out.println(number);
        } else if (n == 0) {
            System.out.println("0");
        }
    }
}

