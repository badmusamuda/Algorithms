package Algo;
public class List<T>
{
    private Node<T> firstNode;
    private Node<T> lastNode;
    private String algoType;

    public void addFromFront ( T thisdata )
    {
        if ( isEmpty() )
            firstNode = lastNode = new Node<T>(thisdata);
        else
            firstNode = new Node<T>(thisdata, firstNode);
    }
    public T deleteFromFront() throws EmptyDataError
    {
        if ( isEmpty() )
            throw new EmptyDataError("Node with Data");
        T dataToRemove = firstNode.data;
        if ( firstNode == lastNode )
            firstNode = lastNode = null;
        else
            firstNode = firstNode.nextNode;

        return dataToRemove;
    }

    public void addFromBack ( T thisdata )
    {
        if ( isEmpty() )
            firstNode = lastNode = new Node<T>(thisdata);
        else
            lastNode = lastNode.nextNode = new Node<T>(thisdata);
    }
    public T deleteFromBack() throws EmptyDataError
    {
        if ( isEmpty() )
            throw new EmptyDataError("Node with Data");
        T dataToRemove = lastNode.data;
        if ( firstNode == lastNode )
            firstNode = lastNode = null;
        else
        {
            Node<T> currentNode = firstNode;
            while ( currentNode.nextNode != lastNode)
                currentNode = currentNode.nextNode;
            lastNode = currentNode;
            currentNode.nextNode = null;
        }

        return dataToRemove;
    }

    public void displayData()
    {
        if ( isEmpty() ){
            System.out.printf("Ooops %s is Empty", algoType);
        }
            Node<T> currentNode = firstNode;
            while( currentNode != null )
            {
                System.out.printf("%s ",currentNode.data);
                currentNode = currentNode.nextNode;
            }
            System.out.println("\n");
        }

    List()
    {
        this("Data");
    }
    List( String dataType )
    {
        this.algoType = dataType;
    }
    public boolean isEmpty()
    {
        return firstNode == null;
    }
}
