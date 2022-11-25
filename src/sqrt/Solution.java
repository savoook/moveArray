package sqrt;

//6 36
class Solution {
    public int mySqrt(int x) {
        if (x <= 1) return x;
        int lo = 0;
        int hi = x / 2;
        while (lo < hi) {
            int mid = lo + (hi - lo + 1) / 2;
            int t = x / mid;
            if (mid == t) {
                return mid;
            } else if (mid > t) {
                hi = mid - 1;
            } else {
                lo = mid;
            }
        }
        return hi;
    }
}
