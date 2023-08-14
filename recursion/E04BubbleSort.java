import java.util.Arrays;
public class E04BubbleSort {
    public static void sort(int[] a){
        bubble(a,a.length-1);
    }
    private static void bubble(int[] a,int j){
        if(j==0){
            return;
        }
        int x =0;
        for(int i =0 ; i<j;i++){
            if(a[i]>a[i+1]){
                int t=a[i];
                a[i]=a[i+1];
                a[i+1]=t;
                x=i;
            }
        }
        bubble(a,x);
    }

    public static void main(String[] args) {
        int [] a= {6,5,4,3,2,1};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
}
