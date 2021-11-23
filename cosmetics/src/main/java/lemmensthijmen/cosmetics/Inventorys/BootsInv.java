package lemmensthijmen.cosmetics.Inventorys;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;

import java.util.ArrayList;

public class BootsInv {

    private static final Inventory inventory = Bukkit.createInventory(null, 27, "Boots");

    public static void bootsInv(Player player){

        ItemStack barrier = new ItemStack(Material.BARRIER);
        ItemStack boots = new ItemStack(Material.LEATHER_BOOTS);

        ItemMeta barrierMeta = barrier.getItemMeta();
        barrierMeta.setDisplayName(ChatColor.RED + "Go Back");
        ArrayList<String> barrierLore = new ArrayList<>();
        barrierLore.add(ChatColor.GRAY + "Goes back to start screen!");
        barrierMeta.setLore(barrierLore);
        barrier.setItemMeta(barrierMeta);

        for (int i=0; i < 19; i++) {
            switch (i) {
                case 0 -> inventory.setItem(0, boots);
                case 1 -> bootsItemMeta(1, Color.AQUA);
                case 2 -> bootsItemMeta(2, Color.BLACK);
                case 3 -> bootsItemMeta(3, Color.BLUE);
                case 4 -> bootsItemMeta(4, Color.FUCHSIA);
                case 5 -> bootsItemMeta(5, Color.GRAY);
                case 6 -> bootsItemMeta(6, Color.GREEN);
                case 7 -> bootsItemMeta(7, Color.LIME);
                case 8 -> bootsItemMeta(8, Color.MAROON);
                case 9 -> bootsItemMeta(9, Color.NAVY);
                case 10 -> bootsItemMeta(10, Color.OLIVE);
                case 11 -> bootsItemMeta(11, Color.ORANGE);
                case 12 -> bootsItemMeta(12, Color.PURPLE);
                case 13 -> bootsItemMeta(13, Color.RED);
                case 14 -> bootsItemMeta(14, Color.SILVER);
                case 15 -> bootsItemMeta(15, Color.TEAL);
                case 16 -> bootsItemMeta(16, Color.WHITE);
                case 17 -> bootsItemMeta(17, Color.YELLOW);
                default -> inventory.setItem(18, barrier);
            }
        }

        player.openInventory(inventory);
    }

    private static void bootsItemMeta(int index ,Color color) {
        ItemStack stack = new ItemStack(Material.LEATHER_BOOTS);
        LeatherArmorMeta leatherArmorMeta = (LeatherArmorMeta) stack.getItemMeta();
        leatherArmorMeta.setColor(color);
        stack.setItemMeta(leatherArmorMeta);

        inventory.setItem(index, stack);
    }
}
