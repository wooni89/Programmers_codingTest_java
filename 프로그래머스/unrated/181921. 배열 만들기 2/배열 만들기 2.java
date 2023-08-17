import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        for (int i = l; i <= r ; i++) {
            int idx = 0;
            String str = i + "";
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == 48 || str.charAt(j) == 53) {
                    idx++;
                }
            }
            if (idx == str.length()) {
                list.add(i);
            }
        }
        
        int[] answer = new int[list.size()];
        int [] empty = {-1};
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        if (answer.length == 0) {
            return empty;
        }
        return answer;
    }
}