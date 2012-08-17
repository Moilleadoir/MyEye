/*    */ package com.github.Moilleadoir.DropThatBlock;
/*    */ 
/*    */ import org.bukkit.entity.Enderman;
/*    */ import org.bukkit.event.EventHandler;
/*    */ import org.bukkit.event.EventPriority;
/*    */ import org.bukkit.event.Listener;
/*    */ import org.bukkit.event.entity.EntityChangeBlockEvent;
/*    */ 
/*    */ public class EnderWatch
/*    */   implements Listener
/*    */ {
/*    */   @EventHandler(priority=EventPriority.LOWEST)
/*    */   public void onEntityChangeBlock(EntityChangeBlockEvent event)
/*    */   {
/* 14 */     if ((event.getEntity() instanceof Enderman))
/*    */     {
/* 16 */       event.setCancelled(true);
/*    */     }
/*    */   }
/*    */ }
