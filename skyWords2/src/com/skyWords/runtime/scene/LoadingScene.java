package com.skyWords.runtime.scene;

import org.andengine.entity.scene.background.Background;
import org.andengine.entity.text.Text;
import org.andengine.util.color.Color;

import com.skyWords.manager.BaseScene;
import com.skyWords.manager.SceneManager.SceneType;

public class LoadingScene extends BaseScene{

	@Override
	public void createScene() {
		setBackground(new Background(Color.WHITE));
	    attachChild(new Text(400, 240, resourcesManager.font, "Loading...", vbom));
	}

	@Override
	public void onBackKeyPressed() {
		// TODO Auto-generated method stub
		  return;
	}

	@Override
	public SceneType getSceneType() {
		// TODO Auto-generated method stub
		return SceneType.SCENE_LOADING;
	}

	@Override
	public void disposeScene() {
		// TODO Auto-generated method stub
		
	}

}
