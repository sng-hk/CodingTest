package datastructure.stack;

import java.util.*;

/*기능 개발*/
public class FunctionImpl {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] solution1 = solution.solution(new int[]{93, 30, 55}, new int[]{1, 30, 5});
        Arrays.stream(solution1).forEach(e -> System.out.print(e + " "));
        System.out.println("\n");

        int[] solution2 = solution.solution(new int[]{95, 90, 99, 99, 80, 99}, new int[]{1,1,1,1,1,1});
        Arrays.stream(solution2).forEach(e -> System.out.print(e + " "));
    }
}

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> implList = new ArrayList<>();
        int index = 0;
        List<Integer> cdList = new ArrayList<>();
        for (int i = 0; i < progresses.length; i++) {
//            int round = Math.round((float) (100 - progresses[i]) / speeds[i]);
            float x = (float) (100 - progresses[i]) / speeds[i];
            int result = (int) ((100 - progresses[i]) % speeds[i] != 0? x+1:x);
            implList.add(result);
        }
        if(implList.size() <= 1) {
            return new int[]{1};
        }
        int cnt = 1;
        for(int i = 1; i < implList.size(); i++) {
            if (implList.get(i) > implList.get(index)) {
                cdList.add(cnt);
                cnt = 1;
                index = i;
            }
            else {
                cnt++;
            }
        }
        cdList.add(cnt);
        return cdList.stream().mapToInt(Integer::intValue).toArray();
    }
}
