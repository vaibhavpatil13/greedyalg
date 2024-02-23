import java.util.*;

public class activityselcnonsorted{
    public static void main(String args[]){
        int start[] ={2,5,3,6,7};
        int end[] ={ 9,6,5,7,8};

        int activities[][] = new int[start.length][3];

        for(int i=0;i<start.length;i++){
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        Arrays.sort(activities , Comparator.comparingDouble(o->o[2]));

       int max =0;
       ArrayList<Integer> ans = new ArrayList<>();
       ans.add(activities[0][0]);
       max =1 ;

      int lastend = activities[0][2];

       for(int i=1;i<end.length;i++){
        if(activities[i][1]>=lastend){
            max++;
            ans.add(activities[i][0]);
            lastend = activities[i][2];
        }
       }
        System.out.println("total maximum activties: "+max);

        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }
    }
}