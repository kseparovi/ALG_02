package pckg_1;

import java.util.Arrays;
//Umetanje indexa
public class AUX_ALG {
    public static int [] insertElementAtPosition(int[] arr, int pos, int el){
        int[] arrAddElement = new int[arr.length+1];
        if(pos <= arr.length){
            System.arraycopy(arr,0,arrAddElement,0, pos);
            System.out.println(Arrays.toString(arrAddElement));
            arrAddElement[pos] =el;
            System.out.println(Arrays.toString(arrAddElement));
            System.out.println(arr.length - pos);
            System.arraycopy(arr,pos,arrAddElement,pos+1,arr.length-pos);
            System.out.println(Arrays.toString(arrAddElement));

        }else{
            System.out.println("Index is out of defined bounds!!!");
        }
        return arrAddElement;
    }
    public static int[] removeElementFromArrayPos(int[] arr, int pos){

        int[] removedArr = new int[arr.length-1];
        if(pos == 0){
            System.arraycopy(arr,pos+1,removedArr,0,arr.length-1);
            System.out.println(Arrays.toString(removedArr));
        }else if (pos == arr.length-1){
            System.arraycopy(arr,0,removedArr,arr.length-1);

        } else {

            System.arraycopy(arr,0,removedArr,0);
            System.arraycopy(arr, pos+1,removedArr,pos,arr.lenght-(pos+1));
            System.out.println(Arrays.toString(removedArr));
        }

        return null;
    }
}
