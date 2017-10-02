public class Main {

    // Bad way to implement
    public static void main(String[] args) {
	    int val = 3;
	    regFlow(val);
	    switchFlow(val);
	    forFlow(val);
	    whileFlow(val);

    }

    public static void regFlow(int val){
        if(val == 1){
            System.out.println("val is 1");
        } else if (val == 2){
            System.out.println("val is 2");
        } else{
            System.out.printf("Reg Value is : shit happens\n");
        }
    }

    //Switch is good if only testing one variable
    public static void switchFlow(int val){
        switch (val){
            case 1:
                System.out.println("Val is 1");
                break;
            case 2:
                System.out.printf("Val is 2");
                break;
            case 3: case 4: case 5:
                System.out.printf("Switch Value is " + val + '\n');
                break;

            default:
                System.out.printf("shit happens");
        }

    }

    public static void forFlow(int val){
        int count = 0;
        for (int i = 0; i < val; i++){
            count += 1;
        }
        System.out.println("For such an input, Here is the result for adding 'input' times: " + count);
    }

    public static void whileFlow(int val){
        int count = 0;
        while(count < val){
            count += 1;
        }
        System.out.println("Successfully escape while loop, the final count val is: " + count);
    }

}
