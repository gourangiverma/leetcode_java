public class LC1545 {
    public char findKthBit(int n, int k) {
        if (n == 1) return '0';
        // number of bits in S_n = 2^n - 1
        int number_of_bits = (1 << n) - 1;
        // middle position = number of bits - 1 / 2;
        int middle = (number_of_bits + 1) >> 1;
        if (k == middle) {
            return '1';
        } else if (k < middle) {
            return findKthBit(n-1, k);
        } else {
            return findKthBit(n-1, 1 + (number_of_bits - k)) == '0' ? '1' : '0';
        }
    }
}
