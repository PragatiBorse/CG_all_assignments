
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class RandomIntDouble {
	public static void main(String[] args) {
		
	        HashMap<Integer, Double> hMap = new HashMap<>();
	        System.out.println("Enter data:(First enter Integer value then press Enter and then Double value(i.e:1.1,2.2 etc) again press Enter and go On...)");
	        Scanner in = new Scanner(System.in);

	        for (int i = 0; i < 10; i++) {
	            Integer a = in.nextInt();
	            Double b = in.nextDouble();
	            hMap.put(a, b);
	        }
	        
	        for (Integer key: hMap.keySet()){
	            System.out.println(key +" , "+hMap.get(key)); 
	        }
	}
}