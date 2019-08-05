package domain.champion;


import domain.champion.ability.Change;
import domain.champion.ability.New;
import domain.champion.ability.Remove;
import org.jsoup.select.Elements;

import java.util.List;

import static domain.champion.ability.AttributeFactory.*;
import static jsoupUtil.ElementContextUtil.getTextFromElement;
import static jsoupUtil.ElementContextUtil.getUrlFromElement;

public class Ability {  //스킬 .change-detail-title .ability-title

    //기본 능력치는 .change-detail-title

    private String title;           // 스킬 명 .attribute-detail-title .ability-title
    private String image;           // 스킬 이미지   img src
    private List<New> news;
    private List<Change> changes;
    private List<Remove> removes;

    private Ability(String title, String image, List<New> news, List<Change> changes, List<Remove> removes) {
        this.title = title;
        this.image = image;
        this.news = news;
        this.changes = changes;
        this.removes = removes;
    }

    private Ability(Builder builder) {
        this.title = builder.title;
        this.image = builder.image;
        this.news = builder.news;
        this.changes = builder.changes;
        this.removes = builder.removes;
    }

    public String toString() {
        return "\n========ability========" +
                "\ntitle : " + title +
                "\nimage : " + image +
                "\nremoves : " + removes.toString() +
                "\nnews : " + news.toString() +
                "\nchange : " + changes.toString();
    }

    static class Builder {

        private String title;
        private String image;
        private List<New> news;
        private List<Change> changes;
        private List<Remove> removes;

        Builder() {
        }

        Builder title(Elements title) {
            this.title = getTextFromElement(title);
            return this;
        }

        Builder image(Elements image) {
            this.image = getUrlFromElement(image);
            return this;
        }

        Builder news(Elements news) {
            this.news = ofNews(news);
            return this;
        }

        Builder changes(Elements changes) {
            this.changes = ofChanges(changes);
            return this;
        }

        Builder removes(Elements removes) {
            this.removes = ofRemoves(removes);
            return this;
        }

        Ability build() {
            return new Ability(this.title, this.image, this.news, this.changes, this.removes);
        }
    }
}
