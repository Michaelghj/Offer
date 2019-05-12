/**
 * Copyright (C), 2019-2019,
 * FileName: DeserializeDemo
 * Author:   Administrator
 * Date:     2019/5/12 22:37
 * Description: 序列化二叉树
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ghj.myoffer;

/**
 * 〈一句话功能简述〉<br> 
 * 〈序列化二叉树〉
 *
 * @author Administrator
 * @create 2019/5/12
 * @since 1.0.0
 */
public class DeserializeDemo {
    public class TreeNode{
        public int value;
        public TreeNode left;
        public TreeNode right;
        public TreeNode(int data){
            this.value = data;
        }
    }
    private String deserializeStr;

    public String Serialize(TreeNode root) {
        if (root == null)
            return "#";
        return root.value + " " + Serialize(root.left) + " " + Serialize(root.right);
    }

    public TreeNode Deserialize(String str) {
        deserializeStr = str;
        return Deserialize();
    }

    private TreeNode Deserialize() {
        if (deserializeStr.length() == 0)
            return null;
        int index = deserializeStr.indexOf(" ");
        String node = index == -1 ? deserializeStr : deserializeStr.substring(0, index);
        deserializeStr = index == -1 ? "" : deserializeStr.substring(index + 1);
        if (node.equals("#"))
            return null;
        int val = Integer.valueOf(node);
        TreeNode t = new TreeNode(val);
        t.left = Deserialize();
        t.right = Deserialize();
        return t;
    }

}
