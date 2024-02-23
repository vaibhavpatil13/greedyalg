import java.util.*;

public class minimumsum{
    public static void main(String args[]){
        int a[] ={ 3,2,7,8};
        int b[] = { 5,3,7,9};

        Arrays.sort(a);
        Arrays.sort(b);

        int absdiff = 0;

        for(int i=0;i<a.length;i++){
            absdiff += Math.abs(a[i]-b[i]);
        }

        System.out.println("minimum difference is : "+absdiff);
    }
}