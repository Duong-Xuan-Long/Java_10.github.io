package playerservice;

import com.company.Player;
import com.company.Position;

import java.util.*;

public class Team {
    ArrayList<Player> allPlayers=new ArrayList<>();
   public ArrayList<Player> getAllPlayer(){

       allPlayers.add(new Player(1,"Nguyễn Văn Toản",Position.GK));
       allPlayers.add(new Player(2,"Nguyễn Văn Toản",Position.GK));
       allPlayers.add(new Player(3,"Nguyễn Văn Toản",Position.DF));
       allPlayers.add(new Player(4,"Nguyễn Văn Toản",Position.DF));
       allPlayers.add(new Player(5,"Nguyễn Văn Toản",Position.DF));
       allPlayers.add(new Player(6,"Nguyễn Văn Toản",Position.DF));
       allPlayers.add(new Player(7,"Nguyễn Văn Toản",Position.DF));
       allPlayers.add(new Player(8,"Nguyễn Văn Toản",Position.MF));
       allPlayers.add(new Player(9,"Nguyễn Văn Toản",Position.MF));
       allPlayers.add(new Player(10,"Nguyễn Văn Toản",Position.MF));
       allPlayers.add(new Player(11,"Nguyễn Văn Toản",Position.MF));
       allPlayers.add(new Player(12,"Nguyễn Văn Toản",Position.MF));
       allPlayers.add(new Player(13,"Nguyễn Văn Toản",Position.MF));
       allPlayers.add(new Player(14,"Nguyễn Văn Toản",Position.MF));
       allPlayers.add(new Player(15,"Nguyễn Văn Toản",Position.FW));
       allPlayers.add(new Player(16,"Nguyễn Văn Toản",Position.FW));
       allPlayers.add(new Player(17,"Nguyễn Văn Toản",Position.FW));
       allPlayers.add(new Player(18,"Nguyễn Văn Toản",Position.FW));
       allPlayers.add(new Player(19,"Nguyễn Văn Toản",Position.FW));
       allPlayers.add(new Player(20,"Nguyễn Văn Toản",Position.FW));
       return allPlayers;
   }
   public void show(ArrayList<Player> list){
       for(Player p:list){
           System.out.println(p.getShirtNumber()+" - "+p.getFull_name()+" - "+p.getPosition()+" - ");
       }


   }
    public ArrayList<Player> buildTeam(int gk,int df,int mf,int fw){
        ArrayList<Player> choiceTeam=new ArrayList<>();
        Random rd=new Random();
        int gkSize=0;
        int dfSize=0;
        while(gkSize<gk){
            int rdGoalKeeper=rd.nextInt(20);

            if(allPlayers.get(rdGoalKeeper).getPosition()==Position.GK){
                choiceTeam.add(allPlayers.get(rdGoalKeeper));
                gkSize++;
            }
        }
        while(dfSize<df){
            int dfRandom=rd.nextInt(20);
            if(allPlayers.get(dfRandom).getPosition()==Position.DF){
                if(!choiceTeam.contains(allPlayers.get(dfRandom))){
                    choiceTeam.add(allPlayers.get(dfRandom));
                    dfSize++;
                }
            }
        }
        for(Player p:choiceTeam){
            System.out.println(p);
        }

        return choiceTeam;
    }



}
