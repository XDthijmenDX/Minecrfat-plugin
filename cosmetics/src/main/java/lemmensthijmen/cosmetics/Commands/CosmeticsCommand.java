package lemmensthijmen.cosmetics.Commands;

import lemmensthijmen.cosmetics.Cosmetics;
import lemmensthijmen.cosmetics.Inventorys.StartInv;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CosmeticsCommand implements CommandExecutor {

    private Cosmetics cosmetics;

    public CosmeticsCommand(Cosmetics cosmetics) {
        this.cosmetics = cosmetics;
        cosmetics.getCommand("cosmetics").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            StartInv.startInv(player);
        } else {
            cosmetics.getLogger().info("Only Player cant do this!");
        }

        return false;
    }
}
