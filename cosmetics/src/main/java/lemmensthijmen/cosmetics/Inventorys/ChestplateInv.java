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

public class ChestplateInv {

    private static final Inventory inventory = Bukkit.createInventory(null, 27, "Chestplates");

    public static void chestplateInv(Player player){

        ItemStack barrier = new ItemStack(Material.BARRIER);
        ItemStack air = new ItemStack(Material.AIR);
        ItemStack chestplate = new ItemStack(Material.LEATHER_CHESTPLATE);

        ItemMeta itemMetaBarrier = barrier.getItemMeta();
        itemMetaBarrier.setDisplayName(ChatColor.RED + "Go Back!");
        ArrayList<String> barrierLore = new ArrayList<>();
        barrierLore.add(ChatColor.GRAY + "go back to the start inventory.");
        itemMetaBarrier.setLore(barrierLore);
        barrier.setItemMeta(itemMetaBarrier);

        for (int i=0; i < 19; i++) {
            switch (i) {
                case 0 -> inventory.setItem(0, chestplate);
                case 1 -> chestplateItemMeta(1, Color.AQUA);
                case 2 -> chestplateItemMeta(2, Color.BLACK);
                case 3 -> chestplateItemMeta(3, Color.BLUE);
                case 4 -> chestplateItemMeta(4, Color.FUCHSIA);
                case 5 -> chestplateItemMeta(5, Color.GRAY);
                case 6 -> chestplateItemMeta(6, Color.GREEN);
                case 7 -> chestplateItemMeta(7, Color.LIME);
                case 8 -> chestplateItemMeta(8, Color.MAROON);
                case 9 -> chestplateItemMeta(9, Color.NAVY);
                case 10 -> chestplateItemMeta(10, Color.OLIVE);
                case 11 -> chestplateItemMeta(11, Color.ORANGE);
                case 12 -> chestplateItemMeta(12, Color.PURPLE);
                case 13 -> chestplateItemMeta(13, Color.RED);
                case 14 -> chestplateItemMeta(14, Color.SILVER);
                case 15 -> chestplateItemMeta(15, Color.TEAL);
                case 16 -> chestplateItemMeta(16, Color.WHITE);
                case 17 -> chestplateItemMeta(17, Color.YELLOW);
                case 18 -> inventory.setItem(18, barrier);
            }
        }
        player.openInventory(inventory);
    }

    private static void chestplateItemMeta(int index ,Color color) {
        ItemStack stack = new ItemStack(Material.LEATHER_CHESTPLATE);
        LeatherArmorMeta leatherArmorMeta = (LeatherArmorMeta) stack.getItemMeta();
        leatherArmorMeta.setColor(color);
        stack.setItemMeta(leatherArmorMeta);

        inventory.setItem(index, stack);
    }
}
