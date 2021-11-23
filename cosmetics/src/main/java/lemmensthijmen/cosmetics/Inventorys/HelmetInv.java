package lemmensthijmen.cosmetics.Inventorys;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Color;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;

import java.util.ArrayList;

public class HelmetInv {

    private static final Inventory inventory = Bukkit.createInventory(null, 27, "Helmets");

    public static void helmetInv(Player player){

        ItemStack barrier = new ItemStack(Material.BARRIER);
        ItemStack helmet = new ItemStack(Material.LEATHER_HELMET);

        ItemMeta itemMetaBarrier = barrier.getItemMeta();
        itemMetaBarrier.setDisplayName(ChatColor.RED + "Go Back!");
        ArrayList<String> barrierLore = new ArrayList<>();
        barrierLore.add(ChatColor.GRAY + "go back to the start inventory.");
        itemMetaBarrier.setLore(barrierLore);
        barrier.setItemMeta(itemMetaBarrier);

        for (int i=0; i < 19; i++) {
            switch (i) {
                case 0 -> inventory.setItem(0, helmet);
                case 1 -> helmetMeta(1, Color.AQUA);
                case 2 -> helmetMeta(2, Color.BLACK);
                case 3 -> helmetMeta(3, Color.BLUE);
                case 4 -> helmetMeta(4, Color.FUCHSIA);
                case 5 -> helmetMeta(5, Color.GRAY);
                case 6 -> helmetMeta(6, Color.GREEN);
                case 7 -> helmetMeta(7, Color.LIME);
                case 8 -> helmetMeta(8, Color.MAROON);
                case 9 -> helmetMeta(9, Color.NAVY);
                case 10 -> helmetMeta(10, Color.OLIVE);
                case 11 -> helmetMeta(11, Color.ORANGE);
                case 12 -> helmetMeta(12, Color.PURPLE);
                case 13 -> helmetMeta(13, Color.RED);
                case 14 -> helmetMeta(14, Color.SILVER);
                case 15 -> helmetMeta(15, Color.TEAL);
                case 16 -> helmetMeta(16, Color.WHITE);
                case 17 -> helmetMeta(17, Color.YELLOW);
                case 18 -> inventory.setItem(18, barrier);
            }
        }
        player.openInventory(inventory);
    }

    private static void helmetMeta(int index, Color color) {
        ItemStack stack = new ItemStack(Material.LEATHER_HELMET);
        LeatherArmorMeta leatherArmorMeta = (LeatherArmorMeta) stack.getItemMeta();
        leatherArmorMeta.setColor(color);
        stack.setItemMeta(leatherArmorMeta);

        inventory.setItem(index, stack);
    }
}
