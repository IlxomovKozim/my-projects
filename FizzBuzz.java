package fizzbuzz;
import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args) {
        System.out.print("n = ");
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        for(int i=1; i<=n; i++){
            if(i%3 == 0 && i%5 == 0){
                System.out.println("FizzBuzz"); 
            }
            else if(i%3 == 0){
                System.out.println("Fizz"); 
            }
            else if(i%5 == 0){
                System.out.println("Buzz");
            }
          else{
                System.out.println(i);};
            //Kozim
        }
    }
}
