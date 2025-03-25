package net.hazen.hazennstuff.item;

import net.hazen.hazennstuff.HazenNStuff;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(HazenNStuff.MOD_ID);

    public static final DeferredItem<Item> ZENALITE = ITEMS.register("zenalite",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> OMINOUSALLOY = ITEMS.register("ominous_alloy",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> RAWZENALITE = ITEMS.register("raw_zenalite",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STARKISSEDZENALITE = ITEMS.register("starkissed_zenalite",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
