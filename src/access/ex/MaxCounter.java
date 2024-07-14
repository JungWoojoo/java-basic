package access.ex;

public class MaxCounter {
    private int count;
    private int max;

    public MaxCounter(int max){
        this.max = max;
    }

    public void increment(){
        if(count < max){
            count += 1;
        } else {
            System.out.println("최대 값으로 더이상 올릴 수 없습니다.");
        }
    }

    public void getCount(){
        System.out.println("카운트 : " + count);
    }
}
