/**
 * Copyright (C), 2019-2019,
 * FileName: StackWithMin
 * Author:   Administrator
 * Date:     2019/4/21 15:22
 * Description: 包含min函数的栈
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ghj.myoffer;

import java.util.Stack;

/**
 * 〈一句话功能简述〉<br> 
 * 〈包含min函数的栈〉
 *
 * @author Administrator
 * @create 2019/4/21
 * @since 1.0.0
 */
public class StackWithMin {
    private Stack<Integer> stackData;
    private Stack<Integer> stackMIn;

    public StackWithMin(){
        this.stackData = new Stack<Integer>();
        this.stackMIn = new Stack<Integer>();
    }

    public void push(int newNum){
        //如果最小栈中为空则填入数据，该数据为最小值
        if(this.stackMIn.isEmpty()){
            this.stackMIn.push(newNum);
        }else if(newNum <= this.getMin()){
            this.stackMIn.push(newNum);
        }
        this.stackData.push(newNum);
    }

    public int pop(){
        if(this.stackData.isEmpty()){
            throw new RuntimeException("Your stack is empty...");
        }
        int value = this.stackData.pop();
        if(value == this.getMin()){
            this.stackMIn.pop();
        }
        return value;
    }

    public int getMin(){
        if(this.stackMIn.isEmpty()){
            throw new RuntimeException("your stack is empty ");
        }
        return this.stackMIn.peek();
    }
}
