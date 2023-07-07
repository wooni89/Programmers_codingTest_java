import java.util.Arrays;

class Solution {
    public int solution(String myString, String pat) {
        String[] str = myString.split("");
        String temp = "";
        for (int i = 0; i < myString.length() ; i++) {
            if (str[i].equals("A")) {
                temp += "B";
            } else if (str[i].equals("B")) {
                temp += "A";
            }
        }
        return temp.contains(pat) ? 1 : 0;
    }
}