class Solution {
    public String solution(String my_string, int[] indices) {
        String[] str = my_string.split("");
        for (int index : indices) {
            str[index] = "";
        }
        
        return String.join("", str);
    }
}