/**
 * Copyright (C), 2019-2019,
 * FileName: RemoveLastKNode
 * Author:   Administrator
 * Date:     2019/4/15 22:51
 * Description: 删除倒数K个节点
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ghj.myoffer;

import javax.xml.crypto.Data;

/**
 * 〈一句话功能简述〉<br> 
 * 〈删除倒数K个节点〉
 *
 * @author Administrator
 * @create 2019/4/15
 * @since 1.0.0
 */
public class RemoveLastKNode {
    public class Node{
        public int value;
        public Node next;

        public Node(int data){
            this.value = data;
        }

        public Node removeLastKNode(Node head, int lastKth){
            if(head == null || lastKth < 1){
                return head;
            }
            Node cur = head;
            //k-1
            while(cur != null){
                lastKth--;
                cur = cur.next;
            }
            if(lastKth ==0 ){
                head = head.next;
            }
            if(lastKth < 0){
                cur = head;
                while(++lastKth != 0){
                    cur = cur.next;
                }
                cur.next = cur.next.next;
            }
            return head;
        }
    }
    public class DoubleNode{
        public int value;
        public DoubleNode next;
        public DoubleNode last;
        public DoubleNode(int data){
            this.value = data;
        }

        public DoubleNode removeLastKNode(DoubleNode head, int lastKth){
            if(head == null|| lastKth < 1){
                return head;
            }
            DoubleNode cur = head;

            while(cur != null){
                lastKth--;
                cur = cur.next;
            }
            if(lastKth == 0){
                head.next = next;
                head.last = null;
            }
            if(lastKth < 0){
                cur = head;
                while (++lastKth !=0){
                    cur = cur.next;
                }
                DoubleNode doubleNode = cur.next.next;
                cur.next = doubleNode;
                if(doubleNode != null){
                    doubleNode.last = cur;
                }
            }
            return head;
        }
    }
}
