package easy;

/*66. 加一
给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。

最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。

你可以假设除了整数 0 之外，这个整数不会以零开头。*/

public class Subject66 {
    public static void main(String[] args) {
        int[] nums = {9, 9};
        int[] result = plusOne(nums);
        for (int i : result) {
            System.out.print(i);
        }
    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) {return digits;}
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    public static int[] plusOne0(int[] digits) {
        boolean flag = false;
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] != 9) {
                flag = true;
                break;
            }
        }
        if (flag) {
            for (int i = digits.length - 1; i >= 0; i--) {
                if ((digits[i] += 1) != 10) {
                    break;
                } else {
                    digits[i] = 0;
                }
            }
            return digits;
        } else {
            int[] result = new int[digits.length + 1];
            for (int i = 1; i < result.length; i++) {
                result[i] = digits[i - 1];
            }
            for (int i = result.length - 1; i >= 0; i--) {
                if ((result[i] += 1) != 10) {
                    break;
                } else {
                    result[i] = 0;
                }
            }
            return result;
        }
    }
}
