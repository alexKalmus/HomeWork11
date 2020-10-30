package com.lhomeWork11;

public class SuperPrint extends ArrayPrinter{
    @Override
    protected void printElem(int a, boolean lastMember) {
        System.out.println(">>"+a+"<<");
    }
}
