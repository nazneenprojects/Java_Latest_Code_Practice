package dev.arraydemo;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] myList = new int[10];
        int myStorage[] = new int[10];
        myList[9] = 100;

        double[] myArray = new double[10];
        myArray[0] = 3.8;
        System.out.println("["+myArray[0]+ "]--->["+myArray[9]+"]--->");

        //array init
        int[] myData = {1,2,3,4,5};
        String[] data = {"hey", "good", "morning"};
        System.out.println("data array length -->"+data.length);
        int[] yourData = new int[]{6,7,8,9,10};
        System.out.println("["+yourData[0]+ "]--->["+yourData[1]+"]--->.....this array has length :"+yourData[yourData.length -1]);

        String[] empty = new String[3];
        for(int j = 0; j<empty.length ; j++){
            System.out.println("Printing Empty Array -"+ empty[j]);
        }

        String[]  tuple = new String[]{"This ","Is", "The", "Way" };
        for (String element:tuple) {
            System.out.print(element + "");
        }

        float[]  record = new float[]{1f, 2f, 3f, 4f };
        for (float element:record) {
            System.out.println(" ->"+element );
        }

        System.out.println(record);

       System.out.println( "Binary Search "+Arrays.binarySearch(record, 4));

       System.out.println("Record Array Elements-->"+ Arrays.toString(record));

       Object objectVar = record;
       if(objectVar instanceof float[]){
           System.out.println( "ObjectVar is really an Float Array");
       }

       Object [] obj = new Object[3];
       obj[0] = "hello";
       obj[1] = new StringBuilder("world");
       obj[2] = record;

       System.out.println("Obj Array contains:"+ Arrays.toString(obj));

    }
}
