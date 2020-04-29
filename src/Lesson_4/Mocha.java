package Lesson_4;

public class Mocha extends CondimentDecorator {

    private Beverage beverage;

    Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public double cost() {
        return beverage.cost() + 0.20;
    }

}
