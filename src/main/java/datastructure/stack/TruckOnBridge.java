package datastructure.stack;

import java.util.LinkedList;
import java.util.Queue;

public class TruckOnBridge {
    public static void main(String[] args) {
        new TruckOnBridge().solution(2, 10, new int[]{7, 4, 5, 6});

    }

    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> q = new LinkedList<>();
        int time = 0;
        int available = weight;
        for(int i = 0; i< truck_weights.length; i++){
            while(true) {
                if(q.isEmpty()){
                    q.offer(truck_weights[i]);
                    time++;
                    available -= truck_weights[i];
                    break;
                }
                else {
                    if(bridge_length <= q.size()) {
                        available += q.poll(); // 다리 위 맨 앞 트럭을 빼고, 그 무게만큼 이용가능무게에 추가한다.
                    }
                    if(available < truck_weights[i]) { // 이용가능 무게가 올라갈 트럭무게보다 작을 때.
                        q.offer(0);
                        time++;
                    } else {
                        q.offer(truck_weights[i]);
                        available -= truck_weights[i];
                        time++;
                        break;
                    }
                }
            }
        }
        time += bridge_length;
        return time;
    }
}
