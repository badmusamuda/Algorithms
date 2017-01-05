package AI;
import java.util.*;
public class Sort 
{
	private static Scanner rfk = new Scanner ( System.in );
	private static Random random = new Random();
	private static String name;
	private static final int ZERO = 0 , ONE = 1 , TWO = 2; 
	private static int[] data = {23,12,1,9,-14,56,78,45,98,0,10};
	public static void main ( String[] argssss)
	{
		for ( int normal : data )
			System.out.print( normal + "  ");
		System.out.println(" \nUn-sorted data");
		bubbleSort();
		selectiveSort();
		insertionSort();
	}
    public static void bubbleSort()
	{
		for ( int index2 = data.length - ONE ; index2 > ZERO ; index2--)
			for ( int index = ZERO; index < index2; index++)
			{
				if ( ( data[index] > data[index + ONE] )  )
					swapData(index);
			}
			System.out.println("Bubble Sort ( ascending Order )");
			for ( int myData : data )
				System.out.print(myData + "  ");
			for ( int c = data.length - ONE ; c > ZERO; c--)
			{
				for ( int b = ZERO; b < c; b++)
					if ( data[b] < data[b + ONE ] )
						swapData(b);
			}	
			System.out.println("\nBubble Sort ( descending Order )");
				for ( int desce : data )
					System.out.print( desce + "  ");
		}
		public static void selectiveSort ()
		{
			int max;
			for ( int a = ZERO; a < data.length - ONE; a++)
			{
				max = a;
				for ( int b = a + ONE ; b < data.length; b++)
				{
					if ( data[b] < data[max] )
						max = b;
					swapData(a);
				}
			}
			System.out.print("\nSlective Rubbish sort ( Ascending ) : \n");
				for ( int ascend : data )
					System.out.print(ascend + "  ");
				int max2;
				for ( int c = ZERO; c < data.length - ONE; c++)
			   {
				max2 = c;
				for ( int d = c + ONE ; d < data.length; d++)
				{
					if ( data[d] > data[max2] )
					{
						swapData(c);
						max2 = d;
					}
				}
			}
			System.out.print("\nSlective sort ( Descending ) : \n");
				for ( int descend : data )
					System.out.print(descend + "  ");
		}
		
		public static void insertionSort()
		{
			int in, out;
			for(out = ONE; out < data.length; out++)
			{
				int temp = data[out];
				in = out;
				while(in> ZERO && data[in-1] >= temp) 
				{
					data[in] = data[in-1]; 
					--in; 
				}
					data[in] = temp; 
			} 
			System.out.print("\nInsertive sort ( Ascending ) : \n");
				for ( int descend : data )
					System.out.print(descend + "  ");
		}
	public static void swapData ( int dataIndex )
	{
		int tempData = data[ dataIndex ];
		data[ dataIndex ] = data[ dataIndex + ONE ];
		data[ dataIndex + ONE ] = tempData;
	}	
	public static void randomRawData ()
	{
		System.out.print("Enter data size : ");
		int size = rfk.nextInt();
		int []okay = new int[size];
		for (int d = 0; d < okay.length; d++)
			okay[d] = ONE * d + ONE /  ONE * d + ONE % ONE + random.nextInt(10);
		for ( int getIT : okay )
			System.out.print(getIT + "  ");
	}

}

