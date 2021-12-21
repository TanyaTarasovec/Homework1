package com.company;

public class Executor {

    public static void main(String[] args) {
// Task 1
//        for (int i = 0; i < 10000; i++) {
//            if (i % 7 == 0) {
//                System.out.println(i);
//            }
//        }
//    }
//}

// Task 2
        int counter = 0;
        int sum = 0;
        for (int i = 0; i <= 200; i++) {
            if (i % 10 == 0) {
                counter += 1;
                sum += 1;
            }
        }
        System.out.println("arithmetic mean:" + sum / counter);
    }
}