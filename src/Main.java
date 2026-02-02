import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static Scanner scanner =  new Scanner(System.in);
 static class Node {
     Node left;
     Node right;
     int data;

     Node(int data) {
         this.data = data;
         left = null;
         right = null;
     }
 }
static Node createTree() {
    System.out.print("Enter the data (-1 to exit): ");
    int data = scanner.nextInt();

    if (data == -1) {
        return null;
    }

    Node root = new Node(data);

    System.out.println("Enter data for lef " + data);
    root.left = createTree();

    System.out.println("Enter the data for right " + data);
    root.right = createTree();

    return root;
}

static void printtree(Node root){
     if(root==null){
         return;
     }
     Queue<Node> q = new LinkedList<>();
     q.add(root);

     while(!q.isEmpty()){
           Node curr = q.poll();
         System.out.println(curr.data);

         if(curr.left!=null){
             q.add(curr.left);
         }
         if(curr.right!=null){
             q.add(curr.right);
         }

     }

}

public static void main(String[] args) {
    Node root = createTree();
    printtree(root);

    // Perform operations on the constructed tree if needed


}
}
