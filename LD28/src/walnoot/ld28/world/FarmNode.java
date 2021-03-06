package walnoot.ld28.world;

import walnoot.ld28.screens.GameScreen;
import walnoot.ld28.world.Resource.ResourceType;

import com.badlogic.gdx.math.Vector2;

public class FarmNode extends ResourceNode{
	public FarmNode(Vector2 pos, GameScreen screen){
		super(pos, screen, NodeType.FARM.getRegion());
	}
	
	@Override
	protected ResourceType getType(){
		return ResourceType.GRAIN;
	}
}
