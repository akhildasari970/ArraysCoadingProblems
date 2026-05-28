package org.example;

public class LargestAndSmallestElementInArray {

    public static int getLargestElement(int[] arr){
        int max=arr[0];

        for(int a:arr){
         if(a>max){
             max=a;
         }
        }
        return max;
    }

    public static int getSmallestElement(int[] arr){
        int min=arr[0];
        for(int a:arr){
            if(a<min){
                min=a;
            }
        }
        return min;
    }
}
