import java.util.*;
class Car{
    String brand;
    int price;
    String model;
    int finalprice;

    public void setdata(){
       brand="BMW";
       model="X5";
       price=50000000;
    }
    public void display()
    {
         System.out.println("brand:"+brand);
        System.out.println("model:"+model);
        System.out.println("price:"+price);
    }
    public void discount()
    {
     finalprice=price-(price*10/100);
     System.out.println("finalprice="+finalprice);
    }
    public static void main(String[] args){
        Car c1=new Car();
       c1.setdata();
       c1.display();
       c1.discount();
    }
}