package com.daniu101.chapter11.hw3;

import java.util.ArrayList;
import java.util.List;

//单选
public class SingleOption extends Field{
    public String getSo(int a) {
        return so.get(a);
    }

    public void setSo(List<String> so) {
        this.so = so;
    }

    private List<String> so;//单选

}
