package lemmensthijmen.cosmetics.Events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class CancelClick implements Listener {

    @EventHandler
    public void onClickEvent(InventoryClickEvent event){

        if (event.getView().getTitle().equalsIgnoreCase("Cosmetics")) {
            event.setCancelled(true);
        }

        if (event.getView().getTitle().equalsIgnoreCase("Boots")){
            event.setCancelled(true);
        }

        if (event.getView().getTitle().equalsIgnoreCase("Chestplates")){
            event.setCancelled(true);
        }

        if (event.getView().getTitle().equalsIgnoreCase("Leggings")){
            event.setCancelled(true);
        }

        if (event.getView().getTitle().equalsIgnoreCase("Helmets")){
            event.setCancelled(true);
        }

        if (event.getView().getTitle().equalsIgnoreCase("Halloween")){
            event.setCancelled(true);
        }

        if (event.getView().getTitle().equalsIgnoreCase("PlayerHeads")){
            event.setCancelled(true);
        }
    }
}
