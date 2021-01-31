package com.daniu101.chapter11.hw3;

import java.util.ArrayList;
import java.util.List;
import java.net.URL;
//多选
public class MultipleChoice extends Field{
    private List<String> mp;//多选
    private URL va;//视频解析

    public List<String> getMp(int a) {
        List<String> list = new ArrayList<>();
        for(int i =0; i<a;i++){
            list.add(mp.get((int)(Math.random()*10)));
        }
        return list;
    }

    public void setMp(List<String> mp) {
        this.mp = mp;
    }

    public URL getVa() {
        return va;
    }

    public void setVa(String va) throws Exception{
        this.va = new URL(va);
    }

    @Override
    public String toString() {
        return "MultipleChoice{" +
                "va=" + va +
                '}';
    }
}
