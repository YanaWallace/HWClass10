package HWClass10;

public class HW003 {
    public static void main(String[] args) {
        String[][] groceries = {
                {"Potato", "Broccoli", "Carrots"},
                {"Apples", "Kiwi", "Oranges"},
                {"Milk", "Cheese","Yogurt"},
                {"Cake", "Coockie", "Candy", "Icecream"}
        };

        for (int i = 0; i < groceries.length; i++) {
            for (int j = 0; j < groceries[i].length; j++) {
                System.out.print(groceries[i][j]+" ");
            }
            System.out.println();
        }

        for (String[] str : groceries) {
            for (String s : str) {
                System.out.print(s+" ");
            }

        }
    }
}
