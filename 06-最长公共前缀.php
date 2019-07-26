<?php

/**
	编写一个函数来查找字符串数组中的最长公共前缀。

	如果不存在公共前缀，返回空字符串 ""。

	示例 1:

	输入: ["flower","flow","flight"]
	输出: "fl"
	示例 2:

	输入: ["dog","racecar","car"]
	输出: ""
	解释: 输入不存在公共前缀。
	说明:

	所有输入只包含小写字母 a-z 。

	来源：力扣（LeetCode）
	链接：https://leetcode-cn.com/problems/longest-common-prefix
	著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
**/
class Solution {

    /**
     * @param String[] $strs
     * @return String
     */
    function longestCommonPrefix($strs) {
           if(empty($strs)){
            return "";
        }

        //第一个
        $first = $strs[0];
        $firstLen = strlen($strs[0]);
        $len = count($strs);
        //循环
        for($i = 1;$i < $len ; $i ++){
            //如果到底，不用比较，或者已经$first 已经长度没了
            if($first == ''){
                break;
            }

            //下一个比较的
            $next = $strs[$i];
            for($j = 0;$j < $firstLen;$j ++){
                //如果匹配不上
                if($first[$j] != $next[$j]){
                    $first = substr($first,0,$j);
                    $firstLen = $firstLen - 1;
                    break;
                }
            }
        }

        return $first;
    }
}

/**
	118 / 118 个通过测试用例
	状态：通过
	执行用时：16 ms
**/