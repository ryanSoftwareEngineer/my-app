package ryan.ryan.helloworld;

import java.util.HashMap;
import java.util.Map;

public class longestsub {
    public static int lengthOfLongestSubstring(String s) {
        int one, two, answer;
        one = two = answer = 0;
        Map<Character, Integer> book = new HashMap<>();
        char[] input = s.toCharArray();
        while (two < s.length()){
            answer = Math.max(answer, two-one);
            char val = input[two];
            if (book.containsKey(val)){
                System.out.print(one + " " + val + " ");
                System.out.println(book);
                 while(one < book.get(val)){
                     book.remove(input[one]);
                     one++;
                 }
                 one++;
            }
            book.put(val, two);

            two++;
        }
        return answer;
    }
}
