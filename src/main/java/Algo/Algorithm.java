package Algo;
import java.util.Scanner;

public class Algorithm
{

    public static void main ( String [] args2)
    {
        runQueueTest();
    }

    public static void runQueueTest()
    {
        Queue<String> please = new Queue<String>();
        System.out.printf("\t%s","Adding Data to QUEUE from Back....\n".toUpperCase());
        please.addToQueueFromBack("H");
        please.displayQueueData();
        please.addToQueueFromBack("A");
        please.displayQueueData();
        please.addToQueueFromBack("P");
        please.displayQueueData();
        please.addToQueueFromBack("P");
        please.displayQueueData();
        please.addToQueueFromBack("Y");
        please.displayQueueData();
        System.out.printf("\t%s","Removing Data from  Queue at Front....\n".toUpperCase());
        please.removeInQueueFromFront();
        please.displayQueueData();
        please.removeInQueueFromFront();
        please.displayQueueData();
        please.removeInQueueFromFront();
        please.displayQueueData();
        please.removeInQueueFromFront();
        please.displayQueueData();
    }
    public static void runStackTest()
    {
        Stack<String> rawStack = new Stack<String>();
        System.out.printf("\t%s","Adding stack data from front....\n".toUpperCase());
        rawStack.pushData("H");
        rawStack.displayData();
        rawStack.pushData("A");
        rawStack.displayData();
        rawStack.pushData("P");
        rawStack.displayData();
        rawStack.pushData("P");
        rawStack.displayData();
        rawStack.pushData("Y");
        rawStack.displayData();
        System.out.printf("\t%s","Removing stack data from front....\n".toUpperCase());
        rawStack.popData();
        rawStack.displayData();
        rawStack.popData();
        rawStack.displayData();
        rawStack.popData();
        rawStack.displayData();
        rawStack.popData();
        rawStack.displayData();
    }
    public static void runListTest()
    {
        List<String> rawListing = new List<String>();
        System.out.printf("\t%s","Adding list data from Back....\n".toUpperCase());
        rawListing.addFromFront("H");
        rawListing.displayData();
        rawListing.addFromFront("A");
        rawListing.displayData();
        rawListing.addFromFront("P");
        rawListing.displayData();
        rawListing.addFromFront("P");
        rawListing.displayData();
        rawListing.addFromFront("Y");
        rawListing.displayData();
        System.out.printf("\t%s","Removing list data from Back....\n".toUpperCase());
        rawListing.deleteFromBack();
        rawListing.displayData();
        rawListing.deleteFromBack();
        rawListing.displayData();
        rawListing.deleteFromBack();
        rawListing.displayData();
        rawListing.deleteFromBack();
        rawListing.displayData();
        rawListing.deleteFromBack();
        rawListing.displayData();
    }
    public static void  trinarySearchRawText()
    {
        System.out.printf("See the data below Search them \n");

        try
        {
            for ( int getData : testData)
                System.out.printf("%d ",getData);
            Scanner rfk = new Scanner(System.in);
            for ( int a = 0; a < 13; a++){
                System.out.print("\nEnter Data : ");
                int datas = rfk.nextInt();
                System.out.println(Search.trinarySeacrh(testData,datas));
            }
        }
        catch ( Exception error)
        {
            System.out.println("Ooops NOT FOUND "+ error.getCause());

        }
    }
    static int[] testData = {23, 12, 45, 6, 79, 34, 59,100,78,40,92,41,76,67,87,73,90,102,109,1000001,10001,1001,1003,112,101,159};

}
