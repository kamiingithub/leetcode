package easy;

/**
 * @author linyilong
 * @createTime 2020/7/3 9:38 上午
 * @description
 */

/*58.给定一个仅包含大小写字母和空格 ' ' 的字符串 s，返回其最后一个单词的长度。如果字符串从左向右滚动显示，
    那么最后一个单词就是最后出现的单词。
 如果不存在最后一个单词，请返回 0 。
 说明：一个单词是指仅由字母组成、不包含任何空格字符的 最大子字符串。
 示例:
 输入: "Hello World"
 输出: 5
 Related Topics 字符串*/

public class Subject58 {

    public static void main(String[] args) {
        String s = "a ";
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int totalLength = s.length();
        int finalLength = 0;
        for (int i= totalLength -1 ; i>=0; i--) {
            if (s.charAt(i) == ' ' && finalLength > 0) {
                return finalLength;
            }
            if (s.charAt(i) == ' ') {
                finalLength = 0;
            } else {
                finalLength++;
            }
        }
        return finalLength;

    }
}
