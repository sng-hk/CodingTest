import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Process {
    public static void main(String[] args) {
        new Process().solution(new int[]{2,1,3,2}, 2);
    }

    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < priorities.length; i++) {
            queue.offer(priorities[i]);
        }

        while (!queue.isEmpty()) {
            for (int i = 0; i <= priorities.length; i++) {
                if(queue.peek() == priorities[i]) {
                    queue.poll();
                    answer++;
                    if(i==location) {
                        return answer;
                    }
                }
            }
        }
        return answer;
    }
}