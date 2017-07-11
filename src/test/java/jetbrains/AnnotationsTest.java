package jetbrains;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Created by white on 7/11/17.
 */
public class AnnotationsTest {

    private Annotations annotations = new Annotations();

    @Test
    public void foo() throws Exception {

        Integer[] intArray = new Integer[1];
        Assert.assertNull(intArray[0]);
        List<Integer> list = annotations.foo(intArray);
//        list.forEach(System.out::println);
        Assert.assertTrue(list.isEmpty());
    }

}