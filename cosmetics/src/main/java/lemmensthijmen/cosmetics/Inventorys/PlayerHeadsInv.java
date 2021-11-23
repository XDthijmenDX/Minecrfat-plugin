package lemmensthijmen.cosmetics.Inventorys;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class PlayerHeadsInv {

    private static final Inventory inventory = Bukkit.createInventory(null, 45, "PlayerHeads");

    public static void playerHeadsInv(Player player){

        ItemStack playerHead = new ItemStack(Material.PLAYER_HEAD);
        ItemStack creeperHead = new ItemStack(Material.CREEPER_HEAD);
        ItemStack dragonHead = new ItemStack(Material.DRAGON_HEAD);
        ItemStack zombieHead = new ItemStack(Material.ZOMBIE_HEAD);
        ItemStack skeletonHead = new ItemStack(Material.SKELETON_SKULL);
        ItemStack barrier = new ItemStack(Material.BARRIER);

        ItemMeta itemMetaBarrier = barrier.getItemMeta();
        itemMetaBarrier.setDisplayName(ChatColor.RED + "Go Back!");
        ArrayList<String> barrierLore = new ArrayList<>();
        barrierLore.add(ChatColor.GRAY + "go back to the start inventory.");
        itemMetaBarrier.setLore(barrierLore);
        barrier.setItemMeta(itemMetaBarrier);

        ItemStack[] items = {playerHead, creeperHead, dragonHead, zombieHead, skeletonHead, barrier};
        inventory.setContents(items);
        player.openInventory(inventory);
    }

}
