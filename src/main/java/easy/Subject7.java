package easy;

/**
 * @author linyilong
 * @createTime 2020/7/1 4:27 下午
 * @description
 */

/*7. 整数反转
给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
示例 1:
输入: 123
输出: 321
示例 2:
输入: -123
输出: -321
示例 3:
输入: 120
输出: 21
*/

public class Subject7 {
    public static void main(String[] args) {
        int result = reverse(-64351);
        System.out.println(result);
    }

    public static int reverse(int x) {
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