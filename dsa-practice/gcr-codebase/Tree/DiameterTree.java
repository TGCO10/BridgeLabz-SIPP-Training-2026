package gcrCodebase.Tree;

public class DiameterTree {
    static int diameter = 0;
    static int height(Node root) {
        if (root == null)
            return -1;

        int left = height(root.left);
        int right = height(root.right);

        diameter = Math.max(diameter,
                left + right + 2);

        return Math.max(left, right) + 1;
    }

    static int getDiameter(Node root) {
        diameter = 0;
        height(root);
        return diameter;
    }
}