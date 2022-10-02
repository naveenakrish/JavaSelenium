package Assignment1;

public class calculator {
    public static void main(String[] args) {

        calculator calc=new calculator();
        calc.addnumber(30,50);
        calc.subtraction(50,30);
        calc.multiplication(20,30);
        calc.division(80,50);
    }

    public void division(int i, int i1) {
        int div=i/i1;
        System.out.println("division="+div);
    }

    public void multiplication(int i, int i1) {
        int mul=i*i1;
        System.out.println("multiplication="+mul);
    }

    public void subtraction(int i, int i1) {
        int sub=i-i1;
        System.out.println("subtraction="+sub);
    }

    public void addnumber(int i, int i1) {
        int sum=i+i1;
        System.out.println("addition="+sum);
    }
}
