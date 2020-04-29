package Lesson_3;

public class NutritionFacts {
    private final String name;
    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    static class Builder {
        private final String name;
        private final int servingSize;
        private final int servings;

        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;

        Builder(String name, int servingSize, int servings) {
            this.name = name;
            this.servingSize = servingSize;
            this.servings = servings;
        }

        Builder calories(int val) {
            calories = val;
            return this;
        }

        Builder fat(int val) {
            fat = val;
            return this;
        }

        Builder sodium(int val) {
            sodium = val;
            return this;
        }

        Builder carbohydrate(int val) {
            carbohydrate = val;
            return this;
        }

        NutritionFacts build() {
            return new NutritionFacts(this);
        }
    }

    private NutritionFacts(Builder builder) {
        this.name = builder.name;
        this.servingSize = builder.servingSize;
        this.servings = builder.servings;
        this.calories = builder.calories;
        this.fat = builder.fat;
        this.sodium = builder.sodium;
        this.carbohydrate = builder.carbohydrate;
    }

    @Override
    public String toString() {
        return "NutritionFacts{" +
                "name='" + name + '\'' +
                ", servingSize=" + servingSize +
                ", servings=" + servings +
                ", calories=" + calories +
                ", fat=" + fat +
                ", sodium=" + sodium +
                ", carbohydrate=" + carbohydrate +
                '}';
    }
}
