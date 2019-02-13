package Knowledge.Test;

import java.util.Arrays;
import java.util.List;

public class LmbdaExceptions {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(3, 9, 7, 0, 10, 20);
        integers.forEach(i -> {
            if (i == 0) {
                throw new IllegalArgumentException("Zero not allowed");
            }
            System.out.println(Math.PI / i);
        });

    }
}
