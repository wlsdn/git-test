package gamelevel;

public class MainBoardTest {
    public static void main(String[] args) {

        Player player = new Player();
        player.play(1);

        PlayerLevel aLevel = new AdvancedLevel();
        player.upgradeLevel(aLevel);
        player.play(2);

        SuperLevel sLevel = new SuperLevel();
        player.upgradeLevel(sLevel);
        player.play(3);

    }
}
