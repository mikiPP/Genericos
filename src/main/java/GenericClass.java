

public class GenericClass<T> implements Validable<Integer> {

    private T t;

    public T get() { return t; }
    public void set(T t) { this.t = t; }


    @Override
    public boolean test(Integer number) {
        return number % 2 == 1;
    }


    public static <T> void changePositions(Integer position1,Integer position2,T[] list){

        T aux = list[position1];
        list[position1] = list[position2];
        list[position2] = aux;
    }


}


