/**
 * Copyright (C), 2019-2019,
 * FileName: Mirror
 * Author:   Administrator
 * Date:     2019/4/16 20:31
 * Description: 二叉树的镜像
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ghj.myoffer;

import sun.net.idn.Punycode;

/**
 * 〈一句话功能简述〉<br> 
 * 〈二叉树的镜像〉
 *
 * @author Administrator
 * @create 2019/4/16
 * @since 1.0.0
 */
public class Mirror {
    public class Node{
        public int value;
        public Node left;
        public Node right;
        public Node(int data){
            this.value = data;
        }
    }
    //递归求解
    public void mirror1(Node t){
        if(t == null){
            return ;
        }else if(t.left == null && t.right == null){
            return ;
        }
        Node temp = t.left;
        t.left = t.right;
        t.right = temp;
        if(t.left != null){
            mirror1(t.left);
        }
        if(t.right != null){
            mirror1(t.right);
        }
    }
}
