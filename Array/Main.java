package Array;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)
    {
        //Declare an array
        //int[] myIntArray = new int[10];

        //Or int[] myIntArray = {1,2,3,4,5,6,7,8,9,10};
        //Array length: myIntArray.length

        int[] myIntegers = getIntegers(5);
        for(int i=0; i < myIntegers.length; i++)
        {
            System.out.println("Element " + i + ", type value was "+ myIntegers[i]);
        }

        int[] anotherArray = new int[]{4,5,6,7,8};
        for(int i=0; i < anotherArray.length; i++)
        {
            System.out.println("Element " + i + ", type value was "+ anotherArray[i]);
        }
    }

    public static int[] getIntegers(int number)
    {
        System.out.println("Enter " + number + " integer values.\n");
        int[] values = new int[number];

        for(int i = 0; i < values.length; i++)
        {
            values[i] = scanner.nextInt();
        }

        return values;
    }
}
