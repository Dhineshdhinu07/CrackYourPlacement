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
        List<Integer>list=new ArrayList<>();
        for(int num:nums){
            nums[Math.abs(num)-1]*=-1;
            if(nums[Math.abs(num)-1]>0){
            list.add(Math.abs(num));
        }
      }  
      return list;
    }
    
}
