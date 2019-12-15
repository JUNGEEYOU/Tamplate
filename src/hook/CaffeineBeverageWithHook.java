package hook;

public abstract class CaffeineBeverageWithHook {

    final void prepareRecipe(){
    boilWater();
    brew();
    pourInCup();
    if(customerWantsCondiments()) {
        addCondiments();
    }
    }

    abstract void brew();
    abstract void addCondiments();

    final void boilWater(){
        System.out.println("물 끓이는 중");
    }
    final void pourInCup(){
        System.out.println("컵에 따르는 중");
    }

    boolean customerWantsCondiments(){  // 서브클래스 필요에 따라 오버라이드 가능 : 후크
        return true;
    }
}
