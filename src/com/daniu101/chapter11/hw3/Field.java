package com.daniu101.chapter11.hw3;

import java.util.Date;

//基础所共有的字段
public class Field {
    private long id;
    private int number;//题号
    //所属阶段
    enum stage{
        Java基础,OOP,Spring,项目,专题,冲刺;
    }
    private String questionStem;//题干
    private String descriptiveQuestions;//题的描述
    private String textAnalysis;//文字解析
    public Field(long id,int number,Enum stage,String questionStem,String descriptiveQuestions,String textAnalysis){
        this.id = id;
        this.questionStem =questionStem;
        this.descriptiveQuestions = descriptiveQuestions;
        this.textAnalysis = textAnalysis;
    }
    public Field(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getQuestionStem() {
        return questionStem;
    }

    public void setQuestionStem(String questionStem) {
        this.questionStem = questionStem;
    }

    public String getDescriptiveQuestions() {
        return descriptiveQuestions;
    }

    public void setDescriptiveQuestions(String descriptiveQuestions) {
        this.descriptiveQuestions = descriptiveQuestions;
    }

    public String getTextAnalysis() {
        return textAnalysis;
    }

    public void setTextAnalysis(String textAnalysis) {
        this.textAnalysis = textAnalysis;
    }

    @Override
    public String toString() {
        return "Field{" +
                "id=" + id +
                ", number=" + number +
                ", questionStem='" + questionStem + '\'' +
                ", descriptiveQuestions='" + descriptiveQuestions + '\'' +
                ", textAnalysis='" + textAnalysis + '\'' +
                '}';
    }
}
