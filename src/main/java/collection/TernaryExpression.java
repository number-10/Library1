package collection;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TernaryExpression {
    public static  void main(String[] args){
        Map<String, String> params = new HashMap<String, String>();

        Map<String, String[]> requestParams = new HashMap<String, String[]>();
        String[] a={"1","2","3"};
        String str3 = StringUtils.join(a,",");
        System.out.println(str3);

        String str4 = ArrayUtils.toString(a,",");
        System.out.println(str4);

        requestParams.put("key",a);
        requestParams.put("name",a);
        requestParams.put("name1",a);

        for (Iterator iter = requestParams.keySet().iterator(); iter.hasNext();)
        {
            String name = (String) iter.next();
            String[] values = (String[]) requestParams.get(name);
            String valueStr = "";
            for (int i = 0; i < values.length; i++)
            {
                valueStr = (i == values.length - 1) ? valueStr + values[i] : valueStr + values[i] + ",";

                System.out.println("valuesStr: "+i+", "+valueStr);
            }
            //乱码解决，这段代码在出现乱码时使用。
            //valueStr = new String(valueStr.getBytes("ISO-8859-1"), "utf-8");
            params.put(name, valueStr);
        }

    }
}
