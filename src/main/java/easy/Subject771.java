package easy;

import java.util.HashMap;
import java.util.Map;

/**
 给定字符串J 代表石头中宝石的类型，和字符串 S代表你拥有的石头。 S 中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。

 J 中的字母不重复，J 和 S中的所有字符都是字母。字母区分大小写，因此"a"和"A"是不同类型的石头。

 示例 1:

 输入: J = "aA", S = "aAAbbbb"
 输出: 3

 示例 2:

 输入: J = "z", S = "ZZ"
 输出: 0

 注意:

 S 和 J 最多含有50个字母。
 J 中的字符不重复。

 来源：力扣（LeetCode）
 链接：https://leetcode-cn.com/problems/jewels-and-stones
 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Subject771 {
    public static void main(String[] args) {
        String j = "aA";
        String s = "aAAbbbb";
        numJewelsInStones(j, s);
    }

    public static int numJewelsInStones(String jewels, String stones) {
        Map<Character, Integer> map = new HashMap<>();
        char[] c = stones.toCharArray();
        for(int i = 0; i < c.length;i++){
            Integer num = map.get(c[i]);
            if (num== null || num==0){
                map.put(c[i], 1);
                continue;
            }
            map.put(c[i], num+1);
        }
        char[] c1 = jewels.toCharArray();
        int res = 0;
        for(int i = 0; i < c1.length;i++){
            if (map.get(c1[i]) != null && map.get(c1[i]) >0){
                res += map.get(c1[i]);
            }
        }
        return res;
    }
}
