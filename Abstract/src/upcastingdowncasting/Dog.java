package upcastingdowncasting;

public class Dog extends Animal implements IDog{
    @Override
    public void method1() {
        System.out.println("dog1");

    }
    @Override
    public void method2() {
        System.out.println("dog2");
    }
    public void method3() {
        System.out.println("dog3");
    }

    @Override
    public void method11() {

    }
}
