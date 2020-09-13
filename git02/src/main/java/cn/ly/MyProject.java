package cn.ly;

public class MyProject {
    public void say(){
        System.out.println("hello");
    }

    public int data(){
        int i =0;
        System.out.println(++i);
        return i;
    }

    public static void main(String[] args) {
        MyProject myProject = new MyProject();
        myProject.say();
        myProject.data();
    }
}
