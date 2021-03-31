package chap11.sec03.exam05_object_finalize;

public class Counter {

    private int no;

    public Counter(int no) {
        this.no = no;
    }

    @Override
    protected void finalize() throws Throwable{
        System.out.println(no + "번 객체의 finalize()가 실행 됨");
    }
}
