package methods;

public class InputParameter {
    public String welcome(String name){
        String msg="Welcome to my Java program "+name;

        return msg;
    }

    public static void main(String[] args) {
        InputParameter msg=new  InputParameter();
        String result=msg.welcome("Vishal");
        System.out.println(result);


    }
}
