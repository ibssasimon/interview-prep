public class ArrayTestDriver {

    public static void main(String[] args) {
        int[] array = {1, 2, 0};
        print(array);
        int [] barray = ArrayTest.insert(array, 3);
        print(barray);
    }

    public static void print(int[] a) {
        System.out.print("[");
        for(int i = 0; i < a.length - 1; i++) {
            if (i != a.length - 1) {
                System.out.print(a[i] + ",");
            } else {
                System.out.print(a[i]);
            }
            
        }
        System.out.print("]");
    }
}