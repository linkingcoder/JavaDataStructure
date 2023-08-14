import java.util.Arrays;

public class E05InsertionSort {
    public static void sort(int a[]){
           insertion(a,1);
    }
    private static void insertion(int a[], int low){
        if (low == a.length){
            return;
        }
        int t=a[low];
        int i=low-1;//已排序区域指针
        while (i>=0&&a[i]>t){
            a[i+1]=a[i];
            i--;
        }
        a[i+1]=t;
        insertion(a,low+1);
    }
    public static void main(String[] args) {
        int[] expected ={3,14,5,6,2};
        sort(expected);
        System.out.println(Arrays.toString(expected));
    }

}

