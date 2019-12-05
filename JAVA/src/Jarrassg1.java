public class Jarrassg1 {

    public static int[] subArr(int arr[], int sIndex, int eIndex) {
        int diff = eIndex - sIndex;
        int subarr[] = new int[diff];
        for (int i = 0, j = sIndex; i < subarr.length; i++, j++) {
            subarr[i] = arr[j];
        }
        return subarr;
    }

    public static void main(String[] args) {
        int[] asg1 = {1, 2, 3, 4, 5};
        for (int i : subArr(asg1, 2, 4)) {
            System.out.println(i);

        }
    }
}
