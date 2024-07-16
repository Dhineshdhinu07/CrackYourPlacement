import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
    }
    public static void moveZeroes(int[] nums){
    int i=0;
    int j=1;
    while(j<nums.length){
        if(nums[i]==0){
            if(nums[j]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
            else{
                j++;
            }
        }
        else{
            i++;
            j++;
        }
    }
    System.out.println(Arrays.toString(nums));
    }
    
}
