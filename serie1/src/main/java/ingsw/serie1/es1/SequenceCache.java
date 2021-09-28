package ingsw.serie1.es1;

import java.util.HashMap;
import java.util.Map;

public class SequenceCache {

    private final Map<Integer,Worker> allWorkers;

    public SequenceCache(){
        allWorkers = new HashMap<>();
    }

    public int length(int length){
        if(!allWorkers.containsKey(length)){
            allWorkers.put(length,new Worker(length));
        }
        return allWorkers.get(length).sequence();
    }

}
