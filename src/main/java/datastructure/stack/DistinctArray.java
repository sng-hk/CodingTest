package datastructure.stack;

import java.util.*;

public class DistinctArray {
    public static void main(String[] args) {
        DistinctArray distinctArray = new DistinctArray();
        distinctArray.solution(new int[]{5, 2, 3, 0, 2, 1, 1, 2, 2});
        distinctArray.solutionStream(new int[]{5, 2, 3, 0, 2, 1, 1, 2, 2});
    }
    public int[] solution(int []arr) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int[] array = set.stream().mapToInt(Integer::intValue).toArray();
        Arrays.stream(array).forEach(e -> System.out.print(e + " "));
        return array;
    }

    public int[] solutionStream(int []arr) {
        int[] answer = Arrays.stream(arr).distinct().toArray();
        Arrays.stream(answer).forEach(e -> System.out.print(e + " "));
        System.out.println("\n");
        return answer;
    }
}


