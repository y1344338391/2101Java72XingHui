package com.daniu101.chapter11.hw3;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Test {
    public static void main(String[] args) throws Exception{
        Field f = new Field(new Date().getTime(),1, Field.stage.Java基础,"这是题干","这是题的描述","这是文字解析");
        System.out.println(f.toString());

        //填空
        FillBlank fb = new FillBlank();
        fb.setFb("填空");
        System.out.println(fb.getFb());

        //编程
        Program p = new Program();
        p.setP("这是编程");
        System.out.println(p.getP());

        //简答
        ShortAnswer sa = new ShortAnswer();
        sa.setSa("这是简答");
        //把视频地址存入类属性中
        sa.setUrl("http://www.runoob.com/index.html?language=cn#j2se");//这是视频解析
        System.out.println(sa.getSa());
        System.out.println(sa.getUrl().toString());

        //单选
        SingleOption so = new SingleOption();
        List<String> list = new ArrayList<>();
        //把选项放入集合
        String[] letter ={"a","b","c","d","e","f"};
        for(int i = 0; i<letter.length;i++){
            list.add(letter[i]);
        }
        so.setSo(list);
        //产生0到数组长度之间的伪随机数
        System.out.println(so.getSo((int)(Math.random()*(letter.length))));

        //多选
        MultipleChoice mc = new MultipleChoice();
        //地址存入类属性中
        mc.setVa("http://www.runoob.com/index.html?language=cn#j2se");
        List<String> list2 = new ArrayList<>();
        //把选项存入集合
        String[] letter2 ={"a","b","c","d","e","f","g","h","i","j"};
        for(int i = 0; i<letter2.length;i++){
            list2.add(letter2[i]);
        }
        mc.setMp(list2);
        //根据输入的数字个数，获取选项的个数
        List<String> list3 = mc.getMp((int)(Math.random()*5+3));
        System.out.print("抽中的字母为：");
        for(String a: list3){
            System.out.print(a);
        }
        System.out.println();
        System.out.println(mc.getVa().toString());
    }
}
