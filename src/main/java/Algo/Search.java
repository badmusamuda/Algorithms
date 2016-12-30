package Algo;

import java.util.Arrays;

/**
 * Created by  User on 12/28/2016. Algorithm Algo
 */
public class Search {
    public static int ZERO = 0, ONE = 1, TWO = 2;
    private static boolean repeat = true;

    public static <T> String trinarySeacrh (int[] data , int find)
    {
        Arrays.sort(data);
        int ofIniFirstIndex = App.ZERO, ofIniLastIndex = data.length-1, ofIniMiddleIndex = ( ofIniFirstIndex + ofIniLastIndex ) / TWO, ofFirstIndex = ofIniFirstIndex , ofLastIndex = ofIniLastIndex , ofMiddleIndex = ofIniMiddleIndex;
        int iniFirstData = data[ofIniFirstIndex] , iniLastData = data[ofIniLastIndex] , iniMiddleData = data[ofIniMiddleIndex] , firstData = data[ofIniFirstIndex] , lastData = data[ofIniLastIndex] , middleData = data[ofIniMiddleIndex];
        for ( int get : data)
            System.out.printf("%d ",get);
        if ( find == iniFirstData )
        {
            String searchMessage = String.format("\nFisrt searching... \n Found (%d) At the Initial First index [%d] \n In Which The First Middle Data is (%d) with position [%d] \n And The First LAST Data is (%d) with position [%d]",find ,ofIniFirstIndex , iniMiddleData , ofIniMiddleIndex , iniLastData , ofIniLastIndex);
            return searchMessage;
        }
        else
        if ( find == iniMiddleData )
        {
            String searchMessage = String.format("\nFisrt searching... \n Found (%d) At First Middle Index with the index [%d] \n In Which The First Data is (%d) with position [%d] \n And The First LAST Data is (%d) with position [%d]",find ,ofIniMiddleIndex , iniFirstData , ofIniFirstIndex , iniLastData , ofIniLastIndex);
            return searchMessage;
        }
        else
        if ( find == iniLastData )
        {
            String searchMessage = String.format("\nFisrt searching... \n Found (%d) At First BACK Index with the index [%d] \n In Which The Middle Data is (%d) with position [%d] \n And The First FRONT Data is (%d) with position [%d]",find ,ofIniLastIndex , iniMiddleData , ofIniMiddleIndex , iniFirstData , ofIniFirstIndex);
            return searchMessage;
        }
        else
        if ( find < iniMiddleData )
        {
            do {
                boolean repeat = true;
                ofFirstIndex = ofFirstIndex + App.ONE;
                firstData = data[ofFirstIndex];
                ofLastIndex =  ofMiddleIndex - App.ONE;
                lastData = data[ofLastIndex];
                ofMiddleIndex = ( ofFirstIndex + ofLastIndex ) / App.TWO;
                middleData = data[ofMiddleIndex];
                if (find == firstData) {
                    repeat = false;
                    String searchMessage = String.format( "\nSecond searching... \n Found (%d) At the Initial END index [%d] \n In Which The First Middle Data is (%d) with position [%d] \n And The First FRONT Data is (%d) with position [%d]", find, ofFirstIndex, middleData, ofMiddleIndex, lastData, ofLastIndex );
                    return searchMessage;
                }
                else
                if ( find == middleData )
                {
                    repeat = false;
                    String searchMessage = String.format("\nSecond searching... \n Found (%d) At First Middle Index with the index [%d] \n In Which The First FRONT Data is (%d) with position [%d] \n And The First LAST END Data is (%d) with position [%d]",find ,ofMiddleIndex , firstData , ofFirstIndex , lastData , ofLastIndex);
                    return searchMessage;
                }
                else
                if ( find == lastData )
                {
                    repeat = false;
                    String searchMessage = String.format("\nSecond searching... \n Found (%d) At First Last Index with the index [%d] \n In Which The First MIDDLE Data is (%d) with position [%d] \n And The First FRONT Data is (%d) with position [%d]",find ,ofLastIndex , middleData , ofMiddleIndex , firstData , ofFirstIndex);
                    return searchMessage;
                }
            }while( repeat );
        }


        return  " Not found " ;
    }

    private static <T> String binarySearch ( int find, int[] data )
    {
        Arrays.sort(data);
        int firstLength = ZERO;
        int lastLength = data.length - 1;
        int middleLength = ( lastLength + ONE ) / TWO;
        int iniMiddleLength = ( firstLength + lastLength + 1 ) / TWO;

        int firstData = data[ZERO];
        int lastData = data[lastLength];
        boolean repeat = true;
        int middleData = data[middleLength];
        for ( int getData : data)
            System.out.printf("%d ", getData);
        System.out.println();
        if ( ( find == firstData ) )
        {
            return "\nFirst Searching ("+ find+")"+" FOUND AT FIRST INDEX \nFIRST DATA >>> " + find +" | POSITION " + firstLength +"" +
                    "\n"+ "MIDDLE DATA " + middleData +" POSITION " +middleLength + "\nLAST DATA  " + lastData +" POSITION " + lastLength;
        }
        else
        if ( ( find == middleData ) )
        {
            return "\nFirst Searching ("+ find+")"+" FOUND AT MIDDLE INDEX \nMIDDLE DATA >>> " + find +" | POSITION " + middleLength +"" +
                    "\n"+"FIRST DATA " + firstData +" POSITION " + firstLength + "\nLAST DATA  " + lastData +" POSITION " + lastLength;
        }
        else
        if ( ( find == lastData ) )
        {
            return "\nFirst Searching ("+ find+")"+" FOUND AT LAST INDEX \nLAST DATA >>> " + find +" | POSITION " + lastLength +"" +
                    "\n"+"FIRST DATA " + firstData +" POSITION " + firstLength + "\nMIDDLE DATA  " + middleData +" POSITION " + middleLength;
        }
        else
        if ( find < middleData )
            do
            {
                firstLength = firstLength + ONE; // index 1
                firstData = data[firstLength]; // data at index 1
                lastLength = middleLength - ONE; // index 499,999
                lastData = data[lastLength]; // data at index 499,999
                middleLength = ( firstLength + lastLength ) / TWO ; //249,999 index
                middleData = data[middleLength]; // data at index 249,999
                if ( ( find == firstData ) )
                {
                    repeat = false;
                    return "\nSecond Searching ("+ find+")"+" FOUND AT FIRST INDEX \nFIRST DATA >>> " + find +" | POSITION " + firstLength +"" +
                            "\n"+ "MIDDLE DATA " + middleData +" POSITION " +middleLength + "\nLAST DATA  " + lastData +" POSITION " + lastLength;
                }
                else
                if ( ( find == middleData ) )
                {
                    repeat = false;
                    return "\nSecond Searching ("+ find+")"+" FOUND AT MIDDLE INDEX \nMIDDLE DATA >>> " + find +" | POSITION " + middleLength +"" +
                            "\n"+"FIRST DATA " + firstData +" POSITION " + firstLength + "\nLAST DATA  " + lastData +" POSITION " + lastLength;
                }
                else
                if ( ( find == lastData ) )
                {
                    repeat = false;
                    return "\nSecond Searching ("+ find+")"+" FOUND AT LAST INDEX \nLAST DATA >>> " + find +" | POSITION " + lastLength +"" +
                            "\n"+"FIRST DATA " + firstData +" POSITION " + firstLength + "\nMIDDLE DATA  " + middleData +" POSITION " + middleLength;
                }

            } while ( repeat );


        return find + " Not found";
    }
}
