package cn.ly;

public class Hello {
    public void say(){
        System.out.println("hello");
        System.out.println("hi");
        System.out.println("123");
        System.out.println("47777");

    }

    public static void main(String[] args) {
        Hello hello = new Hello();
        hello.say();
    }

    public int test(){
        int i = 0;
        return  i++;
    }
}
