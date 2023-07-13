class Solution {
    public boolean solution(int x) {
        String haShad = Integer.toString(x);
        int sum = 0;
        for (int i = 0 ; i < haShad.length(); i++) {
            sum += Integer.parseInt(String.valueOf(haShad.charAt(i)));
        }
        
        if (x % sum == 0) {
            return true;
        } 
        return false;
    }
}