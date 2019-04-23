import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class GenericClassTest {

    @Test
    public void comprobarConstructor() {

        //____________________________Integer________________________________________//

        GenericClass<Integer> integerGenericClass = new GenericClass<>();
        integerGenericClass.set(2);
        assertTrue(integerGenericClass.get() instanceof Integer);

        //____________________________String________________________________________//

        GenericClass<String> stringGenericClass = new GenericClass<>();
        stringGenericClass.set("Soy un String");
        assertTrue(stringGenericClass.get() instanceof String);

    }


    @Test
    public void countOddsTest() {

        List<Integer> lista = Arrays.asList(1, 2, 3);
        assertEquals(2, Algorithm.countIf(lista, new GenericClass<Integer>()));

        List<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 40; i++) {
            linkedList.add(i);
        }

        assertEquals(20, Algorithm.countIf(linkedList, new GenericClass<Integer>()));

    }


    @Test
    public void ChangePositionsTest(){


        Integer[] lista = {1,2,3};
        Integer[] expected = {3,2,1};
        GenericClass.changePositions(0,2,lista);
        for(int i =0;i<lista.length;i++){
            assertTrue(lista[i] == expected[i]);
        }
    }


}

