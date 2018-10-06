package edu.school.maina;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n= input.nextInt();
		int m= input.nextInt();
		int curr=0;
		int[] arr1 = new int[n];
		int[] arr2 = new int[m];
		int[] arrCombo= new int[n+m];
		for(int i=0; i<n; i++){
			arr1[i]=input.nextInt();
		}
		for(int i=0; i<m; i++){
			arr2[i]=input.nextInt();
		}
		for(int now=0; now<Math.min(n, m); now++){
			arrCombo[curr]=arr1[now];
			arrCombo[curr+1]=arr2[now];
			curr+=2;
		}
		for(int i=Math.min(n, m); i<Math.max(n,m); i++){
			if(m>n){
				arrCombo[curr]=arr2[i];
			}else{
				arrCombo[curr]=arr1[i];
			}
			curr++;
		}
		for(int i=0; i<n+m; i++){
			System.out.print(arrCombo[i]+ " ");
		}
	}

}
