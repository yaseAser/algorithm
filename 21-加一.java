/**
给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。

最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。

你可以假设除了整数 0 之外，这个整数不会以零开头。

示例 1:

输入: [1,2,3]
输出: [1,2,4]
解释: 输入数组表示数字 123。
示例 2:

输入: [4,3,2,1]
输出: [4,3,2,2]
解释: 输入数组表示数字 4321。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/plus-one
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。


**/
public static int[] plusOne(int[] digits) {
    int length = digits.length;

    for (int i = (length - 1) ; i >= 0 ; i--){
        if((digits[i] + 1) > 9){
            digits[i] = 0;

            //在这里就是小心999这种情况，要申请一个新的空间
            if(i == 0){
                digits = new int[length + 1];
                digits[0] = 1;
            }

        }else{
            digits[i] += 1;
            break;
        }
    }

    return digits;
}


/**
	执行用时 :0 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗 :34.8 MB, 在所有 Java 提交中击败了48.01%的用户
**/