package Algo;
public abstract class Error extends RuntimeException
{
    Error()
    {
        this("Data");
    }
    Error(String error)
    {
        System.err.println("Ooops" + error + "is empty");
    }
}

class EmptyDataError extends  Error
{
    EmptyDataError()
    {
        this("Data");
    }
    EmptyDataError(String error)
    {
        System.err.println("Ooops" + error + "is empty");
    }
}
