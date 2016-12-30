package Algo;
public class Stack<T> extends List<T>
{
    Stack()
    {
        super("Stack");
    }
    public void pushData(T data)
    {
        addFromFront(data);
    }
    public T popData() throws EmptyDataError
    {
        return deleteFromFront();
    }
}
