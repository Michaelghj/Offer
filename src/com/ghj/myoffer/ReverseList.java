/**
 * Copyright (C), 2019-2019,
 * FileName: ReverseList
 * Author:   Administrator
 * Date:     2019/4/15 19:05
 * Description: 链表的反转
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ghj.myoffer;


/**
 * 〈一句话功能简述〉<br> 
 * 〈链表的反转〉
 *
 * @author Administrator
 * @create 2019/4/15
 * @since 1.0.0
 */
public class ReverseList {

    public class Node{
        public int value;
        public Node next;
        public Node(int data){
            this.value = data;
        }
    }
    //反转单向链表
    public Node reverseList(Node head){

        if(head == null){
            return null;
        }
        Node pre = null;//当前结点的前节点
        Node next = null;//当前结点的后结点
        while (head != null){
            //pre->Node->next--------pre<-Node<-next
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

    public class DoubleNode{
        public int value;
        public DoubleNode next;
        public DoubleNode last;
        public DoubleNode(int data){
            this.value = data;
        }
    }

    public DoubleNode reverseList(DoubleNode head){
        DoubleNode pre = null;
        DoubleNode next = null;
        while (head != null){
            next = head.next;
            head.next = pre;
            head.last = next;
            pre = head;
            head = next;
        }
        return pre;
    }

}
