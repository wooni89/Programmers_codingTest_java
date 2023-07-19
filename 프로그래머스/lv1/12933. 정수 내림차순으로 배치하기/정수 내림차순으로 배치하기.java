import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String[] str = Long.toString(n).split("");
        Arrays.sort(str, Collections.reverseOrder());
        
        String stan = "";
        
        for (String s : str) {
            stan += s;
        }
        
        answer = Long.parseLong(stan);
        return answer;
    }
}