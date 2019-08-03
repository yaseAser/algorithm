/**

给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。

示例 1:

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
     请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/longest-substring-without-repeating-characters
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
**/

class Solution {
    public int lengthOfLongestSubstring(String s) {
      int length = s.length();
        //左边存值，右边存长度位置
        HashMap<Character,Integer> hashMap = new HashMap<Character, Integer>();
        int maxSize = 0;

        if(length == 1){
            maxSize = 1;
        }

        for (int i = 0; i < length ;i++){
            char c = s.charAt(i);

            if(hashMap.get(c) == null){
                hashMap.put(c,i);
            }else{
                //跟谁匹配上的,就在那个位置开始，不能直接继续下去，要回归。
                i = hashMap.get(c);
                maxSize = Math.max(maxSize,hashMap.size());
                hashMap.clear();
            }
        }

        //最后还是要再次对比一下，防止没有执行到else语句
        maxSize = Math.max(maxSize,hashMap.size());

        return maxSize;
    }
}

/**
1 分钟前	通过	140 ms	66 MB	Java
**/