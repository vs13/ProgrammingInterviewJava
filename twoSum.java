import java.util.*;
import java.lang.*;
import java.io.*;

class twoSum
{
	
	public static int[] twoSum(int[] numbers, int target) {
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		int[] result = new int[2];

		for(int i = 0; i < numbers.length ; i++) {
			if(map.containsKey(numbers[i])) {
				int val = map.get(numbers[i]);
				result[0] = val;
				result[1] = i;
			}
			else {
				map.put(target-numbers[i],i);
			}
		}
		return result;
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		int numbers[] = new int[3];
		int results[] = new int[2];
		numbers[0]=5;
		numbers[1]=2;
		numbers[2]=6;
		//Target is 11
		results = twoSum(numbers,11);
		System.out.println("Indexes that add up to the target are : "+results[0]+" "+results[1]);
	}
}