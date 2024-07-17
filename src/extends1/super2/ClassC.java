package extends1.super2;

public class ClassC extends ClassB{
    public ClassC() {
        super(10, 20); //ClassB의 생성자가 기본생성자가 아니기에 super 생략 불가
        System.out.println("ClassC 생성자");
    }
}
