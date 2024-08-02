import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Stack<Integer> stack = new Stack<>();
        ArrayList<String> arrayList = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int cnt = 0;

        int n = Integer.parseInt(st.nextToken());
        long m = Long.parseLong(st.nextToken());

        for (int i = 0; i < n; i++) {
            stack.add(Integer.parseInt(br.readLine()));
        }

        for (int i = 0; i < n; i++) {
            int a = stack.pop();

            cnt += (m / a);
            m %= a;
        }

        System.out.println(cnt);
    }
}