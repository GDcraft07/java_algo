package solution_problem_from_leetcode.problem_14;


// Bad Solution
//import java.util.HashSet;
//import java.util.Set;
//
//class Solution {
//    public String longestCommonPrefix(String[] strs) {
//        StringBuilder answer = new StringBuilder();
//        for (int i = 0; i < strs[0].length(); i++) {
//            Set<Character> index_letter = new HashSet<>();
//
//            try {
//                for (int j = 0; j < strs.length; j++) {
//                    index_letter.add(strs[j].charAt(i));
//                }
//
//                if (index_letter.size() != 1) {
//                    break;
//                }
//
//                answer.append(strs[0].charAt(i));
//            }
//            catch (Exception e) {
//                break;
//            }
//        }
//
//        return answer.toString();
//    }
//}

import java.util.Arrays;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder answer = new StringBuilder();

        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];

        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                return answer.toString();
            }

            answer.append(first.charAt(i));
        }

        return answer.toString();
    }
}