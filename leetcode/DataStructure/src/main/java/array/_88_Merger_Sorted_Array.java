package array;

public class _88_Merger_Sorted_Array {
    //          Two pointers technical
    /*
        + Note: phan tu tu mang nums2 vao cuoi cua nums1 => i & j là vị trí cuối của mảng
        + currIdx: phuc vu cho 1 mang moi & cũng là vị trí cuối của mảng
        + Object function: a[k] = max(nums1[i], nums2[j])
    */
    public static int[] merge(int[] nums1, int m, int[] nums2, int n){
        int k = m + n - 1;
        int i = m - 1;      // nums1
        int j = n - 1;      // nums2
        while(k >= 0){
            if (i < 0){
                nums1[k] = nums2[j];
                j--;
            }else if(j < 0){
                nums1[k] = nums1[i];
                i--;
            }
            else if(nums2[j] > nums1[i]){
                nums1[k] = nums2[j];
                j--;
            }else{
                nums1[k] = nums1[i];
                i--;
            }
            k--;
        }
        return nums1;
    }

    public static void main(String[] args){
        int[] nums1 = {1, 2 , 3, 0, 0, 0};
        int[] nums2 = {2,5,6};
        int[] result = merge(nums1, 3, nums2, 3);
        System.out.println(result);
    }
}
