package week3.overriding;

public class RunOverriding {
    public static void main(String[] args) {

        //자식변수가 자식인스턴스 참조
        Child child = new Child();
        System.out.println(child.name);
        child.method();

        //부모변수가 부모인스턴스 참조
        Parent parent = new Parent();
        System.out.println(parent.name);
        parent.method();

        //부모변수가 자식인스턴스 참조
        Parent p2 = new Child();
        System.out.println(p2.name);
        p2.method();
    }
}
