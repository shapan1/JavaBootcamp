package com.company;

//Type


import sun.font.TrueTypeFont;

public class Main {
    public static void main(String[] args) {
//        Min Max
        int maxVal = Integer.MAX_VALUE;
        int minVal = Integer.MIN_VALUE;
        System.out.println("Maximum Value for Integer in Java: " + maxVal);
        System.out.println("Maximum Value for Integer in Java: " + minVal);
        System.out.println("Their sum is : " + (maxVal + minVal));

        // Int/Float/Double
        int whole = 5 / 3;
        float f_value = 5f / 3f;
        double d_value = 5d / 3d;

        System.out.println(whole);
        System.out.println(f_value);
        System.out.println(d_value);

        // char/String
        char myChar = '\u00A9';
        System.out.println("cool stuff" + myChar);

        String myString = "You are so beautiful to me";
        System.out.println(myString);


        //Casting
        String num = "3";
        int res = Integer.parseInt(num) + 3;

        System.out.println(res);

        //Operators
        boolean isSmart = true;
        if ((Integer.parseInt(num) < 2) && (isSmart == true)){
            System.out.println("you never see this");
        }
        else{
            System.out.println("oops");
        }

        boolean isDumb = false;


        // if isDumb, then isDumb, else not isDumb
        boolean wasDumb = isDumb ? true : false;
        System.out.println(wasDumb);


        //Challenge
        double num1 = 20d;
        double num2 = 80;
        double remain = (((num1 + num2) * 25) % 3) / 40;

        if (remain <= 20){
            System.out.println("total was over the limit");
        }
    }
}
