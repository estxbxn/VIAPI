package net.vadamdev.viaapi.api.inv.content;

import org.bukkit.entity.Player;

public interface InventoryProvider {
    void init(Player player, InventoryContents contents);
    default void update(Player player, InventoryContents contents) {}
}
