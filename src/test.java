public class test {
    int a;
    public void m1(String n){
        System.out.println("his name is" + n);
    }
    public void m1(String n, int a){
        System.out.println("her name is"  +  n  +  "and  age is  "  +  a);
    }
    public void m1(String n, int a, int w ){
        System.out.println("steps taken  "   + a +  " name is "  +  n +  "  age is  "  +  w);
    }

    public static void main(String[] args) {
        test obj1 = new test();
        obj1.m1("Anurag");
        test obj2 = new test();
        obj2.m1("anveshika",67);
        test obj3 = new test();
        obj3.m1("anurag", 67, 79999);
    }
}
