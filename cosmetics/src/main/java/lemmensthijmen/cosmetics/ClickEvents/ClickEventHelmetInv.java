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

public class ClickEventHelmetInv implements Listener {

    private final Cosmetics cosmetics;

    public ClickEventHelmetInv(Cosmetics cosmetics) {
        this.cosmetics = cosmetics;
        cosmetics.getServer().getPluginManager().registerEvents(this, cosmetics);
    }

    @EventHandler
    public void onInventoryClickEvent(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();

        ItemStack helmet = new ItemStack(Material.LEATHER_HELMET);

        if (event.getView().getTitle().equalsIgnoreCase("Helmets")) {
            switch (event.getSlot()) {
                case 0 -> {
                    player.getInventory().setHelmet(helmet);
                    cosmetics.getCheckIfArmourIsOn().setHelmet(true);
                }
                case 1 -> {
                    helmetMeta(player, Color.AQUA);
                    cosmetics.getCheckIfArmourIsOn().setHelmet(true);
                }
                case 2 -> {
                    helmetMeta(player, Color.BLACK);
                    cosmetics.getCheckIfArmourIsOn().setHelmet(true);
                }
                case 3 -> {
                    helmetMeta(player, Color.BLUE);
                    cosmetics.getCheckIfArmourIsOn().setHelmet(true);
                }
                case 4 -> {
                    helmetMeta(player, Color.FUCHSIA);
                    cosmetics.getCheckIfArmourIsOn().setHelmet(true);
                }
                case 5 -> {
                    helmetMeta(player, Color.GRAY);
                    cosmetics.getCheckIfArmourIsOn().setHelmet(true);
                }
                case 6 -> {
                    helmetMeta(player, Color.GREEN);
                    cosmetics.getCheckIfArmourIsOn().setHelmet(true);
                }
                case 7 -> {
                    helmetMeta(player, Color.LIME);
                    cosmetics.getCheckIfArmourIsOn().setHelmet(true);
                }
                case 8 -> {
                    helmetMeta(player, Color.MAROON);
                    cosmetics.getCheckIfArmourIsOn().setHelmet(true);
                }
                case 9 -> {
                    helmetMeta(player, Color.NAVY);
                    cosmetics.getCheckIfArmourIsOn().setHelmet(true);
                }
                case 10 -> {
                    helmetMeta(player, Color.OLIVE);
                    cosmetics.getCheckIfArmourIsOn().setHelmet(true);
                }
                case 11 -> {
                    helmetMeta(player, Color.ORANGE);
                    cosmetics.getCheckIfArmourIsOn().setHelmet(true);
                }
                case 12 -> {
                    helmetMeta(player, Color.PURPLE);
                    cosmetics.getCheckIfArmourIsOn().setHelmet(true);
                }
                case 13 -> {
                    helmetMeta(player, Color.RED);
                    cosmetics.getCheckIfArmourIsOn().setHelmet(true);
                }
                case 14 -> {
                    helmetMeta(player, Color.SILVER);
                    cosmetics.getCheckIfArmourIsOn().setHelmet(true);
                }
                case 15 -> {
                    helmetMeta(player, Color.TEAL);
                    cosmetics.getCheckIfArmourIsOn().setHelmet(true);
                }
                case 16 -> {
                    helmetMeta(player, Color.WHITE);
                    cosmetics.getCheckIfArmourIsOn().setHelmet(true);
                }
                case 17 -> {
                    helmetMeta(player, Color.YELLOW);
                    cosmetics.getCheckIfArmourIsOn().setHelmet(true);
                }
                case 18 -> StartInv.startInv(player);
            }
        }
    }

    private static void helmetMeta(Player player, Color color) {
        ItemStack stack = new ItemStack(Material.LEATHER_HELMET);
        LeatherArmorMeta leatherArmorMeta = (LeatherArmorMeta) stack.getItemMeta();
        leatherArmorMeta.setColor(color);
        stack.setItemMeta(leatherArmorMeta);

        player.getInventory().setHelmet(stack);
    }
}
