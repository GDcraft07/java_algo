package algorithms.problem_1;

public class Test {
    public static void main(String[] args) {
        int [] nums = {2,7,11,15};
        Solution solution = new Solution();
        int [] answer = solution.twoSum(nums, 13);
        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }
}
