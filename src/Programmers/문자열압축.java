package Programmers;

import java.util.ArrayList;
import java.util.Collections;

public class ���ڿ����� {

	public static void main(String[] args) {
		String str = "aabbaccc";
		ArrayList<Integer> arraylist = new ArrayList<>();
		
		for(int i = 0; i < str.length()/2; i++) {
			int count = 0;
			String answer = "";
			String target = str.substring(0, i+1);
			String remainder = str.substring(i+1);
			for(int j = 0; j < str.length(); j++) {
				if(remainder.length() <= i) {
					if(count == 0) {
						answer += target;
					}
					else {
						answer += count + 1 + target;
						count = 0;
					}
					break;
				}
				if(target.equals(remainder.substring(0, i+1)) ) {
					count++;
					target = remainder.substring(0, i+1);
					remainder = remainder.substring(i+1);
				}
				else {
					if(count == 0) {
						answer += target;
					}
					else {
						answer += count + 1 + target;
						count = 0;
					}
					target = remainder.substring(0, i+1);
					remainder = remainder.substring(i+1);
				}
			}
			answer += remainder;
			arraylist.add(answer.length());
		}
		
		Collections.sort(arraylist);
		System.out.println(arraylist.get(0));

	}

}

/*
 ���� 1
 aabbaccc
 7
 
 ���� 2
 ababcdcdababcdcd
 9
 
 ���� 3
 abcabcdede
 8
 
 ���� 4
 abcabcabcabcdededededede
 14
 
 ���� 5
 xababcdcdababcdcd
 17
 */
