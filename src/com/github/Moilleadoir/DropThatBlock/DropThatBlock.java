/*    */ package com.github.Moilleadoir.DropThatBlock;
/*    */ 
/*    */ import java.util.logging.Logger;
/*    */ import org.bukkit.Server;
/*    */ import org.bukkit.plugin.PluginDescriptionFile;
/*    */ import org.bukkit.plugin.PluginManager;
/*    */ import org.bukkit.plugin.java.JavaPlugin;
/*    */ 
/*    */ public class DropThatBlock extends JavaPlugin
/*    */ {
/*    */   public PluginManager pluginManager;
/* 14 */   public Logger log = Logger.getLogger("Minecraft");
/*    */ 
/*    */   public void onEnable()
/*    */   {
/* 18 */     this.pluginManager = getServer().getPluginManager();
/*    */ 
/* 21 */     this.pluginManager.registerEvents(new EnderWatch(), this);
/*    */ 
/* 24 */     this.log.info("[EnderEnd] - Version " + getDescription().getVersion() + " Started.");
/*    */   }
/*    */ 
/*    */   public void onDisable()
/*    */   {
/* 29 */     this.log.info("[EnderEnd] - Version " + getDescription().getVersion() + " Stopped.");
/*    */   }
/*    */ }
