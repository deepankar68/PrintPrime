import java.util.*;
public class PrintPrime {
public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter low range num and high range num separeted by white space: ");
    
    int low = input.nextInt();
    int high = input.nextInt();

    for(int n = low; n <= high; n++){
        
        int count = 0;
        for(int div = 2; div*div <= n; div++){
            if(n % div == 0){
                count++;
                break;
            }
        }
        if(count == 0){
            System.out.println(n);
        }
        
    }
}
}   