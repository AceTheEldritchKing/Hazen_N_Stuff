package net.hazen.hazennstuff.registries;

import io.redspace.ironsspellbooks.util.ItemPropertiesHelper;
import net.hazen.hazennstuff.HazenNStuff;
import net.hazen.hazennstuff.item.armor.CreakingSorcererArmorItem;
import net.hazen.hazennstuff.item.armor.ModArmorMaterials;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    // Ace comment here, but as a tip for organization, leave some comments for whatever section of
    // Items you want to be organized
    // In DTE, I use comment blocks to organize between different types of items I have (armor, weapons, staves, etc.)
    // Just a little info for you!
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(HazenNStuff.MOD_ID);

    public static final DeferredItem<Item> ZENALITE = ITEMS.register("zenalite",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> OMINOUSALLOY = ITEMS.register("ominous_alloy",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> RAWZENALITE = ITEMS.register("raw_zenalite",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STARKISSEDZENALITE = ITEMS.register("starkissed_zenalite",
            () -> new Item(new Item.Properties()));

    /*public static final DeferredItem<ArmorItem> CREAKIN_MASK = ITEMS.register("creaking_mask",
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
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(19))));*/

    public static final DeferredHolder<Item, Item> CREAKIN_MASK = ITEMS.register("creaking_mask", () -> new CreakingSorcererArmorItem(ArmorItem.Type.HELMET, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.HELMET.getDurability(19))));
    public static final DeferredHolder<Item, Item> CREAKIN_CHESTPLATE = ITEMS.register("creaking_chestplate", () -> new CreakingSorcererArmorItem(ArmorItem.Type.CHESTPLATE, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.CHESTPLATE.getDurability(19))));
    public static final DeferredHolder<Item, Item> CREAKIN_LEGGINGS = ITEMS.register("creaking_leggings", () -> new CreakingSorcererArmorItem(ArmorItem.Type.LEGGINGS, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.LEGGINGS.getDurability(19))));
    public static final DeferredHolder<Item, Item> CREAKIN_BOOTS = ITEMS.register("creaking_boots", () -> new CreakingSorcererArmorItem(ArmorItem.Type.BOOTS, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.BOOTS.getDurability(19))));

        /*public static final DeferredItem<ArmorItem> SERAPH_VISOR = ITEMS.register("seraph_visor",
            () -> new ArmorItem(ModArmorMaterials.SERAPH_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(19))));
    public static final DeferredItem<ArmorItem> SERAPH_BREASTPLATE = ITEMS.register("seraph_breastplate",
            () -> new ArmorItem(ModArmorMaterials.SERAPH_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(19))));
    public static final DeferredItem<ArmorItem> SERAPH_LEGGINGS = ITEMS.register("seraph_leggings",
            () -> new ArmorItem(ModArmorMaterials.SERAPH_ARMOR_MATERIALL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(19))));
    public static final DeferredItem<ArmorItem> SERAPH_TRACERS = ITEMS.register("seraph_tracers",
            () -> new ArmorItem(ModArmorMaterials.SERAPH_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(19))));*/

    public static final DeferredHolder<Item, Item> SERAPH_VISOR = ITEMS.register("seraph_visor", () -> new CreakingSorcererArmorItem(ArmorItem.Type.HELMET, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.HELMET.getDurability(19))));
    public static final DeferredHolder<Item, Item> SERAPH_BREASTPLATE = ITEMS.register("seraph_breastplate", () -> new CreakingSorcererArmorItem(ArmorItem.Type.CHESTPLATE, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.CHESTPLATE.getDurability(19))));
    public static final DeferredHolder<Item, Item> SERAPH_LEGGINGS = ITEMS.register("seraph_leggings", () -> new CreakingSorcererArmorItem(ArmorItem.Type.LEGGINGS, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.LEGGINGS.getDurability(19))));
    public static final DeferredHolder<Item, Item> SERAPH_TRACERS = ITEMS.register("seraph_tracers", () -> new CreakingSorcererArmorItem(ArmorItem.Type.BOOTS, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.BOOTS.getDurability(19))));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
