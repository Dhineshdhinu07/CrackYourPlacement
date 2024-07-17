import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
    public static int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i = 0; i < n; i++){
            int ans = target - nums[i];
            if(map.containsKey(ans)){
                return new int[]{map.get(ans), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
