class Solution {
    public String solution(String my_string, int s, int e) {
        String param = my_string.substring(s , e + 1);
        StringBuilder reverse = new StringBuilder(param).reverse();
        return my_string.replace(param, reverse.toString());
    }
}