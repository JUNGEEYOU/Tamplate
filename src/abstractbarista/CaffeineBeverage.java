package abstractbarista;

public abstract class CaffeineBeverage {

    final void prepareRecipe(){
    boilWater();
    brew();
    pourInCup();
    addCondiments();
    }

    abstract void brew();
    abstract void addCondiments();

    final void boilWater(){
        System.out.println("물 끓이는 중");
    }
   final void pourInCup(){
        System.out.println("컵에 따르는 중");
    }
}
