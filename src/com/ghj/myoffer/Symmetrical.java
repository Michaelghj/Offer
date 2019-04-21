/**
 * Copyright (C), 2019-2019,
 * FileName: Symmetrical
 * Author:   Administrator
 * Date:     2019/4/16 21:30
 * Description: 对称二叉树
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ghj.myoffer;

/**
 * 〈一句话功能简述〉<br> 
 * 〈对称二叉树〉
 *
 * @author Administrator
 * @create 2019/4/16
 * @since 1.0.0
 */
public class Symmetrical {
    public class Node{
        public int value;
        public Node left;
        public Node right;
        public Node(int data){
            this.value = data;
        }
    }

    public boolean isSymmetrical(Node root){
        return isSymmetrical(root, root);
    }
    public boolean isSymmetrical(Node root1, Node root2){
        if(root1 == null && root2 == null){
            return true;
        }
        if(root1 == null || root2 == null){
            return false;
        }
        if(root1.value != root2.value){
            return false;
        }
        //左结点等于右结点，右 结点等于左结点
        return isSymmetrical(root1.left, root2.right) && isSymmetrical(root1.right, root2.left);
    }
}
