package problem;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class A1 {
    public static void main(String[] args) {
     /*   int[] nums ={2,19,21};
        A1 a = new A1();
        int[] rnums = a.twoSum2(nums,21);

        for(int num : rnums){
            System.out.println(num);
        }

        Set set = new HashSet();
        boolean f1 = set.add(1);
        boolean f2= set.add(1);*/

        HashMap map = new HashMap(16,0.75f);
        map.put("k1","v1");      map.put("k2","v2");   map.put("k3","v3");
        map.get("k1");
        map.containsKey("k1");

        String key = "k1";
        int h=0;
        int v1 = (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
        System.out.println(key.hashCode());
        System.out.println(v1);
        System.out.println(map.get("k1"));


    }

    public  int[]  twoSum(int[] nums, int target) {
        int tmp;
        for(int i =0 ;i<nums.length-1; i++){
            tmp = target-nums[i];
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]==tmp){
                    return new int[]{i,j};
                }
            }
        }
        return  null;
    }
    public  int[]  twoSum2(int[] nums, int target) {
        HashMap hashMap = new HashMap(2);
        int tmp;
        for(int i =0 ;i<nums.length; i++){

            tmp = target-nums[i];
             if(hashMap.containsKey(tmp)){
                return new int[]{(int)hashMap.get(tmp),i};
            }
            hashMap.put(nums[i],i);
        }
        return  null;
    }

}
