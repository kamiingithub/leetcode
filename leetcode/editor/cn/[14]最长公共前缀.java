//编写一个函数来查找字符串数组中的最长公共前缀。 
//
// 如果不存在公共前缀，返回空字符串 ""。 
//
// 示例 1: 
//
// 输入: ["flower","flow","flight"]
//输出: "fl"
// 
//
// 示例 2: 
//
// 输入: ["dog","racecar","car"]
//输出: ""
//解释: 输入不存在公共前缀。
// 
//
// 说明: 
//
// 所有输入只包含小写字母 a-z 。 
// Related Topics 字符串 
// 👍 1144 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length==0){
            return "";
        }
        int min = strs[0].length();
        for (int i = 1; i < strs.length; i++) {
            min = strs[i].length() < min ? strs[i].length():min;
        }

        StringBuilder result = new StringBuilder();
        for (int t = 0; t < min; t++) {
            char c = strs[0].charAt(t);
            for (int i = 0; i < strs.length; i++){
                if (strs[i].charAt(t)!=c){
                    return result.toString();
                }
            }
            result.append(c);
        }

        return result.toString();
    }

    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0)
            return "";
        String ans = strs[0];
        for(int i =1;i<strs.length;i++) {
            int j=0;
            for(;j<ans.length() && j < strs[i].length();j++) {
                if(ans.charAt(j) != strs[i].charAt(j))
                    break;
            }
            ans = ans.substring(0, j);
            if(ans.equals(""))
                return ans;
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
