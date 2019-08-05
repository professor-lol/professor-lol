package domain.champion.ability;

import org.jsoup.nodes.Element;

import static domain.champion.ability.AttributeFactory.AttributeSelector.*;

class AttributeMapper {

    static Change ofChange(Element element) {
        return new Change.Builder()
                .attribute(element.select(ATTRIBUTE.getCssQuery()))
                .before(element.select(BEFORE.getCssQuery()))
                .after(element.select(AFTER.getCssQuery()))
                .build();
    }

    static Remove ofRemove(Element element) {
        return new Remove.Builder()
                .attribute(element.select(ATTRIBUTE.getCssQuery()))
                .remove(element.select(REMOVE.getCssQuery()))
                .build();
    }

    static New ofNew(Element element) {
        return new New.Builder()
                .attribute(element.select(ATTRIBUTE.getCssQuery()))
                .after(element.select(AFTER.getCssQuery()))
                .build();
    }

}
