import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1};
        int k = 2;
        System.out.println(subarraySum(nums, k));
    }
    public static int subarraySum(int[] nums, int k) {
    int ans = 0;
    int prefix = 0;
    Map<Integer, Integer> count = new HashMap<>();
    count.put(0, 1);

    for ( int num : nums) {
      prefix += num;
      ans += count.getOrDefault(prefix - k, 0);
      count.merge(prefix, 1, Integer::sum);
    }

    return ans;
  }
    
}
