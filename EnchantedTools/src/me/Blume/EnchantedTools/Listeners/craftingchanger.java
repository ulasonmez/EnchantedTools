package me.Blume.EnchantedTools.Listeners;

import java.util.Random;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import me.Blume.EnchantedTools.Main;

public class craftingchanger implements Listener {

	@SuppressWarnings("unused")
	private Main plugin;
	public craftingchanger(Main plugin) {
		this.plugin=plugin;
	}
	Random rand = new Random();
	int level,level1;
	@EventHandler
	public void craftingClick(InventoryClickEvent event) {
		if(event.getInventory().getType().equals(InventoryType.WORKBENCH)) {
			if(event.getRawSlot()==0) {
				if(event.getCurrentItem().equals(new ItemStack(Material.WOODEN_AXE))) {
					//12345
					level = rand.nextInt(5)+1;
					ItemStack item = event.getCurrentItem();
					ItemMeta meta = item.getItemMeta();
					meta.addEnchant(Enchantment.DIG_SPEED, level, true);
					item.setItemMeta(meta);
				}
				else if(event.getCurrentItem().equals(new ItemStack(Material.STONE_AXE))) {

					level = rand.nextInt(5)+6;
					ItemStack item = event.getCurrentItem();
					ItemMeta meta = item.getItemMeta();
					meta.addEnchant(Enchantment.DIG_SPEED, level, true);
					item.setItemMeta(meta);
				}
				else if(event.getCurrentItem().equals(new ItemStack(Material.GOLDEN_AXE))) {
					level = rand.nextInt(5)+11;
					ItemStack item = event.getCurrentItem();
					ItemMeta meta = item.getItemMeta();
					meta.addEnchant(Enchantment.DIG_SPEED, level, true);
					item.setItemMeta(meta);
				}
				else if(event.getCurrentItem().equals(new ItemStack(Material.GOLDEN_AXE))) {
					level = rand.nextInt(5)+16;
					ItemStack item = event.getCurrentItem();
					ItemMeta meta = item.getItemMeta();
					meta.addEnchant(Enchantment.DIG_SPEED, level, true);
					item.setItemMeta(meta);
				}
				else if(event.getCurrentItem().equals(new ItemStack(Material.IRON_AXE))) {
					level = rand.nextInt(5)+21;
					level1 = rand.nextInt(5)+1;
					ItemStack item = event.getCurrentItem();
					ItemMeta meta = item.getItemMeta();
					meta.addEnchant(Enchantment.DIG_SPEED, level, true);
					meta.addEnchant(Enchantment.DAMAGE_ALL, level1, true);
					item.setItemMeta(meta);
				}
				else if(event.getCurrentItem().equals(new ItemStack(Material.DIAMOND_AXE))) {
					level = rand.nextInt(5)+26;
					level1 = rand.nextInt(5)+6;
					ItemStack item = event.getCurrentItem();
					ItemMeta meta = item.getItemMeta();
					meta.addEnchant(Enchantment.DIG_SPEED, level, true);
					meta.addEnchant(Enchantment.DAMAGE_ALL, level1, true);
					item.setItemMeta(meta);
				}
				else if(event.getCurrentItem().equals(new ItemStack(Material.WOODEN_PICKAXE))) {

					level = rand.nextInt(5)+1;
					ItemStack item = event.getCurrentItem();
					ItemMeta meta = item.getItemMeta();
					meta.addEnchant(Enchantment.DIG_SPEED, level, true);
					item.setItemMeta(meta);
				}
				else if(event.getCurrentItem().equals(new ItemStack(Material.STONE_PICKAXE))) {

					level = rand.nextInt(5)+6;
					ItemStack item = event.getCurrentItem();
					ItemMeta meta = item.getItemMeta();
					meta.addEnchant(Enchantment.DIG_SPEED, level, true);
					item.setItemMeta(meta);
				}
				else if(event.getCurrentItem().equals(new ItemStack(Material.GOLDEN_PICKAXE))) {

					level = rand.nextInt(5)+11;
					ItemStack item = event.getCurrentItem();
					ItemMeta meta = item.getItemMeta();
					meta.addEnchant(Enchantment.DIG_SPEED, level, true);
					
					item.setItemMeta(meta);
				}
				else if(event.getCurrentItem().equals(new ItemStack(Material.IRON_PICKAXE))) {

					level = rand.nextInt(5)+16;
					level1 = rand.nextInt(5)+1;
					ItemStack item = event.getCurrentItem();
					ItemMeta meta = item.getItemMeta();
					meta.addEnchant(Enchantment.DIG_SPEED, level, true);
					meta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, level1, true);
					item.setItemMeta(meta);
				}
				else if(event.getCurrentItem().equals(new ItemStack(Material.DIAMOND_PICKAXE))) {

					level = rand.nextInt(5)+21;
					level1 = rand.nextInt(5)+6;
					ItemStack item = event.getCurrentItem();
					ItemMeta meta = item.getItemMeta();
					meta.addEnchant(Enchantment.DIG_SPEED, level, true);
					meta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, level1, true);
					item.setItemMeta(meta);
				}
				else if(event.getCurrentItem().equals(new ItemStack(Material.WOODEN_SHOVEL))) {

					level = rand.nextInt(5)+1;
					ItemStack item = event.getCurrentItem();
					ItemMeta meta = item.getItemMeta();
					meta.addEnchant(Enchantment.DIG_SPEED, level, true);
					item.setItemMeta(meta);
				}
				else if(event.getCurrentItem().equals(new ItemStack(Material.STONE_SHOVEL))) {

					level = rand.nextInt(5)+6;
					ItemStack item = event.getCurrentItem();
					ItemMeta meta = item.getItemMeta();
					meta.addEnchant(Enchantment.DIG_SPEED, level, true);
					item.setItemMeta(meta);
				}
				else if(event.getCurrentItem().equals(new ItemStack(Material.GOLDEN_SHOVEL))) {

					level = rand.nextInt(5)+11;
					ItemStack item = event.getCurrentItem();
					ItemMeta meta = item.getItemMeta();
					meta.addEnchant(Enchantment.DIG_SPEED, level, true);
					item.setItemMeta(meta);
				}
				else if(event.getCurrentItem().equals(new ItemStack(Material.IRON_SHOVEL))) {

					level = rand.nextInt(5)+16;
					ItemStack item = event.getCurrentItem();
					ItemMeta meta = item.getItemMeta();
					meta.addEnchant(Enchantment.DIG_SPEED, level, true);
					item.setItemMeta(meta);
				}
				else if(event.getCurrentItem().equals(new ItemStack(Material.DIAMOND_SHOVEL))) {

					level = rand.nextInt(5)+21;
					ItemStack item = event.getCurrentItem();
					ItemMeta meta = item.getItemMeta();
					meta.addEnchant(Enchantment.DIG_SPEED, level, true);
					item.setItemMeta(meta);
				}
				else if(event.getCurrentItem().equals(new ItemStack(Material.WOODEN_SWORD))) {

					
					ItemStack item = event.getCurrentItem();
					ItemMeta meta = item.getItemMeta();
					level = rand.nextInt(5)+1;
					meta.addEnchant(Enchantment.DAMAGE_ALL, level, true);
					item.setItemMeta(meta);
				}
				else if(event.getCurrentItem().equals(new ItemStack(Material.STONE_SWORD))) {

					ItemStack item = event.getCurrentItem();
					ItemMeta meta = item.getItemMeta();
					level = rand.nextInt(5)+6;
					meta.addEnchant(Enchantment.DAMAGE_ALL, level, true);
					item.setItemMeta(meta);
				}
				else if(event.getCurrentItem().equals(new ItemStack(Material.GOLDEN_SWORD))) {

					ItemStack item = event.getCurrentItem();
					ItemMeta meta = item.getItemMeta();
					level = rand.nextInt(5)+11;
					meta.addEnchant(Enchantment.DAMAGE_ALL, level, true);
					level1 = rand.nextInt(5)+1;
					meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, level1, true);
					item.setItemMeta(meta);
				}
				else if(event.getCurrentItem().equals(new ItemStack(Material.IRON_SWORD))) {

					ItemStack item = event.getCurrentItem();
					ItemMeta meta = item.getItemMeta();
					level = rand.nextInt(5)+16;
					meta.addEnchant(Enchantment.DAMAGE_ALL, level, true);
					level1 = rand.nextInt(5)+6;
					meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, level1, true);
					level1 = rand.nextInt(5)+1;
					meta.addEnchant(Enchantment.FIRE_ASPECT, level1, true);
					item.setItemMeta(meta);
				}
				else if(event.getCurrentItem().equals(new ItemStack(Material.DIAMOND_SWORD))) {

					ItemStack item = event.getCurrentItem();
					ItemMeta meta = item.getItemMeta();
					level = rand.nextInt(5)+21;
					meta.addEnchant(Enchantment.DAMAGE_ALL, level, true);
					level1 = rand.nextInt(5)+11;
					meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, level1, true);
					level1 = rand.nextInt(5)+6;
					meta.addEnchant(Enchantment.FIRE_ASPECT, level1, true);
					item.setItemMeta(meta);
				}
				else if(event.getCurrentItem().equals(new ItemStack(Material.WOODEN_HOE))) {

					ItemStack item = event.getCurrentItem();
					ItemMeta meta = item.getItemMeta();
					level = rand.nextInt(5)+1;
					meta.addEnchant(Enchantment.DIG_SPEED, level, true);
					item.setItemMeta(meta);
				}
				else if(event.getCurrentItem().equals(new ItemStack(Material.STONE_HOE))) {

					ItemStack item = event.getCurrentItem();
					ItemMeta meta = item.getItemMeta();
					level = rand.nextInt(5)+6;
					meta.addEnchant(Enchantment.DIG_SPEED, level, true);
					item.setItemMeta(meta);
				}
				else if(event.getCurrentItem().equals(new ItemStack(Material.GOLDEN_HOE))) {

					ItemStack item = event.getCurrentItem();
					ItemMeta meta = item.getItemMeta();
					level = rand.nextInt(5)+11;
					meta.addEnchant(Enchantment.DIG_SPEED, level, true);
					level = rand.nextInt(5)+1;
					meta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, level, true);
					item.setItemMeta(meta);
				}
				else if(event.getCurrentItem().equals(new ItemStack(Material.IRON_HOE))) {

					ItemStack item = event.getCurrentItem();
					ItemMeta meta = item.getItemMeta();
					level = rand.nextInt(5)+11;
					meta.addEnchant(Enchantment.DIG_SPEED, level, true);
					level = rand.nextInt(5)+6;
					meta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, level, true);
					item.setItemMeta(meta);
				}
				else if(event.getCurrentItem().equals(new ItemStack(Material.DIAMOND_HOE))) {

					ItemStack item = event.getCurrentItem();
					ItemMeta meta = item.getItemMeta();
					level = rand.nextInt(5)+16;
					meta.addEnchant(Enchantment.DIG_SPEED, level, true);
					level = rand.nextInt(5)+11;
					meta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, level, true);
					item.setItemMeta(meta);
				}
			}
		}
		else if(event.getInventory().getType().equals(InventoryType.SMITHING)) {
			if(event.getRawSlot()==2) {
				if(event.getCurrentItem().equals(new ItemStack(Material.NETHERITE_AXE))) {
					level = rand.nextInt(5)+36;
					level1 = rand.nextInt(5)+16;
					ItemStack item = event.getCurrentItem();
					ItemMeta meta = item.getItemMeta();
					meta.addEnchant(Enchantment.DIG_SPEED, level, true);
					meta.addEnchant(Enchantment.DAMAGE_ALL, level1, true);
					item.setItemMeta(meta);
				}
				else if(event.getCurrentItem().equals(new ItemStack(Material.NETHERITE_PICKAXE))) {
					level = rand.nextInt(5)+36;
					level1 = rand.nextInt(5)+16;
					ItemStack item = event.getCurrentItem();
					ItemMeta meta = item.getItemMeta();
					meta.addEnchant(Enchantment.DIG_SPEED, level, true);
					meta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, level1, true);
					item.setItemMeta(meta);
				}
				else if(event.getCurrentItem().equals(new ItemStack(Material.NETHERITE_SHOVEL))) {
					level = rand.nextInt(5)+36;
					ItemStack item = event.getCurrentItem();
					ItemMeta meta = item.getItemMeta();
					meta.addEnchant(Enchantment.DIG_SPEED, level, true);
					item.setItemMeta(meta);
				}
				else if(event.getCurrentItem().equals(new ItemStack(Material.NETHERITE_SWORD))) {
					ItemStack item = event.getCurrentItem();
					ItemMeta meta = item.getItemMeta();
					level = rand.nextInt(5)+36;
					meta.addEnchant(Enchantment.DAMAGE_ALL, level, true);
					level1 = rand.nextInt(5)+11;
					meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, level1, true);
					level1 = rand.nextInt(5)+6;
					meta.addEnchant(Enchantment.FIRE_ASPECT, level1, true);
					level1 = rand.nextInt(5)+10;
					meta.addEnchant(Enchantment.KNOCKBACK, level1, true);
					item.setItemMeta(meta);
				}
				else if(event.getCurrentItem().equals(new ItemStack(Material.NETHERITE_HOE))) {
					ItemStack item = event.getCurrentItem();
					ItemMeta meta = item.getItemMeta();
					level = rand.nextInt(5)+21;
					meta.addEnchant(Enchantment.DIG_SPEED, level, true);
					level = rand.nextInt(5)+16;
					meta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, level, true);
					item.setItemMeta(meta);
				}
			}
		}
	}
}
