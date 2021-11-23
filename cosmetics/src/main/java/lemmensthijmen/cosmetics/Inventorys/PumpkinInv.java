package lemmensthijmen.cosmetics.Inventorys;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class PumpkinInv {

    public static void pumpkinInv(Player player){

        Inventory inventory = Bukkit.createInventory(null, 45, "Halloween");


        ItemStack[] items = {};
        inventory.setContents(items);
        player.openInventory(inventory);
    }
}
