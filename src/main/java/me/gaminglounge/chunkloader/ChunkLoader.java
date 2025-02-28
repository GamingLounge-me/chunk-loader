package me.gaminglounge.chunkloader;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import me.gaminglounge.itembuilder.ItemBuilder;
import net.kyori.adventure.text.minimessage.MiniMessage;

public final class ChunkLoader extends JavaPlugin {

    public static ChunkLoader INSTANCE;

    public static ItemStack CHUNKLOADER = new ItemBuilder(Material.DIAMOND_BLOCK)
            .setName(MiniMessage.miniMessage().deserialize("ChunkLoader"))
            .addBlockPlaceEvent("chunkloader:add")
            .addBlockBreakEvent("chunkloader:remove")
            .build();

    @Override
    public void onLoad() {
        INSTANCE = this;

        new Events();

    }

    @Override
    public void onEnable() {
        // this.listener();
    }

    @Override
    public void onDisable() {

    }

    public void listener() {
        PluginManager pm = getServer().getPluginManager();

        // pm.registerEvents(new InvClickEvent(), this);
    }
}
