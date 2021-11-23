package lemmensthijmen.cosmetics.Inventorys;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;

import java.util.ArrayList;

public class LeggingsInv {

    private static final Inventory inventory = Bukkit.createInventory(null, 27, "Leggings");

    public static void leggingsInv(Player player){

        ItemStack barrier = new ItemStack(Material.BARRIER);
        ItemStack leggings = new ItemStack(Material.LEATHER_LEGGINGS);

        ItemMeta itemMetaBarrier = barrier.getItemMeta();
        itemMetaBarrier.setDisplayName(ChatColor.RED + "Go Back!");
        ArrayList<String> barrierLore = new ArrayList<>();
        barrierLore.add(ChatColor.GRAY + "go back to the start inventory.");
        itemMetaBarrier.setLore(barrierLore);
        barrier.setItemMeta(itemMetaBarrier);

        for (int i=0; i < 19; i++) {
            switch (i) {
                case 0 -> inventory.setItem(0, leggings);
                case 1 -> leggingsMeta(1, Color.AQUA);
                case 2 -> leggingsMeta(2, Color.BLACK);
                case 3 -> leggingsMeta(3, Color.BLUE);
                case 4 -> leggingsMeta(4, Color.FUCHSIA);
                case 5 -> leggingsMeta(5, Color.GRAY);
                case 6 -> leggingsMeta(6, Color.GREEN);
                case 7 -> leggingsMeta(7, Color.LIME);
                case 8 -> leggingsMeta(8, Color.MAROON);
                case 9 -> leggingsMeta(9, Color.NAVY);
                case 10 -> leggingsMeta(10, Color.OLIVE);
                case 11 -> leggingsMeta(11, Color.ORANGE);
                case 12 -> leggingsMeta(12, Color.PURPLE);
                case 13 -> leggingsMeta(13, Color.RED);
                case 14 -> leggingsMeta(14, Color.SILVER);
                case 15 -> leggingsMeta(15, Color.TEAL);
                case 16 -> leggingsMeta(16, Color.WHITE);
                case 17 -> leggingsMeta(17, Color.YELLOW);
                case 18 -> inventory.setItem(18, barrier);
            }
        }
        player.openInventory(inventory);
    }

    private static void leggingsMeta(int index, Color color) {
        ItemStack stack = new ItemStack(Material.LEATHER_LEGGINGS);
        LeatherArmorMeta leatherArmorMeta = (LeatherArmorMeta) stack.getItemMeta();
        leatherArmorMeta.setColor(color);
        stack.setItemMeta(leatherArmorMeta);

        inventory.setItem(index, stack);
    }
}
