package Lesson_4;

public class Soy extends CondimentDecorator {

    private Beverage beverage;

    Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    public double cost() {
        return beverage.cost() + 0.15;
    }

}