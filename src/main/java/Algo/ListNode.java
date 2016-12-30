package Algo;
public class ListNode<T>
{
    T data;
    ListNode<T> nextNode;
    public ListNode(T myData, ListNode<T> node)
    {
        this.data = myData;
        this.nextNode = node;
    }
    ListNode ( T onlyData)
    {
        this(onlyData,null);
    }
    ListNode()
    {
        this(null,null);
    }
}

class LinkedList<T> extends ListNode<T>
{
    ListNode<T> firstNode , lastNode;
    public LinkedList ()
    {
        super();
    }
    public void addFromData ( T dataToAdd)
    {
        if ( ( firstNode == null) && ( lastNode == null ) )
        {
            firstNode = lastNode = new ListNode<T>(dataToAdd);
        }
        else
            if ( ( firstNode != null ) && ( lastNode != null) )
            {
                firstNode = new ListNode<T>(dataToAdd, firstNode);
            }
    }
    public T removeFromFront()
    {
        T dataToRemove = firstNode.data;
        if ( (firstNode == null) && ( lastNode == null ) )
            System.err.println("Nothing to remove from....");
        if ( firstNode == lastNode )
            firstNode = lastNode = null;
        else
            firstNode = firstNode.nextNode;
        return dataToRemove;
    }
    public void addFromBack ( T thisdata )
    {
        if ( ( firstNode == null) && ( lastNode == null ) )
            firstNode = lastNode = new ListNode<T>(thisdata);
        else
            lastNode = lastNode.nextNode = new ListNode<T>(thisdata);
    }
    public T deleteFromBack() throws EmptyDataError
    {
        if ( ( firstNode == null) && ( lastNode == null ) )
            System.err.println("Nothing to remove from back....");
        T dataToRemove = lastNode.data;
        if ( firstNode == lastNode )
            firstNode = lastNode = null;
        else
        {
            ListNode<T> currentNode = firstNode;
            while ( currentNode.nextNode != lastNode)
                currentNode = currentNode.nextNode;
            lastNode = currentNode;
            currentNode.nextNode = null;
        }

        return dataToRemove;
    }
    public void displayDataUsingNode()
    {
        if ( ( firstNode == null ) && ( lastNode == null ) )
            System.out.println("Their is not dada to display currently".toUpperCase());
                ListNode<T> newCurrentNode = firstNode;
                while ( newCurrentNode != null )
                {
                    System.out.printf("%s",newCurrentNode.data);
                    newCurrentNode = newCurrentNode.nextNode;
                }
                System.out.printf("\n");
    }
}