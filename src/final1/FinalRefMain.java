package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data(); //참조형
        //data = new Data() //참조값 변경 불가 컴파일 오류

        //참조 대상의 값은 변경 가능
        data.value = 10; // 현재 Data 클래스 안에 value 인스턴스는 final 아니기 때문에
        System.out.println(data.value);
        data.value = 20;
        System.out.println(data.value);
    }
}
