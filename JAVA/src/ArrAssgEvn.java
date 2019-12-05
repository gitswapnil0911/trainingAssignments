public class ArrAssgEvn {
    public void evenElements(int[] arr) {
        for (int i : arr) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
            int[] arr={12,13,14,15,16,17,18};
            ArrAssgEvn as = new ArrAssgEvn();
            as.evenElements(arr);
            }
}




