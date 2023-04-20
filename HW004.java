package HWClass10;

public class HW004 {
    public static void main(String[] args) {

        int[][] numbers = {
                {9,7,18},
                {98,27,107},
                {5,28,99}
        };
        int sum = 0;
        for (int[] number : numbers) {
            for (int i : number) {
                sum += i;
            }
        }
        System.out.println(sum);

        }
    }

