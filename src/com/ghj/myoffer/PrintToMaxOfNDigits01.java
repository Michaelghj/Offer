/**
 * Copyright (C), 2019-2019,
 * FileName: PrintToMaxOfNDigits01
 * Author:   Administrator
 * Date:     2019/4/15 20:43
 * Description: 打印从1到最大的n位数
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ghj.myoffer;

/**
 * 打印从1到最大的n位数
 * 缺点：不知道数字的大小，数值变大时会出现数据溢出，如果n比较大，就会出现问题
 */
public class PrintToMaxOfNDigits01 {
    public void printToMaxOfNDigits(int n){
        int number = 1;
        int i = 0;
        while(i++ < n){
            number *= 10;
        }
        for (i = 1; i < number; i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        PrintToMaxOfNDigits01 printToMaxOfNDigits01 = new PrintToMaxOfNDigits01();
       printToMaxOfNDigits01.printToMaxOfNDigits(100);
    }
}
