package exercise;

import java.util.Map;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class PairedTag extends Tag {
    private String text;
    private List<Tag> tags;

    PairedTag(String tagName, Map<String, String> attribs, String text, List<Tag> tags) {
        super(tagName, attribs);
        this.tags = new ArrayList<>(tags);
        this.text = text;
    }

    public String toString() {
        String str = String.format("<%s%s>%s", super.getTagName(), super.toString(), text);
        for (var tag : tags) {
            str = String.format("%s%s", str, tag.toString());
        }
        return String.format("%s</%s>", str, super.getTagName());
    }
}

// END
