import java.util.Scanner;

class TreeBuilding{
    Node root;
    class Node{
        int value;
        Node left;
        Node right;
        Node(int value){
            this.value=value;
        }
        
    }
    void add(Node curr,Scanner sc){
        
        if(curr==null){
            System.out.println("add root node");
            int data=sc.nextInt();
            Node newNode=new Node(data);
            root=newNode; 
            add(newNode, sc);
        }
        System.out.println("add node in left");
        boolean left=sc.nextBoolean();
        if(left){
         System.out.println("enter the left node");
         int data=sc.nextInt();
         Node newNode=new Node(data);
         curr.left=newNode;
         add(newNode, sc);
        }

        System.out.println("add node in the right");
        boolean right=sc.nextBoolean();
        if(right){
            System.out.println("enter the right node");
            int data=sc.nextInt();
            Node newNode=new Node(data);
            curr.right=newNode;
            add(newNode,sc);
        }
    }
    void display(Node temp){
        if(temp==null){
            return;
        }
        System.out.println(temp.value);
        display(temp.left);
        display(temp.right);
    }
    public static void main(String[] args) {
        TreeBuilding tree=new TreeBuilding();
        Scanner sc=new Scanner(System.in);
        tree.add(tree.root,sc);
        tree.display(tree.root);
    }
}