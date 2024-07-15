package static2.ex;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class MathArrayUtils {

    private MathArrayUtils() {
        //private 인스턴스 생성 막는다.
    }

    public static int sum(int[] values){
        return Arrays.stream(values).sum();
    }

    public static double average(int[] values){
        OptionalDouble average = Arrays.stream(values).average();
        return average.getAsDouble();
    }

    public static int min(int[] values){
        OptionalInt min = Arrays.stream(values).min();
        return min.getAsInt();
    }

    public static int max(int[] values){
        OptionalInt max = Arrays.stream(values).max();
        return max.getAsInt();
    }

}
