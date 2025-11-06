import java.util.ArrayList;

public class ArrayListClass {
    public static void main(String[] args) {
        ArrayList<String> food = new ArrayList<String>();

        food.add("Pizza");
        food.add("Burger");
        food.add("Pasta");

        food.set(1, "Sushi");
        food.remove(2);

        for (int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }
        System.out.println();

        for (String i : food) {
            System.out.println(i);
        }
    }
}
