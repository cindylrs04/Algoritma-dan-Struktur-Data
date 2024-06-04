package Code;

public class BinaryTree08 {

    Node08 root;

public BinaryTree08() {
    root = null;
}

boolean isEmpty() {
    return root == null;
}

void add(int data) {
    root = addRecursive(root, data);
}

private Node08 addRecursive(Node08 current, int data) {
    if (current == null) {
        return new Node08(data);
    }

    if (data < current.data) {
        current.left = addRecursive(current.left, data);
    } else if (data > current.data) {
        current.right = addRecursive(current.right, data);
    }

    return current;
}

Node08 find(int data) {
    return findRecursive(root, data);
}

private Node08 findRecursive(Node08 current, int data) {
    if (current == null || current.data == data) {
        return current;
    }

    if (data < current.data) {
        return findRecursive(current.left, data);
    } else {
        return findRecursive(current.right, data);
    }
}

void traversePreOrder(Node08 node) {
    if (node != null) {
        System.out.print(node.data + " ");
        traversePreOrder(node.left);
        traversePreOrder(node.right);
    }
}

void traversePostOrder(Node08 node) {
    if (node != null) {
        traversePostOrder(node.left);
        traversePostOrder(node.right);
        System.out.print(node.data + " ");
    }
}

void traverseInOrder(Node08 node) {
    if (node != null) {
        traverseInOrder(node.left);
        System.out.print(node.data + " ");
        traverseInOrder(node.right);
    }
}

Node08 getSuccessor(Node08 del) {
    Node08 successor = del.right;
    Node08 successorParent = del;
    while (successor.left != null) {
        successorParent = successor;
        successor = successor.left;
    }
    if (successor != del.right) {
        successorParent.left = successor.right;
        successor.right = del.right;
    }
    return successor;
}

void delete(int data) {
    root = deleteRecursive(root, data);
}

private Node08 deleteRecursive(Node08 current, int data) {
    if (current == null) {
        return null;
    }

    if (data == current.data) {
        if (current.left == null && current.right == null) {
            return null;
        }
        if (current.left == null) {
            return current.right;
        }
        if (current.right == null) {
            return current.left;
        }
        int smallestValue = findSmallestValue(current.right);
        current.data = smallestValue;
        current.right = deleteRecursive(current.right, smallestValue);
        return current;
    }

    if (data < current.data) {
        current.left = deleteRecursive(current.left, data);
    } else {
        current.right = deleteRecursive(current.right, data);
    }

    return current;
}

private int findSmallestValue(Node08 root) {
    return root.left == null ? root.data : findSmallestValue(root.left);
}

public int findMinValue() {
    if (isEmpty()) {
        System.out.println("Tree is empty.");
        return Integer.MIN_VALUE;
    }
    Node08 current = root;
    while (current.left != null) {
        current = current.left;
    }
    return current.data;
}

public int findMaxValue() {
    if (isEmpty()) {
        System.out.println("Tree is empty.");
        return Integer.MAX_VALUE;
    }
    Node08 current = root;
    while (current.right != null) {
        current = current.right;
    }
    return current.data;
}

public void displayLeafNodes() {
    if (isEmpty()) {
        System.out.println("Tree is empty.");
        return;
    }
    System.out.print("Leaf nodes: ");
    displayLeafNodesRecursive(root);
    System.out.println();
}

private void displayLeafNodesRecursive(Node08 node) {
    if (node != null) {
        if (node.left == null && node.right == null) {
            System.out.print(node.data + " ");
        }
        displayLeafNodesRecursive(node.left);
        displayLeafNodesRecursive(node.right);
    }
}

public int countLeaves() {
    return countLeavesRecursive(root);
}

private int countLeavesRecursive(Node08 node) {
    if (node == null) {
        return 0;
    }
    if (node.left == null && node.right == null) {
        return 1;
    }
    return countLeavesRecursive(node.left) + countLeavesRecursive(node.right);
}
}