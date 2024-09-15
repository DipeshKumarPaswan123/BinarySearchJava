package com.anonymous.p1;

/**
 * Binary search
 *
 * @author ASUS
 * @date 9/14/2024
 */
public class BinaraySearch {
    public static int binarySearch(int number[], int key){
        int start =0;
        int end = number.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(number[mid]==key){
                return mid;
            }
            if(number[mid]<key){
                start = mid+1;
            }
            else {
                end =  mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int number[] = {2,4,6,8,10,12,14};
        int key = 16;
        int index = binarySearch(number,key);
        if(index == -1)
            System.out.println("Not found");
        else{
            System.out.printf("Key found at index :%d%n", binarySearch(number, key));

        }
    }
}
