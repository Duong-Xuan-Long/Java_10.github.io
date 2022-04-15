package playerservice;

import com.company.Player;
import com.company.Position;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Team {
    Random random=new Random(0);
    Player p1=new Player(1,"Mr 1", Position.DF);
    Player p2=new Player(2,"Mr 2", Position.DF);
    Player p3=new Player(3,"Mr 3", Position.DF);
    Player p4=new Player(4,"Mr 4", Position.DF);
    Player p5=new Player(5,"Mr 5", Position.DF);
    Player p6=new Player(6,"Mr 6", Position.FW);
    Player p7=new Player(7,"Mr 7", Position.FW);
    Player p8=new Player(8,"Mr 8", Position.FW);
    Player p9=new Player(9,"Mr 9", Position.FW);
    Player p10=new Player(10,"Mr 10", Position.MF);
    Player p11=new Player(11,"Mr 11", Position.MF);
    Player p12=new Player(12,"Mr 12", Position.MF);
    Player p13=new Player(13,"Mr 13", Position.MF);
    Player p14=new Player(14,"Mr 14", Position.MF);
    Player p15=new Player(15,"Mr 15", Position.GK);
    Player p16=new Player(16,"Mr 16", Position.GK);

    ArrayList<Player> listDF=new ArrayList<>();
    ArrayList<Player> listFW=new ArrayList<>();
    ArrayList<Player> listMF=new ArrayList<>();
    ArrayList<Player> listGK=new ArrayList<>();
    ArrayList<Player> list11=new ArrayList<>();

    public void add(){
        listDF.add(p1);
        listDF.add(p2);
        listDF.add(p3);
        listDF.add(p4);
        listDF.add(p5);
        listFW.add(p6);
        listFW.add(p7);
        listFW.add(p8);
        listFW.add(p9);
        listMF.add(p10);
        listMF.add(p11);
        listMF.add(p12);
        listMF.add(p13);
        listMF.add(p14);
        listGK.add(p15);
        listGK.add(p16);

        Scanner scanner=new Scanner(System.in);


        String choice;
        do{
            display();
            System.out.println("chọn đội hình bạn muốn: ");
             choice=scanner.nextLine();
            switch(choice){
                case "1": dh1442();
                    break;
                case "2":dh1433();
                    break;
                case "3":dh1352();
                    break;
                case "4":
                    System.out.println("Exit");
                default:
                    System.out.println("ENter again");
            }
        }while(!choice.equals("4"));


    }
    public void dh1442(){
       
        
            int df1=random.nextInt(listDF.size());
            int df2=random.nextInt(listDF.size());
        int df3=random.nextInt(listDF.size());
        int df4=random.nextInt(listDF.size());
        

       while(df2==df1){
           df2=random.nextInt(listDF.size());
       }
       while((df3==df1)||(df3==df2)){
           df3=random.nextInt(listDF.size());
       }
       while((df4==df3)||(df4==df2)||(df4==df1)){
           df4=random.nextInt(listDF.size());
       }
        list11.add(listDF.get(df1));
        list11.add(listDF.get(df2));
        list11.add(listDF.get(df3));
        list11.add(listDF.get(df4));

        int fw1=random.nextInt(listFW.size());
        int fw2=random.nextInt(listFW.size());
        while(fw1==fw2){
            fw2=random.nextInt(listFW.size());
        }

        list11.add(listFW.get(fw1));
        list11.add(listFW.get(fw2));

        int gk1= random.nextInt(listGK.size());
        list11.add(listGK.get(gk1));
        int mf1=random.nextInt(listMF.size());
        int mf2=random.nextInt(listMF.size());
        int mf3=random.nextInt(listMF.size());
        int mf4=random.nextInt(listMF.size());


        while(mf2==mf1){
            mf2=random.nextInt(listMF.size());
        }
        while((mf3==mf1)||(mf3==mf2)){
            mf3=random.nextInt(listMF.size());
        }
        while((mf4==mf3)||(mf4==mf2)||(mf4==mf1)){
            mf4=random.nextInt(listMF.size());
        }
        list11.add(listMF.get(mf1));
        list11.add(listMF.get(mf2));
        list11.add(listMF.get(mf3));
        list11.add(listMF.get(mf4));

        for(Player i:list11){
                System.out.println(i);
            }
    }
    public void dh1433(){
        int gk1= random.nextInt(listGK.size());
        list11.add(listGK.get(gk1));

        int df1=random.nextInt(listDF.size());
        int df2=random.nextInt(listDF.size());
        int df3=random.nextInt(listDF.size());
        int df4=random.nextInt(listDF.size());


        while(df2==df1){
            df2=random.nextInt(listDF.size());
        }
        while((df3==df1)||(df3==df2)){
            df3=random.nextInt(listDF.size());
        }
        while((df4==df3)||(df4==df2)||(df4==df1)){
            df4=random.nextInt(listDF.size());
        }
        list11.add(listDF.get(df1));
        list11.add(listDF.get(df2));
        list11.add(listDF.get(df3));
        list11.add(listDF.get(df4));

        int mf1=random.nextInt(listMF.size());
        int mf2=random.nextInt(listMF.size());
        int mf3=random.nextInt(listMF.size());
       


        while(mf2==mf1){
            mf2=random.nextInt(listMF.size());
        }
        while((mf3==mf1)||(mf3==mf2)){
            mf3=random.nextInt(listMF.size());
        }
       
        list11.add(listMF.get(mf1));
        list11.add(listMF.get(mf2));
        list11.add(listMF.get(mf3));


        int fw1=random.nextInt(listFW.size());
        int fw2=random.nextInt(listFW.size());
        int fw3=random.nextInt(listFW.size());



        while(fw2==fw1){
            fw2=random.nextInt(listFW.size());
        }
        while((fw3==fw1)||(fw3==fw2)){
            fw3=random.nextInt(listFW.size());
        }

        list11.add(listFW.get(fw1));
        list11.add(listFW.get(fw2));
        list11.add(listFW.get(fw3));


        for(Player i:list11){
            System.out.println(i);
        }
        
    }
    public void dh1352(){
        int gk1= random.nextInt(listGK.size());
        list11.add(listGK.get(gk1));

        int df1=random.nextInt(listDF.size());
        int df2=random.nextInt(listDF.size());
        int df3=random.nextInt(listDF.size());



        while(df2==df1){
            df2=random.nextInt(listDF.size());
        }
        while((df3==df1)||(df3==df2)){
            df3=random.nextInt(listDF.size());
        }

        list11.add(listDF.get(df1));
        list11.add(listDF.get(df2));
        list11.add(listDF.get(df3));

        int mf1=random.nextInt(listMF.size());
        int mf2=random.nextInt(listMF.size());
        int mf3=random.nextInt(listMF.size());
        int mf4=random.nextInt(listMF.size());
        int mf5=random.nextInt(listMF.size());


        while(mf2==mf1){
            mf2=random.nextInt(listMF.size());
        }
        while((mf3==mf1)||(mf3==mf2)){
            mf3=random.nextInt(listMF.size());
        }
        while((mf4==mf3)||(mf4==mf2)||(mf4==mf1)){
            mf4=random.nextInt(listMF.size());
        }
        while((mf5==mf1)||(mf5==mf2)||(mf5==mf3)||(mf5==mf4)){
            mf5=random.nextInt(listMF.size());
        }
        list11.add(listMF.get(mf1));
        list11.add(listMF.get(mf2));
        list11.add(listMF.get(mf3));
        list11.add(listMF.get(mf4));
        list11.add(listMF.get(mf5));

        int fw1=random.nextInt(listFW.size());
        int fw2=random.nextInt(listFW.size());
        int fw3=random.nextInt(listFW.size());



        while(fw2==fw1){
            fw2=random.nextInt(listFW.size());
        }
        while((fw3==fw1)||(fw3==fw2)){
            fw3=random.nextInt(listFW.size());
        }

        list11.add(listFW.get(fw1));
        list11.add(listFW.get(fw2));
        list11.add(listFW.get(fw3));

        for(Player i:list11){
            System.out.println(i);
        }
    }





    public void display(){
        System.out.println("nhấn 1 để chọn đội hình :1GK - 4DF - 4MF - 2FW");
        System.out.println("nhấn 2 để chọn đội hình :1GK - 4DF - 3MF - 3FW");
        System.out.println("nhấn 3 để chọn đội hình :1GK - 3DF - 5MF - 2FW");
        System.out.println("nhấn 4 :exit");
    }

}
