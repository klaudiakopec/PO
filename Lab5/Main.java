package com.company;

public class Main {

    public static void main(String[] args) {
        prostokat prz1=new prostokat(5,9);
        prz1.a=5;
        prz1.b=9;
        prz1.Info();
    }
    public class prostokat {
        int a,b;
        int pole = a*b;
        int obw = a+a+b+b;
        int przekatna = (a*a)+(b*b);
    }
    
  
}


