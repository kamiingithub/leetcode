//给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。 
//
// 示例 1: 
//
// 输入: 123
//输出: 321
// 
//
// 示例 2: 
//
// 输入: -123
//输出: -321
// 
//
// 示例 3: 
//
// 输入: 120
//输出: 21
// 
//
// 注意: 
//
// 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231, 231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。 
// Related Topics 数学


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int reverse(int x) {
        int res = 0;
        while (x!=0){
            int a = x%10;
            //判断是否 大于 最大32位整数 2147483647
            if (res>214748364 || (res==214748364 && a>7)) {
                return 0;
            }
            //判断是否 小于 最小32位整数 -2147483648
            if (res<-214748364 || (res==-214748364 && a<-8)) {
                return 0;
            }
            res = res*10 +a;
            x = x/10;
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
