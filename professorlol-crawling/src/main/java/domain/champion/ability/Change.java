package domain.champion.ability;

import org.jsoup.select.Elements;

import static jsoupUtil.ElementContextUtil.getTextFromElement;

/**
 * <attribute>
 * <attribute></attribute>
 * <attribute-before></attribute-before>
 * <attribute-remove></attribute-remove>
 * </attribute>
 */

public class Change {
    private String attribute;
    private String before;
    private String after;

    private Change(String attribute, String before, String after) {
        this.attribute = attribute;
        this.before = before;
        this.after = after;
    }

    private Change(Builder builder) {
        this.attribute = builder.attribute;
        this.before = builder.before;
        this.after = builder.after;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n========unit(change)========");
        sb.append("\nattribute : ").append(attribute);
        sb.append("\n").append(before).append("->").append(after);
        return sb.toString();
    }

    static class Builder {

        private String attribute;
        private String before;
        private String after;

        Builder() {
        }

        Builder attribute(Elements attribute) {
            this.attribute = getTextFromElement(attribute);
            return this;
        }

        Builder before(Elements before) {
            this.before = getTextFromElement(before);
            return this;
        }

        Builder after(Elements after) {
            this.after = getTextFromElement(after);
            return this;
        }


        Change build() {
            return new Change(this.attribute, this.before, this.after);
        }
    }
}
