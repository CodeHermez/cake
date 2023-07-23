public class Llist{

    Llist(){}
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




    Node root;

    public static void main(String [] args)
    {
//        Llist obj = new Llist();
//        obj.terminate();
    }
}
