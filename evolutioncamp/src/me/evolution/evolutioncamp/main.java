package me.evolution.evolutioncamp;

import org.bukkit.plugin.java.JavaPlugin;
import org.getspout.spoutapi.SpoutManager;

public class main extends JavaPlugin{
	
	Register Register = new Register();
	
	public void onEnable(){
		SpoutManager.getFileManager().addToPreLoginCache(this, "http://i.imgur.com/jzqFx.png");
		SpoutManager.getFileManager().addToPreLoginCache(this, "http://i.imgur.com/Chsok.png");
		Register.init(this);
	}
	
	public void onDisable(){
		
	}
}
