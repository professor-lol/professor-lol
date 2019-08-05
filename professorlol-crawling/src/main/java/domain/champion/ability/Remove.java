package domain.champion.ability;

import org.jsoup.select.Elements;

import static jsoupUtil.ElementContextUtil.getTextFromElement;

/**
 * <attribute>
 * <attribute></attribute>
 * <attribute-remove></attribute-remove>
 * </attribute>
 */

public class Remove {   // .attribute-change
    private String attribute;   // 스킬 변경 사항 .attribute
    private String remove;       // 변경 후 능력 셋 .attribute-remove

    private Remove(String attribute, String remove) {
        this.attribute = attribute;
        this.remove = remove;
    }

    private Remove(Builder builder) {
        this.attribute = builder.attribute;
        this.remove = builder.remove;
    }

    public String toString() {
        return "\n========unit(remove)========" +
                "\nattribute : " + attribute +
                "\n>>>" + remove;
    }

    static class Builder {

        private String attribute;
        private String remove;

        Builder() {
        }

        Builder attribute(Elements attribute) {
            this.attribute = getTextFromElement(attribute);
            return this;
        }


        Builder remove(Elements remove) {
            this.remove = getTextFromElement(remove);
            return this;
        }


        Remove build() {
            return new Remove(this.attribute, this.remove);
        }
    }
}
