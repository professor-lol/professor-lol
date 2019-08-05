package domain.champion.ability;

import org.jsoup.select.Elements;

import static jsoupUtil.ElementContextUtil.getTextFromElement;

/**
 * <attribute>
 * <attribute></attribute>
 * <attribute-remove></attribute-remove>
 * </attribute>
 */

public class New {   // .attribute-change
    private String attribute;   // 스킬 변경 사항 .attribute
    private String after;       // 변경 후 능력 셋 .attribute-remove

    public New(String attribute, String after) {
        this.attribute = attribute;
        this.after = after;
    }

    private New(Builder builder) {
        this.attribute = builder.attribute;
        this.after = builder.after;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n========unit(new)========");
        sb.append("\nattribute : ").append(attribute);
        sb.append("\n>>>").append(after);
        return sb.toString();
    }

    static class Builder {

        private String attribute;
        private String after;

        Builder() {
        }

        Builder attribute(Elements attribute) {
            this.attribute = getTextFromElement(attribute);
            return this;
        }


        Builder after(Elements after) {
            this.after = getTextFromElement(after);
            return this;
        }


        New build() {
            return new New(this.attribute, this.after);
        }
    }
}
