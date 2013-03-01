package com.skyWords.runtime;

import org.andengine.entity.scene.background.Background;
import org.andengine.util.color.Color;

import com.skyWords.manager.BaseScene;
import com.skyWords.manager.SceneManager.SceneType;

public class LoadingScene extends BaseScene{

	@Override
	public void createScene() {
		// TODO Auto-generated method stub
		setBackground(new Background(Color.WHITE)); 
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
