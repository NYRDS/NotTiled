package com.mirwanda.nottiled.desktop;

//import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
//import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;

import com.mirwanda.nottiled.MyGdxGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		/*
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "my-gdx-game";
		cfg.useGL30 = false;
		cfg.width = 1920;
		cfg.height = 1080;
		com.mirwanda.nottiled.nullInterface ni= new com.mirwanda.nottiled.nullInterface();
		new LwjglApplication(new MyGdxGame("",ni), cfg);

		 */
//-XstartOnFirstThread

		/**/
		Lwjgl3ApplicationConfiguration cfg3 = new Lwjgl3ApplicationConfiguration();
		cfg3.setTitle( "NotTiled" );
		cfg3.useOpenGL3( false,1,1 );
		cfg3.setMaximized( true );
		com.mirwanda.nottiled.nullInterface ni3= new com.mirwanda.nottiled.nullInterface();
		new Lwjgl3Application(new MyGdxGame("",ni3), cfg3);
		 /**/
	}
}
