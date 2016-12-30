package Algo;

public class Queue<T> extends List<T>
{
    private List<T> queueList;

    Queue()
    {
        queueList = new List<T>("On Queue");
    }
    public void addToQueueFromBack ( T toBack)
    {
        queueList.addFromBack(toBack);
    }
    public T removeInQueueFromFront () throws EmptyDataError
    {
        return queueList.deleteFromFront();
    }
    public boolean isEmpty()
    {
        return queueList.isEmpty();
    }
    public void displayQueueData()
    {
        queueList.displayData();
    }
}
