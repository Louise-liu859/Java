package test;

class Vehicle{
private String type; //用于存放车类型的变量
private String brand; //用于存放车品牌的变量
private double price; //用于存放车价格的变量
private String comment; //用于存放评论的变量
public Vehicle(String type, String brand, double price) {
this. type = type;
this. brand = brand;
this. price = price;
}
public void setComment(String comment) {
this. comment = comment;
 }
public void printInfo() {
System. out. println("类型： "+type) ;
System. out. println("品牌: " + brand) ;
System. out. println("价格: " + price) ;
System. out. println("评论: " + comment) ;
}
}
