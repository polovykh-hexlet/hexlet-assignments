package exercise;

// BEGIN
public class LabelTag implements TagInterface {
    private String text;
    private TagInterface inside;

    LabelTag(String text, TagInterface inside) {
        this.text = text;
        this.inside = inside;
    }

    public String render() {
        return "<label>" + text + inside.render() + "</label>";
    }
}
// END
