import java.util.*;
class Product{
        int id;
        String product;
        int rate;
     Product( int i,String p, int r){
        id=i;
        product=p;
        rate=r;
            
     }
     void display(){
        System.out.println("id:"+id);
        System.out.println("product:"+product);
        System.out.println("rate:"+rate);

     }
    }

    class Price{
        public static void main(String[] args){
            Product p=new Product(101,"laptop",450000);
            p.display();
        }
    }
