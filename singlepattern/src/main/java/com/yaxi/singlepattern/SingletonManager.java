package com.yaxi.singlepattern;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * 容器单例
 * Created by yaxi on 2017/11/21.
 */

public class SingletonManager {

    private SingletonManager(){}

    private static Map<String,Object> objMap = new LinkedHashMap<>();

    public static void registerService(String key,Object instance){
        if (!objMap.containsKey(key)){
            objMap.put(key,instance);
        }
    }

    public static Object getService(String key){
        return objMap.get(key);
    }
}
