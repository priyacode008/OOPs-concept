import java.util.*;
class Calculactor{
    void add(int a, int b){
    System.out.println(" add sum="+(a+b));
    }
    void add(int a,int b, int c){

    System.out.println("sub sum="+(a-b-c));
    
    }
    void add(int a,int b,int c,float avg){
      
    avg=a+b+c/3;

    System.out.println("average="+avg);
    }

    void add (char a, char b, char c, char d, char e){

    String name = "" + a + b + c + d + e;
    System.out.println("Name = " + name);
}

    public static void main(String [] args){
        Calculactor c=new Calculactor();
        
        c.add(5,5);
        c.add(10,10,5);
        c.add(50,50,50);
        c.add('p','r','i','y','a');
    }

    

}