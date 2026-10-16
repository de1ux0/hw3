import java.util.Scanner;

public class prac07_6 {
    public static void main(String[] args) {

        Scanner even = new Scanner(System.in);

        System.out.print("Input the value: ");
        int n = even.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }
}
