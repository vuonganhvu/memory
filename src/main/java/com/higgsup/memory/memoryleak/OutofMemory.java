package com.higgsup.memory.memoryleak;

import java.util.HashMap;
import java.util.Map;

public class OutofMemory {
    private Map<String, String> map = new HashMap<String, String>();

    public Map<String, String> getCache() {
        return map;
    }

    public void forEachDisplay(long size) {
        for (int i =1; i < size; i++) {
            String key = "Anil"+i;
            String val = map.get(key);
            map.remove(key);
            System.out.println(key + " :: " + val);
        }
    }

    public static void main(String[] args) {
        OutofMemory cache = new OutofMemory();
        cache.initCache(5000);
        cache.forEachDisplay(5000);
        cache.initCache(3000);
    }

    private void initCache(long size){
        int lengt = map.size();
        for (int i = 0; i < size; i++) {
            map.put("Anil"+(i+lengt), "Work as Engineer"+(i+lengt));
        }
    }
}
