/**
 * Copyright (C), 2019-2019,
 * FileName: InOrder
 * Author:   Administrator
 * Date:     2019/5/12 22:30
 * Description: 二叉搜索树与双向链表
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ghj.myoffer;

/**
 * 〈一句话功能简述〉<br> 
 * 〈二叉搜索树与双向链表〉
 *
 * @author Administrator
 * @create 2019/5/12
 * @since 1.0.0
 */
public class InOrder {

    public class TreeNode{
        public int value;
        public TreeNode left;
        public TreeNode right;
        public TreeNode(int data){
            this.value = data;
        }
    }
    private TreeNode pre = null;
    private TreeNode head = null;

    public TreeNode Convert(TreeNode root) {
        inOrder(root);
        return head;
    }
    private void inOrder(TreeNode node) {
        if (node == null)
            return;
        inOrder(node.left);
        node.left = pre;
        if (pre != null)
            pre.right = node;
        pre = node;
        if (head == null)
            head = node;
        inOrder(node.right);
    }
}
