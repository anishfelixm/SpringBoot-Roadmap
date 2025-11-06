public class Arrays {
    public static void main(String[] args) {
        String[][] cars = new String[3][3];
        cars[0][0] = "Camaro";
        cars[0][1] = "Tesla";
        cars[0][2] = "Porsche";
        cars[1][0] = "Ferrari";
        cars[1][1] = "Lamborghini";
        cars[1][2] = "Ford";
        cars[2][0] = "Mustang";
        cars[2][1] = "Suzuki";
        cars[2][2] = "Toyota";

        for (int i = 0; i < cars.length; i++) {
            System.out.println();
            for (int j = 0; j  < cars[i].length; j++) {
                System.out.print(cars[i][j] + " ");
            }
        }
    }
}
