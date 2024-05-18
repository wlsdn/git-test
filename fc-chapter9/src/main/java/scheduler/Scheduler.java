package scheduler;

public interface Scheduler {

    public void getNextCall(); // 다음 콜을 가져와라
    public void sendCallToAgent();

}
