import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {

        List<Integer> list = new ArrayList<>();
        
        for (int[] intval : intervals)
            for(int i = intval[0]; i <= intval[1]; i++) {     
                list.add(arr[i]);
            }

        return list.stream().mapToInt(x -> x).toArray();
    }
}