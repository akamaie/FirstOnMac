import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		//Get input from user
		System.out.println("How many numbers: ");
		int count = Integer.parseInt(reader.readLine());
		System.out.println("Please enter " + count + " numbers: ");
		
		//populate the list with user's input
		for(int i = 0; i < count; i++) {
			list.add(Integer.parseInt(reader.readLine()));
		}
		
		
		//call method to convert list to an array
		int[] array = toArray(list);
		//find the smallest element
		int smallestValue = smallestValue(array);
		//print the smallest value before sorting
		System.out.println("Smallest value: " + smallestValue);
		
		//print first and last element before sorting
		System.out.println("first and last element before sorting: ");
		System.out.println(firstAndLast(array));
		//sort the array
		sort(array);
		//print first and last element after sorting 
		System.out.println("first and last element after sorting: ");
		System.out.println(firstAndLast(array));
		//print the median of the elements 
		System.out.println("The median of the elements is: " + midValue(array));
		//print the smallest value in the array after sorting
		System.out.println("Smallest value: " + array[0]);
		
		
		
		
		
		
	}
	
	public static int[] sort(int[] array) {
		int temp = 0;
		for(int i = 0; i < array.length; i++) {
			for(int j = i + 1; j < array.length; j++) {
				if(array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		
		return array;
		
	}
	
	
	public static int smallestValue(int[] array) {
		int num = Integer.MAX_VALUE;
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] < num) {
				num = array[i];
			}
		}
		
		return num;
		
	}
	
	
	public static double midValue(int[] array) {
		if(array.length % 2 != 0) {
			return array[array.length / 2];
		} else {
			return (double) (array[(array.length / 2) - 1] + array[(array.length / 2)]) / 2;
		}
	}
	
	public static int[] toArray(ArrayList<Integer> list) {
		int[] array = new int[list.size()];
		
		for(int i = 0; i < list.size(); i++) {
			array[i] = list.get(i);
		}
		
		return array;
	}
	
	public static String firstAndLast(int[] array) {
		return "First element is: " + array[0] + ", and last element is: " + array[array.length - 1];
	}
}
