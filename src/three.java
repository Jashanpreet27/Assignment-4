import java.util.*;

public class three {
    static void triple(int a[],int k){
        Arrays.sort(a);
Set<String> A=new HashSet<>();
        int n=a.length;
        for(int i=0;i<a.length;i++){
            int requird=k-a[i];
            int left=i+1;
            int right=n-1;
            while(left<right){
                if(a[left]+a[right]==requird){
                   // System.out.println(Arrays.asList(a[i],a[left],a[right]));
                    A.add(a[i]+","+ a[left]+","+a[right]);
left++;
right--;

         }
                else
                if( a[left]+a[right] < requird){
                    left++;
                }
                else  {
                    right--;
                }
            }

        }
        System.out.println(A);

    }
    public static void main(String[] args) {
        int a[]={50,-50,1,4,5,3,5,3,2,-5,0,5,-5,5,-5};
        triple(a,0);
    }
}
