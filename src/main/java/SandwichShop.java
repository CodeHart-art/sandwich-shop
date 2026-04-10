import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        double pickedprice = 5.45;
        double largePrice = 8.95;
        int studentAge = 17;

        if (studentAge <= 17){
            pickedprice *= .90;

            System.out.printf("your total is $%.2f",pickedprice);

        } else if (studentAge >=65) {
            pickedprice *= .80;

            System.out.printf("your total is $%.2f",pickedprice);
        }
        else {
            System.out.println("your total is %" + pickedprice);
        }
        ;
    }
}
