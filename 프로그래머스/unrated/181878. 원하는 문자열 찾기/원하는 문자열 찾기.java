class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String mystr = myString.toLowerCase();
        String patstr = pat.toLowerCase();
        if (mystr.contains(patstr)) {
            return 1;
        }
        return answer;
    }
}