class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        int a = box[0] / n;
        int b = box[1] / n;
        int c = box[2] / n;
        return a * b * c;
    }
}