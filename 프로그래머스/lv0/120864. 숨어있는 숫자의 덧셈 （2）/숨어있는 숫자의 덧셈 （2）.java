class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] str = my_string.split("[a-zA-z]+");
        for(int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
            if (str[i].matches("[0-9]+"))
            answer += Integer.parseInt(str[i]);
        }
    
        return answer;
    }
}