package Swap;

/**
 * Keep this.  Just make it so the tests pass.
 */
public class Swap {
    public static <T> T[] swap(int i, int j, T... values) {
        T temp = values[i]; // temp <- values[0]{1.5}
        values[i] = values[j]; // values[0]{1.5} <- values[1]{2.3}
        values[j] = temp; // values[1]{1.5} <- temp
        return values;
    }
}
