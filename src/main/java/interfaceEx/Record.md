# Interface 接口

1、 ** Interface abstract methods cannot have body **
```
public interface Interface1 {

    String f1(String var1);

    Object f2 (Object object){ return  object.toString(); }  
}
```
    f2 报  Interface abstract methods cannot have body

2、接口里可以有静态方法

```
public interface Interface1 {

    String f1(String var1);

    static Object f2 (Object object){ return  object.toString(); }  
}
```
*从Java 8开始，接口当中允许定义静态方法、默认方法*。
意义: 接口方法扩展