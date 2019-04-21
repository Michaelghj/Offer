/**
 * Copyright (C), 2019-2019,
 * FileName: Test
 * Author:   Administrator
 * Date:     2019/4/16 20:12
 * Description: 测试
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ghj.myoffer;

/**
 * 〈一句话功能简述〉<br> 
 * 〈测试〉
 *
 * @author Administrator
 * @create 2019/4/16
 * @since 1.0.0
 */
public class Test {
    public static class Node{
        public int value;
        public Contains.Node left;
        public Contains.Node right;
        public Node(int data){
            this.value = data;
        }

    }
    public static void main(String[] args) {
        Contains contains = new Contains();
        Contains.Node t1 = new Contains.Node(1);
        t1.left = new Contains.Node(2);
        t1.right = new Contains.Node(3);
        t1.left.left = new Contains.Node(4);
        t1.left.right = new Contains.Node(5);
        t1.right.left = new Contains.Node(6);
        t1.right.right = new Contains.Node(7);
        t1.left.left.left= new Contains.Node(8);
        t1.left.left.right= new Contains.Node(9);
        t1.left.right.left = new Contains.Node(10);

        Contains.Node t2 = new Contains.Node(2);
        t2.left = new Contains.Node(4);
        t2.right = new Contains.Node(5);
        t2.left.left = new Contains.Node(8);
        System.out.println();
    }

}
