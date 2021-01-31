package com.daniu101.chapter11.hw3;

import java.net.MalformedURLException;
import java.net.URL;

//简答
public class ShortAnswer extends Field {
    private String sa;
    private URL url;
    public String getSa() {
        return sa;
    }
    public void setSa(String sa) {
        this.sa = sa;
    }
    public URL getUrl() {
        return url;
    }

    public void setUrl(String url) throws Exception{

        this.url = new URL(url);
    }

    @Override
    public String toString() {
        return "ShortAnswer{" +
                "sa='" + sa + '\'' +
                ", url=" + url +
                '}';
    }
}
