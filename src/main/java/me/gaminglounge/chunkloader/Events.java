package me.gaminglounge.chunkloader;

import me.gaminglounge.itembuilder.ItemBuilderManager;

public class Events {

    public Events() {

        ItemBuilderManager.addBlockPlaceEvent("chunkloader:add", (e) -> {
            e.getBlock().getWorld().setChunkForceLoaded(e.getBlock().getChunk().getX(), e.getBlock().getChunk().getZ(),
                    true);
        });

        ItemBuilderManager.addBlockBreakEvent("chunkloader:remove", (e) -> {
            e.getBlock().getWorld().setChunkForceLoaded(e.getBlock().getChunk().getX(), e.getBlock().getChunk().getZ(),
                    false);
        });

    }

}
