package array;


import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class DemoArray {


    public void number(){
        int a=52;
        int b=2;
        int divide = a/b;
        System.out.println("This is divisible by "+divide);
    }

    public static void main(String[] args) {
        DemoArray obj=new DemoArray();
        obj.number();
    }
}

