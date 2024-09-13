import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Deque<int[]> deque = new ArrayDeque<>();

        int n = scanner.nextInt();

        // 풍선 번호와 해당 풍선에 적힌 값을 쌍으로 저장
        for (int i = 1; i <= n; i++) {
            deque.add(new int[]{i, scanner.nextInt()});
        }

        // 첫 번째 풍선을 터뜨린다
        int[] current = deque.poll();
        System.out.print(current[0] + " ");

        // 덱이 비어있을 때까지 반복
        while (!deque.isEmpty()) {
            int move = current[1];

            // 풍선에 적힌 값이 양수면 오른쪽으로, 음수면 왼쪽으로 이동
            if (move > 0) {
                // 오른쪽으로 이동 (move - 1번 회전)
                for (int i = 0; i < move - 1; i++) {
                    deque.addLast(deque.pollFirst());
                }
            } else {
                // 왼쪽으로 이동 (move의 절댓값만큼 회전)
                for (int i = 0; i < Math.abs(move); i++) {
                    deque.addFirst(deque.pollLast());
                }
            }

            // 다음 풍선을 터뜨림
            current = deque.poll();
            System.out.print(current[0] + " ");
        }
    }
}