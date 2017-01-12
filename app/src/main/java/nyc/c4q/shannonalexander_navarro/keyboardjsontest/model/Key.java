package nyc.c4q.shannonalexander_navarro.keyboardjsontest.model;


import java.io.Serializable;

/**
 * Created by shannonalexander-navarro on 1/11/17.
 */

public class Key implements Serializable {

    private String name;
    private String textColor;
    private String url;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTextColor() {
        return textColor;
    }

    public void setTextColor(String textColor) {
        this.textColor = textColor;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
