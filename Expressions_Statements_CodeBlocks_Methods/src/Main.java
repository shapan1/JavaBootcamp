public class Main {

    public static void main(String[] args){
        /**
         * Expression: Variable = Value and Operation
         * Examples:
            * score= 100
            * score > 99
            * ("wow")
            * score = 0
         */

        /**
         * Statement:
         * Expression is an subset of Statement.
         * Examples:
         * int score = 100;
         * score++;
         * score --;
         * System.out.println("wow");
         */

        int score = 100;
        if(score > 99){
            System.out.println("wow");
            score = 0;
        }

        /**
         * Method
         */
        int num1 = 10;
        int num2 = 12;
        int num3 = 15;
        addnum();
        int res = addnum(num1, num2);
        System.out.println(res);
        int res2 = addnum(num1, num2, num3);
        System.out.println(res2);



    }
    public static void addnum(){
        System.out.printf("Enter some parameter\n");
    }

    public static int addnum(int x, int y){
        return x + y;
    }

    //Overloading
    public static int addnum(int x, int y, int z){
        return x + y + z;
    }
}
