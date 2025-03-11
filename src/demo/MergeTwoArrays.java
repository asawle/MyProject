package demo;

import java.util.Arrays;

public class MergeTwoArrays {

	public static void main(String[] args) {

		int[] firstArray = { 2, 7, 5, 23, 56 };
		int[] secondArray = { 1, 13, 45, 66, 33 };
//		int fal=firstArray.length;
//		int sal=secondArray.length;
//		int [] mergeArray=new int[fal+sal];
//		
//		for(int i=0;i<=fal;i++) {
//			mergeArray[i]=firstArray[i];
//		}
//		System.out.println(mergeArray);

		int[] mergeArray = MergeTwoArrays(firstArray, secondArray);

		for (int i : mergeArray) {
			System.out.print(i + " ");
		}
	}

	private static int[] MergeTwoArrays(int[] firstArray, int[] secondArray) {
		int fal = firstArray.length;
		int sal = secondArray.length;
		int[] mergeArray = new int[fal + sal];

//		System.arraycopy(firstArray, 0, mergeArray, 0, fal);
//		System.arraycopy(secondArray, 0, mergeArray, fal, sal);
		for (int i = 0; i < fal; i++) {
			mergeArray[i] = firstArray[i];
		}

		for (int i = 0; i < sal; i++) {
			mergeArray[fal + i] = secondArray[i];

		}

		//Arrays.sort(mergeArray);
		int l=mergeArray.length;
		for(int i=0;i<l-1;i++) {
			for(int j=0;j<l-i-1;j++) {
				if(mergeArray[j]>mergeArray[j+1]) {
				int temp=mergeArray[j];
				mergeArray[j]=mergeArray[j+1];
				mergeArray[j+1]=temp;
				}
			}
		}
		return mergeArray;
	}

}
