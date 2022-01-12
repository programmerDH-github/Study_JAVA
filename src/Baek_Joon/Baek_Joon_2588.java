package Baek_Joon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_Joon_2588 {

	public static void main(String[] args) {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[3]; 
		
		try {
			int number1 = Integer.parseInt(bf.readLine());
			String number2 = bf.readLine();
			
			for(int i = 0; i < 3; i++) {
				int num = (int)number2.charAt(2-i) - '0';
				System.out.println(arr[i] = number1 * num);
			}
			
			System.out.println(arr[0] + arr[1] * 10 + arr[2] * 100);			
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

/* 	¿¹Á¦ 1
	472
	385

	2360
	3776
	1416
	181720

*/
