import java.util.*;

public class jobsequence{
    static class job{
        int index;
        int deadline;
        int profit;

        job(int i,int d, int p){
            index =i;
            deadline = d;
            profit =p ;
        }
    }
    public static void main(String args[]){
        int jobinfo[][] ={{4,20} ,{1,10}, {1,40}, {1,30}};

        ArrayList<job> jobs = new ArrayList<>();

        for(int i=0;i<jobinfo.length;i++){
            jobs.add(new job(i,jobinfo[i][0],jobinfo[i][1]));

        }

        Collections.sort(jobs , (obj1,obj2)-> obj2.profit - obj1.profit);   //descending order of profit

        int time =0;

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<jobs.size();i++){
            job curr = jobs.get(i);
            if(curr.deadline > time){
                time++;
                list.add(curr.index);
            }

        }

        System.out.println("max jobs done: "+time);

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }

    }
}