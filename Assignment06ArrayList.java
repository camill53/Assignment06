/*
 Author: Connor Miller
 Filename: Assignment06
 Specification: Array functions
 For: CSE 110
 Time Spent: 4 hours
*/
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Assignment06ArrayList 
{
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("Enter Integers please (type done when no more integers are being added)");
		
		while(!scan.hasNext("done"))
		{
			list.add(scan.nextInt());
	
		}
		scan.nextLine();
		scan.nextLine();
		int[] nums = new int[list.size()];
		for (int i =0; i < list.size(); i++) 
            nums[i] = list.get(i); 
		String sym = "";
		System.out.print("Insert seperating symbol: ");
		sym = scan.next();
		ArrayList<Integer> list1 = (ArrayList<Integer>)list.clone();
		ArrayList<Integer> list2 = (ArrayList<Integer>)list.clone();
		ArrayList<Integer> list3 = (ArrayList<Integer>)list.clone();
		
		printArray(nums,sym);
		getFirst(nums);
		getLast(nums);
		getAllButFirst(nums);	
		getIndexOfMin(list);
		getIndexOfMax(list);
		swapByIndex(list1, 1, 4);
		removeAtIndex(list2, 3);
		insertAtIndex(list3, 2, 777);
		System.out.println(isSorted(nums));
	}
	
	// #1
	public static void printArray(int[] nums, String sym)
	{
		if(sym.equals(","))
		{
			for(int i = 0; i < nums.length; i++)
			{
				if(i < (nums.length - 1))
					System.out.print(nums[i]+ sym + " ");
				else 
					System.out.print(nums[i] + "\n" + "\n");
			}
		}
		
		else if(sym.equals("-"))
		{
			for(int i = 0; i < nums.length; i++)
			{
				if(i < (nums.length - 1))
					System.out.print(nums[i]+ " " + sym + " ");
				else 
					System.out.print(nums[i] + "\n" + "\n");
			}
		}
		
		else
		{
			for(int i = 0; i < nums.length; i++)
			{
				if(i < (nums.length - 1))
					System.out.print(nums[i]+ sym + " ");
				else 
					System.out.print(nums[i] + "\n" + "\n");
			}
		}
		
		
	}
	
	//#2
	public static void getFirst(int[] nums)
	{
			
		System.out.println("First value of array: " + nums[0] + "\n");
	}
	
	// #3
	public static void getLast(int[] nums)
	{
		System.out.println("Last value of array: " + nums[nums.length - 1] + "\n");
	}
	
	// #4
	public static void getAllButFirst(int[] nums)
	{	
		final String sym = ",";
		for(int i = 1; i < nums.length; i++)
		{
			if(i < (nums.length - 1))
				System.out.print( nums[i]+ sym + " ");
			else 
				System.out.print(nums[i] + "\n" + "\n");
		}
	
	}
	
	// #5
	public static void getIndexOfMin(ArrayList<Integer> nums)
	{
		
		int i = Collections.min(nums);
		System.out.println("The index of the minimum value is: " + nums.indexOf(i)+ "\n");
				
	}
	
	// #6
	public static void getIndexOfMax(ArrayList<Integer> nums)
	{
		
		int i = Collections.max(nums);
		System.out.println("The index of the max value is: " + nums.indexOf(i)+ "\n");
				
	}
	
	// #7
	private static void swapByIndex(ArrayList<Integer> num, int one, int two)
	{
		
		
		Collections.swap(num, one, two);
		int[] nums = new int[num.size()];
		for (int i = 0; i < num.size(); i++) 
            nums[i] = num.get(i); 
		final String sym = ",";
		for(int i = 0; i < nums.length; i++)
		{
			if(i < (nums.length - 1))
				System.out.print(  nums[i]+ sym + " ");
			else 
				System.out.print(nums[i]  + "\n" + "\n");
		
		}

	}
	
	// #8
	private static void removeAtIndex(ArrayList<Integer> num, int one)
	{
		num.remove(one);
		int[] nums = new int[num.size()];
		for (int i = 0; i < num.size(); i++) 
            nums[i] = num.get(i); 
		final String sym = ",";
		for(int i = 0; i < nums.length; i++)
		{
			if(i < (nums.length - 1))
				System.out.print( nums[i]+ sym + " ");
			else 
				System.out.print(nums[i]  + "\n" + "\n");
		
		}
		
	}
	
	// #9
	private static void insertAtIndex(ArrayList<Integer> num, int one, int two)
	{
		num.set(one, two);
		int[] nums = new int[num.size()];
		for (int i = 0; i < num.size(); i++) 
            nums[i] = num.get(i); 
		final String sym = ",";
		for(int i = 0; i < nums.length; i++)
		{
			if(i < (nums.length - 1))
				System.out.print(  nums[i]+ sym + " ");
			else 
				System.out.print(nums[i] + "\n" + "\n");
		
		}
	}
	
	public static boolean isSorted(int[] nums)
	{
		int total = 0;
		for(int i = 0; i < nums.length - 1; i++)
		{
			if(nums[i] > nums[i+1])
				return false;
			
		}
		
		return true;
			
	}
}
