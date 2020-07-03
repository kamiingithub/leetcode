### 解题思路
此处撰写解题思路
倒叙遍历，找到了空格且长度不为0的时候提前退出
### 代码

```java
class Solution {
    public int lengthOfLastWord(String s) {
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
```