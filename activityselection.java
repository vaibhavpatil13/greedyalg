import java.util.*;

public class activityseletion{
    public static void main(String args[]){
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};

        int max =0;     //count of activities performed

        ArrayList<Integer> li = new ArrayList<>();

        li.add(0);      //index of activities

        max=1;
        int lastend = end[0];

        for(int i=1;i<end.length;i++){
            if(start[i]>=lastend){    //non overlapping activites
                max++;
                li.add(i);
                lastend= end[i];
            }
        }
        System.out.println("total maximum activties: "+max);

        for(int i=0;i<li.size();i++){
            System.out.print("A"+li.get(i)+" ");
        }
    }
}