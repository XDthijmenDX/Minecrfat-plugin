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

public class ClickEventChestplate implements Listener {

    private final Cosmetics cosmetics;

    public ClickEventChestplate(Cosmetics cosmetics) {
        this.cosmetics = cosmetics;
        cosmetics.getServer().getPluginManager().registerEvents(this, cosmetics);
    }

    @EventHandler
    public void onInventoryClickEvent(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();

        ItemStack chestplate = new ItemStack(Material.LEATHER_CHESTPLATE);

        if (event.getView().getTitle().equalsIgnoreCase("Chestplates")) {
            switch (event.getSlot()) {
                case 0 -> {
                    player.getInventory().setChestplate(chestplate);
                    cosmetics.getCheckIfArmourIsOn().setChestplate(true);
                }
                case 1 -> {
                    chestplateMeta(player, Color.AQUA);
                    cosmetics.getCheckIfArmourIsOn().setChestplate(true);
                }
                case 2 -> {
                    chestplateMeta(player, Color.BLACK);
                    cosmetics.getCheckIfArmourIsOn().setChestplate(true);
                }
                case 3 -> {
                    chestplateMeta(player, Color.BLUE);
                    cosmetics.getCheckIfArmourIsOn().setChestplate(true);
                }
                case 4 -> {
                    chestplateMeta(player, Color.FUCHSIA);
                    cosmetics.getCheckIfArmourIsOn().setChestplate(true);
                }
                case 5 -> {
                    chestplateMeta(player, Color.GRAY);
                    cosmetics.getCheckIfArmourIsOn().setChestplate(true);
                }
                case 6 -> {
                    chestplateMeta(player, Color.GREEN);
                    cosmetics.getCheckIfArmourIsOn().setChestplate(true);
                }
                case 7 -> {
                    chestplateMeta(player, Color.LIME);
                    cosmetics.getCheckIfArmourIsOn().setChestplate(true);
                }
                case 8 -> {
                    chestplateMeta(player, Color.MAROON);
                    cosmetics.getCheckIfArmourIsOn().setChestplate(true);
                }
                case 9 -> {
                    chestplateMeta(player, Color.NAVY);
                    cosmetics.getCheckIfArmourIsOn().setChestplate(true);
                }
                case 10 -> {
                    chestplateMeta(player, Color.OLIVE);
                    cosmetics.getCheckIfArmourIsOn().setChestplate(true);
                }
                case 11 -> {
                    chestplateMeta(player, Color.ORANGE);
                    cosmetics.getCheckIfArmourIsOn().setChestplate(true);
                }
                case 12 -> {
                    chestplateMeta(player, Color.PURPLE);
                    cosmetics.getCheckIfArmourIsOn().setChestplate(true);
                }
                case 13 -> {
                    chestplateMeta(player, Color.RED);
                    cosmetics.getCheckIfArmourIsOn().setChestplate(true);
                }
                case 14 -> {
                    chestplateMeta(player, Color.SILVER);
                    cosmetics.getCheckIfArmourIsOn().setChestplate(true);
                }
                case 15 -> {
                    chestplateMeta(player, Color.TEAL);
                    cosmetics.getCheckIfArmourIsOn().setChestplate(true);
                }
                case 16 -> {
                    chestplateMeta(player, Color.WHITE);
                    cosmetics.getCheckIfArmourIsOn().setChestplate(true);
                }
                case 17 -> {
                    chestplateMeta(player, Color.YELLOW);
                    cosmetics.getCheckIfArmourIsOn().setChestplate(true);
                }
                case 18 -> StartInv.startInv(player);
            }
        }
    }

    private static void chestplateMeta(Player player, Color color) {
        ItemStack stack = new ItemStack(Material.LEATHER_CHESTPLATE);
        LeatherArmorMeta leatherArmorMeta = (LeatherArmorMeta) stack.getItemMeta();
        leatherArmorMeta.setColor(color);
        stack.setItemMeta(leatherArmorMeta);

        player.getInventory().setChestplate(stack);
    }
}
