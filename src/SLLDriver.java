public class SLLDriver
{
    public static void main(String[] args)
    {
        //SLL = Single Linked List
        PracSLL mySLL = new PracSLL();
        mySLL.addNodeToStart(25);
        mySLL.addNodeToStart(38);
        mySLL.addNodeToStart(-45);
        mySLL.showList();

        System.out.println("The list length is: " + mySLL.length());

        mySLL.setData(25,8);
        mySLL.deleteNodeFromStart();
        mySLL.showList();
        System.out.println("The list length is: " + mySLL.length());
    }
}//end class
