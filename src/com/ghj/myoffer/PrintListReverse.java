/**
 * Copyright (C), 2019-2019,
 * FileName: PrintListReverse
 * Author:   Administrator
 * Date:     2019/4/18 16:39
 * Description: 从头到尾打印链表
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ghj.myoffer;

import org.w3c.dom.html.HTMLIsIndexElement;

import java.util.Stack;

/**
 * 〈一句话功能简述〉<br>
 * 〈从头到尾打印链表〉
 *
 * @author Administrator
 * @create 2019/4/18
 * @since 1.0.0
 */
public class PrintListReverse {
    public class ListNode{

        public ListNode next;
        public int value;
        public ListNode(int data){
           this.value = data;
        }
    }
    //反转链表
    public ListNode printListReverse01(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode pre = null;
        while (head != null){
            ListNode temp = head.next;//链表的下一个结点
            head.next = pre;//把当前结点的指针指向前面的节点
            pre = head;//继续向后移动
            head = temp;
        }

        return pre;
    }

    public ListNode printListReverse02(ListNode head){
        Stack<ListNode> stack = new Stack<ListNode>();
        while (head.next != null){
            stack.push(head);
            head = head.next;
        }

        ListNode endHead = head;

        while (!stack.empty()){
            head.next = stack.pop();
            head = head.next;
        }
        head.next = null;
        return endHead;
    }

    public ListNode printListReverse03(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode newhead = printListReverse03(head.next);
        return newhead;
    }
}
