package week3.animal;

public class Duck implements Animal{
    @Override
    public void sound() {
        System.out.println("꽥꽥");
    }

    @Override
    public void move() {
        System.out.println("오리가 움직입니다.");
    }
}
