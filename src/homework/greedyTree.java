package homework;

class binaryTree {
    int num;
    binaryTree left, right;

    public void setLeftNode(binaryTree leftNode) {
        this.left = leftNode;
    }

    public void setRightNode(binaryTree rightNode) {
        this.right = rightNode;
    }

    public binaryTree getLeftNode() {
        return this.left;
    }

    public binaryTree getRightNode() {
        return this.right;
    }

    public int getNum() {
        return this.num;
    }

    public binaryTree(int num) {
        this.num = num;
    }
}
public class greedyTree { //이진트리 생성
    static binaryTree rootnode = new binaryTree(1);
    static binaryTree node1 = new binaryTree(10);
    static binaryTree node2 = new binaryTree(3);
    static binaryTree node3 = new binaryTree(9);
    static binaryTree node4 = new binaryTree(5);
    static binaryTree node5 = new binaryTree(4);
    static binaryTree node6 = new binaryTree(36);
    static binaryTree node7 = new binaryTree(8);
    static binaryTree node8 = new binaryTree(47);
    static binaryTree node9 = new binaryTree(13);
    static binaryTree node10 = new binaryTree(2);
    static binaryTree node11 = new binaryTree(8);
    static binaryTree node12 = new binaryTree(1);
    static binaryTree node13 = new binaryTree(2);
    static binaryTree node14 = new binaryTree(4);

    // 자식 노드 정해주기
    static void setBinaryTree() {
        rootnode.setLeftNode(node1); rootnode.setRightNode(node2);
        node1.setLeftNode(node3); node1.setRightNode(node4);
        node2.setLeftNode(node5); node2.setRightNode(node6);
        node3.setLeftNode(node7); node3.setRightNode(node8);
        node4.setLeftNode(node9); node4.setRightNode(node10);
        node5.setLeftNode(node11); node5.setRightNode(node12);
        node6.setLeftNode(node13); node6.setRightNode(node14);

    }

    public static int greedyTree(binaryTree tree) {
        int min_sum = tree.getNum();
        if(tree.getLeftNode()!=null && tree.getRightNode()!=null) {
            if(tree.getLeftNode().getNum()<=tree.getRightNode().getNum()) {
                min_sum += greedyTree(tree.getLeftNode());
            }
            else if(tree.getLeftNode().getNum()>tree.getRightNode().getNum()) {
                min_sum += greedyTree(tree.getRightNode());
            }
        }
        return min_sum;
    }
    public static void main(String[] args) {
        setBinaryTree();
        System.out.println("탐욕기법을 적용한 이진트리 경로의 최소합은 아래와 같습니다.");
        System.out.println(greedyTree(rootnode));
    }

}
