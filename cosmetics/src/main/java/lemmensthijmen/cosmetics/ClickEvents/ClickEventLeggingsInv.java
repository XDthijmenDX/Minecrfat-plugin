package lemmensthijmen.cosmetics.ClickEvents;

import lemmensthijmen.cosmetics.Cosmetics;
import lemmensthijmen.cosmetics.Inventorys.StartInv;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.LeatherArmorMeta;

public class ClickEventLeggingsInv implements Listener {

    private final Cosmetics cosmetics;

    public ClickEventLeggingsInv(Cosmetics cosmetics) {
        this.cosmetics = cosmetics;
        cosmetics.getServer().getPluginManager().registerEvents(this, cosmetics);
    }

    @EventHandler
    public void onInventoryClickEvent(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();

        ItemStack leggings = new ItemStack(Material.LEATHER_LEGGINGS);

        if (event.getView().getTitle().equalsIgnoreCase("Leggings")) {
            switch (event.getSlot()) {
                case 0 -> {
                    player.getInventory().setLeggings(leggings);
                    cosmetics.getCheckIfArmourIsOn().setLeggings(true);
                }
                case 1 -> {
                    leggingsMeta(player, Color.AQUA);
                    cosmetics.getCheckIfArmourIsOn().setLeggings(true);
                }
                case 2 -> {
                    leggingsMeta(player, Color.BLACK);
                    cosmetics.getCheckIfArmourIsOn().setLeggings(true);
                }
                case 3 -> {
                    leggingsMeta(player, Color.BLUE);
                    cosmetics.getCheckIfArmourIsOn().setLeggings(true);
                }
                case 4 -> {
                    leggingsMeta(player, Color.FUCHSIA);
                    cosmetics.getCheckIfArmourIsOn().setLeggings(true);
                }
                case 5 -> {
                    leggingsMeta(player, Color.GRAY);
                    cosmetics.getCheckIfArmourIsOn().setLeggings(true);
                }
                case 6 -> {
                    leggingsMeta(player, Color.GREEN);
                    cosmetics.getCheckIfArmourIsOn().setLeggings(true);
                }
                case 7 -> {
                    leggingsMeta(player, Color.LIME);
                    cosmetics.getCheckIfArmourIsOn().setLeggings(true);
                }
                case 8 -> {
                    leggingsMeta(player, Color.MAROON);
                    cosmetics.getCheckIfArmourIsOn().setLeggings(true);
                }
                case 9 -> {
                    leggingsMeta(player, Color.NAVY);
                    cosmetics.getCheckIfArmourIsOn().setLeggings(true);
                }
                case 10 -> {
                    leggingsMeta(player, Color.OLIVE);
                    cosmetics.getCheckIfArmourIsOn().setLeggings(true);
                }
                case 11 -> {
                    leggingsMeta(player, Color.ORANGE);
                    cosmetics.getCheckIfArmourIsOn().setLeggings(true);
                }
                case 12 -> {
                    leggingsMeta(player, Color.PURPLE);
                    cosmetics.getCheckIfArmourIsOn().setLeggings(true);
                }
                case 13 -> {
                    leggingsMeta(player, Color.RED);
                    cosmetics.getCheckIfArmourIsOn().setLeggings(true);
                }
                case 14 -> {
                    leggingsMeta(player, Color.SILVER);
                    cosmetics.getCheckIfArmourIsOn().setLeggings(true);
                }
                case 15 -> {
                    leggingsMeta(player, Color.TEAL);
                    cosmetics.getCheckIfArmourIsOn().setLeggings(true);
                }
                case 16 -> {
                    leggingsMeta(player, Color.WHITE);
                    cosmetics.getCheckIfArmourIsOn().setLeggings(true);
                }
                case 17 -> {
                    leggingsMeta(player, Color.YELLOW);
                    cosmetics.getCheckIfArmourIsOn().setLeggings(true);
                }
                case 18 -> StartInv.startInv(player);
            }
        }
    }

    private static void leggingsMeta(Player player, Color color) {
        ItemStack stack = new ItemStack(Material.LEATHER_LEGGINGS);
        LeatherArmorMeta leatherArmorMeta = (LeatherArmorMeta) stack.getItemMeta();
        leatherArmorMeta.setColor(color);
        stack.setItemMeta(leatherArmorMeta);

        player.getInventory().setLeggings(stack);
    }
}
