import java.util.*;

public class permutation{
    
    static void perm(int[] a, int k, int n){
        if(k == n){
            System.out.println();
            //Output permutation
            for(int i=0; i<n; i++){
                System.out.print(a[i]+" ");
            }
        }
        else{
            for(int i=k; i<n; i++){
                int t = a[k];
                a[k] = a[i];
                a[i] = t;
                perm(a,k+1,n);
                //All permutation of a[k+1 : n]
                t = a[k];
                a[k] = a[i];
                a[i] = t;
            }
        }
    }

    public static void main(String[] args){
        //Scanner object
        Scanner scr = new Scanner(System.in);
        int k,n;
        System.out.print("Enter the size of array ('n') : ");
        n = scr.nextInt();

        System.out.print("Enter the digits to be fixed ('k') : ");
        k = scr.nextInt();

        System.out.println("Enter elements of array");
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = scr.nextInt();
        }

        System.out.println("\n\nPermutation for given array\n\n");
        perm(a, k, n);

        System.out.println();
        //Close the Scanner object
        scr.close();
    }
}
