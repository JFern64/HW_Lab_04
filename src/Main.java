import java.util.*;
public class Main {
    public static void reclusion(int n){  // hello world
        if (n == 0){
            System.out.println("Hello world!");
        }
        else {
            System.out.println("Hello world!");
                    reclusion(n - 1);
        }
    }
    public static void returnSum(int n1, int n2){
        int total = 0;
        int i;
        for (i = n1; i <= n2; i++){
            int hold = i;
            total += hold;
        }
        if (total % 7 == 0){
            System.out.println(total + " is diviable by 7.");
        }
        else{
            n2 =-1;
        }
    }
    public static int binaryReclusion(int menu[], int low, int high, int target){
        if (low <= high) {
            int mid = low + (high - low) / 2;
            if (menu[mid] == target)
                return mid;
            if (menu[mid] > target)
                return binaryReclusion(menu, low, mid - 1, target);
        }
    return -1;
    }
    public static void main(String[] args) {
    reclusion(5);
    returnSum(1,14);
    int test[] = {12,23,34,56,45,67,78,89,90};
    //binaryReclusion(test,12,90,23);
        System.out.println( "Index: " + binaryReclusion(test,0,test.length,23));


    }
}