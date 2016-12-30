package Algo;

import java.util.Scanner;

public class Display
{
    protected static final int ONE = 1, ZERO = 0 , TWO = 2 , STOP = -1 , MAINMENU = 1, QUIT = 0, ADDFROMFRONT = 3, ADDFRONFBACK = 2 ,DELETEFROMFRONT = 5, DELETEFROMBACK = 4, TRINARYSEARCH = 6 , STACK = 7, QUEUE = 9;
    static final String deleteFromFront ="Delete from front", deleteFromBack ="Delete from back", to ="To", forThis ="For",type = "Type ", mainMenu  = "Main Menu", quit = "Quit", fromFront = "Type backward", fromBack = "Type Forward", trinary ="Trinary Search" ,stack="Stack", queue ="Queue";
    static int MENU ; static String newdata , quits = "Quit",front ="(", back =")";
    static Scanner rfk = new Scanner (System.in); static String textOrData, terminate = "-1";
    public static void runAlgo ()
    {
        LinkedList<String> data = new LinkedList<String>();
        menuPrompt();
        try {
            switch (MENU = rfk.nextInt() ) {
                case ADDFRONFBACK:
                    {
                        System.out.println("Linked List : Add from front");
                    System.out.printf("Enter Data or Text ( Type Quit to stop or use %s to delete from back and %s to dlete from front and Type option menu) : ",back,front);
                    newdata = rfk.nextLine();
                            while (!(newdata.equalsIgnoreCase(quit)))
                            {
                                newdata = rfk.nextLine();
                                data.addFromData(newdata);
                                data.displayDataUsingNode();
                            }
                    }
                    break;
                case ADDFROMFRONT: {
                    System.out.println("Linked List : Add from Back");
                    System.out.printf("Enter Data or Text ( Type Quit to stop or use %s to delete from back and %s to dlete from front and Type option menu) : ",back,front);
                    newdata = rfk.nextLine();
                    while (!(newdata.equalsIgnoreCase(quit))) {

                            newdata = rfk.nextLine();
                            data.addFromBack(newdata);
                            data.displayDataUsingNode();
                        }
                    }
                    break;
                case DELETEFROMBACK: {
                    System.out.println("Linked List : Delete from back");
                    System.out.printf("Enter Data or Text ( Type Quit to stop or Type option menu) : ");
                    newdata = rfk.nextLine();
                    while (!(newdata.equalsIgnoreCase(quit))) {
                        newdata = rfk.nextLine();
                        data.deleteFromBack();
                        data.displayDataUsingNode();
                    }
                    break;
                }
                case STACK: {
                    System.out.println("Stack");
                    System.out.printf("Enter Data or Text ( Type Quit to stop or Type option menu) : ");
                    newdata = rfk.nextLine();
                    while (!(newdata.equalsIgnoreCase(quit))) {
                        newdata = rfk.nextLine();
                        data.removeFromFront();
                        data.displayDataUsingNode();
                    }
                    break;
                }
                    case DELETEFROMFRONT:
                        {
                            System.out.println("Linked List : Delete from front");
                            System.out.printf("Enter Data or Text ( Type Quit to stop or Type option menu) : ");
                            newdata = rfk.nextLine();
                                while (!(newdata.equalsIgnoreCase(quit)))
                                {
                                    newdata = rfk.nextLine();
                                    data.addFromData(newdata);
                                    data.displayDataUsingNode();
                                }
                                    break;
                        }
                case TRINARYSEARCH:
                {
                    System.out.println("Trinary Seaarh Algo...");
                    System.out.printf("See the data below Search them \n");

                    try
                    {
                        for ( int getData : Algorithm.testData)
                            System.out.printf("%d ",getData);
                        Scanner rfk = new Scanner(System.in);
                        for ( int a = 0; a < 13; a++){
                            System.out.print("\nEnter Data : ");
                            int datas = rfk.nextInt();
                            System.out.println(Search.trinarySeacrh(Algorithm.testData,datas));
                        }
                    }
                    catch ( Exception error)
                    {
                        System.out.println("Ooops NOT FOUND "+ error.getCause());

                    }
                }
                break;
                case QUIT:
                    System.out.println("Quiting.... Bye Bye");

                break;

            default:
                    break;
            }
        }
        catch ( Exception error)
        {
            System.err.println("Invalid option selected...\nPlease run me again and make sure you enter correct option");
        }

    }
    private static void menuPrompt()
    {
        System.out.printf("Hi... Welcome to my Algorithm and Data Structures\n\n\n%s %s",forThis,mainMenu);
        System.out.printf(" %s %s",to,fromFront);
        System.out.printf(" %5s %s",to,fromBack);
        System.out.printf(" %5s %s",to,deleteFromBack);
        System.out.printf(" %5s %s",to,deleteFromFront);
        System.out.printf(" %5s %s",forThis,trinary);
        System.out.printf(" %5s %s",forThis,stack);
        System.out.printf(" %5s %s",forThis,queue);
            System.out.printf(" %5s %s\n",to,quit);
            System.out.printf("%8s%d%15s%d%18s%d%19s%d%23s%d%23s%d%15s%d%10s%d%11s%d\n",type,MAINMENU,type,ADDFROMFRONT,type,ADDFRONFBACK,type,DELETEFROMBACK,type,DELETEFROMFRONT,type,TRINARYSEARCH,type,STACK,type,QUEUE,type,QUIT);

    }
}
