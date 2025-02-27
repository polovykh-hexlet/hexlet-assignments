package exercise;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

// BEGIN
public class Validator {
    public static List<String> validate(Object obj) {
        List<String> ret = new ArrayList<>();
        var fields = obj.getClass().getDeclaredFields();
        for (var field : fields) {
            field.setAccessible(true);
            if (field.isAnnotationPresent(NotNull.class)) {
                try {
                    if (field.get(obj) == null) {
                        ret.add(field.getName());
                    }
                } catch (NullPointerException ex) {
                    ret.add("Null ex!");
                } catch (IllegalAccessException | IllegalAccessError ex) {
                    ret.add("Illegal ex!");
                }
            }
        }
        return ret;
    }
}
// END
