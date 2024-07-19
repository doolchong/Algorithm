import java.util.Scanner;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();

        for (int i = S.length() - 1; i >= 0; i--) {
            System.out.print(S.charAt(i));
        }

        sc.close();
    }
}