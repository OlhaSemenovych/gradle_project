package module2;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SumCalculator {

    public int sum(int n) {
        int sum = 0;
        int i;
        if (n != 0) {
            if (n > 0) {
                for (i = 1; i <= n; i++) {
                    sum = sum + i;
                }
            } else {
                for (i = -1; i >= n; i--) {
                    sum = sum + i;
                }
            }
            log.info("Sum of first [{}] numbers is = [{}].", n, sum);
            return sum;
        } else {
            throw new IllegalArgumentException("Number is 0, current solution don't support 0 value");
        }
    }
}
