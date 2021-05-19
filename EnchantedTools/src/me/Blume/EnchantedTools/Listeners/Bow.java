package me.Blume.EnchantedTools.Listeners;

import java.util.HashMap;
import java.util.Random;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareItemCraftEvent;
import org.bukkit.inventory.CraftingInventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import me.Blume.EnchantedTools.Main;

public class Bow implements Listener{
	@SuppressWarnings("unused")
	private Main plugin;
	public Bow(Main plugin) {
		this.plugin=plugin;
	}
	Random rand = new Random();
	int level;
	public ItemStack leatherBow() {
		ItemStack leatherbow = new ItemStack(Material.BOW);
		ItemMeta meta = leatherbow.getItemMeta();
		level = rand.nextInt(5)+1;
		meta.addEnchant(Enchantment.ARROW_DAMAGE, level, true);
		leatherbow.setItemMeta(meta);
		return leatherbow;
	}
	public ItemStack stoneBow() {
		ItemStack leatherbow = new ItemStack(Material.BOW);
		ItemMeta meta = leatherbow.getItemMeta();
		level = rand.nextInt(5)+6;
		meta.addEnchant(Enchantment.ARROW_DAMAGE, level, true);
		leatherbow.setItemMeta(meta);
		return leatherbow;
	}
	public ItemStack goldenBow() {
		ItemStack leatherbow = new ItemStack(Material.BOW);
		ItemMeta meta = leatherbow.getItemMeta();
		level = rand.nextInt(5)+11;
		meta.addEnchant(Enchantment.ARROW_DAMAGE, level, true);
		leatherbow.setItemMeta(meta);
		return leatherbow;
	}
	public ItemStack ironBow() {
		ItemStack leatherbow = new ItemStack(Material.BOW);
		ItemMeta meta = leatherbow.getItemMeta();
		level = rand.nextInt(5)+16;
		meta.addEnchant(Enchantment.ARROW_DAMAGE, level, true);
		meta.addEnchant(Enchantment.ARROW_INFINITE, 1, true);
		level = rand.nextInt(5)+1;
		meta.addEnchant(Enchantment.ARROW_FIRE, level, true);
		leatherbow.setItemMeta(meta);
		return leatherbow;
	}
	public ItemStack diamondBow() {
		ItemStack leatherbow = new ItemStack(Material.BOW);
		ItemMeta meta = leatherbow.getItemMeta();
		level = rand.nextInt(5)+21;
		meta.addEnchant(Enchantment.ARROW_DAMAGE, level, true);
		meta.addEnchant(Enchantment.ARROW_INFINITE, 1, true);
		level = rand.nextInt(5)+6;
		meta.addEnchant(Enchantment.ARROW_FIRE, level, true);
		level = rand.nextInt(5)+1;
		meta.addEnchant(Enchantment.ARROW_KNOCKBACK, level, true);
		leatherbow.setItemMeta(meta);
		return leatherbow;
	}
	public ItemStack netheriteBow() {
		ItemStack leatherbow = new ItemStack(Material.BOW);
		ItemMeta meta = leatherbow.getItemMeta();
		level = rand.nextInt(5)+26;
		meta.addEnchant(Enchantment.ARROW_DAMAGE, level, true);
		meta.addEnchant(Enchantment.ARROW_INFINITE, 1, true);
		level = rand.nextInt(5)+11;
		meta.addEnchant(Enchantment.ARROW_FIRE, level, true);
		level = rand.nextInt(5)+6;
		meta.addEnchant(Enchantment.ARROW_KNOCKBACK, level, true);
		leatherbow.setItemMeta(meta);
		return leatherbow;
	}
	@SuppressWarnings("serial")
	@EventHandler
	public void bowitems(PrepareItemCraftEvent event) {
		if(event.getInventory().getMatrix().length<9) {
			return;
		}
		checkCraft(leatherBow(),event.getInventory(),new HashMap<Integer,ItemStack>(){{
			put(4,new ItemStack(Material.BOW));
			put(5,new ItemStack(Material.LEATHER));
		}});
		checkCraft(stoneBow(),event.getInventory(),new HashMap<Integer,ItemStack>(){{
			put(4,new ItemStack(Material.BOW));
			put(5,new ItemStack(Material.COBBLESTONE));
		}});
		checkCraft(goldenBow(),event.getInventory(),new HashMap<Integer,ItemStack>(){{
			put(4,new ItemStack(Material.BOW));
			put(5,new ItemStack(Material.GOLD_INGOT));
		}});
		checkCraft(ironBow(),event.getInventory(),new HashMap<Integer,ItemStack>(){{
			put(4,new ItemStack(Material.BOW));
			put(5,new ItemStack(Material.IRON_INGOT));
		}});
		checkCraft(diamondBow(),event.getInventory(),new HashMap<Integer,ItemStack>(){{
			put(4,new ItemStack(Material.BOW));
			put(5,new ItemStack(Material.DIAMOND));
		}});
		checkCraft(netheriteBow(),event.getInventory(),new HashMap<Integer,ItemStack>(){{
			put(4,new ItemStack(Material.BOW));
			put(5,new ItemStack(Material.NETHERITE_INGOT));
		}});
		
		
		}
		
		

	public void checkCraft(ItemStack result,CraftingInventory inv,HashMap<Integer, ItemStack> ingredients) {
		ItemStack[] matrix = inv.getMatrix();
		for(int i =0;i<9;i++) {
			if(ingredients.containsKey(i)) {
				if(matrix[i]==null || !matrix[i].equals(ingredients.get(i))) {
					return;
				}
			}
			else {
				if(matrix[i]!=null) {
					return;
				}
			}
		}
			inv.setResult(result);
	}
}
