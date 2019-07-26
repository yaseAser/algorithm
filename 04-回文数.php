<?php

/**
	判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
**/

class Solution {

    /**
     * @param Integer $x
     * @return Boolean
     */
    function isPalindrome($x) {
        $y = (string)$x;
        $len = strlen($y);
        $result = true;

        $i = 0;
        while ($i < ($len - $i - 1)) {
            if($y[$i] != $y[$len - $i - 1]){
                $result = false;
            }
            $i ++;
        }
        return $result;
    }
}

/**
	11509 / 11509 个通过测试用例
	状态：通过
	执行用时：20 ms
**/