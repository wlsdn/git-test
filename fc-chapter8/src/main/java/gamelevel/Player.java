package gamelevel;

public class Player {

    /* Player는 플레이어의 하나의 레벨을 가지고 있다.
     * 근데 플레이어 레벨이 Beginner일 수 있고, Advanced일 수 있고, Super일 수도 있다.
    BeginnerLevel bLevel;
    AdvancedLevel aLevel;
    SuperLevel sLevel;
     이건 객체 지향 프로그램이 아니다. 그래서 이렇게 짜는건 안 된다.
     */

    private PlayerLevel level; // 이렇게 선언해야 한다. level안으로 상속받은 모든 애들이 들어 올 수 있다.

    public Player() {
        level = new BeginnerLevel();
        level.showLevelMessage();
    }

    public void upgradeLevel(PlayerLevel level) { //초급,중급,고급으로 업그레이드가 될 수 있으니
        // PlayerLevel타입으로 선언한다.
        this.level = level;
        level.showLevelMessage();
    }

    public void play(int count) {
        level.go(count);
    }

    public PlayerLevel getLevel() {
        return level;
    }

    public void setLevel(PlayerLevel level) {
        this.level = level;
    }

}
