/**
 * Created by ramya on 5/18/16.
 */
public class DiamondWithName {
    public static void main(String args[]){
        int n=4;
        for(int i=1;i<=n-1;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.println("ramya");
        for(int i=n-1;i>0;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
