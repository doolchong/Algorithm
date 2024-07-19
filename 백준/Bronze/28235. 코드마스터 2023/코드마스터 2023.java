import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String S = scanner.next();

        if (S.equals("SONGDO")) {
            System.out.println("HIGHSCHOOL");
        } else if (S.equals("CODE")) {
            System.out.println("MASTER");
        } else if (S.equals("2023")) {
            System.out.println("0611");
        } else if (S.equals("ALGORITHM")) {
            System.out.println("CONTEST");
        }
    }
}
