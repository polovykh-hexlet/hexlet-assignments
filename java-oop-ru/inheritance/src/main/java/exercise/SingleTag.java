package exercise;

import java.util.Map;

// BEGIN
public class SingleTag extends Tag {
    SingleTag(String tagName, Map<String, String> attribs) {
        super(tagName, attribs);
    }

    public String toString() {
        return String.format("<%s%s>", super.getTagName(), super.toString());
    }
}
// END
