package week3.poly;

public class PolyRun {
    public static void main(String[] args) {
        System.out.println("부모타입 변수가 부모 인스턴스 참조");
        Parent parent = new Parent();
        parent.parentMethod();
        System.out.println();

        System.out.println("자식타입 변수가 자식 인스턴스 참조");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();
        System.out.println();

        System.out.println("부모타입 변수가 자식 인스턴스 참조");
        Parent p2 = new Child();
        p2.parentMethod();
//        p2.childMethod(); // 에러, 자식의 기능을 호출 할 수 없음

//        Child c2 = new Parent(); // 에러, 자식은 부모를 담을 수 없음

    }
}
