package medium;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author linyilong
 * @createTime 2020/8/13 10:16 上午
 * @description
 */

/* 3.无重复字符的最长子串
给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
示例 1:
 输入: "abcabcbb"
输出: 3
解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。

 示例 2:
 输入: "bbbbb"
输出: 1
解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。

 示例 3:
 输入: "pwwkew"
输出: 3
解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
     请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。*/

public class Subject3 {
    public static void main(String[] args) {
        String s = "qrsvbspk";
        System.out.println(lengthOfLongestSubstring0(s));
    }
    public static int lengthOfLongestSubstring(String s) {
        int max = 0;
        HashSet<Character> set = new HashSet<>();
        for (int i=0,j=0;j<s.length();j++){
            while (set.contains(s.charAt(j))){
                set.remove(s.charAt(i));
                i++;
            }
            set.add(s.charAt(j));
            max = Math.max(max, set.size());
        }

        return max;
    }
    public static int lengthOfLongestSubstring0(String s) {
        int max = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i=0,j=0;j<s.length();j++){
            if (map.containsKey(s.charAt(j))){
                i = Math.max(map.get(s.charAt(j))+1, i);
            }
            map.put(s.charAt(j), j);
            max = Math.max(max, j-i+1);
        }

        return max;
    }
}
