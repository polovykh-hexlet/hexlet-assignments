package exercise;

import java.util.Map;
import java.util.HashMap;

// BEGIN
public class InMemoryKV implements KeyValueStorage {
    private Map<String, String> kv;

    InMemoryKV(Map<String, String> map) {
        kv = new HashMap<String, String>(map);
    }

    public void set(String key, String value) {
        kv.put(key, value);
    }

    public void unset(String key) {
        kv.remove(key);
    }

    public String get(String key, String defaultValue) {
        return kv.getOrDefault(key, defaultValue);
    }

    public Map<String, String> toMap() {
        Map<String, String> ret = new HashMap<>(kv);
        return ret;
    }

}

// END
