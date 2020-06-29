package collection;



import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class List1 {
    public static void main(String[] args){
        List<String> arrList = new ArrayList<>();
        arrList.add("a");
        arrList.add("b");

        //数组
        String arr[] = {"a","b","c"};
        System.out.println(arr);
        Stream.of(arr).forEach(t->{t=t+"1";
            System.out.println(t);});



        System.out.println("aa");
    }
}
