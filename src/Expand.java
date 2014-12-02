/**
 * 
 */

import java.util.*;

import com.sun.org.apache.bcel.internal.generic.INEG;

public class Expand {
    
    static int[] stretch(Integer[] integerArray) {
        int[] stretchedArray = new int[(integerArray.length) * 2];
        int integerArrayCount = 0;
        
        for(int stretchedArrayCount = 0; stretchedArrayCount < stretchedArray.length; stretchedArrayCount++) {
            if(integerArray[integerArrayCount] % 2 == 0) {
                stretchedArray[stretchedArrayCount] = integerArray[integerArrayCount] / 2;
                stretchedArrayCount++;
                stretchedArray[stretchedArrayCount] = integerArray[integerArrayCount] / 2;
            }
            else {
                stretchedArray[stretchedArrayCount] = (integerArray[integerArrayCount] / 2);
                stretchedArrayCount++;
                stretchedArray[stretchedArrayCount] = (integerArray[integerArrayCount] / 2) + 1;
            }
            integerArrayCount++;
        }
        return(stretchedArray);
    }
    
    public static void main(String[] args) {
        int arraySize = 0;
        Integer[] integerArray;
        int[] stretchedArray;
        
        Scanner keyboard = new Scanner(System.in);
        
        while(arraySize <= 0) {
            System.out.print("Enter the size of array (int over 0): ");
            try {
                arraySize = keyboard.nextInt();
            } catch(Exception e) {
                keyboard.nextLine();
            }
        }
        
        integerArray = new Integer[arraySize];
        
        for(int inputCount = 0; inputCount < integerArray.length; inputCount++) {
            while(integerArray[inputCount] == null) {
                System.out.print("Enter value for " + (inputCount + 1) + " element: ");
                try {
                    integerArray[inputCount] = keyboard.nextInt();
                } catch(Exception e) {
                    keyboard.nextLine();
                }
            }
        }
        stretchedArray = stretch(integerArray);
        
        System.out.print("Original array: ");
        for(int printArray : integerArray) {
            System.out.print("[" + printArray + "]   ");
        }
        System.out.println();
        System.out.print("Stretched array:");
        for(int printArray : stretchedArray) {
            System.out.print("[" + printArray + "]");
        }
    }
}
