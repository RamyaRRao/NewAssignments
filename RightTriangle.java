/**
 * Created by ramya on 5/18/16.
 */
public class RightTriangle {
    public static void main(String args[]){
        int n=6;
        int i=0;
        int j=0;
        while(i<n){
            j=0;
            while(j<=i){
                System.out.print("*");
                j++;
            }
            System.out.println("");
            i++;
        }
    }
}
