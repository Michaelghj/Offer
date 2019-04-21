/**
 * Copyright (C), 2019-2019,
 * FileName: PrintTree
 * Author:   Administrator
 * Date:     2019/4/21 16:18
 * Description: 二叉树的打印
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ghj.myoffer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * 〈一句话功能简述〉<br> 
 * 〈二叉树的打印〉
 *
 * @author Administrator
 * @create 2019/4/21
 * @since 1.0.0
 */
public class PrintTree {
    public class Node{
        public int value;
        public Node left;
        public Node right;
        public Node(int data){
            this.value = data;
        }
    }

    public void fun1(Node head){
        if(head == null){
           return;
        }
        //定义队列
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(head);
        while (!queue.isEmpty()){
            //取出队列的头部节点
            Node node = queue.poll();
            System.out.println(head.value + " ");
            if(head.left != null){
                queue.add(head.left);
            }
            if(head.right != null){
                queue.add(head.right);
            }
        }
    }

    /**
     * 分行从上到下打印二叉树
     * @param head
     */
    Node flagNode = new Node(-1);
    public void fun2(Node head1){
        if(head1 == null){
            return;
        }
        Queue<Node> queue1 = new LinkedList();
        queue1.add(head1);
        //下一层节点的数量
        int nextLevel = 0;
        //当前层剩余节点的数量
        int toBePrinted = 1;

        while (!queue1.isEmpty()){
            Node node1 = queue1.poll();
            System.out.println(head1.value + " ");
            if(head1.left != null){
                queue1.add(head1.left);
                nextLevel++;
            }
            if(head1.right != null){
                queue1.add(head1.right);
                nextLevel++;
            }
            toBePrinted--;
            if(toBePrinted == 0){
                System.out.println();
                toBePrinted = nextLevel;
                nextLevel = 0;
            }
        }
    }
    public void fun3(Node head2){
        if(head2 == null){
            return;
        }
        Queue<Node> queue2 = new LinkedList<>();
        queue2.add(head2);
        queue2.add(flagNode);

        while (!queue2.isEmpty()){
            if (head2.left != null){
                queue2.add(head2.left);
            }
            if (head2.right != null){
                queue2.add(head2.right);
            }

            if(queue2.peek().value == -1){
                queue2.poll();
                System.out.println();
                if (!queue2.isEmpty()){
                    queue2.add(flagNode);
                }
            }
        }
    }
    /**
     * 按照之字形打印二叉树
     */
    public void fun4(Node head3){
        if (head3 == null){
            return;
        }
        //存储奇数层节点，从左到右
        Stack<Node> s1 = new Stack<>();
        //存储偶数层节点，从右到左
        Stack<Node> s2 = new Stack<>();
        s1.add(head3);
        while (!s1.isEmpty() || !s2.isEmpty()){
            //退出循环的条件
            if (s1.isEmpty() && s2.isEmpty()){
                break;
            }
            if (!s1.isEmpty()){
                while (!s1.isEmpty()){
                    Node node = s1.pop();
                    System.out.println(node.value + " ");
                    if (node.left != null){
                        s2.add(node.left);
                    }
                    if (node.right != null){
                        s2.add(node.right);
                    }
                }
                System.out.println();
            }else {
                while (!s2.isEmpty()){
                    Node node = s2.pop();
                    System.out.println(node.value + " ");
                    if (node.left != null){
                        s1.add(node.left);
                    }
                    if (node.right != null){
                        s1.add(node.right);
                    }
                }
                System.out.println();
            }

        }
    }
}
