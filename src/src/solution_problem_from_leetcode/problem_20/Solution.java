package solution_problem_from_leetcode.problem_20;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        Stack<Character> memory = new Stack<>();
        Map<Character, Character> brackets = new HashMap<>();
        brackets.put('}', '{');
        brackets.put(']', '[');
        brackets.put(')', '(');

        for (int i = 0; i < s.length(); i++) {
            char element = s.charAt(i);
            if (element == '{' || element == '[' || element == '(') {
                memory.add(element);
            }

            else {
                if (memory.isEmpty() || brackets.get(element) != memory.peek()) {
                    return false;
                }

                else {
                    memory.pop();
                }
            }
        }

        return memory.isEmpty();
    }
}
