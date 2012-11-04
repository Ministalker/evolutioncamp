package me.evolution.evolutioncamp.Doors;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;

public class JungleDoor extends GenericCubeCustomBlock{

	public JungleDoor(Plugin plugin, GenericCubeBlockDesign design) {
		super(plugin, "", design);
	}
}
