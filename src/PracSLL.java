public class PracSLL
{
    //variables
    private Node head;

    //constructor
    public PracSLL()
    {
        head = null;
    }

    //to populate the list
    public void addNodeToStart(int addData)
    {
        head = new Node(addData, head); //refers to the old head as the link
    }

    public void deleteNodeFromStart()
    {
        if(head != null)
        {
            head = head.getLink();
        }
        else
        {
            System.out.println("Delete from an empty list?");
            System.exit(0);
        }
    }
    public boolean hasNext()
    {
        Node position = head;
        if(position.getLink() != null)
        {
            return true;
        }
        return false;
    }//end method has next

    public int length()
    {
        int count = 0;
        Node position = head;
        while(position != null)
        {
            count ++;
            position = position.getLink();
        }
        return count;
    }


    //to display the list
    public void showList()
    {
        Node position = head;
        while(position != null)
        {
            System.out.println(position.getData());
            position = position.getLink();
        }
    }
    private static class Node
    {
        //instance variables
        private int data;
        private Node link; //instance of a self-referencing class

        //constructors
        //public only in the class in which the private class exists
        public Node(int data, Node link)
        {
            this.data = data;
            this.link = link;
        }
        //getters/setters
        public int getData()
        {
            return data;
        }

        public Node getLink() {
            return link;
        }

        public void setData(int data) {
            this.data = data;
        }

        public void setLink(Node link) {
            this.link = link;
        }

        //toString
        public String toString()
        {
            return "data: " + data + " links to " + link;
        }

    }
}
