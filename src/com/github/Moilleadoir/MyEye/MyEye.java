package com.github.Moilleadoir.MyEye;

import java.util.logging.Logger;
//import org.bukkit.Server;
//import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class MyEye extends JavaPlugin {

	public PluginManager pluginManager;
	public Logger log = Logger.getLogger("Minecraft");

	public void onEnable() {
		this.pluginManager = getServer().getPluginManager();
		this.pluginManager.registerEvents(new BlockWatch(), this);
		this.log.info("[" + getDescription().getName() + "] " + getDescription().getVersion() + " starting.");
	}

	public void onDisable() {
		this.log.info("[" + getDescription().getName() + "] " + getDescription().getVersion() + " stopping.");
	}
	
}
