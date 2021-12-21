package com.company;

public class Executor {

    public static void main(String[] args) {
	int[] a = {5, 12, 8, 99, 75, 96, 18, 86};
    for (int num : a) {
        System.out.println(num + "," );
    }
    int count;
    do {
        count =0;
        for (int i=0; i<a.length-1; i++) {
            if (a[i] > a[i+1]) {
                int temp =a[i];
                a[i] = a[i+1];
                a[i+1]= temp;
                count++;
            }
        }
    } while (count >0);
    System.out.println();
    for (int num :a) {
        System.out.print(num + ",");
    }
    }
}
