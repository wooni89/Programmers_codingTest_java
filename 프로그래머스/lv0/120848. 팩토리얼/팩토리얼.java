class Solution {
    public static int factorial(int fac) {
        if (fac > 1) {
            return fac * factorial(fac - 1);
        }
        return fac;
    }
    
    public int solution(int n) {
        int answer = 0;
        for (int i = 0; i <=10; i++) {
            if (n >= factorial(i)) {
                answer = i;
            } else {
                break;
            }
        }
        return answer;
    }
}