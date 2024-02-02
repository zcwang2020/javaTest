package meta.test;

import java.util.function.Supplier;

/**
 * @Author: tmind
 * @Date: 2024/2/1 15:54
 * @Description:
 */
public class ArrayAlg {

    //计算泛型数组的最大值和最小值
    public static <T extends Comparable> MyPair<T> minmax(T[] a) {
        if (a == null || a.length == 0) {
            return null;
        }
        T min = a[0];
        T max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (min.compareTo(a[i]) > 0) {
                min = a[i];
            }
            if (max.compareTo(a[i]) < 0) {
                max = a[i];
            }
        }
        return new MyPair<>(min, max);
    }

    public static <T> MyPair<T> makePair(Supplier<T> constr) {
        return new MyPair<>(constr.get(), constr.get());
    }

    //判断pair中的两个元素是否为null
    public static boolean hasNulls(MyPair<?> p) {
        return p.getFirst() == null || p.getSecond() == null;
    }

    public static void main(String[] args) {
        String[] a = {"Mary", "had", "a", "little", "lamb"};
        MyPair<String> result = ArrayAlg.minmax(a);
        boolean b = hasNulls(result);
        System.out.println(b);
    }

    public static class MyPair<T> {
        private T first;
        private T second;

        public MyPair(T first, T second) {
            this.first = first;
            this.second = second;
        }

        public T getFirst() {
            return first;
        }

        public T getSecond() {
            return second;
        }

        public void setFirst(T first) {
            this.first = first;
        }

        public void setSecond(T second) {
            this.second = second;
        }
    }

}
