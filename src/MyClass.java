/**
 * Created by Антон on 27.11.2016.
 */
public class MyClass {
    static void sayHello(String name){
        System.out.println("Hi, "+name);
    }

    static int calc_sum(int val1, int val2){
        return val1+val2;
    }

    public  static void main(String[] args){
        sayHello("Anton");
        int x = calc_sum(999,52);
        System.out.println(x);

        TestClass tClass1=new TestClass(" www");
        tClass1.Set_attribute_1(1);
        //tClass1.Set_attribute_2(" aaa");

        TestClass tCless2=new TestClass(" zzz");
        tCless2.Set_attribute_1(2);
        ///tCless2.Set_attribute_2(" bbbb");

        tClass1.test_metod("asas");
        tCless2.test_metod("2222");

    }
}
