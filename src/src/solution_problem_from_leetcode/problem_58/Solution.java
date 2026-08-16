package solution_problem_from_leetcode.problem_58;

public class Solution {
    public int lengthOfLastWord(String s) {
        String [] words = s.split(" ");

        return words[words.length - 1].length();
    }
}
