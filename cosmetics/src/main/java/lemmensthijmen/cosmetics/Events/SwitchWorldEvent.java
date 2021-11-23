package lemmensthijmen.cosmetics.Events;

import lemmensthijmen.cosmetics.Cosmetics;
import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChangedWorldEvent;

public class SwitchWorldEvent implements Listener {

    private Cosmetics cosmetics;

    public SwitchWorldEvent(Cosmetics cosmetics) {
        this.cosmetics = cosmetics;
        cosmetics.getServer().getPluginManager().registerEvents(this, cosmetics);
    }

    @EventHandler
    public void onEvent(PlayerChangedWorldEvent event) {
        Player player = event.getPlayer();
        World world = player.getWorld();
        if (!world.getName().equalsIgnoreCase("Lobby")) {
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
            }
        }
    }
}
