public class SubarraySumsDivisiblebyK {
    public static void main(String[] args) {
        int[] nums = {4,5,0,-2,-3,1};
        int k = 5;
        System.out.println(subarraysDivByK(nums, k));
    }
    public static int subarraysDivByK(int[] nums, int k) {
        int ans = 0;
        int prefix = 0;
        int[] count = new int[k];
        count[0] = 1;
        for (int num : nums) {
          prefix = (prefix + num % k + k) % k;
          ans += count[prefix];
          ++count[prefix];
    }
    return ans;
    }
}
