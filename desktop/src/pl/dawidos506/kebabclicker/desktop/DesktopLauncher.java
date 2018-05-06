package pl.dawidos506.kebabclicker.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import pl.dawidos506.kebabclicker.Clicker;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		
		config.width = Clicker.GAME_WIDHT;
		config.height = Clicker.GAME_HEIGHT;
		config.title = Clicker.GAME_NAME;
		
		new LwjglApplication(new Clicker(), config);
	}
}
