import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesInAnArray {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> result = new ArrayList<>();
        result = findDuplicates(nums);
        System.out.println(result);
    }
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int[] hash = new int[Integer.MAX_VALUE];
        for (int i = 0; i < hash.length; i++) {
            hash[nums[i]]++;
        } 
        for (int i = 0; i < hash.length; i++) {
            if(hash[i] > 1) {
                list.add(i);
            }
        }
        return list;
        
    }
    
}
