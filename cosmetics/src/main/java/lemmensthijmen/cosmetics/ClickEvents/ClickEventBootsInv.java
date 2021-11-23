package lemmensthijmen.cosmetics.ClickEvents;

import lemmensthijmen.cosmetics.Inventorys.StartInv;

import lemmensthijmen.cosmetics.Cosmetics;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.LeatherArmorMeta;

public class ClickEventBootsInv implements Listener {

    private final Cosmetics cosmetics;

    public ClickEventBootsInv(Cosmetics cosmetics) {
        this.cosmetics = cosmetics;
        cosmetics.getServer().getPluginManager().registerEvents(this, cosmetics);
    }

    @EventHandler
    public void onInventoryClickEvent(InventoryClickEvent event){
        Player player = (Player) event.getWhoClicked();

        ItemStack boots = new ItemStack(Material.LEATHER_BOOTS);

        if (event.getView().getTitle().equalsIgnoreCase("Boots")) {
            switch (event.getSlot()) {
                case 0 -> {
                    player.getInventory().setBoots(boots);
                    cosmetics.getCheckIfArmourIsOn().setBoots(true);
                }
                case 1 -> {
                    bootsMeta(player, Color.AQUA);
                    cosmetics.getCheckIfArmourIsOn().setBoots(true);
                }
                case 2 -> {
                    bootsMeta(player, Color.BLACK);
                    cosmetics.getCheckIfArmourIsOn().setBoots(true);
                }
                case 3 -> {
                    bootsMeta(player, Color.BLUE);
                    cosmetics.getCheckIfArmourIsOn().setBoots(true);
                }
                case 4 -> {
                    bootsMeta(player, Color.FUCHSIA);
                    cosmetics.getCheckIfArmourIsOn().setBoots(true);
                }
                case 5 -> {
                    bootsMeta(player, Color.GRAY);
                    cosmetics.getCheckIfArmourIsOn().setBoots(true);
                }
                case 6 -> {
                    bootsMeta(player, Color.GREEN);
                    cosmetics.getCheckIfArmourIsOn().setBoots(true);
                }
                case 7 -> {
                    bootsMeta(player, Color.LIME);
                    cosmetics.getCheckIfArmourIsOn().setBoots(true);
                }
                case 8 -> {
                    bootsMeta(player, Color.MAROON);
                    cosmetics.getCheckIfArmourIsOn().setBoots(true);
                }
                case 9 -> {
                    bootsMeta(player, Color.NAVY);
                    cosmetics.getCheckIfArmourIsOn().setBoots(true);
                }
                case 10 -> {
                    bootsMeta(player, Color.OLIVE);
                    cosmetics.getCheckIfArmourIsOn().setBoots(true);
                }
                case 11 -> {
                    bootsMeta(player, Color.ORANGE);
                    cosmetics.getCheckIfArmourIsOn().setBoots(true);
                }
                case 12 -> {
                    bootsMeta(player, Color.PURPLE);
                    cosmetics.getCheckIfArmourIsOn().setBoots(true);
                }
                case 13 -> {
                    bootsMeta(player, Color.RED);
                    cosmetics.getCheckIfArmourIsOn().setBoots(true);
                }
                case 14 -> {
                    bootsMeta(player, Color.SILVER);
                    cosmetics.getCheckIfArmourIsOn().setBoots(true);
                }
                case 15 -> {
                    bootsMeta(player, Color.TEAL);
                    cosmetics.getCheckIfArmourIsOn().setBoots(true);
                }
                case 16 -> {
                    bootsMeta(player, Color.WHITE);
                    cosmetics.getCheckIfArmourIsOn().setBoots(true);
                }
                case 17 -> {
                    bootsMeta(player, Color.YELLOW);
                    cosmetics.getCheckIfArmourIsOn().setBoots(true);
                }
                case 18 -> StartInv.startInv(player);
            }
        }
    }

    private static void bootsMeta(Player player, Color color) {
        ItemStack stack = new ItemStack(Material.LEATHER_BOOTS);
        LeatherArmorMeta leatherArmorMeta = (LeatherArmorMeta) stack.getItemMeta();
        leatherArmorMeta.setColor(color);
        stack.setItemMeta(leatherArmorMeta);

        player.getInventory().setBoots(stack);
    }
}
