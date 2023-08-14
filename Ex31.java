
package ex31;
import java.util.*;

public class Ex31 {
static void largesum(int arr[],int size){
    int c=0;
    int m=0;
    int start=0,s=0,end=0;
    for(int i=0;i<size;i++){
        c=c+arr[i];
        if(c>m){
            m=c;
            start=s;
            end =i;
        }
        if(c<0){
            c=0;
        s=1+i;
        }
    }
    System.out.println("max sum=  "+m);
    System.out.println("Starting index " + start);
        System.out.println("Ending index " + end);
}
    
    public static void main(String[] args) {
        // TODO code application logic here
        int arr[]={-2, -3, 4, -1, -2, 1, 5, -3 };
        int size=arr.length;
        largesum(arr,size);
    }
    
}
