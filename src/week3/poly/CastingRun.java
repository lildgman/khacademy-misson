package week3.poly;

public class CastingRun {
    public static void main(String[] args) {

        // 부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent p2 = new Child();
        // 이때 자식의 기능은 호출할 수 없음
        // p2.childMethod();

        System.out.println("다운캐스팅");
        Child child = (Child) p2;
        child.childMethod();
    }
}
