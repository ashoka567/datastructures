public class ReverseArray {
    /**
     * First draft
     *
     * @param a
     * @return
     */
    public int[] reverse(int[] a){

        int k = a.length;
        int middle = k/2;
        for (int i = 0; i < k; i++) {

            int b = a[i];

            if(i < middle){
                int  s = --k;
                a[i] = a[s];
                a[s] = b;
            }

        }

        return a;
    }

    public static void main(String[] args) {
        ReverseArray reverseArray = new ReverseArray();
        int[] a = new int[5];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;
        reverseArray.reverse(a);

        System.out.println("Array size "+a.length);
        for (int i = 0; i < a.length; i++) {
            System.out.println("Array  RE "+a[i]);
        }
    }
}
