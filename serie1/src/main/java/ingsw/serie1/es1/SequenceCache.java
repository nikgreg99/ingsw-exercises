package ingsw.serie1.es1;

import java.util.HashMap;
import java.util.Map;

public class SequenceCache {

    private Map<Integer,Worker> cache;

    public SequenceCache(){
        cache = new HashMap<>();
    }

    public int length(int value){
        if(!cache.containsKey(value)){
            cache.put(value,new Worker(value));
        }

        final Worker worker = cache.get(value);
        return worker.sequence();
    }

}
