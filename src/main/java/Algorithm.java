import java.util.Collection;

public final class Algorithm {

    public static <T> int countIf(Collection<T> c, Validable<T> validable) {

        int count = 0;

        for (T element : c)

            if (validable.test(element))
                ++count;

            else {
                //nothing wil happend
            }

        return count;
    }
}