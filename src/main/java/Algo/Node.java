package Algo;

public class Node<T>
{
    T data;
     Node<T> nextNode;


    Node (T data)
    {
        this(data,null);
    }

    Node(T data , Node<T> nodeLink)
    {
        this.data = data;
        this.nextNode = nodeLink;
    }

    public T getData()
    {
        return this.data;
    }
    public Node<T> getNextNode()
    {
        return nextNode;
    }

}
