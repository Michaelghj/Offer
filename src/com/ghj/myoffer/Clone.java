/**
 * Copyright (C), 2019-2019,
 * FileName: Clone
 * Author:   Administrator
 * Date:     2019/5/11 23:27
 * Description: 复杂对象的复制
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ghj.myoffer;

/**
 * 复杂对象的复制
 * 输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，
 * 另一个特殊指针指向任意一个节点），返回结果为复制后复杂链表的 head。
 * @author Administrator
 * @create 2019/5/11
 * @since 1.0.0
 */
public class Clone {
    public class Node{
        public int value;
        public Node left;
        public Node right;
        Node next = null;
        Node random = null;

        public Node(int data){
            this.value = data;
        }
    }
    public Node clone(Node phead){
        if(phead == null){
            return null;
        }
        //插入新节点
        Node cur = phead;
        while(cur != null){
            Node clone1 = new Node(cur.value) ;
            clone1.next = cur.next;
            cur.next = clone1;
            cur = clone1.next;
        }
        //建立ramdom连接
        cur = phead;
        while (cur != null) {
            Node clone = cur.next;
            if (cur.random != null)
                clone.random = cur.random.next;
            cur = clone.next;
        }

        // 拆分
        cur = phead;
        Node pCloneHead = phead.next;
        while (cur.next != null) {
            Node next = cur.next;
            cur.next = next.next;
            cur = next;
        }
        return pCloneHead;
    }
}
