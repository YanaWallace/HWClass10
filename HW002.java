package HWClass10;

public class HW002 {
    public static void main(String[] args) {
        String[][] cars = {
                {"Ford", "Chevy", "Buick"},
                {"BMW", "Mercedes", "VW"},
                {"Hyundai", "Kia"},
                {"Alfa Romeo", "Ferrari", "Fiat", "Lamborghini"}
        };

        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j]+" ");
            }
            System.out.println();
        }

        for (String[] car : cars) {
            for (String s : car) {
                System.out.print(s+" ");
            }

        }

    }
}
