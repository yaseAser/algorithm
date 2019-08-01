/**
给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。

如果不存在最后一个单词，请返回 0 。

说明：一个单词是指由字母组成，但不包含任何空格的字符串。

示例:

输入: "Hello World"
输出: 5

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/length-of-last-word
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
**/


//从最后往前遍历
public static int lengthOfLastWord(String s) {
    int len = s.length() - 1;

    //去除末尾空格
    while ( len >= 0 && s.charAt(len) == ' ') {
        len--;
    }

    //去除了空格后，可以放心从尾部开始计算了
    int wordLeng = 0;
    for (int i = len; i >= 0; i--) {
        if (s.charAt(i) != ' ') {
            wordLeng++;
        } else {
            break;
        }
    }

    return wordLeng;
}


/**

执行结果：通过
显示详情 ：
执行用时 : 1 ms, 在所有 Java 提交中击败了 93.31% 的用户
内存消耗 : 35.2 MB, 在所有 Java 提交中击败了83.44%的用户
∂
**/