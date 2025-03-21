package datastructure.stack;

import java.util.ArrayList;

/*같은 숫자는 싫어*/
public class SequentialDistinctArray {
    public int[] solution(int []arr) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                continue;
            }
            list.add(arr[i]);
        }
        int[] array = list.stream().mapToInt(e -> e).toArray();
        return array;
    }
}

