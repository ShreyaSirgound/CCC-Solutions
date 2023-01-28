import java.util.Scanner;

/*
 * Good Fours and Good Fives
 * Author: Shreya Sirgound
 */

 public class S1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int numOfSums = 0;

        if (n%4 == 0){
            numOfSums++;
        }

        if(n%5 == 0){
            numOfSums++;
        }

        for (int i = 1; i <= n; i++){
            n = n - 1;
            if (n%5 == 0){
                if (i%4 == 0){
                    numOfSums++;
                    break;
                }
            }
        }

        System.out.println(numOfSums);

        scan.close();

        
    }
 }