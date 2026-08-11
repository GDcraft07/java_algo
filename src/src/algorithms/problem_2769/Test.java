package algorithms.problem_2769;

import java.util.Scanner;
import java.io.PrintStream;
import java.io.IOException;

public class Test {
    static Scanner in = new Scanner(System.in);
    static PrintStream out = new PrintStream(System.out);

    public static void main(String[] args) throws IOException {
        Solution solution = new Solution();
        out.println(solution.theMaximumAchievableX(3, 2));
    }
}
