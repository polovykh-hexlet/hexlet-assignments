package exercise;

import java.util.stream.Collectors;
import java.text.Format;
import java.util.HashMap;
import java.util.Map;

// BEGIN
public class Tag {
    private Map<String, String> tag;
    private String tagName;

    Tag(String tagName, Map<String, String> attribs) {
        // tag = new HashMap<>(attribs);
        tag = attribs;
        this.tagName = tagName;
    }

    public String toString() {
        // var keys = tag.keySet().stream().sorted().toList();
        var entries = tag.entrySet();
        String str = "";
        for (var entry : entries) {
            str = String.format("%s %s=\"%s\"", str, entry.getKey(), entry.getValue());
        }
        return str;
    }

    public String getTagName() {
        return tagName;
    }
}
// END
