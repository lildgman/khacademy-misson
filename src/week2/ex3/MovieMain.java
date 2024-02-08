package week2.ex3;

public class MovieMain {
    public static void main(String[] args) {
        Menu popcorn = new Menu("카라멜 팝콘",7000,20);
        Menu coke = new Menu("콜라",1500,20);
        Menu nacho = new Menu("나쵸",6000,10);

        Movie avengers = new Movie("어벤져스"
                , new String[]{"09:00", "12:00", "13:00"}
                , new String[]{"A","B","C"});

        Movie interstellar = new Movie("인터스텔라"
                , new String[]{"09:20", "12:30", "15:00"}
                , new String[]{"E","F","G"});

        Movie senAndChihiro = new Movie("센과 치히로의 행방불명"
                , new String[]{"09:05", "11:30", "14:30"}
                , new String[]{"H","I"});

    }
}
