/**
 * Copyright (C), 2019-2019,
 * FileName: PrintEdge
 * Author:   Administrator
 * Date:     2019/4/16 22:01
 * Description: 打印矩阵
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ghj.myoffer;

/**
 * 〈一句话功能简述〉<br> 
 * 〈打印矩阵〉
 *
 * @author Administrator
 * @create 2019/4/16
 * @since 1.0.0
 */
public class PrintEdge {
    public void spiralOrderPrint(int [][] matrix){
        int tR = 0;//左上角坐标
        int tC = 0;
        int dR = matrix.length - 1;//右下角坐标
        int dC = matrix[0].length - 1;
        while (tR <= dR && tC <= dC){
            printEdge(matrix, tR++, tC++, dR--, dC--);
        }
    }
    public void printEdge(int[][] m, int tR, int tC, int dR, int dC){
        if(tC == dC){//子矩阵只有一行
            for (int i = tR; i <= dR; i++){
                System.out.println(i);
            }
        }else if(tC == dC){//子矩阵只有一列时
            for(int i = tC; i <= dC; i++){
                System.out.println(i);
            }
        }else{
            int cur1 = tC;
            int cur2 = tR;
            //行
            while (cur1 != dC){
                System.out.println(m[tR][cur1] + " ");
                cur1++;
            }
            //列
            while (cur2 != dR){
                System.out.println(m[cur2][dC] + " ");
                cur2++;
            }
            while (cur1 != tC){
                System.out.println(m[dR][cur1] + " ");
                cur1--;
            }
            while (cur2 != tR){
                System.out.println(m[cur2][tC]);
                cur2--;
            }
        }

    }
}
