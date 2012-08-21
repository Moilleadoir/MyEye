
package com.github.Moilleadoir.MyEye;
 
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockDamageEvent;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.*;
import org.bukkit.inventory.*;
import java.util.logging.Logger;

public class BlockWatch implements Listener {
	
	public Logger log = Logger.getLogger("Minecraft");
	
	@EventHandler(priority=EventPriority.LOWEST)
	public void onBlockDamageEvent(BlockDamageEvent event) {
		Block block = event.getBlock();
		Material blocktype = block.getType();
		byte data = block.getData();
		ItemStack tool = event.getItemInHand();
		Material tooltype = event.getItemInHand().getType();
		Player player = event.getPlayer();
		Location loc = player.getLocation();
		// data values with eye: 4,5,6,7,12,13,14,15
		if (blocktype == Material.ENDER_PORTAL_FRAME && ((data > 3 && data < 8) || (data > 11 && data < 16))) {
			if (tool.containsEnchantment(Enchantment.SILK_TOUCH) || tooltype == Material.IRON_SWORD || tooltype == Material.GOLD_SWORD || tooltype == Material.DIAMOND_SWORD) {
				block.setData((byte)(data - 4));
				loc.getWorld().dropItem(loc, new ItemStack(Material.EYE_OF_ENDER));
			}
			else {
				player.sendMessage("Maybe you could lever it out with a sword?");
			}
		}
	}
	
}
