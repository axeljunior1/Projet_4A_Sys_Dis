package com.polytech.bean;

import java.util.ArrayList;

public class test {

//	 public double findMedianSortedArrays(int[] nums1, int[] nums2) {        
//			ArrayList<Integer> al = new ArrayList<Integer>(); 
//			int nums3[]= new int[nums1.length+nums2.length];
//			al.add(nums1[0]);
//			for (int i = 0; i < nums1.length; i++) {
//				int j=0;
//				
//					if (nums1[i]<=al.get(j)) {
//						al.add(i,nums1[i]);
//					}
//					else {
//						al.add(al.size(),nums1[i]);
//					}
//				
//			}
//			for (int i = 0; i < nums3.length; i++) {
//				nums3[i] = al.get(i);
//			}
//			
//	    }
	public static void main(String[] args) {
		
		int[] nums1= {1,6,2,4}; //int[] nums2= {3};
		ArrayList<Integer> al = new ArrayList<Integer>(); 
		//int nums3[]= new int[nums1.length+nums2.length];
		al.add(10);
		for (int i = 0; i < al.size(); i++) {
			for (int j = 0; j < nums1.length; j++) {
				if (nums1[j]<= al.get(i)) {
					al.add(i,nums1[j]);
				}
			}			
		}

		System.out.println(al.toString());
		System.out.println("test");
}
}
