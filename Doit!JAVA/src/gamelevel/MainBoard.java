package gamelevel;

public class MainBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player player = new Player();
		player.play(1);

		AdvancedLevel aLevel = new AdvancedLevel();
		player.upgradelevel(aLevel);
		player.play(2);

		SuperLevel sLevel = new SuperLevel();
		player.upgradelevel(sLevel);
		player.play(3);
	}

}
