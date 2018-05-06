package pl.dawidos506.kebabclicker;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;

public class Clicker extends ApplicationAdapter {
	
	
	public static final int GAME_WIDHT = 800;
	public static final int GAME_HEIGHT = 480;
	public static final String GAME_NAME = "KEBAB CLICKER v0.1";
	
	
	@Override
	public void create () {
		
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
	}
	
	
}
