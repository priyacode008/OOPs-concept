import java.util.*;
class Atm{
    private int currentamt;
        int withdraw;
        int balanceamt;
        void setdata(int c){
            currentamt=c;
        }
        void display(){
            balanceamt=1500-500;
            System.out.println("balanceamt="+balanceamt);
        }
    public static void main(String[] args){
        Atm a=new Atm();

        a.setdata(1500);
        a.display();
    }
}
