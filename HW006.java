package HWClass10;

public class HW006 {
    public static void main(String[] args) {
        String[][] countries = {
                {"USA", "Ukraine", "Mexico"},
                {"Morocco", "Italy", "Chile"},
                {"France", "UK", "Spain", "Germany"},
                {"Canada", "China", "India", "Serbia"}
        };

        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                System.out.println(countries[i][j]);
            }
        }

        int sum = 0;

        for (String[] str : countries) {
            for (String s : str) {
                System.out.print(s+" ");
                sum++;
            }
            System.out.println();
        }
        System.out.println("There are " + sum + " countries in a list");
    }
}


