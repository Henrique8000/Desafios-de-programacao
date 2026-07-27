package application;

import java.io.*;
import java.util.*;

public class JavaOutputFormatting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        int n1, n2, n3;
        String s1, s2, s3;
        List<String> listStrings = new ArrayList<>();
        List<Integer> listNum = new ArrayList<>();
        
        s1 = sc.next();
        n1 = sc.nextInt();
        listStrings.add(s1);
        listNum.add(n1);
        
        s2 = sc.next();
        n2 = sc.nextInt();
        listStrings.add(s2);
        listNum.add(n2);
               
        s3 = sc.next();
        n3 = sc.nextInt();
        listStrings.add(s3);
        listNum.add(n3);
        
        formatPrint(listNum, listStrings);
        
        sc.close();
	}
	
	public static void formatPrint(List<Integer> listNum, List<String> listString) {
		System.out.println("=".repeat(32));
		
        for (int i=0; i<listNum.size(); i++) {
        	System.out.printf("%-15s", listString.get(i) + " ");
        	
        	if (listNum.get(i) == 0) {
        		System.out.print("0" + listNum.get(i) + "0" );
        	}
        	else {
        		if (listNum.get(i) < 100) {
            		System.out.printf("0" + listNum.get(i));
            	}
            	else {
            		System.out.print(listNum.get(i));
            	}
        	}
        	
        	System.out.println();
        }
		
		System.out.println("=".repeat(32));
    }
}


