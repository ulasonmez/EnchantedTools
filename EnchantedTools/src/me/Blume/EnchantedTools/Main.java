package me.Blume.EnchantedTools;

import org.bukkit.plugin.java.JavaPlugin;

import me.Blume.EnchantedTools.Listeners.craftingchanger;

public class Main extends JavaPlugin{

	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new craftingchanger(this), this);
	}
	@Override
	public void onDisable() {
		
	}

}
