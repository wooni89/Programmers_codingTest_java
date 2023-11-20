import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public int solution(String[] spell, String[] dic) {
        return Arrays.stream(dic)  // dic 배열을 스트림으로 변환
                .map(check -> check.chars()
                    .sorted()
                    .mapToObj(i -> String.valueOf((char) i))
                    .collect(Collectors.joining())) // dic 문자열을 문자로 변환 정렬 -> 문자열로 합침
                .collect(Collectors.toList()) // 리스트로 정렬
                .contains(Arrays.stream(spell)
                    .sorted() // spell 문자열을 변환 및 정렬
                    .collect(Collectors.joining())) ? 1 : 2;
    }
}