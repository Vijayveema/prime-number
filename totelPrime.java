import java.util.Scanner;
public class totelPrime {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter tne number ");
        int n=sc.nextInt();
        int totel=0;
        for(int i=1;i<=n;i++){
            int count=0;
            for(int j=1;j<=i;j++){
                if(i%j==0)
                count++;
            }
            if(count==2){
                System.out.print(i+",");
                totel++;
            }
        }
        System.out.println(": totel prime number is->"+totel);
     
    }
}