package Programmers;

public class ½ÇÆÐÀ² {

	public static void main(String[] args) {
		int N = 3;
		int[] stages = {3,3,3};
		int poeple = 0;
		int[] numerator = new int[N]; 
		int[] denominator = new int[N];
		int[] index = new int[N];
		
		
		for (int i = 0; i < N; i++) {
			
			
			for (int j = 0; j < stages.length; j++) {
				if(i+1 == stages[j]) {
					poeple += 1;					
				}
			}
			
			if(i == 0) {
				numerator[i] = poeple;
				denominator[i] = stages.length;
			}
			else {
				if(poeple == 0 || denominator[i-1] <= 0) {
					numerator[i] = 0;
					denominator[i] = 0;
				} else {
					denominator[i] = denominator[i-1] - numerator[i-1];
					numerator[i] = poeple;					
				}
			}
			poeple = 0;
			
			
		}
		
		for(int i = 0; i < numerator.length; i++) {
			int cul = numerator[i];
			for(int j = 0; j <denominator.length; j++) {
				if(numerator[i] <= 0 || denominator[j] <= 0 || i == j) continue;
				else {
					cul = cul * denominator[j];
				}
				
			}
			index[i] = i;
			numerator[i] = cul;
			
		}
		
		for(int i = 0; i < numerator.length; i++) {
			for(int j = 0; j < numerator.length; j++) {
				if(numerator[i] > numerator[j]) {
					int temp = numerator[i];
					numerator[i] = numerator[j];
					numerator[j] = temp;
					
					temp = index[i];
					index[i] = index[j];
					index[j] = temp;
							
				}
			}
		}
		
		int i = 0;
		while(true) {
			if(i+1 == index.length) break;
			if(numerator[i] == numerator[i+1] && index[i] > index[i+1]) {
				int temp = index[i];
				index[i] = index[i+1];
				index[i+1] = temp;
				i = 0;
			} 
			else i++;
		}
		
		for(int z : index) System.out.println(z+1);

	}

}
