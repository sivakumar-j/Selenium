package com.company;

public class FlourPacker {
    public static boolean canPack(int bigCount,int smallCount,int goal){
        if(bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }
        int c_big_bag_kg = 5;
        int c_small_bag_kg = 1;
        int v_bigcount = bigCount;//1
        int v_smallcount = smallCount;//0
        int v_bigcount_in_1_kg   = 0;
        int v_smallcount_in_1_kg = 0;
        int v_goal = 0;

        do{
             v_bigcount_in_1_kg   = v_bigcount * c_big_bag_kg;//10
             v_smallcount_in_1_kg = v_smallcount * c_small_bag_kg;//10*1=10//9*1=9//8*1=8
             v_goal = v_bigcount_in_1_kg + v_smallcount_in_1_kg;//20//19//18

            if( v_goal == goal){//no
                return true;
            }else if ( v_goal < goal ){//20<18--No//19<18--No
                return false;
            }else{
                int v_goal_diff = v_goal - goal;//20-18=2//19-18=1
                if (v_goal_diff >= 5) {//2>=5-No//1>=5-No
                    v_bigcount = v_bigcount - 1;
                }else {
                    if(v_goal_diff > smallCount){//2>10-No//1>10-No
                        return false;
                    }
                    v_smallcount = v_smallcount - 1;//10-1=9//9-1=8
                }
            }
        }while ( v_goal > goal);//20>18//19>18
        return false;
    }
}
