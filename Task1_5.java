package edu.school.maina;

import java.util.Scanner;

public class Task1_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++){
			arr[i]=input.nextInt();
		}
		int ncopy=n;
		while(ncopy>n-2){
			for(int i=0; i<ncopy-1; i++){
				if(arr[i]>arr[i+1]){
					int a=arr[i+1];
					arr[i+1]=arr[i];
					arr[i]=a;
				}
			}
			ncopy--;
		}
		System.out.println(arr[n-2]);
	}
}
