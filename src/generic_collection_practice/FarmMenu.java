package generic_collection_practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class FarmMenu {
    Scanner sc = new Scanner(System.in);
    FarmController fc = new FarmController();

    public void mainMenu() {

        while (true) {
            System.out.println("====== KH 마트 ======");
            System.out.println("***** 메인 메뉴 *****");
            System.out.println("1. 직원 메뉴");
            System.out.println("2. 손님 메뉴");
            System.out.println("9. 종료");
            System.out.print("메뉴 번호 선택: ");
            int menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    adminMenu();
                    break;
                case 2:
                    customerMenu();
                    break;
                case 9:
                    System.out.println("프로그램 종료");
                    return;
                default:
                    System.out.println("잘 못 입력하셨습니다. 다시 입력해주세요");
            }
        }
    }

    public void adminMenu() {

        boolean again = true;
        while (again) {
            System.out.println("***** 직원 메뉴 *****");
            System.out.println("1. 새 농산물 추가");
            System.out.println("2. 종류 삭제");
            System.out.println("3. 수량 수정");
            System.out.println("4. 농산물 목록");
            System.out.println("9. 메인으로 돌아가기");
            System.out.print("메뉴 번호 선택: ");
            int menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    addNewKind();
                    break;
                case 2:
                    removeKind();
                    break;
                case 3:
                    changeAmount();
                    break;
                case 4:
                    printFarm();
                    break;
                case 9:
                    again = false;
                    break;
                default:
                    System.out.println("잘못 입력하셨습니다. 다시입력해주세요.");
            }
        }
    }
    public void customerMenu() {
        boolean again = true;

        while (again) {
            System.out.println("현재 KH마트 농산물 수량");
            printFarm();
            System.out.println("****** 고객 메뉴 ******");
            System.out.println("1. 농산물 사기");
            System.out.println("2. 농산물 빼기");
            System.out.println("3. 구입한 농산물 보기");
            System.out.println("9. 메인으로 돌아가기");
            System.out.print("메뉴 번호 선택: ");
            int menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    buyFarm();
                    break;
                case 2:
                    removeFarm();
                    break;
                case 3:
                    printBuyFarm();
                    break;
                case 9:
                    again = false;
                    break;
                default:
                    System.out.println("잘못 입력하셨습니다. 다시입력해주세요.");
            }
        }
    }
    public void addNewKind() {
        boolean again = true;
        int num = 0;
        while (again) {
            System.out.println("1. 과일 / 2. 채소 / 3. 견과");
            System.out.print("추가할 종류 번호: ");
            num = sc.nextInt();
            sc.nextLine();

            if (num != 1 && num != 2 && num != 3) {
                System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
            } else {
                again = false;
            }
        }

        System.out.print("이름: ");
        String name = sc.nextLine();
        System.out.print("수량: ");
        int amount = sc.nextInt();

        switch (num) {
            case 1:
                Fruit fruit = new Fruit("과일", name);
                if (fc.addNewKind(fruit, amount)) {
                    System.out.println("새 농산물이 추가되었습니다.");
                } else {
                    System.out.println("새 농산물 추가에 실패하였습니다. 다시입력해주세요.");
                }
                break;
            case 2:
                Vegetable vegetable = new Vegetable("채소", name);
                if (fc.addNewKind(vegetable, amount)) {
                    System.out.println("새 농산물이 추가되었습니다.");
                } else {
                    System.out.println("새 농산물 추가에 실패하였습니다. 다시입력해주세요.");
                }
                break;
            case 3:
                Nut nut = new Nut("견과류", name);
                if (fc.addNewKind(nut, amount)) {
                    System.out.println("새 농산물이 추가되었습니다.");
                } else {
                    System.out.println("새 농산물 추가에 실패하였습니다. 다시입력해주세요.");
                }
                break;
        }
    }
    public void removeKind() {
        boolean again = true;
        int num = 0;
        while (again) {
            System.out.println("1. 과일 / 2. 채소 / 3. 견과");
            System.out.print("삭제할 종류 번호: ");
            num = sc.nextInt();
            sc.nextLine();

            if (num != 1 && num != 2 && num != 3) {
                System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
            } else {
                again = false;
            }
        }

        System.out.print("삭제할 농산물 이름: ");
        String name = sc.nextLine();

        switch (num) {
            case 1:
                Fruit fruit = new Fruit("과일", name);
                if (fc.removeKind(fruit)) {
                    System.out.println("농산물 삭제에 성공하였습니다");
                } else {
                    System.out.println("새 농산물 삭제에 실패하였습니다. 다시입력해주세요.");
                }
                break;
            case 2:
                Vegetable vegetable = new Vegetable("채소", name);
                if (fc.removeKind(vegetable)) {
                    System.out.println("농산물 삭제에 성공하였습니다");
                } else {
                    System.out.println("새 농산물 삭제에 실패하였습니다. 다시입력해주세요.");
                }
                break;
            case 3:
                Nut nut = new Nut("견과류", name);
                if (fc.removeKind(nut)) {
                    System.out.println("농산물 삭제에 성공하였습니다");
                } else {
                    System.out.println("새 농산물 삭제에 실패하였습니다. 다시입력해주세요.");
                }
                break;
        }
    }
    public void changeAmount() {
        boolean again = true;
        int num = 0;
        while (again) {
            System.out.println("1. 과일 / 2. 채소 / 3. 견과");
            System.out.print("수정할 종류 번호: ");
            num = sc.nextInt();
            sc.nextLine();

            if (num != 1 && num != 2 && num != 3) {
                System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
            } else {
                again = false;
            }
        }

        System.out.print("수정할 농산물 이름: ");
        String name = sc.nextLine();
        System.out.print("수정할 수량: ");
        int newAmount = sc.nextInt();

        switch (num) {
            case 1:
                Fruit fruit = new Fruit("과일", name);
                if (fc.changeAmount(fruit,newAmount)) {
                    System.out.println("농산물 수량이 수정되었습니다.");
                } else {
                    System.out.println("농산물 수량 수정에 실패하였습니다. 다시입력해주세요.");
                }
                break;
            case 2:
                Vegetable vegetable = new Vegetable("채소", name);
                if (fc.changeAmount(vegetable, newAmount)) {
                    System.out.println("새 농산물이 추가되었습니다.");
                } else {
                    System.out.println("새 농산물 추가에 실패하였습니다. 다시입력해주세요.");
                }
                break;
            case 3:
                Nut nut = new Nut("견과류", name);
                if (fc.changeAmount(nut,newAmount)) {
                    System.out.println("새 농산물이 추가되었습니다.");
                } else {
                    System.out.println("새 농산물 추가에 실패하였습니다. 다시입력해주세요.");
                }
                break;
        }
    }
    public void printFarm() {
        HashMap hashMap = fc.printFarm();
        Set<Farm> keySet = hashMap.keySet();
        for (Farm farm : keySet) {
            String kind = farm.getKind();
            int amount = (Integer) hashMap.get(farm);
            if (farm instanceof Fruit) {
                System.out.println(kind + " : " + ((Fruit) farm).getName() + "(" + amount + "개)");
            } else if (farm instanceof Vegetable) {
                System.out.println(kind + " : " + ((Vegetable) farm).getName() + "(" + amount + "개)");
            } else if (farm instanceof Nut) {
                System.out.println(kind + " : " + ((Nut) farm).getName() + "(" + amount + "개)");
            }
        }
    }
    public void buyFarm() {
        boolean again = true;
        int num = 0;
        while (again) {
            System.out.println("1. 과일 / 2. 채소 / 3. 견과");
            System.out.print("구매할 종류 번호: ");
            num = sc.nextInt();
            sc.nextLine();

            if (num != 1 && num != 2 && num != 3) {
                System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
            } else {
                again = false;
            }
        }

        System.out.print("구매할 농산물 이름: ");
        String name = sc.nextLine();

        switch (num) {
            case 1:
                Fruit fruit = new Fruit("과일", name);
                if (fc.buyFarm(fruit)) {
                    System.out.println("농산물 구매에 성공하였습니다..");
                } else {
                    System.out.println("마트에 없는 물건이거나 수량이 없습니다. 다시입력해주세요.");
                }
                break;
            case 2:
                Vegetable vegetable = new Vegetable("채소", name);
                if (fc.buyFarm(vegetable)) {
                    System.out.println("농산물 구매에 성공하였습니다..");
                } else {
                    System.out.println("마트에 없는 물건이거나 수량이 없습니다. 다시입력해주세요.");
                }
                break;
            case 3:
                Nut nut = new Nut("견과류", name);
                if (fc.buyFarm(nut)) {
                    System.out.println("농산물 구매에 성공하였습니다..");
                } else {
                    System.out.println("마트에 없는 물건이거나 수량이 없습니다. 다시입력해주세요.");
                }
                break;
        }
    }
    public void removeFarm() {

        boolean again = true;
        int num = 0;
        while (again) {
            System.out.println("1. 과일 / 2. 채소 / 3. 견과");
            System.out.print("구매취소할 종류 번호: ");
            num = sc.nextInt();
            sc.nextLine();

            if (num != 1 && num != 2 && num != 3) {
                System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
            } else {
                again = false;
            }
        }

        System.out.print("구매 취소할 농산물 이름: ");
        String name = sc.nextLine();

        switch (num) {
            case 1:
                Fruit fruit = new Fruit("과일", name);
                if (fc.removeFarm(fruit)) {
                    System.out.println("구매 취소에 성공하였습니다..");
                } else {
                    System.out.println("구매 목록에 존재하지 않습니다.. 다시입력해주세요.");
                }
                break;
            case 2:
                Vegetable vegetable = new Vegetable("채소", name);
                if (fc.removeFarm(vegetable)) {
                    System.out.println("구매 취소에 성공하였습니다..");
                } else {
                    System.out.println("구매 목록에 존재하지 않습니다.. 다시입력해주세요.");
                }
                break;
            case 3:
                Nut nut = new Nut("견과류", name);
                if (fc.removeFarm(nut)) {
                    System.out.println("구매 취소에 성공하였습니다..");
                } else {
                    System.out.println("구매 목록에 존재하지 않습니다.. 다시입력해주세요.");
                }
                break;
        }
    }

    public void printBuyFarm() {
        Iterator<Farm> it = fc.printBuyFarm().iterator();

        while (it.hasNext()) {
            Farm farm = it.next();
            if (farm instanceof Fruit) {
                System.out.println(farm.getKind() + " : " + ((Fruit) farm).getName());
            } else if (farm instanceof Vegetable) {
                System.out.println(farm.getKind() + " : " + ((Vegetable) farm).getName());
            } else if (farm instanceof Nut) {
                System.out.println(farm.getKind() + " : " + ((Nut) farm).getName());
            }
        }
    }
}
