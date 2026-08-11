package algorithms.problem_9;

// Bad Solution
//public class Solution {
//    public String reverse(String line) {
//        StringBuilder reverse_line = new StringBuilder();
//
//        for (int i = line.length() - 1; i >= 0; i--) {
//            reverse_line.append(line.charAt(i));
//        }
//
//        return reverse_line.toString();
//    }
//
//    public boolean isPalindrome(int x) {
//        if (x < 0) {
//            return false;
//        }
//
//        return this.reverse(Integer.toString(x)).equals(Integer.toString(x));
//    }
//}


public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int reverse_x = 0;
        int digits = x;

        while (digits != 0) {
            reverse_x = reverse_x * 10 + digits % 10;
            digits /= 10;
        }

        return x == reverse_x;
    }
}