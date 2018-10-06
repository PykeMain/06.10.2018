package edu.school.maina;

import java.util.Scanner;

public class Task1_4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++){
			arr[i]=input.nextInt();
		}
		for(int i=0; i<n-1; i++){
			if(arr[i]>arr[i+1]){
				int a=arr[i+1];
				arr[i+1]=arr[i];
				arr[i]=a;
			}
		}
		for(int i=n-1; i>0; i--){
			if(arr[i]<arr[i-1]){
				int a=arr[i-1];
				arr[i-1]=arr[i];
				arr[i]=a;
			}
		}
		System.out.println(arr[n-1]-arr[0]);
	}
}
