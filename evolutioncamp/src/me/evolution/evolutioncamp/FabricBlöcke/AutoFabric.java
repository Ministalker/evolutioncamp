package me.evolution.evolutioncamp.FabricBl�cke;

import org.bukkit.World;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
import org.getspout.spoutapi.player.SpoutPlayer;

public class AutoFabric extends GenericCubeCustomBlock{
    public AutoFabric(Plugin plugin) {
        super(plugin, "Auto Fabric", "http://cdn.spout.org/img/icon/spout_16x16.png", 16);
    }
  
    public void onNeighborBlockChange(World world, int x, int y, int z, int changedId) { }
  
    public void onBlockPlace(World world, int x, int y, int z) { }
  
    public void onBlockPlace(World world, int x, int y, int z, LivingEntity living) { }
  
    public void onBlockDestroyed(World world, int x, int y, int z) { }
  
    public boolean onBlockInteract(World world, int x, int y, int z, SpoutPlayer player) {
        return true;
    }
  
    public void onEntityMoveAt(World world, int x, int y, int z, Entity entity) { }
  
    public void onBlockClicked(World world, int x, int y, int z, SpoutPlayer player) { }
  
    public boolean isProvidingPowerTo(World world, int x, int y, int z, BlockFace face) {
        return false;
    }
  
    public boolean isIndirectlyProvidingPowerTo(World world, int x, int y, int z, BlockFace face) {
        return false;
    }
}