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

public class craftingarmor implements Listener{

	@SuppressWarnings("unused")
	private Main plugin;
	public craftingarmor(Main plugin) {
		this.plugin=plugin;
	}
	int level;
	Random rand = new Random();
	@EventHandler
	public void armor(InventoryClickEvent event) {
		if(event.getInventory().getType().equals(InventoryType.WORKBENCH)) {
			if(event.getRawSlot()==0) {
				if(event.getCurrentItem().equals(new ItemStack(Material.LEATHER_HELMET))) {
					ItemStack item = event.getCurrentItem();
					ItemMeta meta = item.getItemMeta();
					level = rand.nextInt(5)+1;
					meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, level, true);
					item.setItemMeta(meta);
				}
				else if(event.getCurrentItem().equals(new ItemStack(Material.GOLDEN_HELMET))) {
					ItemStack item = event.getCurrentItem();
					ItemMeta meta = item.getItemMeta();
					level = rand.nextInt(5)+6;
					meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, level, true);
					item.setItemMeta(meta);
				}
				else if(event.getCurrentItem().equals(new ItemStack(Material.IRON_HELMET))) {
					ItemStack item = event.getCurrentItem();
					ItemMeta meta = item.getItemMeta();
					level = rand.nextInt(5)+11;
					meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, level, true);
					level = rand.nextInt(5)+1;
					meta.addEnchant(Enchantment.THORNS, level, true);
					level = rand.nextInt(5)+1;
					meta.addEnchant(Enchantment.WATER_WORKER, level, true);
					item.setItemMeta(meta);
				}
				else if(event.getCurrentItem().equals(new ItemStack(Material.DIAMOND_HELMET))) {
					ItemStack item = event.getCurrentItem();
					ItemMeta meta = item.getItemMeta();
					level = rand.nextInt(5)+16;
					meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, level, true);
					level = rand.nextInt(5)+6;
					meta.addEnchant(Enchantment.THORNS, level, true);
					level = rand.nextInt(5)+6;
					meta.addEnchant(Enchantment.WATER_WORKER, level, true);
					level = rand.nextInt(5)+1;
					meta.addEnchant(Enchantment.PROTECTION_FIRE, level, true);
					level = rand.nextInt(5)+1;
					meta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, level, true);
					item.setItemMeta(meta);
				}
				else if(event.getCurrentItem().equals(new ItemStack(Material.LEATHER_CHESTPLATE))) {
					ItemStack item = event.getCurrentItem();
					ItemMeta meta = item.getItemMeta();
					level = rand.nextInt(5)+1;
					meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, level, true);
					item.setItemMeta(meta);
				}
				else if(event.getCurrentItem().equals(new ItemStack(Material.GOLDEN_CHESTPLATE))) {
					ItemStack item = event.getCurrentItem();
					ItemMeta meta = item.getItemMeta();
					level = rand.nextInt(5)+6;
					meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, level, true);
					item.setItemMeta(meta);
				}
				else if(event.getCurrentItem().equals(new ItemStack(Material.IRON_CHESTPLATE))) {
					ItemStack item = event.getCurrentItem();
					ItemMeta meta = item.getItemMeta();
					level = rand.nextInt(5)+11;
					meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, level, true);
					level = rand.nextInt(5)+1;
					meta.addEnchant(Enchantment.THORNS, level, true);
					item.setItemMeta(meta);
				}
				else if(event.getCurrentItem().equals(new ItemStack(Material.DIAMOND_CHESTPLATE))) {
					ItemStack item = event.getCurrentItem();
					ItemMeta meta = item.getItemMeta();
					level = rand.nextInt(5)+16;
					meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, level, true);
					level = rand.nextInt(5)+6;
					meta.addEnchant(Enchantment.THORNS, level, true);
					level = rand.nextInt(5)+6;
					meta.addEnchant(Enchantment.PROTECTION_FIRE, level, true);
					level = rand.nextInt(5)+1;
					meta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, level, true);
					item.setItemMeta(meta);
				}
				else if(event.getCurrentItem().equals(new ItemStack(Material.LEATHER_LEGGINGS))) {
					ItemStack item = event.getCurrentItem();
					ItemMeta meta = item.getItemMeta();
					level = rand.nextInt(5)+1;
					meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, level, true);
					item.setItemMeta(meta);
				}
				else if(event.getCurrentItem().equals(new ItemStack(Material.GOLDEN_LEGGINGS))) {
					ItemStack item = event.getCurrentItem();
					ItemMeta meta = item.getItemMeta();
					level = rand.nextInt(5)+6;
					meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, level, true);
					item.setItemMeta(meta);
				}
				else if(event.getCurrentItem().equals(new ItemStack(Material.IRON_LEGGINGS))) {
					ItemStack item = event.getCurrentItem();
					ItemMeta meta = item.getItemMeta();
					level = rand.nextInt(5)+11;
					meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, level, true);
					level = rand.nextInt(5)+1;
					meta.addEnchant(Enchantment.THORNS, level, true);
					item.setItemMeta(meta);
				}
				else if(event.getCurrentItem().equals(new ItemStack(Material.DIAMOND_LEGGINGS))) {
					ItemStack item = event.getCurrentItem();
					ItemMeta meta = item.getItemMeta();
					level = rand.nextInt(5)+16;
					meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, level, true);
					level = rand.nextInt(5)+6;
					meta.addEnchant(Enchantment.THORNS, level, true);
					level = rand.nextInt(5)+1;
					meta.addEnchant(Enchantment.PROTECTION_FIRE, level, true);
					level = rand.nextInt(5)+1;
					meta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, level, true);
					item.setItemMeta(meta);
				}
				else if(event.getCurrentItem().equals(new ItemStack(Material.LEATHER_BOOTS))) {
					ItemStack item = event.getCurrentItem();
					ItemMeta meta = item.getItemMeta();
					level = rand.nextInt(5)+1;
					meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, level, true);
					item.setItemMeta(meta);
				}
				else if(event.getCurrentItem().equals(new ItemStack(Material.GOLDEN_BOOTS))) {
					ItemStack item = event.getCurrentItem();
					ItemMeta meta = item.getItemMeta();
					level = rand.nextInt(5)+6;
					meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, level, true);
					level = rand.nextInt(5)+1;
					meta.addEnchant(Enchantment.PROTECTION_FALL, level, true);
					item.setItemMeta(meta);
				}
				else if(event.getCurrentItem().equals(new ItemStack(Material.IRON_BOOTS))) {
					ItemStack item = event.getCurrentItem();
					ItemMeta meta = item.getItemMeta();
					level = rand.nextInt(5)+11;
					meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, level, true);
					level = rand.nextInt(5)+6;
					meta.addEnchant(Enchantment.PROTECTION_FALL, level, true);
					level = rand.nextInt(5)+1;
					meta.addEnchant(Enchantment.PROTECTION_FIRE, level, true);
					meta.addEnchant(Enchantment.SOUL_SPEED, 1, true);
					level = rand.nextInt(5)+1;
					meta.addEnchant(Enchantment.THORNS, level, true);
					level = rand.nextInt(5)+16;
					meta.addEnchant(Enchantment.DEPTH_STRIDER, level, true);
					item.setItemMeta(meta);
				}
				else if(event.getCurrentItem().equals(new ItemStack(Material.DIAMOND_BOOTS))) {
					ItemStack item = event.getCurrentItem();
					ItemMeta meta = item.getItemMeta();
					level = rand.nextInt(5)+16;
					meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, level, true);
					level = rand.nextInt(5)+11;
					meta.addEnchant(Enchantment.PROTECTION_FALL, level, true);
					level = rand.nextInt(5)+6;
					meta.addEnchant(Enchantment.PROTECTION_FIRE, level, true);
					meta.addEnchant(Enchantment.SOUL_SPEED, 2, true);
					level = rand.nextInt(5)+6;
					meta.addEnchant(Enchantment.THORNS, level, true);
					level = rand.nextInt(5)+21;
					meta.addEnchant(Enchantment.DEPTH_STRIDER, level, true);
					item.setItemMeta(meta);
				}
			}
		}
		else if(event.getInventory().getType().equals(InventoryType.SMITHING)) {
			if(event.getSlot()==2) {
				if(event.getCurrentItem().equals(new ItemStack(Material.NETHERITE_HELMET))) {
					ItemStack item = event.getCurrentItem();
					ItemMeta meta = item.getItemMeta();
					level = rand.nextInt(5)+21;
					meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, level, true);
					level = rand.nextInt(5)+11;
					meta.addEnchant(Enchantment.THORNS, level, true);
					level = rand.nextInt(5)+11;
					meta.addEnchant(Enchantment.WATER_WORKER, level, true);
					level = rand.nextInt(5)+6;
					meta.addEnchant(Enchantment.PROTECTION_FIRE, level, true);
					level = rand.nextInt(5)+6;
					meta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, level, true);
					item.setItemMeta(meta);
				}
				else if(event.getCurrentItem().equals(new ItemStack(Material.NETHERITE_CHESTPLATE))) {
					ItemStack item = event.getCurrentItem();
					ItemMeta meta = item.getItemMeta();
					level = rand.nextInt(5)+21;
					meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, level, true);
					level = rand.nextInt(5)+11;
					meta.addEnchant(Enchantment.THORNS, level, true);
					level = rand.nextInt(5)+11;
					meta.addEnchant(Enchantment.PROTECTION_FIRE, level, true);
					level = rand.nextInt(5)+6;
					meta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, level, true);
					item.setItemMeta(meta);
				}
				else if(event.getCurrentItem().equals(new ItemStack(Material.NETHERITE_LEGGINGS))) {
					ItemStack item = event.getCurrentItem();
					ItemMeta meta = item.getItemMeta();
					level = rand.nextInt(5)+21;
					meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, level, true);
					level = rand.nextInt(5)+11;
					meta.addEnchant(Enchantment.THORNS, level, true);
					level = rand.nextInt(5)+6;
					meta.addEnchant(Enchantment.PROTECTION_FIRE, level, true);
					level = rand.nextInt(5)+6;
					meta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, level, true);
					item.setItemMeta(meta);
				}
				else if(event.getCurrentItem().equals(new ItemStack(Material.NETHERITE_BOOTS))) {
					ItemStack item = event.getCurrentItem();
					ItemMeta meta = item.getItemMeta();
					level = rand.nextInt(5)+21;
					meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, level, true);
					level = rand.nextInt(5)+16;
					meta.addEnchant(Enchantment.PROTECTION_FALL, level, true);
					level = rand.nextInt(5)+11;
					meta.addEnchant(Enchantment.PROTECTION_FIRE, level, true);
					meta.addEnchant(Enchantment.SOUL_SPEED, 3, true);
					level = rand.nextInt(5)+11;
					meta.addEnchant(Enchantment.THORNS, level, true);
					level = rand.nextInt(5)+26;
					meta.addEnchant(Enchantment.DEPTH_STRIDER, level, true);
					item.setItemMeta(meta);
				}
			}
		}
	}
}
