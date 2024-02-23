import java.util.*;

public class indiancoins{
    public static void main(String args[]){
        Integer coins[] = {1,2,5,10,20,50,100,500,2000};

        Arrays.sort(coins , Comparator.reverseOrder());

        int coinsused =0;
        int amount = 590;

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<coins.length;i++){
            if(coins[i]<=amount){
                while(coins[i]<=amount){
                    coinsused++;
                    list.add(coins[i]);
                    amount -=coins[i];
                }
            }
        }

        System.out.println("minimum coins used: "+coinsused);

        for(int i=0 ;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }
}