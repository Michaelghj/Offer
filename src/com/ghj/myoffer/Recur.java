/**
 * Copyright (C), 2019-2019,
 * FileName: Recur
 * Author:   Administrator
 * Date:     2019/4/16 18:35
 * Description: 二叉树的变遍历
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ghj.myoffer;

/**
 *  递归求二叉树的前、中、后遍历
 * 〈二叉树的变遍历〉
 *
 * @author Administrator
 * @create 2019/4/16
 * @since 1.0.0
 */
public class Recur {
    public class Node{
        public int value;
        public Node left;
        public Node right;
        public Node(int data){
            this.value = data;
        }
        //二叉树的前序遍历
        public void preOrderRecur(Node head){
            if(head == null){
                return;
            }
            System.out.println(head.value + " ");
            preOrderRecur(head.left);
            preOrderRecur(head.right);
        }
        //二叉树的中序遍历
        public void inOrderRecur(Node head){
            if(head == null){
                return;
            }
            inOrderRecur(head.left);
            System.out.println(head.value + " ");
            inOrderRecur(head.right);
        }
        //二叉树的后续遍历
        public void posOrderRecur(Node head){
            if(head == null){
                return;
            }
            posOrderRecur(head.left);
            posOrderRecur(head.right);
            System.out.println(head.value + " ");
        }
    }
}
