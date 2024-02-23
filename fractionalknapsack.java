import java.util.*;

public class fractionknapsack{
    public static void main(String args[]){
        int value[] = {60,100,120};
        int weight[] = {10,20,30};
        int W =50;

        double ratio[][] = new double[value.length][2];   //make 2d array consist of index and valwight ratio

        for(int i=0;i<value.length;i++){
            ratio[i][0] = i;
            ratio[i][1] = value[i] / (double)weight[i] ; 
        }

        Arrays.sort(ratio ,Comparator.comparingDouble( o ->o[1]));    //ascending sorting

        int capacity = W;
        int val = 0;

        for(int i=ratio.length-1 ; i>=0;i--){    //since we need descending sorting max ration will get store first
            int idx =(int) ratio[i][0];
            if(capacity >=weight[idx]){     //if capacity is greater include full item
                val +=value[idx];
                capacity -=weight[idx];
            }
            else{
                val +=(capacity*ratio[i][1]);    //at last when remaining capacity is less than weight include fractional item
                capacity =0;
                break ;
            }

        } 
        System.out.println("total value is: "+val);
    }
}