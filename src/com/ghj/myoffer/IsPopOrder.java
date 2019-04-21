/**
 * Copyright (C), 2019-2019,
 * FileName: IsPopOrder
 * Author:   Administrator
 * Date:     2019/4/21 15:42
 * Description: 栈的压入和弹出
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ghj.myoffer;

import java.util.Stack;

/**
 * 〈一句话功能简述〉<br> 
 * 〈栈的压入和弹出〉
 *
 * @author Administrator
 * @create 2019/4/21
 * @since 1.0.0
 */
public class IsPopOrder{
    public boolean IsPopOrder1(int [] pushA,int [] popA) {
        //模拟栈的入栈出栈
        if(pushA == null || pushA.length <= 0)
            return false;
        Stack<Integer> stack = new Stack<Integer>();
        int p1= 0,p2 = 0;
        while(p1 < pushA.length && p2 < popA.length){
            if(pushA[p1] == popA[p2]){
                p1++;
                p2++;
                continue;
            }
            while((p1 < pushA.length) && (pushA[p1] != popA[p2])){
                stack.push(pushA[p1++]);
            }
        }
        while(!stack.isEmpty() && p2 < popA.length && stack.peek() == popA[p2]){
            p2++;
            stack.pop();
        }
        return stack.isEmpty();
    }

    //思路一样，但是大神的代码真的简洁，还要多努力练习;编程真是一门艺术
    public boolean IsPopOrder2(int [] pushA,int [] popA){
        if(pushA == null || pushA.length <= 0)
            return false;
        Stack<Integer> stack = new Stack<>();
        int i = 0,j = 0;
        while(i < pushA.length){
            stack.push(pushA[i++]);
            while(!stack.isEmpty() && stack.peek() == popA[j]){
                j++;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
