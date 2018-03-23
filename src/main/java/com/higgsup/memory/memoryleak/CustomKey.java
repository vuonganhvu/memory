package com.higgsup.memory.memoryleak;

import java.util.HashMap;
import java.util.Map;

public class CustomKey {
    public CustomKey(String name) {
        this.name = name;
    }

    private String name;

    public static void main(String[] args) {
        Map<CustomKey, String> map = new HashMap<CustomKey, String>();
        for(int i = 0; i< 10000; i++){
            CustomKey key = new CustomKey("Shamik"+i);
            map.put(key, "Shamik Mitra");
            String val = map.get(new CustomKey("Shamik"+i));
//            String val = map.get(key);
            System.out.println("Missing equals and hascode so value is not accessible from Map " + val);
        }


//        int size = map.size();
//        for(int i=0; i< 1000; i++){
//            CustomKey key = new CustomKey("Shamik"+(i+size));
//            map.put(key, "Shamik Mitra");
//        }
    }
}
