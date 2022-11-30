// Реализовать алгоритм сортировки слиянием.
public class task1 {
    public static void main(String[] args) {
        int[] arr = {110,109,108,107,101,87,999,65,43,8,6,5,3,2,0,1};
        my_print(arr);
        new task1().sort(arr, 0, arr.length - 1);
        my_print(arr);}

    private void sort(int[] arr, int lo, int hi) {
        if (lo < hi) {
            int mid = (lo + hi) / 2;
            sort(arr, lo, mid);  
            sort(arr, mid + 1, hi);
            merge(arr, lo, mid, hi);}}
        
    private void merge(int[] arr, int lo, int mid, int hi) {
        int[] left = new int[(mid - lo) + 2];
        int[] right = new int[hi - mid + 1];
        System.arraycopy(arr, lo, left, 0, left.length - 1);
        System.arraycopy(arr, mid + 1, right, 0, right.length - 1);
        left[left.length - 1] = 1000;
        right[right.length - 1] = 1000;
        int i = 0;
        int j = 0;
        for (; lo <= hi; lo++) {
            if (left[i] <= right[j]) {
                arr[lo] = left[i];
                i++;} 
            else {
                arr[lo] = right[j];
                j++;}}}

    private static void my_print(int[] arr) {
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if (i>0) System.out.print(", "+arr[i]);
            else System.out.print(arr[i]);}
        System.out.println();
    }    
}
