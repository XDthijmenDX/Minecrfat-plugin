package lemmensthijmen.cosmetics.Events;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class PlayerJoin implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){
        Player player = event.getPlayer();

        Inventory inventory = player.getInventory();

        ItemStack chest = new ItemStack(Material.CHEST);

        ItemMeta chestMeta = chest.getItemMeta();
        chestMeta.setDisplayName(ChatColor.GREEN + "Cosmetics");
        chest.setItemMeta(chestMeta);

        if (!inventory.contains(chest)) {
            inventory.setItem(4, chest);
        }
    }
}
