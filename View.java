import java.util.*;
class Book{
    void setdata(){
        System.out.println("java");
    }
}
    class Detail extends Book{
        void display(){
        System.out.println("james gosling");
        }   
    }
class View{
    public static void main(String[] args){
        Detail d=new Detail();

        d.setdata();
        d.display();
    }
}