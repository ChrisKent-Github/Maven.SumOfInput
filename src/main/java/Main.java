import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        int input = 0;
        boolean rerun = false;
        while (!rerun) {
            System.out.println("Input Number");
            input = userInput.nextInt();
            for (int i = input - 1; i >= 0; i--) {
                input += i;
            }
            int result = input;
            System.out.println(result);
        }
        rerun = true;
    }






}

