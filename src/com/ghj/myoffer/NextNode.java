/**
 * Copyright (C), 2019-2019,
 * FileName: NextNode
 * Author:   Administrator
 * Date:     2019/4/18 18:29
 * Description: 二叉树的下一个结点
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ghj.myoffer;

import sun.reflect.generics.tree.Tree;

/**
 * 〈一句话功能简述〉<br> 
 * 〈二叉树的下一个结点〉
 *
 * @author Administrator
 * @create 2019/4/18
 * @since 1.0.0
 */
public class NextNode {
    public class TreeNode {
        public int val = 0;
        public ReConstructBinaryTree.TreeNode left = null;
        public ReConstructBinaryTree.TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    public TreeNode getNextNode(TreeNode node){
        if(node == null){
            return null;
        }
        if(node.right != null){
            
        }
        return null;
    }
}
