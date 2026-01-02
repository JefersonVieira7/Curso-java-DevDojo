package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClassesTest01 {
    private String name = "Monkey";

    class Inner{
        public void printOuterClassAttibute(){
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        OuterClassesTest01 outerClassesTest01 = new OuterClassesTest01();
        Inner inner = outerClassesTest01.new Inner();
        inner.printOuterClassAttibute();
    }
}
