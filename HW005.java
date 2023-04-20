package HWClass10;

public class HW005 {
    public static void main(String[] args) {
        int[][] numbers = {
                {9,7,8,10},
                {98,99,107,8},
                {18,28,5,103}
        };
        for (int[] number : numbers) {
            for (int i : number) {
                if (i % 2 == 0){
                    System.out.print(i+" ");
                }
            }
        }
    }
}
