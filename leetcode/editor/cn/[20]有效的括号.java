//给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。 
//
// 有效字符串需满足： 
//
// 
// 左括号必须用相同类型的右括号闭合。 
// 左括号必须以正确的顺序闭合。 
// 
//
// 注意空字符串可被认为是有效字符串。 
//
// 示例 1: 
//
// 输入: "()"
//输出: true
// 
//
// 示例 2: 
//
// 输入: "()[]{}"
//输出: true
// 
//
// 示例 3: 
//
// 输入: "(]"
//输出: false
// 
//
// 示例 4: 
//
// 输入: "([)]"
//输出: false
// 
//
// 示例 5: 
//
// 输入: "{[]}"
//输出: true 
// Related Topics 栈 字符串 
// 👍 1768 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isValid(String s){
        if (s.length() == 0){
            return true;
        }
        // 计数左右是否相等
        int count = 0;
        char[] left = {'(','[','{'};
        char[] right = {')',']','}'};

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.toCharArray().length; i++) {
            if (isContain(left, s.charAt(i))){
                stack.push(s.charAt(i));
                count++;
            }else {
                if (--count<0){
                    return false;
                }
                char l = stack.pop();
                if (!isMatch(l, s.charAt(i))){
                    return false;
                }
            }
        }
        return count == 0 ? true : false;
    }
    boolean isContain(char[] source, char c){
        for (int i = 0; i < source.length; i++) {
            if (c==source[i]){
                return true;
            }
        }
        return false;
    }
    boolean isMatch(char c1, char c2){
        if (c1=='(' && c2==')'){
            return true;
        }
        if (c1=='[' && c2==']'){
            return true;
        }
        if (c1=='{' && c2=='}'){
            return true;
        }
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
