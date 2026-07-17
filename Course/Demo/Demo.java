
class Calculator {

    public int add(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }
}

class Computer {
    void playMusic() {
        System.out.println("playing music");
    }

}

class Demo {

    public static void main(String[] args) {
        // Calculator calculator = new Calculator();

        int num1 = 4;
        int num2 = 5;

        // int result = calculator.add(num1,num2);
        // System.out.println(result);

        Computer pc = new Computer();

        pc.playMusic();

        /*
         * int num[][] = new int[3][4];
         * 
         * for (int i = 0; i < 3; i++) {
         * for (int j = 0; j < 4; j++) {
         * num[i][j] = (int) (Math.random() 100);
         * }
         * }
         * 
         * for (int i = 0; i < 3; i++) {
         * for (int j = 0; j < 4; j++) {
         * System.out.print(num[i][j] + " ");
         * }
         * System.out.println();
         * }
         * 
         * // enhanced for loops
         * for (int n[] : num) {
         * for (int m : n) {
         * System.out.print(m + " ");
         * }
         * System.out.println();
         * }
         * 
         */

        int nums[][] = new int[3][]; // jagged array

        nums[0] = new int[3];
        nums[1] = new int[4];
        nums[2] = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = (int) (Math.random() * 100);
            }
        }

        for (int n[] : nums) {
            for (int m : n) {
                System.out.print(m + " ");
            }
            System.out.println();
        }

    }
}
