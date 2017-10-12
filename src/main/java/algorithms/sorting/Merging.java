package algorithms.sorting;
public class Merging{
    public static void main(String[] args) {
        int[] a1 = new int[] {0, 2, 2};
        int[] a2 = new int[] {1, 3};
        int[] mergeaarray = mergeArrays(a1, a2 );
        for (int i = 0; i< mergeaarray.length; i++)
        System.out.println(mergeaarray[i]);
    }
    public static int[] mergeArrays(int[] a1, int[] a2) {

        int[] a3 = new int[a1.length + a2.length];

        int i=0, j=0;
        for (int k=0; k<a3.length; k++) {

            if((i< a1.length)&(j< a2.length))
            {
                if (a1[i] < a2[j]) {
                    int a = a1[i];
                    a3[k] = a;
                    i++;
                }
                else {
                    int b = a2[j];
                    a3[k] = b;
                    j++;
                }
            }
        }
        return a3; // your implementation here
    }

}
