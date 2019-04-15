/**
 * Copyright (C), 2019-2019,
 * FileName: Match
 * Author:   Administrator
 * Date:     2019/4/15 23:41
 * Description: 正则表达式匹配
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ghj.myoffer;

/**
 * 〈一句话功能简述〉<br> 
 * 〈正则表达式匹配〉
 *
 * @author Administrator
 * @create 2019/4/15
 * @since 1.0.0
 */
public class Match {
    public boolean match(char[] str, char[] pattern, int p){
        if(str == null || pattern == null){
            return false;
        }
        return matchCore(str, 0, pattern, 0);
    }
    public boolean matchCore(char[] str, int s, char[] pattern, int p) {
        if (str.length <= s && pattern.length <= p) {
            return true;
        }
        if (str.length > s && pattern.length <= p) {
            return false;
        }
        if (p + 1 < pattern.length && pattern[p + 1] == '*') {

            if (s >= str.length) return matchCore(str, s, pattern, p + 2);
            else {
                if (pattern[p] == str[s] || pattern[p] == '*') {
                    return matchCore(str, s + 1, pattern, p + 2)
                            || matchCore(str, s + 1, pattern, p)
                            || matchCore(str, s, pattern, p + 2);
                } else
                    return matchCore(str, s, pattern, p + 2);
            }
        }
        if (s >= str.length){
            return false;
        }
            else {
            if (str[s] == pattern[p] || pattern[p] == '.')
                return matchCore(str, s + 1, pattern, p + 1);

            return false;
        }

    }
    }

