package net.hazen.hazennstuff.item;

import net.hazen.hazennstuff.HazenNStuff;
import net.minecraft.world.item.ArmorItem;
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

    public static final DeferredItem<ArmorItem> CREAKIN_MASK = ITEMS.register("creaking_mask",
            () -> new ArmorItem(ModArmorMaterials.CREAKING_SORCERER_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(19))));
    public static final DeferredItem<ArmorItem> CREAKIN_CHESTPLATE = ITEMS.register("creaking_chestplate",
            () -> new ArmorItem(ModArmorMaterials.CREAKING_SORCERER_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(19))));
    public static final DeferredItem<ArmorItem> CREAKIN_LEGGINGS = ITEMS.register("creaking_leggings",
            () -> new ArmorItem(ModArmorMaterials.CREAKING_SORCERER_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(19))));
    public static final DeferredItem<ArmorItem> CREAKIN_BOOTS = ITEMS.register("creaking_boots",
            () -> new ArmorItem(ModArmorMaterials.CREAKING_SORCERER_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(19))));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
