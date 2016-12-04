/**
 * Created by Антон on 27.11.2016.
 */
public class TestClass {
private int attribut_1;
private String attribut2;

    TestClass(String c){
        attribut2=c;

    }

    TestClass(){
        this.attribut2="default";
    }
    public void test_metod(String Name) {
        System.out.println("Test metod " + Name + attribut2);
    }

    public int get_attribute_1(){
        return attribut_1;
    }

    public String get_attribute_2(){
        return attribut2;
    }

    public void Set_attribute_1(int c){
        this.attribut_1=c;
    }

    public void Set_attribute_2(String c){
        this.attribut2=c;
    }
}

