package lemmensthijmen.cosmetics;

import lemmensthijmen.cosmetics.ClickEvents.*;
import lemmensthijmen.cosmetics.Commands.CosmeticsCommand;
import lemmensthijmen.cosmetics.Events.CancelClick;
import lemmensthijmen.cosmetics.Events.InteractWithChest;
import lemmensthijmen.cosmetics.Events.PlayerJoin;
import lemmensthijmen.cosmetics.Events.SwitchWorldEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Cosmetics extends JavaPlugin {

    private CheckIfArmourIsOn checkIfArmourIsOn;

    @Override
    public void onEnable() {
        checkIfArmourIsOn = new CheckIfArmourIsOn();
        getServer().getPluginManager().registerEvents(new InteractWithChest(), this);
        getServer().getPluginManager().registerEvents(new PlayerJoin(), this);
        getServer().getPluginManager().registerEvents(new CancelClick(), this);
        new ClickEventStartInv(this);
        new ClickEventBootsInv(this);
        new ClickEventHelmetInv(this);
        new ClickEventLeggingsInv(this);
        new ClickEventChestplate(this);
        new ClickEventPlayerHeadsInv(this);
        new CosmeticsCommand(this);
        new SwitchWorldEvent(this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public CheckIfArmourIsOn getCheckIfArmourIsOn() {
        return checkIfArmourIsOn;
    }
}
