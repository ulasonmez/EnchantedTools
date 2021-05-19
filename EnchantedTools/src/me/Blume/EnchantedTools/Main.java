package me.Blume.EnchantedTools;

import org.bukkit.plugin.java.JavaPlugin;

import me.Blume.EnchantedTools.Listeners.Bow;
import me.Blume.EnchantedTools.Listeners.craftingarmor;
import me.Blume.EnchantedTools.Listeners.craftingchanger;

public class Main extends JavaPlugin{

	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new craftingchanger(this), this);
		getServer().getPluginManager().registerEvents(new craftingarmor(this), this);
		getServer().getPluginManager().registerEvents(new Bow(this), this);
	}
	@Override
	public void onDisable() {
		
	}

}
