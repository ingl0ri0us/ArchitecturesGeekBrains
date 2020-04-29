package Lesson_4;

public class Whip extends CondimentDecorator {

    private Beverage beverage;

    Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    public double cost() {
        return beverage.cost() + 0.10;
    }

}