public class Llist{

    Llist(){
        root = null;
    }
    public void rm_message(int a)
    {
        switch (a) {
            case 0 -> System.out.println("List is empty");
            case 1 -> System.out.println("Node was not found");
            case 2 -> System.out.println("The Node was successfully removed");
            case 3-> System.out.println("List has been terminated");
            default -> System.out.println("What are we doing today??");
        }
    }

    public void delete(int val)
    {
        if(root == null)
        {
            rm_message(0);
        }
        else
        {
            Node prev = null, trav = root;

            while(trav != null && trav.data != val)
            {
                prev = trav;
                trav = trav.next;
            }

            if(trav == null)
                rm_message(0);


            else if(trav == root)
            {
                prev = root;
                root = root.next;
                prev.del();
                rm_message(1);
            }
            else
            {
                prev.next = trav.next;
                trav.del();
            }
        }
    }


    void terminate()
    {
        if(root == null)
        {
           rm_message(0);
        }
        else
        {
            while(root != null)
            {
                Node pt = root;
                root = root.next;
                pt.del();
            }
        }
    }

    @SuppressWarnings("unchecked")
    public String toString()
    {
        Node trav = null;
        String word = "";
        if(root == null)
            return word;
        else
        {

            trav = root;
            while(trav != null)
            {
                if(trav.next == null)
                    word += trav.data;
                else
                    word += trav.data + " -> ";

                trav = trav.next;
            }
        }

        return  word;
    }

    void insert(int num) {
        if (root == null) {
            root = new Node();
            root.data = num;
        } else {
            Node nodePtr = root;
            while (nodePtr.next != null) {
                nodePtr = nodePtr.next;
            }
            nodePtr.next = new Node();
            nodePtr.next.data = num;
        }
    }

    Boolean contains(int num) {
        if (root == null) {
            return false;
        }

        Node nodePtr = root;
        while (nodePtr != null) {
            if (nodePtr.data == num) {
                return true;
            } else{
                nodePtr = nodePtr.next;
            }
        }

        return false;
    }

    void print(){
        if (root == null) {
            return;
        }

        Node nPtr = root;
        while (nPtr != null) {
            System.out.print(nPtr.data + " ");

        }

    }


    Node root;

    public static void main(String [] args)
    {
//        Llist obj = new Llist();
//        obj.terminate();
    }
}
