package walnoot.ld28.screens;

import walnoot.ld28.LD28Game;
import walnoot.ld28.Util;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;

public class LoadingScreen extends UpdateScreen{
	private static final String BACKGROUND = "background.png";
	private static final String ATLAS = "pack.atlas";
	
	private AssetManager assetManager;
	
	public LoadingScreen(LD28Game game){
		super(game);
		
		assetManager = new AssetManager();
		assetManager.load(ATLAS, TextureAtlas.class);
		assetManager.load(BACKGROUND, Texture.class);
	}
	
	@Override
	protected void render(){
	}
	
	@Override
	public void update(){
		if(assetManager.update()){
			Util.ATLAS = assetManager.get(ATLAS);
			Util.BACKGROUND = assetManager.get(BACKGROUND);
			
			FreeTypeFontGenerator generator = new FreeTypeFontGenerator(Gdx.files.internal("Calligraffiti.ttf"));
			Util.FONT = generator.generateFont(32);
			
//			game.setScreen(new GameScreen(game));
			game.setScreen(new IntroScreen(game));
		}
	}
}
