package top_interview_150;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class RandomizedSet {
	HashMap<Integer,Integer> map;
    Random random;
    List<Integer> list;
    
    public RandomizedSet() {
         map = new HashMap<Integer,Integer>();
         random = new Random();
         list = new ArrayList<Integer>();
    }
    
    public boolean insert(int val) {
        
       if(!map.containsKey(val)){
           
           map.put(val,list.size());
            list.add(val);
            return true;
       }
       return false;

    }
    
    public boolean remove(int val) {
       
        int index = map.getOrDefault(val,-1);
        if(index>=0){
        int listSize =list.size()-1;
        Collections.swap(list,index,listSize);
        int swapped = list.get(index);
        map.put(swapped,index);
        list.remove(listSize);
        map.remove(val);
        return true;
        }
        return false;
        
    }
    
    public int getRandom() {
       return list.get(random.nextInt(list.size()));
    }
}
