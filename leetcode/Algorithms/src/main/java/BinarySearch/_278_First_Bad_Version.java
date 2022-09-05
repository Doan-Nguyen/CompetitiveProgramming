/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

package BinarySearch;


public class _278_First_Bad_Version {
    public static boolean isBadVersion(int n){
        if (n < 4){
            return false;
        } else {
            return true;
        }
    }

    public static int firstBadVersion(int n) {
        int l = 1;
        //
        while (l <= n){
            if (l == n){
                return l;
            } else {
                int m = l + (n - l)/2;
                if (! isBadVersion(m)){
                    l = m + 1;
                } else {
                    n = m;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args){

        System.out.println(firstBadVersion(6));
    }
}
