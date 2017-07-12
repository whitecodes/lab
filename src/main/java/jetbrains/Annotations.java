package jetbrains;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * this class show the wrong warn when using @NotNull
 * 用于说明使用注释库时的异常警告
 * <p>
 * Created by white on 7/11/17.
 */
public class Annotations {

    @NotNull
    public List<Integer> foo(@NotNull Integer[] integers) {
        List<Integer> list = new LinkedList<>();
        Arrays.asList(integers).forEach(e -> {
            if (null != e) { // why here has a warning about condition is always true ?
                list.add(addOne(e));
            } else {
                System.out.println("it is nulllllllll");
            }
        });
        return list;
    }


    @NotNull
    @Contract(pure = true)
    private Integer addOne(@NotNull Integer e) {
        return e + 1;
    }
}
