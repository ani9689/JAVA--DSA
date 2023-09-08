
class A{

    void m1(){

        System.out.println("m1-A");

    }

}

class B extends A{

    void m1(){

        System.out.println("m1-B");

    }

}

public class Test{

    public static void main(String args[]){

        //B a  = new B();
        A a =new B();
        a.m1();

    }

}