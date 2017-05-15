package com.tao.test;

import java.util.HashSet;
import java.util.Set;

public class alg3 {

	public static void main(String[] args) {
		int r = solution(10);
		System.out.println(r);
	}
	
    static int solution(int n) {
        int[] d = new int[30];
        int l = 0;
        int p;
        while (n > 0) {
            d[l] = n % 2;
            n /= 2;
            l++;
        }
        for (p = 1; p <= l/2; ++p) {
            int i;
            boolean ok = true;
            for (i = 0; i < l-p; ++i) {
                if (d[i] != d[i + p]) {
                    ok = false;
                    break;
                }
            }
            if (ok) {
                return p;
            }
        }
        return -1;
    }


    
	

}
