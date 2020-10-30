package com.lhomeWork11;

public class PlusPrint extends ArrayPrinter{
    @Override
    protected void printElem(int a, boolean lastMember) {
        if(!lastMember)
        System.out.print(a+"+");
        else System.out.println(a);
    }
}
