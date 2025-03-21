import java.util.*;

public class Main {

//    public String solution(String str) {
//        String answer = "";
//        Stack<Character> stack = new Stack();
//
//        for (int i = 0; i < str.length(); i++) {
//            stack.add(str.charAt(i));
//            if (str.charAt(i) == ')') {
//                while (true) {
//                    if (stack.pop() == '(') {
//                        break;
//                    }
//                }
//            }
//        }
//
//        for (char c : stack) {
//            answer += c;
//        }
//
//        return answer;
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet set = new HashSet();
        boolean check = false;

        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            String[] str = scanner.nextLine().split(" ");

            if (str[0].equals("ChongChong")) {
                check = true;
                set.add(str[1]);
            }
            if (str[1].equals("ChongChong")) {
                check = true;
                set.add(str[0]);
            }
            if (check) {
                if (set.contains(str[0])) {
                    set.add(str[1]);
                }
                if (set.contains(str[1])) {
                    set.add(str[0]);
                }
            }
        }

        System.out.print(set.size());
    }
}