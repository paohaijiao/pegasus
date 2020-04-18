package com.pegasus.toolkit;

import java.util.Iterator;
import java.util.Map;

public class Util {
    public static String getAmosConfigure(){
        Map map = System.getenv();
        Iterator it = map.entrySet().iterator();
        while(it.hasNext())
        {
            Map.Entry entry = (Map.Entry)it.next();
            if("AMOS_HOME".equalsIgnoreCase((String)entry.getKey())){
                return (String)entry.getValue();
            }
        }
        return null;
    }
}
