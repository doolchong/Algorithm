import java.util.Scanner;

public class Main {

    static int[] pwArr;
    static int[] myArr;
    static int checkSecret;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int s = scanner.nextInt();
        int p = scanner.nextInt();
        int cnt = 0;
        String str = scanner.next();
        pwArr = new int[4];
        myArr = new int[4];
        checkSecret = 0;

        for (int i = 0; i < 4; i++) {
            myArr[i] = 0;
        }

        for (int i = 0; i < 4; i++) {
            pwArr[i] = scanner.nextInt();
            if (myArr[i] == pwArr[i]) {
                checkSecret++;
            }
        }

        for (int i = 0; i < p; i++) {
            Add(str.charAt(i));
        }

        if (checkSecret == 4) {
            cnt++;
        }

        for (int i = p; i < s; i++) {
            int j = i - p;

            Add(str.charAt(i));

            switch (str.charAt(j)) {
                case 'A':
                    if (myArr[0] == pwArr[0]) {
                        checkSecret--;
                    }
                    myArr[0]--;
                    break;
                case 'C':
                    if (myArr[1] == pwArr[1]) {
                        checkSecret--;
                    }
                    myArr[1]--;
                    break;
                case 'G':
                    if (myArr[2] == pwArr[2]) {
                        checkSecret--;
                    }
                    myArr[2]--;
                    break;
                case 'T':
                    if (myArr[3] == pwArr[3]) {
                        checkSecret--;
                    }
                    myArr[3]--;
                    break;
            }

            if (checkSecret == 4) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }

    private static void Add(char c) {
        switch (c) {
            case 'A':
                myArr[0]++;
                if (myArr[0] == pwArr[0]) {
                    checkSecret++;
                }
                break;
            case 'C':
                myArr[1]++;
                if (myArr[1] == pwArr[1]) {
                    checkSecret++;
                }
                break;
            case 'G':
                myArr[2]++;
                if (myArr[2] == pwArr[2]) {
                    checkSecret++;
                }
                break;
            case 'T':
                myArr[3]++;
                if (myArr[3] == pwArr[3]) {
                    checkSecret++;
                }
                break;
        }
    }
}