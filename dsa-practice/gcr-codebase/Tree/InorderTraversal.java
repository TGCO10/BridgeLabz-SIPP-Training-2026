package gcrCodebase.Tree;

import java.util.*;

public class InorderTraversal {
    static void inorder(Node root, List<Integer> result) {
        if (root == null)
            return;

        inorder(root.left, result);
        result.add(root.val);
        inorder(root.right, result);
    }

    static List<Integer> getSortedLeaderboard(Node root) {
        List<Integer> result = new ArrayList<>();
        inorder(root, result);
        return result;
    }
}