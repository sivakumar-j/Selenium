package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a=2;
        int b=10;
        int c=18;
       if(FlourPacker.canPack(a,b,c)){
           System.out.println("Can be Packed");
       }else{
           System.out.println("No");
       }
    }
}
