package com.daniu101.chapter10.hw2;

public class Apple {
    private String Brand;
    private double area;
    private String status;

    public void setArea(double area) {
        if (area < 0.00){
            System.out.println("面积不能为负数");
        }else {
            this.area =area;
        }
    }

    public void setStatus(String status) {
        if(status == "on"){
            this.status =status;
            System.out.println("现在是开机状态");
        }else if(status =="off"){
            this.status=status;
            System.out.println("现在是关机状态");
        }else {
            System.out.println("状态错误");
        }
    }

    public void call(){
        System.out.println("打电话");
    }
    public void goOnline(){
        System.out.println("上网");
    }

    @Override
    public String toString() {
        return "Apple{" +
                "area=" + area +
                ", status='" + status + '\'' +
                '}';
    }
}
