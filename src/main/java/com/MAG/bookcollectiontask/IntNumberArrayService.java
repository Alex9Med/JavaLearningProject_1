package com.MAG.bookcollectiontask;

public class IntNumberArrayService {
    public static int findMin(int [] arrayTable){
        int min = arrayTable[0];
        for (int i = 1; i < arrayTable.length; i++){
            if (min > arrayTable[i]){
                min = arrayTable[i];
            }
        }
        return min;
    }

    public static double getAvg(int[]array){
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum = sum + array[i];
//        sum += array[i];         =====>  alta modalitate mai simpla
        }
        return sum/ array.length;
    }
}

