public class ArrayTest {

    public static int[] insert(int[] a, int n) {
        if(a.length == 1) {
            return a;
        }

        for(int i = 0; i < a.length - 1; i++) {
            if(n <= a[i] && a[i] != 0) {
                int [] newArray = insertNum(a, n);
                return newArray;
            }
        }

        return a;

    }

    public static int[] insertNum(int[] a, int n) {
        int[] b = new int[a.length + 1];

        for(int i = 0; i < a.length - 1; i++) {
            if(a[i] < n && a[i] != 0) {
                b[i] = a[i];
            } else {
                b[i+1] = n;
                b[b.length - i - 1] = a[i];
            }
        }

        return b;
    }
}