package poly.ex3;

public abstract class AbstractAnimal {
    // 자식이 오버라이딩을 무조건 해야하는 목적
    public abstract void sound();

    // 자식이 상속받는 목적
    public void move(){
        System.out.println("동물이 움직입니다.");
    }
}