package com.lhomeWork11;

public abstract class ArrayPrinter {

    protected abstract void printElem(int a, boolean lastMember);

    public void print (int[] array){
        boolean lastMember = false;
        for (int i = 0; i < array.length*2; i++) {
            System.out.print("-");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (i==array.length-1) lastMember = true;
            printElem(array[i], lastMember);
        }
        for (int i = 0; i < array.length*2; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
