public class WarmUpClass {


    public static void main(String[] args) {

        int[] warmUpArr;
        warmUpArr = new int[10];
        warmUpArr[0] = 2;
        warmUpArr[1] = 4;
        warmUpArr[2] = 6;
        warmUpArr[3] = 8;
        warmUpArr[4] = 10;
        warmUpArr[5] = 12;
        warmUpArr[6] = 14;
        warmUpArr[7] = 16;
        warmUpArr[8] = 18;
        warmUpArr[9] = 20;

        //int num = 0;

        for (int x = 0; x < warmUpArr.length; x++) {

            int mThree = 0;
            int mFive  = 0;
            warmUpArr[2] = mThree;
            warmUpArr[5] = mThree;
            warmUpArr[8] = mThree;

            warmUpArr[4] = mFive;
            warmUpArr[9] = mFive;
            System.out.println("The array " + warmUpArr[x]);
        }
        //System.out.println(warmUpArr);
    }

}