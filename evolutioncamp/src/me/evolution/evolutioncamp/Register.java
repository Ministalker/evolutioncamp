package me.evolution.evolutioncamp;

import me.evolution.evolutioncamp.Doors.*;
import me.evolution.evolutioncamp.FabricBlöcke.*;
import me.evolution.evolutioncamp.Lantern.*;
import me.evolution.evolutioncamp.SleepingBag.*;
import me.evolution.evolutioncamp.items.*;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.material.Material;


public class Register {
	
	public PlainFabric PlainFabric;
	public AutoFabric AutoFabric;
	public JungleFabric JungleFabric;
	public JungleSleepingBag JungleSleepingBag;
	public OrangeLantern OrangeLantern;
	public CampHammer CampHammer;
	public Hammer Hammer;
	public TundraFabric TundraFabric;
	public DesertFabric DesertFabric;
	public TundraSleepingBag TundraSleepingBag;
	public TundraDoor TundraDoor;
	public DesertDoor DesertDoor;
	public DesertSleepingBag DesertSleepingBag;
	public NetherFabric NetherFabric;
	public GreenFabric GreenFabric;
	public BlackFabric BlackFabric;
	public BrownFabric BrownFabric;
	public PinkFabric PinkFabric;
	public YellowFabric YellowFabric;
	public BlueFabric BlueFabric;
	
	Plugin plugin;
	Material Wool[];
	
	public void init(Plugin plugin) {
		this.plugin = plugin;
		
		//Block Fabrics
		PlainFabric = new PlainFabric(plugin);
		AutoFabric = new AutoFabric(plugin);
		JungleFabric = new JungleFabric(plugin);
		TundraFabric = new TundraFabric(plugin);
		DesertFabric = new DesertFabric(plugin);
		NetherFabric = new NetherFabric(plugin);
		YellowFabric = new YellowFabric(plugin);
		PinkFabric = new PinkFabric(plugin);
		GreenFabric = new GreenFabric(plugin);
		BlueFabric = new BlueFabric(plugin);
		BrownFabric = new BrownFabric(plugin);
		BlackFabric = new BlackFabric(plugin);
		
		//Door Jungle Door
		TundraDoor = new TundraDoor(plugin);
		DesertDoor = new DesertDoor(plugin);
		
		//Block SleepingBags
		JungleSleepingBag = new JungleSleepingBag(plugin);
		TundraSleepingBag = new TundraSleepingBag(plugin);
		DesertSleepingBag = new DesertSleepingBag(plugin);
		
		//Block Laternen
		OrangeLantern = new OrangeLantern(plugin);
		
		//Items
		//Item Hammer
		CampHammer = new CampHammer(plugin);
		Hammer = new Hammer(plugin);
		
		initrecipes();
	}
	public void initrecipes(){
		CampHammerrecipe();
	}
	
	public void CampHammerrecipe(){
		
	}
}
