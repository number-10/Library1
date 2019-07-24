package split;

public class Split1 {
    public static  void main(String[] args){


    String str = "a,b,c,,";
    String[] ary = str.split(",");
    // 预期大于 3，结果是 3  要校验最后一个分隔符 后是否有内容
    System.out.println(ary.length);

    }
}
