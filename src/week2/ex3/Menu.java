package week2.ex3;

public class Menu {
//    우리가 영화관에서 사용하는 프로그램을 만든다고 가정한다.
//    해당 클레스는 영화관 매점에 메뉴 객체를 생성할 Menu Class이다.
//    필요하다고 생각하는 데이터와 기능을 구현하고 이를 활용해 보자
    private String name;
    private int price;
    private int quantity;
    public Menu(String menuName, int menuPrice, int menuQuantity) {
        this.name = menuName;
        this.price = menuPrice;
        this.quantity = menuQuantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }



}
