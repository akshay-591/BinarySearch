package com.akshay.algo;

/**
 * This Class contains three modification of binary search
 * 1. Which finds equal value
 * 2.Which finds equal or nearest Lesser value
 * 3.Which finds equal or nearest greater value
 * @author Akshay Kumar
 */
public class BinarySearch {
    /**
     * This Method applies binary search algorithm and find the equal value.
     *
     * @param array    input array
     * @param startIdx start index for searching
     * @param endIdx   end index
     * @param value    value to be find
     * @return index of the value if present and -1 if not present.
     */
    public static int equal(int[] array, int startIdx, int endIdx, int value) {
        if (startIdx >= endIdx) {
            if (array[startIdx] == value) {
                return startIdx;
            } else return -1;
        }

        int midpoint = (startIdx + endIdx)/2;
        if (array[midpoint] == value) {
            return midpoint;
        } else if (array[midpoint]< value) {
            return equal(array, midpoint + 1, endIdx, value);
        } else {
            return equal(array, startIdx, midpoint, value);
        }

    }

    /**
     * This Method applies binary search algorithm and find the equal value or the nearest Lesser value
     * But there is limitation that the array should be sorted in descending order.
     *
     * @param array    input array
     * @param startIdx start index for searching
     * @param endIdx   end index
     * @param value    value to be find or nearest to
     * @return index of the value or nearest Lesser value if present and -1 if not present.
     */
    public static int equalOrLesser(int[] array, int startIdx, int endIdx, int value) {
        if (startIdx >= endIdx) {
            if (array[startIdx-1] <= value) {
                return -1;
            } else return startIdx;
        }

        int midpoint = (startIdx + endIdx) / 2;
        if(array[midpoint] == value){
            return midpoint;
        }
        else if (array[midpoint] > value) {
            return equalOrLesser(array, midpoint + 1, endIdx, value);
        }
        else return equalOrLesser(array, startIdx, midpoint, value);


    }
    /**
     * This Method applies binary search algorithm and find the equal value or the nearest Greater Value value.
     * But there is limitation that the array should be sorted in ascending order.
     * @param array    input array
     * @param startIdx start index for searching
     * @param endIdx   end index
     * @param value    value to be find or nearest to
     * @return index of the value or nearest Greater value if present and -1 if not present.
     */
    public static int equalOrGreater(int[] array, int startIdx, int endIdx, int value) {
        if (startIdx >= endIdx) {
            if (array[startIdx] <= value) {
                return -1;
            } else return startIdx;
        }

        int midpoint = (startIdx + endIdx) /2;
        if(array[midpoint] == value){
            return midpoint;
        }
        else if (array[midpoint] < value) {
            return equalOrGreater(array, midpoint + 1, endIdx, value);
        }
        else return equalOrGreater(array, startIdx, midpoint, value);


    }
}
