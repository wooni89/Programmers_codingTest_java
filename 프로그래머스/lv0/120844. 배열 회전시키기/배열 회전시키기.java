import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        Deque<Integer> deque = new ArrayDeque<>();
        
        for (int num : numbers) {
            deque.offer(num);
        }
        
        if (direction.equals("right")) {
            int num = deque.pollLast();
            deque.offerFirst(num);
        } else if (direction.equals("left")) {
            int num = deque.pollFirst();
            deque.offerLast(num);
        }
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = deque.poll();
        }
        return answer;
    }
}