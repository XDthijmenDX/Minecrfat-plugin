package lemmensthijmen.cosmetics.ClickEvents;

import lemmensthijmen.cosmetics.Cosmetics;
import lemmensthijmen.cosmetics.Inventorys.*;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class ClickEventStartInv implements Listener {

    private final Cosmetics cosmetics;

    public ClickEventStartInv(Cosmetics cosmetics) {
        this.cosmetics = cosmetics;
        cosmetics.getServer().getPluginManager().registerEvents(this, cosmetics);
    }

    @EventHandler
    public void onInventoryClickEvent(InventoryClickEvent event){
        Player player = (Player) event.getWhoClicked();

        if (event.getView().getTitle().equalsIgnoreCase("Cosmetics")){
            switch (event.getCurrentItem().getType()){
                case BARRIER -> player.closeInventory();
                case LEATHER_HELMET -> HelmetInv.helmetInv(player);
                case LEATHER_CHESTPLATE -> ChestplateInv.chestplateInv(player);
                case LEATHER_LEGGINGS -> LeggingsInv.leggingsInv(player);
                case LEATHER_BOOTS -> BootsInv.bootsInv(player);
                case CARVED_PUMPKIN -> PumpkinInv.pumpkinInv(player);
                case PLAYER_HEAD -> PlayerHeadsInv.playerHeadsInv(player);
                case RED_WOOL -> {
                    if (cosmetics.getCheckIfArmourIsOn().getHelmet() || cosmetics.getCheckIfArmourIsOn().getChestplate() || cosmetics.getCheckIfArmourIsOn().getLeggings() || cosmetics.getCheckIfArmourIsOn().getBoots()) {
                        if (cosmetics.getCheckIfArmourIsOn().getHelmet()) {
                            player.getInventory().setHelmet(null);
                            cosmetics.getCheckIfArmourIsOn().setHelmet(false);
                        }
                        if (cosmetics.getCheckIfArmourIsOn().getChestplate()) {
                            player.getInventory().setChestplate(null);
                            cosmetics.getCheckIfArmourIsOn().setChestplate(false);
                        }
                        if (cosmetics.getCheckIfArmourIsOn().getLeggings()) {
                            player.getInventory().setLeggings(null);
                            cosmetics.getCheckIfArmourIsOn().setLeggings(false);
                        }
                        if (cosmetics.getCheckIfArmourIsOn().getBoots()) {
                            player.getInventory().setBoots(null);
                            cosmetics.getCheckIfArmourIsOn().setBoots(false);
                        }
                        player.sendMessage(ChatColor.RED + "NOW you have no cosmetics!");
                    } else {
                        player.sendMessage(ChatColor.GREEN + "you have no cosmetics on!");
                    }
                }
                default -> player.sendMessage(ChatColor.RED + "Cant do that!");
            }
        }
    }
}
