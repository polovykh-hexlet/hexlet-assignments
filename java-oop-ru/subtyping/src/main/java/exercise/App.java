package exercise;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// BEGIN
public class App {
    public static void swapKeyValue(KeyValueStorage kvs) {
        var keys = kvs.toMap().keySet();
        for (var key : keys) {
            kvs.set(kvs.get(key, null), key);
            kvs.unset(key);
        }
    }
}
// END
