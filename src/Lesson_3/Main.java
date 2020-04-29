package Lesson_3;

public class Main {
    public static void lesson3_main(String[] args) {
        NutritionFacts cocaCola = new NutritionFacts
                .Builder("Coca-Cola", 240, 8)
                .calories(100)
                .sodium(35)
                .carbohydrate(27)
                .build();

        NutritionFacts snickers = new NutritionFacts
                .Builder("Snickers", 300, 10)
                .calories(200)
                .fat(15)
                .carbohydrate(100)
                .build();

        System.out.println(cocaCola.toString());
        System.out.println(snickers.toString());
    }
}
