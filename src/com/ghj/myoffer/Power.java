/**
 * Copyright (C), 2019-2019,
 * FileName: Power
 * Author:   Administrator
 * Date:     2019/4/15 19:44
 * Description: 整数次方
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ghj.myoffer;

/**
 * 〈一句话功能简述〉<br> 
 * 〈整数次方〉
 *
 * @author Administrator
 * @create 2019/4/15
 * @since 1.0.0
 */
public class Power {


    public double power(double base, int exponent) {

        double result = 0.0;
        if(equal(base,0.0) && exponent < 0) {
            System.out.println("0的负次幂无意义");
        }
        //0次幂返回1
        if(equal(exponent,0)){
            return 1.0;
        }
        //幂为负数1/base的次幂
        if(exponent < 0) {
            result = powerWithExponent(1.0/base, -exponent);
        }else{
            result = powerWithExponent(base,exponent);
        }
        return  result;
    }
    private double powerWithExponent(double base, int exponent) {
        double result = 1.0;
        for(int i = 1; i <= exponent; i++) {
            result = result * base;
        }
        return result;
    }
    //判断两个数是否相等
    private boolean equal(double num1, double num2) {
        if((num1 - num2 > -0.0000000001) && (num1 - num2 < 0.000000001)){
            return true;
        }else {
            return false;
        }
    }

}
