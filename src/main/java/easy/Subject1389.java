package easy;

/**
 * @author linyilong
 * @createTime 2021/4/13 5:05 下午
 * @description
 */
public class Subject1389 {
    public static void main(String[] args) {
//        int[] nums = {0,1,2,3,4};
//        int[] index = {0,1,2,2,1};
        int[] nums = {4,2,1,1};
        int[] index = {0,0,2,0};
        createTargetArray(nums, index);
    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        int size = index.length;
        int[] target = new int[size];
        for(int i =0;i<size;i++){
            int var = target[index[i]];
            if (var != 0){
                for(int j=size-1;j>index[i];j--){
                    target[j]=target[j-1];
                }
            }
            target[index[i]] = nums[i];
        }
        return target;
    }
}
