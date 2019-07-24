package collection;

import jdk.nashorn.internal.objects.annotations.Function;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

/**
 *
 * @date  2019/07/18
 * @author number10
 */
public class Collection1 {
    public static  void main(String[] args){
      //  Map map = new HashMap<String,Object>();

        IdentityHashMap<String,Object> map = new IdentityHashMap<String, Object>();
        map.put(new String("name"),1);
        map.put("name",2);

        for(Map.Entry<String,Object> temp : map.entrySet()){
            System.out.println(temp.getKey()+"---"+temp.getValue());
        }

        HashMap<String,Object> map2 = new HashMap<String, Object>();
        map2.put(new String("name"),1);
        map2.put("name",2);

        for(Map.Entry<String,Object> temp : map2.entrySet()){
            System.out.println(temp.getKey()+"---"+temp.getValue());
        }

    }


}
