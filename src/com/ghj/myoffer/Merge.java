/**
 * Copyright (C), 2019-2019,
 * FileName: Merge
 * Author:   Administrator
 * Date:     2019/4/16 17:12
 * Description: 合并两个排序的链表
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ghj.myoffer;

/**
 * 〈一句话功能简述〉<br> 
 * 〈合并两个排序的链表〉
 *
 * @author Administrator
 * @create 2019/4/16
 * @since 1.0.0
 */
public class Merge {
    //创建链表
    public class Node{
        public int value;
        public Node next;
        public Node(int data){
            this.value = data;
        }
    }

    public Node merge(Node head1, Node head2){
        //链表1为空返回链表2
        if(head1 == null){
            return head2;
        }
        //链表2为空返回链表1
        if(head2 == null){
            return head1;
        }
        //链表1的头结点小于链表2的头结点返回head1否则返回head2;
        Node head = head1.value < head2.value ? head1 : head2;
        //cur1指向head1
        Node cur1 = head == head1 ? head1 : head2;
        //cur2指向head2
        Node cur2 = head == head1 ? head2 : head1;
        Node pre = null;
        Node next = null;
        while (cur1 != null && cur2 != null){
            if(cur1.value <= cur2.value) {
                pre = cur1;
                cur1 = cur1.next;
            }else {
                next = cur2.next;
                pre.next = cur2;
                cur2.next = cur1;
                pre = cur2;
                cur2 = next;
            }
        }
        return head;
    }
}
