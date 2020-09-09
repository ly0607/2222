package cn.ly;

public class Hello {
    public String say(){
        System.out.println("hello");
        System.out.println("hi");
        return "hello";
    }

    public static void main(String[] args) {
        Hello hello = new Hello();
        hello.say();
    }
}
