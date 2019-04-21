/**
 * Copyright (C), 2019-2019,
 * FileName: Contains
 * Author:   Administrator
 * Date:     2019/4/16 18:52
 * Description: 二叉树的子结构
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ghj.myoffer;


/**
 * 〈一句话功能简述〉<br> 
 * 〈二叉树的子结构〉
 *
 * @author Administrator
 * @create 2019/4/16
 * @since 1.0.0
 */
public class Contains {


    public static class Node{
        public int value;
        public Node left;
        public Node right;
        public Node(int data){
            this.value = data;
        }

        public boolean contians(Node t1, Node t2){
            if(t2 == null || t1 == null){
                return false;
            }
            return check(t1, t2) || contians(t1.left, t2) || contians(t1.right, t2);
        }
        public boolean check(Node t1, Node t2){
            if(t2 == null){
                return true;
            }
            if(t1 == null){
                return false;
            }
            if(t1.value == t2.value) {
                return check(t1.left, t2.left) && check(t1.right, t2.right);
            }
            return false;
        }
    }

}
