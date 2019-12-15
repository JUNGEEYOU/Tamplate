package hook;

public class Main {

    public static void main(String[] args) {
        Tea teaHook = new Tea();
        Coffee coffeeHook = new Coffee();

        System.out.println("\n 차 준비중...");
        teaHook.prepareRecipe();

        System.out.println("\n 커피 준비중...");
        coffeeHook.prepareRecipe();
    }
}
