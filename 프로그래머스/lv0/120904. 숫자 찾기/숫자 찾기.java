class Solution {
    public int solution(int num, int k) {
        String str = Integer.toString(num);
        
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)-'0' == k) {
                return i+1;
            }
        }
        return -1;
    }
}