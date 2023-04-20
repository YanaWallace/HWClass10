package HWClass10;

public class HW001 {
    public static void main(String[] args) {
        String[][] grades = {
                {"Brett", "Robin", "Skylar", "Aubrey"},
                {"A", "C", "B", "A"}
        };

        for (int i = 0; i < 4; i++) {
            if (grades[1][i].equals("A") || grades[1][i].equals("B")){
                System.out.println(grades[0][i]);
            }
        }

    }
}
