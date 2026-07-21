package gcrCodebase.Tree;

public class TreeHeight {
    static int height(Node root) {
        if (root == null)
            return -1;

        return Math.max(height(root.left),
                height(root.right)) + 1;
    }

    static boolean isTooDeep(Node root, int threshold) {
        return height(root) > threshold;
    }
}