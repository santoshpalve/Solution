/**
 * 
 */
package com.solutions.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

/**
 * @author Santosh
 *
 */
@Component
public class SolutionsUtil {
	public static String getRightPaddedValues(String value, int fixedLength) {
		int count=0;
		System.out.println("Length before : " + value.length());
		for (int i = value.length(); i < fixedLength; i++) {
			value = value.concat(" ");
			count++;

		}
		System.out.println("Total spaces added : " +count);
		System.out.println("Length after : " + value.length());
		return value;
	}

	public static int findLargestNumber() {
		int temp = 0;
		int size = 0;
		int largestNo = 0;
		int array[] = { 160, 10, 20, 25, 63, 96, 57, 100, 101, 120, 150 };
		size = array.length;
		System.out.println("Size of Array :: " + size);
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		largestNo = array[size - 3];
//		System.out.println("Third largest number in given array is :: " + largestNo);
		return largestNo;
	}

	public static String reverseString(String inputString) {
		char[] input = inputString.toCharArray();
		StringBuilder sb = new StringBuilder();
		for (int i = input.length - 1; i >= 0; i--) {
			sb.append(input[i]);
		}
		return sb.toString();
	}

	public static int countDupCharsInString(String inputString) {
		int count = 0;
		char string[] = inputString.toCharArray();
		for (int i = 0; i < string.length; i++) {
			count = 1;
			for (int j = i + 1; j < string.length; j++) {
				if (string[i] == string[j] && string[i] != ' ') {
					count++;
					// Set string[j] to 0 to avoid printing visited character
					string[j] = '0';
				}
			}
			// A character is considered as duplicate if count is greater than 1
			if (count > 1 && string[i] != '0')
				System.out.println(string[i]);
		}
		return count;
	}

	public static int[] doInsertionSort(int[] input) {

		int temp;
		for (int i = 1; i < input.length; i++) {
			for (int j = i; j > 0; j--) {
				if (input[j] < input[j - 1]) {
					temp = input[j];
					input[j] = input[j - 1];
					input[j - 1] = temp;
				}
			}
		}
		return input;
	}

	public static int findDuplicateNumber() {
		int temp = 0;
		int size = 0;
		int largestNo = 0;
		int array[] = { 160, 10, 20, 25, 63, 63, 20, 96, 57, 100, 101, 120, 150, 150 };
		size = array.length;
		System.out.println("Size of Array :: " + size);
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (array[i] == array[j]) {
					System.out.println("Duplicate number found :: " + array[i]);
				} else {
					System.out.println("Non Duplicate number :: " + array[i]);
				}
			}
		}
		largestNo = array[size - 3];
//		System.out.println("Third largest number in given array is :: " + largestNo);
		return largestNo;
	}
	public static void testList() {
		List<String> completeList = new ArrayList<>();
		completeList.add("0121");
		completeList.add("0122");
		completeList.add("0123");
		completeList.add("0124");
		completeList.add("0125");
		completeList.add("0126");
		List<String> listOfWarST = new ArrayList<>();
		listOfWarST.add("0123");
		listOfWarST.add("0124");
		listOfWarST.add("0125");
		listOfWarST.add("0126");
		List<String> listOfErrST = new ArrayList<>();
		listOfErrST.add("0125");
		listOfErrST.add("0126");
		if (!completeList.isEmpty()) {
			if (!listOfWarST.isEmpty()) {
				System.out.println("Success/Error : " + removeDuplicate(completeList, listOfWarST).toString());
			}
			if (!listOfErrST.isEmpty()) {
				System.out.println("Success : " + removeDuplicate(completeList, listOfErrST).toString());
			}
			if (!listOfErrST.isEmpty()) {
				System.out.println("Warn : " + removeDuplicate(listOfWarST, listOfErrST).toString());
				System.out.println("Error : " + listOfErrST.toString());
			}
		}

	}

	private static List<String> removeDuplicate(List<String> finalList, List<String> inputList) {
		inputList.forEach(element -> {
			if (finalList.contains(element)) {
				finalList.remove(element);
			}
		});
		return finalList;
	}
}
