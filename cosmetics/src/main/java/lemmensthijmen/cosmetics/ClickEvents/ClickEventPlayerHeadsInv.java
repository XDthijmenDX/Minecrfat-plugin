package lemmensthijmen.cosmetics.ClickEvents;

import lemmensthijmen.cosmetics.Cosmetics;
import lemmensthijmen.cosmetics.Inventorys.StartInv;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class ClickEventPlayerHeadsInv implements Listener {

    private final Cosmetics cosmetics;

    public ClickEventPlayerHeadsInv(Cosmetics cosmetics) {
        this.cosmetics = cosmetics;
        cosmetics.getServer().getPluginManager().registerEvents(this, cosmetics);
    }

    @EventHandler
    public void onInventoryClickEvent(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();

        ItemStack playerHead = new ItemStack(Material.PLAYER_HEAD);
        ItemStack creeperHead = new ItemStack(Material.CREEPER_HEAD);
        ItemStack dragonHead = new ItemStack(Material.DRAGON_HEAD);
        ItemStack zombieHead = new ItemStack(Material.ZOMBIE_HEAD);
        ItemStack skeletonHead = new ItemStack(Material.SKELETON_SKULL);

        if (event.getView().getTitle().equalsIgnoreCase("PlayerHeads")) {
            switch (event.getSlot()) {
                case 0 -> {
                    player.getInventory().setHelmet(playerHead);
                    cosmetics.getCheckIfArmourIsOn().setHelmet(true);
                }
                case 1 -> {
                    player.getInventory().setHelmet(creeperHead);
                    cosmetics.getCheckIfArmourIsOn().setHelmet(true);
                }
                case 2 -> {
                    player.getInventory().setHelmet(dragonHead);
                    cosmetics.getCheckIfArmourIsOn().setHelmet(true);
                }
                case 3 -> {
                    player.getInventory().setHelmet(zombieHead);
                    cosmetics.getCheckIfArmourIsOn().setHelmet(true);
                }
                case 4 -> {
                    player.getInventory().setHelmet(skeletonHead);
                    cosmetics.getCheckIfArmourIsOn().setHelmet(true);
                }
                case 5 -> StartInv.startInv(player);
            }
        }
    }
}
