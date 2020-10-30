
import java.util.Scanner;

public class nonrepeatarray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int k=a.length;

        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++){
                if(i!=j &&a[i]==a[j])
                {
                    break;
                }
                if(j==k){
                    System.out.println("non repeating element is"+a[i]);
            }}}
        }

    }




