package com.akshay.algo;

public class Main {

    public static void main(String[] args) {
        int[] ar = {-5, 1, 5, 9, 10, 15, 16,19};
        int[] ar1 = {19,16,15,10,9,5,1,-5};

        //finding equal value
        System.out.println(BinarySearch.equal(ar,0,ar.length,5));

        //finding nearest Lesser value
        System.out.println(BinarySearch.equalOrLesser(ar1,0,ar1.length,7));

        //finding nearest Greater Value

        System.out.println(BinarySearch.equalOrGreater(ar,0,ar.length,11));
    }


}
