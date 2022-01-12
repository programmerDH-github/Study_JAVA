package Baek_Joon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_Joon_4458 {

	public static void main(String[] args) {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		try {
			int n = Integer.parseInt(bf.readLine());
			String[] logs = new String[n];

			for (int i = 0; i < n; i++) { 
				logs[i] = bf.readLine().trim();
			}
			for (int i = 0; i < n; i++) {
				System.out.println(logs[i].substring(0, 1).toUpperCase() + logs[i].substring(1));
			}

		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
