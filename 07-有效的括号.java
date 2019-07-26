/**
	给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。

	有效字符串需满足：

	左括号必须用相同类型的右括号闭合。
	左括号必须以正确的顺序闭合。
	注意空字符串可被认为是有效字符串。

	示例 1:

	输入: "()"
	输出: true
	示例 2:

	输入: "()[]{}"
	输出: true
	示例 3:

	输入: "(]"
	输出: false
	示例 4:

	输入: "([)]"
	输出: false
	示例 5:

	输入: "{[]}"
	输出: true

	来源：力扣（LeetCode）
	链接：https://leetcode-cn.com/problems/valid-parentheses
	著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
**/

class Solution {
    public boolean isValid(String s) {
       Boolean result = true;
        //申请一个容量空间
        Stack<Character> stack = new Stack<Character>();
        //map存入
        Map<Character,Character> charMap = new HashMap<Character,Character>();
        charMap.put(')','(');
        charMap.put('}','{');
        charMap.put(']','[');

        //获取字符串长度
        int len = s.length();
        //进行循环逐渐拿值
        for (int i = 0 ; i < len ; i ++){
            char c = s.charAt(i);
            //如果没在map中，则压栈
            if(charMap.containsKey(c)){
                if(stack.empty()){
                    result = false;
                    break;
                }

                char p = stack.pop();
                //如果在map中了，则进行比较
                if(p != charMap.get(c)){
                    result = false;
                    break;
                }
            }else{
                stack.push(c);
            }
        }

        //如果最后栈里面还有，却没有多余的匹配
        if(!stack.empty()){
            result = false;
        }

        return result;
    }
}

/**
	76 / 76 个通过测试用例
	状态：通过
	执行用时：9 ms
**/


