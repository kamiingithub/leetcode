package easy;

import java.util.Arrays;

/*136. 只出现一次的数字
给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。

说明：

你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？*/

public class Subject136 {
	public static void main(String[] args) {
		int[] nums= {2,2,1};
		int result = singleNumber(nums);
		System.out.println(result);

	}
	public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=nums.length-1;i>=0;i--){
        	if(i==0) {return nums[0];}
            if(nums[i]==nums[i-1]){
                i--;
                continue;
            }
            return nums[i];
        }
        return 0;
    }
}
