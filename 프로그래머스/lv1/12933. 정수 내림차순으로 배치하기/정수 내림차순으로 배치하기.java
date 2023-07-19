import java.util.Arrays;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String[] str = Long.toString(n).split("");
        Arrays.sort(str);
        
        StringBuilder sb = new StringBuilder();
        
        for (String s : str) {
            sb.append(s);
        }
        
        return Long.parseLong(sb.reverse().toString());
    }
}