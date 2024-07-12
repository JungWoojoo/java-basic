package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    public MemberConstruct() {
    }

    MemberConstruct(String name, int age) {
        this(name, age, 50); //this 인스턴스 내에서 자기 자신의 생성자를 참조할 수 있음 => 밑에 생성자 사용
                                   //여기서 this 사용은 반드시 첫 번째 줄에서 사용해야 함 안그럼 컴파일 오류
    }

    MemberConstruct(String name, int age, int grade){
        System.out.println("생성자 호출 name = " + name + ", age = " + age + ", grade = " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
