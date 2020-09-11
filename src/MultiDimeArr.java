public class MultiDimeArr {

    public static void main(String[] args) {

        int[][] multiArr = {{2, 4, 6, 8, 10,}, {12, 14, 16, 18, 20}};

        System.out.println("MultiDimeArr printing");
        for (int x = 0; x < 2; x++) {
            for (int i = 0; i < 5; i++) {
                int val1 = 0;
                int val2 = 0;

               // if(i == val1 % 5 && i == val2 % 3) {

              // }
                System.out.println(multiArr[x][i]);
         }

        }
    }
}

