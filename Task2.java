package edu.school.maina;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n= input.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++){
			arr[i]= input.nextInt();
		}
		for(int counter=0; counter<2; counter++){
			for(int i=0; i<n-1-counter; i++){
				if(arr[i]<arr[i+1]){
					int a=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=a;
				}
			}
		}
		System.out.println(arr[n-1]+arr[n-2]);
	}

}
