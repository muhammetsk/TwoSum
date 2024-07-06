import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int arraySize = 100;
        int[] randomArray = new int[arraySize];


        Random random = new Random();
        for (int i = 0; i < arraySize; i++) {
            randomArray[i] = random.nextInt(100);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Target: ");
        int target = scanner.nextInt();
        boolean found = false;

        for (int i = 0; i<randomArray.length; i++){
            for (int j = 1; j < randomArray.length-1; j++) {
                if (randomArray[i] + randomArray[j] == target){
                    found = true;
                    System.out.println("["+i + "," + j +"]");
                    break;
                }
            }
            if (found)break;

        }

    }
}