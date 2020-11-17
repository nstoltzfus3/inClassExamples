package exercises;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ForEachPractice {

	
	public static void main(String[] s) {
		Scanner myScan = new Scanner(System.in);
		ArrayList<Integer> myArr = new ArrayList();
		int userNum;
		for (int i = 1; i < 6; i++) { // 0, 1, 2, 3, 4, 5
			userNum = Integer.parseInt(myScan.nextLine());
			myArr.add(userNum);
		}
		
		
		int max = Integer.MIN_VALUE; // [-1, -2, -3, -4]
		for (int i = 0; i < myArr.size(); i++) { // 0, 1, 2, 3, 4, 5
			if (myArr.get(i) > max) {
				max = myArr.get(i);
			}
		}
		
		int min = Integer.MAX_VALUE; // [-1, -2, -3, -4]
		for (int i = 0; i < myArr.size(); i++) { // 0, 1, 2, 3, 4, 5
			if (myArr.get(i) < min) {
				min = myArr.get(i);
			}
		}
		
		int sum = 0; // [-1, -2, -3, -4]
		for (int i = 0; i < myArr.size(); i++) { // 0, 1, 2, 3, 4, 5
			sum += myArr.get(i);
		}
		
		int product = 1; // [-1, -2, -3, -4]
		for (int i = 0; i < myArr.size(); i++) { // 0, 1, 2, 3, 4, 5
			product *= myArr.get(i);
		}
		
		int sum2 = 0;
		for (int e : myArr) { // size 5
			// iterates 1 time for each element
			// FOR EACH LOOP
			sum2 += e;
		}
		
		HashMap<String, String> vehicles = new HashMap<>();	
		vehicles.put("Fusion", "Ford");
		vehicles.put("CRV", "Honda");
		
		for (Map.Entry<String, String> myCombo : vehicles.entrySet()) {
			if (myCombo.getKey().equals("Fusion")) {
				// do some
			} else {
				// do some
			}
		}
	}
}
