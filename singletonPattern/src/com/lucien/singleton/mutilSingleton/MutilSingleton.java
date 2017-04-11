package com.lucien.singleton.mutilSingleton;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lucien on 2017/3/28.
 */
public class MutilSingleton {

    private static List<MutilSingleton> instanceList = new ArrayList<MutilSingleton>();

    private static int instanceIndex;

    private MutilSingleton(){

    }
    static {
        for(int i = 0;i<3;i++){
            instanceList.add(new MutilSingleton());
        }
    }
    public static MutilSingleton getInstance(int index){
        instanceIndex = index;
        return instanceList.get(index);
    }
    public void say(){
        System.out.println(instanceList.get(instanceIndex));
    }
}
