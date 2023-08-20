import java.util.List;
import java.util.ArrayList;

class Solution {
    public String solution(String my_string, int m, int c) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < my_string.length(); i += m) {
            String sub = my_string.substring(i, i + m);
            list.add(sub);
        }
        String answer = "";
        for (String str : list) {
            answer += str.substring(c - 1, c);
        }
        return answer;
    }
}