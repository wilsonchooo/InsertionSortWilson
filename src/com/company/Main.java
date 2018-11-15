package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        int[] arr = new int[10];
        arr[0] = 9;
        arr[1] = 8;
        arr[2] = 7;
        arr[3] = 6;
        arr[4] = 0;
        arr[5] = 4;
        arr[6] = 3;
        arr[7] = 2;
        arr[8] = 1;
        arr[9] = 5;

        System.out.println(Arrays.toString(arr));


        insertion(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void insertion (int arr[])
    {
        for (int i=1;i<arr.length;i++)
        {
            int key = arr[i];
            int x = i-1;

            while (x>=0 && arr[x]>key) // moves all of the numbers before the key right to make space.
            {
                arr[x+1] = arr[x];
                x=x-1;
            }
            arr[x+1] = key;



        }


    }
}
