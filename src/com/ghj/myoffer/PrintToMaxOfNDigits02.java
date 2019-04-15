package com.ghj.myoffer;
/**
 * 〈一句话功能简述〉<br> 
 * 〈打印从1到最大的n位数〉
 *
 * @author Administrator
 * @create 2019/4/15
 * @since 1.0.0
 */
public class PrintToMaxOfNDigits02 {
    public void PrintToMaxOfNDigits02(int n){
        if(n <= 0){
            return ;
        }
       char number[] = new char[n];

        for(int i = 0; i < number.length; i++){
            number[i] = '0';
        }
        while (!increment(number)){
            printNumber(number);
        }
    }

    private boolean increment(char[] number) {
        boolean isOverFlow = false;
        int nTakeOver = 0;
        int length = number.length;
        for (int i = length - 1; i >= 0; i--) {
            int nSum = number[i] - '0' + nTakeOver;
            //只有个位数时，数值加1
            if (i == length - 1) {
                nSum++;
            }
            //满10进1
            if (nSum >= 10) {
                if (i == 0) {
                    //超过n位了
                    isOverFlow = true;
                } else {
                    nSum -= 10;
                    nTakeOver = 1;
                    number[i] = (char) ('0' + nSum);
                }

            } else {
                number[i] = (char) ('0' + nSum);
                break;
            }
        }
            return isOverFlow;
    }

    //打印字符串
    private void printNumber(char[] number) {
            boolean isBeiginAtZero = true;
            int length = number.length;
            for (int i = 0; i < length; i++) {
                if (isBeiginAtZero && number[i] != '0') {
                    isBeiginAtZero = true;
                }
                if (!isBeiginAtZero) {
                    System.out.println(number[i]);
                }
            }
            System.out.println();
    }
}