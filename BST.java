import java.util.Queue;
import java.util.LinkedList;

// i have made some changes after cloning the branch




class node<T> {
    T data;
    node<T> left;
    node<T> right;
    node(T d){
        data=d;
        left = right = null;
    }
}
public class BST<T extends Comparable<T>> {
    node<T> root;
    int count;
    public void insert(T key)
    {
        node<T> n =new node<T>(key);
        if(root==null)
        {
            root=n;
        }
        else{
            node<T> temp=root;
            node<T> prev=root;
            while(temp!=null){
                if (n.data.compareTo(temp.data) <= 0)
                {
                    prev = temp;
                    temp = temp.left;
                } else {
                    prev = temp;
                    temp = temp.right;
                }
            }
            if (n.data.compareTo(prev.data) <= 0)
            {
                prev.left = n;
            } else {
                prev.right = n;
            }

        }
        count++;
    }
    public void traverse(node n)
    {
        if ( root == null ){
            return;
        }
    }

//    public node find(T key){ … } // find key in a tree

    void print(){
        if (root == null) {
            System.out.println("empty tree"); return;
        }
        Queue<node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            node temp = q.peek();
            q.remove();
            System.out.println(temp.data);

            if (temp.left != null)
            {
                temp.left = (node) q;
                System.out.println(temp.left.data);

            }
            else{
                System.out.println(temp.left.data);
            }
            if (temp.right != null)
            {
                temp.right = (node) q;
                System.out.println(temp.right.data);
            }
            else

                System.out.println(temp.right.data);
        }}


    public static void main(String[] args) {
        BST<Integer> bs = new BST<Integer>();

        bs.insert(5);
        bs.insert(9);
        bs.insert(6);
        bs.insert(4);
        bs.insert(7);
        bs.insert(8);
    }
}
