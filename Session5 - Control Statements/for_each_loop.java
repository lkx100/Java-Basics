public class for_each_loop {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        int sum = 0, alt_sum = 0;
        for (int x : nums) {
            System.out.println("Original x = " + x);
            sum += x;    // x taking value from nums array
            x = x * 10;   // modified x, but nums remains unaffected
            alt_sum += x;
            System.out.println("Modified x = " + x);
        }
        System.out.println("-----------------------------------");
        System.out.println("Original Sum = " + sum);
        System.out.println("Modified Sum = " + alt_sum);
    }    
}
