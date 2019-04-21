/**
 * Copyright (C), 2019-2019,
 * FileName: ReConstructBinaryTree
 * Author:   Administrator
 * Date:     2019/4/18 17:43
 * Description: 重建二叉树
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ghj.myoffer;

import javax.swing.tree.TreeNode;

/**
 * 〈一句话功能简述〉<br> 
 * 〈重建二叉树〉
 *
 * @author Administrator
 * @create 2019/4/18
 * @since 1.0.0
 */
public class ReConstructBinaryTree {
    public class TreeNode {
        public int val = 0;
        public TreeNode left = null;
        public TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    public TreeNode reConstructBinaryTree(int [] pre, int [] in) {
        return reConstructBinaryTree(pre,0,pre.length - 1,in,0,in.length-1);
    }
    public TreeNode reConstructBinaryTree(int[] pre,int lstart,int lend,int[] in,int rstart,int rend){
        TreeNode treeNode = null;
        if(lstart == lend){
            treeNode = new TreeNode(pre[lstart]);
            return treeNode;
        }
        if(lstart < lend){
            treeNode = new TreeNode(pre[lstart]);
            int flag = rstart;
            int length = 0;
            while(flag <= rend){
                if(in[flag] == pre[lstart])
                    break;
                flag++;
                length++;
            }
            treeNode.left = reConstructBinaryTree(pre,lstart + 1,lstart + length,in,rstart,flag - 1);
            treeNode.right = reConstructBinaryTree(pre,lstart + length + 1,lend,in,flag + 1,rend);
        }
        return treeNode;
    }
}
