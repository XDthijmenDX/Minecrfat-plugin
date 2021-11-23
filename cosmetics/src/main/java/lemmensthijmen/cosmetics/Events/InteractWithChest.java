package lemmensthijmen.cosmetics.Events;

import lemmensthijmen.cosmetics.Inventorys.StartInv;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class InteractWithChest implements Listener {

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event) {
        Player player = event.getPlayer();

        if (player.getInventory().getItemInMainHand().getType() == Material.CHEST && event.getAction() == Action.RIGHT_CLICK_AIR){
            StartInv.startInv(player);
        }
    }
}
