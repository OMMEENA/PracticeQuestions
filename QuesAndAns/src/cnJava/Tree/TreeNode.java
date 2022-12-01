package cnJava.Tree;

import java.util.ArrayList;

public class TreeNode<T> {
    public T data;
    public ArrayList<TreeNode<T>> ChildNode;

    public TreeNode(T data) {
        this.data = data;
        ChildNode = new ArrayList<>();
    }
}
