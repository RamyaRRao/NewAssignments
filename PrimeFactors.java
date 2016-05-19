/**
 * Created by ramya on 5/18/16.
 */
public class PrimeFactors {
    public static void main(String args[]){
       PrimeFactors pg = new PrimeFactors();
        pg.generate(30);

    }
    public void generate(int n){
        int i=2;
        int count;
        while(i<n){
            if(n%i==0){
                int j=1;
                count=0;
                while(j<=i){
                    if(i%j==0) {
                        count++;
                    }
                    j++;
                }
                if(count==2){
                    System.out.println(i);
                }
            }
            i++;
        }
    }
}
