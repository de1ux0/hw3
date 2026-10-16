import java.util.Objects;
import java.util.Scanner;

public class prac09_1 {
    public static void main(String[] args) {

        Scanner atm = new Scanner(System.in);

        String password = "5577";
        for (int i = 2; i >= 0; i--) {
            System.out.print("Enter PIN: ");
            String pin = atm.nextLine();

            if (Objects.equals(pin, password)) {
                System.out.println("Access Granted!");
                break;
            } else
                System.out.println("Incorrect PIN.\nAttempts left: " + i);
            if (i == 0)
                System.out.println("Card blocked.");
        }
    }
}

