package com.KwonGusung;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Kangaroo {

	// Complete the kangaroo function below.
    static String kangaroo(int x1, int v1, int x2, int v2) {
    	
    	int smallX = x1 <= x2 ? x1 : x2;
    	int bigX = x1 > x2 ? x1 : x2;
    	int smallV = x1 <= x2 ? v1 : v2;
    	int bigV = x1 > x2 ? v1 : v2;
    	
    	String retrunValue = "NO";
    	while(smallX <= bigX) {
    		if(smallX == bigX) {
    			retrunValue = "YES";
    			break;
    		}
    		smallX += smallV;
    		bigX += bigV;
    	}
    	
    	return retrunValue;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main2(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] x1V1X2V2 = scanner.nextLine().split(" ");

        int x1 = Integer.parseInt(x1V1X2V2[0]);

        int v1 = Integer.parseInt(x1V1X2V2[1]);

        int x2 = Integer.parseInt(x1V1X2V2[2]);

        int v2 = Integer.parseInt(x1V1X2V2[3]);

        String result = kangaroo(x1, v1, x2, v2);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
    
    public static void main(String[] args) {
    	kangaroo(0, 3, 4,2);
	}
}