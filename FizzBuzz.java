/**
 * Created by ramya on 5/18/16.
 */
public class FizzBuzz {
    public static void main(String args[]){
        int n=15;
        int i=1;
        while(i<=n){
            if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            }
            else if(i%3==0){
                System.out.println("Fizz");
            }
            else if(i%5==0){
                System.out.println("Buzz");
            }
            else
                System.out.println(i);
            i++;
        }
    }
}
