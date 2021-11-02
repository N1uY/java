package CoreJavaVolume.objectAnalyzer;

import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

public class objectAnalyzer {
    private ArrayList<Object> visited = new ArrayList<>();
    public String toString(Object obj){
        if (obj == null) {
            return "null";
        }
        if (visited.contains(obj)) {
            return "...";
        }
        visited.add(obj);
        Class cl = obj.getClass();
        if (cl == String.class) {
            return (String) obj;
        }
        if (cl.isArray()) {

            return "for now,Array is not supported "+cl.getName();
        }

//        String r = cl.getName();
//        Field[] fields = cl.getFields();
//        AccessibleObject.setAccessible(fields,true);
//        for(Field f:fields){
//
//        }
        return cl.getName();
    }
}
