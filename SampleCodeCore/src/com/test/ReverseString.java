package com.test;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println(reverse("rohithd"));
	}
	public static String reverse(String s) {
		char[] arr=s.toCharArray();
		for(int i=0;i<s.length()/2;i++) {
			char a=arr[i];
			char b=arr[s.length()-1-i];
			arr[i]=b;
			arr[s.length()-1-i]=a;
		    	
		}
		return String.valueOf(arr);
	}

}
