import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        input.close();

        if(number %  2 == 0){
            System.out.println("The number is even.");
        }else{
            System.out.println("The number is odd.");
        }
    }
}