package Inheritance;

public class Demo {

    public static void main(String[] args){

        AdvC obj = new AdvC();
        int num1=3;
        int num2=4;
        int r1 = obj.add(num1 , num2);
        int r2 = obj.sub(num1 , num2);
        int r3 = obj.multi(num1 , num2);
        int r4 = obj.div(num1 , num2);

        System.out.println(r1 +" " + r2 + " " +r3+ " " +r4+ " ");
    }
}
