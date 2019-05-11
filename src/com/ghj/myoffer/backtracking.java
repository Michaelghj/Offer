/**
 * Copyright (C), 2019-2019,
 * FileName: backtracking
 * Author:   Administrator
 * Date:     2019/5/11 23:06
 * Description: 二叉树中和为某一值的路径
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ghj.myoffer;

import java.util.ArrayList;

/**
 * 〈一句话功能简述〉<br> 
 * 〈二叉树中和为某一值的路径〉
 *
 * @author Administrator
 * @create 2019/5/11
 * @since 1.0.0
 */
public class backtracking {
    //二叉树的声明
    public class TreeNode {
        public int val = 0;
        public TreeNode left = null;
        public TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    private ArrayList<ArrayList<Integer>> ret = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        backtracking(root, target, new ArrayList<>());
        return ret;
    }
    //递归
    private void backtracking(TreeNode node, int target, ArrayList<Integer> path) {
        if(node == null){
            return;
        }
        path.add(node.val);
        target -= node.val;
        if(node == null && node.left == null && node.right == null){
            ret.add(new ArrayList<>(path));
        }else {
            backtracking(node.left, target, path);
            backtracking(node.right, target, path);
        }
        path.remove(path.size() - 1);
    }

}
