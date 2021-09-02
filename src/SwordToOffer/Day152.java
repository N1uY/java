package SwordToOffer;




public class Day152 {
    private class Node {
        public int val;
        public Node left;
        public Node right;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right) {
            val = _val;
            left = _left;
            right = _right;
        }
    };
    Node pre = new Node();
    public Node treeToDoublyList(Node root) {
        if(root==null)return root;
        Node pre = new Node();
        Node p = root;
        Node findHead = root;
        while (findHead.left!=null){
            findHead = findHead.left;
        }
        Node findTail=root;
        while (findTail.right!=null){
            findTail = findTail.right;
        }

        inOrder(p);
        findHead.left = findTail;

        findTail.right = findHead;


        return findHead;

    }
    void inOrder(Node p){
        if(p!=null){

            inOrder(p.left);
            pre.right = p;
            p.left = pre;
            pre = p;
            System.out.println(pre.val);
            inOrder(p.right);
        }
        else{
            System.out.println("空节点");
            return ;
        }
    }
}
