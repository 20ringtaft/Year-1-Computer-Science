
/**
// AUTHOR: Taft Ring
// FILENAME: Assignment6
// SPECIFICATION: Sets up the Array
// FOR: CS 1400 - ASSIGNMENT #6
// TIME SPENT: 90 minutes
 */
import java.util.*;
public class Collection
{
    private int count = 0;
    private int[] numArray;
    //assigns a size to the integer array
    public Collection(int arraySize)
    {
        numArray = new int[arraySize];
    }
    //returns the index of the desired integer, or -1 if it is not present
    private int search(int searchingNum)
    {
        for(int i = 0; i < count; i++)
        {
            if(searchingNum==numArray[i])
                return i;
        }
        return -1;
    }
    //adds an integer to the array
    public boolean add(int numberToAdd)
    {
        int forSearch = search(numberToAdd);
        if(forSearch == -1)
        {
            if(count == numArray.length)
            {
                doubleArray();
            }
            numArray[count] = numberToAdd;
            count++;
            return true;
        }
        else
            return false;

    }
    //removes the desired value and shifts all other values left
    public boolean remove(int numberToRemove)
    {
        int forSearch = search(numberToRemove);
        if(forSearch != -1)
        {
            for(int i = forSearch; i < count-1; i++)
                numArray[i] = numArray[i+1];
            count--;
            return true;
        }
        else
            return false;
    }
    //creates an array twice the size of the original and copies the contents
    private void doubleArray()
    {
        numArray = Arrays.copyOf(numArray,numArray.length*2);
    }
    //returns the largest integer in the array
    public int findLargest()
    {
        int largest = numArray[0];
        for(int i = 1; i < count; i++)
        {
            if(numArray[i] > largest)
                largest = numArray[i];
        }
        return largest;
    }
    //computes the average of the integers in the array
    public double computeAvg()
    {
        int sum = 0;
        for (int i = 0; i < count; i++)
        {
            sum += numArray[i];
        }
        return (double)sum/(double)count;
    }
    //returns the number of positive integers
    public int countPositives()
    {
        int positives = 0;
        for (int i =0; i < count; i++)
            if(numArray[i] > 0)
                positives++;
        return positives;
    }
    //returns a string that contains the contents of the array
    public String toString()
    {
        String toReturn = "{";
        for (int i =0; i < count; i++)
        {
            toReturn += numArray[i];
            if(i < count-1)
            {
                toReturn+= ",";
            }
        }
        toReturn += "}";
        return toReturn;
    }
}
