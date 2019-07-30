package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class DoubleColon {




    public static void main (String[]args){
        List<String> al = Arrays.asList("a", "b", "c", "d");
        for (String a : al) {
            System.out.println(a);
        }
        //下面的for each循环和上面的循环是等价的
        al.forEach(x -> {
            System.out.println(x);
        });

        lamda();
    }

    public static void lamda() {
        System.out.println("**************lamda*******************");
        List<String> al = Arrays.asList("a", "b", "c", "d");
        al.forEach(DoubleColon::printValur);
        //下面的方法和上面等价的
        Consumer<String> methodParam = DoubleColon::printValur; //方法参数
        al.forEach(x -> methodParam.accept(x));//方法执行accept
        System.out.println("**************lamda*******************");

    }

    public static void printValur (String str){
        System.out.println("print value : " + str);
    }
}
