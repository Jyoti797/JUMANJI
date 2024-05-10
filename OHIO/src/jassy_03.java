public class jassy_03 {
    static void variableLengthArgs(int arr[]) {
        System.out.println("Number of args " + arr.length + " Contents ");
        for (int i=0; i<arr.length;i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int n1[] = {10};
        int n2[] = {15, 27, 38};
        int n3[] = {45,66,79,22,999};
        variableLengthArgs(n1);
        variableLengthArgs(n2);
        variableLengthArgs(n3);
    }
}
