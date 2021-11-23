package lemmensthijmen.cosmetics.Inventorys;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class StartInv {

    private static final Inventory inventory = Bukkit.createInventory(null, 45, "Cosmetics");

    public static void startInv(Player player){

        ItemStack helmets = new ItemStack(Material.LEATHER_HELMET);
        ItemStack chestplate = new ItemStack(Material.LEATHER_CHESTPLATE);
        ItemStack leggings = new ItemStack(Material.LEATHER_LEGGINGS);
        ItemStack boots = new ItemStack(Material.LEATHER_BOOTS);
        ItemStack pumpkin = new ItemStack(Material.CARVED_PUMPKIN);
        ItemStack playerHead = new ItemStack(Material.PLAYER_HEAD);
        ItemStack barrier = new ItemStack(Material.BARRIER);
        ItemStack redWool = new ItemStack(Material.RED_WOOL);
        ItemStack air = new ItemStack(Material.AIR);

        for (int i=0; i < 45; i++) {
            switch (i) {
                case 10 -> addItems(10, helmets, "Helmets", "Here can you see all the helmets!", ChatColor.GREEN, ChatColor.GRAY);
                case 12 -> addItems(12, chestplate, "Chestplate", "Here can you see all the chestplates!", ChatColor.GREEN, ChatColor.GRAY);
                case 14 -> addItems(14, leggings, "Leggings", "Here can you see all the leggings!", ChatColor.GREEN, ChatColor.GRAY);
                case 16 -> addItems(16, boots, "Boots", "Here can you see all the boots!", ChatColor.GREEN, ChatColor.GRAY);
                case 28 -> addItems(28, pumpkin, "Pumpkin", "Here can you see all the hallow items!", ChatColor.GREEN, ChatColor.GRAY);
                case 30 -> addItems(30, redWool, "Reset Cosmetics", "Reset your Cosmetics!", ChatColor.RED, ChatColor.GRAY);
                case 32 -> addItems(32, barrier, "Exit Cosmetics", "Close the Cosmetics screen!", ChatColor.RED, ChatColor.GRAY);
                case 34 -> addItems(34, playerHead, "PlayerHead", "Here can you see all the playerheads!", ChatColor.GREEN, ChatColor.GRAY);
                default -> inventory.setItem(i, air);
            }
        }

        player.openInventory(inventory);
    }

    private static void addItems(int index, ItemStack stack, String meta, String lore, ChatColor color, ChatColor color1) {
        ItemMeta meta1 = stack.getItemMeta();
        meta1.setDisplayName(color + "" + meta);
        ArrayList<String> lore1 = new ArrayList<>();
        lore1.add(color1 + "" + lore);
        meta1.setLore(lore1);
        stack.setItemMeta(meta1);

        inventory.setItem(index, stack);
    }
}
