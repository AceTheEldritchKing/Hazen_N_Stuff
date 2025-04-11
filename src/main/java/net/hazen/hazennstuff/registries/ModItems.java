package net.hazen.hazennstuff.registries;

import io.redspace.ironsspellbooks.api.item.weapons.ExtendedSwordItem;
import io.redspace.ironsspellbooks.api.item.weapons.MagicSwordItem;
import io.redspace.ironsspellbooks.api.registry.SpellDataRegistryHolder;
import io.redspace.ironsspellbooks.api.registry.SpellRegistry;
import io.redspace.ironsspellbooks.util.ItemPropertiesHelper;
import net.hazen.hazennstuff.HazenNStuff;
import net.hazen.hazennstuff.item.armor.*;
import net.hazen.hazennstuff.item.curios.RadianceCurio;
import net.hazen.hazennstuff.item.curios.RefinedCurio;
import net.hazen.hazennstuff.item.curios.ReinforcedCurio;
import net.hazen.hazennstuff.item.curios.RupturedCurio;
import net.hazen.hazennstuff.item.weapons.HNSExtendedWeaponTiers;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
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


    //Materials
    public static final DeferredItem<Item> ZENALITE = ITEMS.register("zenalite",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> RAWZENALITE = ITEMS.register("raw_zenalite",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STARKISSEDZENALITE = ITEMS.register("starkissed_zenalite",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DIVINE_MOLD = ITEMS.register("divine_mold",
            () -> new Item(new Item.Properties()));

    //Weapons
    public static final DeferredHolder<Item, Item> ICE_PIKE = ITEMS.register("ice_pike", () ->
            new MagicSwordItem(HNSExtendedWeaponTiers.ICE_PIKE, ItemPropertiesHelper.equipment().rarity(Rarity.RARE).attributes(ExtendedSwordItem.createAttributes(HNSExtendedWeaponTiers.ICE_PIKE)),
                    SpellDataRegistryHolder.of(new SpellDataRegistryHolder(SpellRegistry.ICE_SPIKES_SPELL, 10))));


    //Curios
    public static final DeferredItem<RupturedCurio> RUPTURED = ITEMS.register("ruptured", RupturedCurio::new);
    public static final DeferredItem<RefinedCurio> REFINED = ITEMS.register("refined", RefinedCurio::new);
    public static final DeferredItem<ReinforcedCurio> REINFORCED = ITEMS.register("reinforced", ReinforcedCurio::new);
    public static final DeferredItem<RadianceCurio> RADIANCE = ITEMS.register("radiance", RadianceCurio::new);


    //Armor

    //Creaking Armor

    public static final DeferredHolder<Item, Item> CREAKING_HELMET = ITEMS.register("creaking_helmet", () -> new CreakingSorcererArmorItem(ArmorItem.Type.HELMET, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.HELMET.getDurability(19))));
    public static final DeferredHolder<Item, Item> CREAKING_CHESTPLATE = ITEMS.register("creaking_chestplate", () -> new CreakingSorcererArmorItem(ArmorItem.Type.CHESTPLATE, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.CHESTPLATE.getDurability(19))));
    public static final DeferredHolder<Item, Item> CREAKING_LEGGINGS = ITEMS.register("creaking_leggings", () -> new CreakingSorcererArmorItem(ArmorItem.Type.LEGGINGS, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.LEGGINGS.getDurability(19))));
    public static final DeferredHolder<Item, Item> CREAKING_BOOTS = ITEMS.register("creaking_boots", () -> new CreakingSorcererArmorItem(ArmorItem.Type.BOOTS, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.BOOTS.getDurability(19))));

    //Seraph Armor

    public static final DeferredHolder<Item, Item> SERAPH_HELMET = ITEMS.register("seraph_helmet", () -> new SeraphArmorItem(ArmorItem.Type.HELMET, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.HELMET.getDurability(19))));
    public static final DeferredHolder<Item, Item> SERAPH_CHESTPLATE = ITEMS.register("seraph_chestplate", () -> new SeraphArmorItem(ArmorItem.Type.CHESTPLATE, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.CHESTPLATE.getDurability(19))));
    public static final DeferredHolder<Item, Item> SERAPH_LEGGINGS = ITEMS.register("seraph_leggings", () -> new SeraphArmorItem(ArmorItem.Type.LEGGINGS, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.LEGGINGS.getDurability(19))));
    public static final DeferredHolder<Item, Item> SERAPH_BOOTS = ITEMS.register("seraph_boots", () -> new SeraphArmorItem(ArmorItem.Type.BOOTS, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.BOOTS.getDurability(19))));

    //Legionnaire Armor

    public static final DeferredHolder<Item, Item> LEGIONNAIRE_HELMET = ITEMS.register("legionnaire_helmet", () -> new LegionnaireArmorItem(ArmorItem.Type.HELMET, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.HELMET.getDurability(19))));
    public static final DeferredHolder<Item, Item> LEGIONNAIRE_CHESTPLATE = ITEMS.register("legionnaire_chestplate", () -> new LegionnaireArmorItem(ArmorItem.Type.CHESTPLATE, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.CHESTPLATE.getDurability(19))));
    public static final DeferredHolder<Item, Item> LEGIONNAIRE_LEGGINGS = ITEMS.register("legionnaire_leggings", () -> new LegionnaireArmorItem(ArmorItem.Type.LEGGINGS, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.LEGGINGS.getDurability(19))));
    public static final DeferredHolder<Item, Item> LEGIONNAIRE_BOOTS = ITEMS.register("legionnaire_boots", () -> new LegionnaireArmorItem(ArmorItem.Type.BOOTS, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.BOOTS.getDurability(19))));


    public static final DeferredHolder<Item, Item> CHARGED_SCOURGE_HELMET = ITEMS.register("charged_scourge_helmet", () -> new ChargedScourgeArmorItem(ArmorItem.Type.HELMET, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.HELMET.getDurability(19))));
    public static final DeferredHolder<Item, Item> CHARGED_SCOURGE_CHESTPLATE = ITEMS.register("charged_scourge_chestplate", () -> new ChargedScourgeArmorItem(ArmorItem.Type.CHESTPLATE, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.CHESTPLATE.getDurability(19))));
    public static final DeferredHolder<Item, Item> CHARGED_SCOURGE_LEGGINGS = ITEMS.register("charged_scourge_leggings", () -> new ChargedScourgeArmorItem(ArmorItem.Type.LEGGINGS, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.LEGGINGS.getDurability(19))));
    public static final DeferredHolder<Item, Item> CHARGED_SCOURGE_BOOTS = ITEMS.register("charged_scourge_boots", () -> new ChargedScourgeArmorItem(ArmorItem.Type.BOOTS, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.BOOTS.getDurability(19))));


    //Soul Flame Armor

    public static final DeferredHolder<Item, Item> SOUL_FLAME_HELMET = ITEMS.register("soul_flame_helmet", () -> new SoulFlameArmorItem(ArmorItem.Type.HELMET, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.HELMET.getDurability(19))));
    public static final DeferredHolder<Item, Item> SOUL_FLAME_CHESTPLATE = ITEMS.register("soul_flame_chestplate", () -> new SoulFlameArmorItem(ArmorItem.Type.CHESTPLATE, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.CHESTPLATE.getDurability(19))));
    public static final DeferredHolder<Item, Item> SOUL_FLAME_LEGGINGS = ITEMS.register("soul_flame_leggings", () -> new SoulFlameArmorItem(ArmorItem.Type.LEGGINGS, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.LEGGINGS.getDurability(19))));
    public static final DeferredHolder<Item, Item> SOUL_FLAME_BOOTS = ITEMS.register("soul_flame_boots", () -> new SoulFlameArmorItem(ArmorItem.Type.BOOTS, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.BOOTS.getDurability(19))));

    //Supreme Witch Armor

    public static final DeferredHolder<Item, Item> SUPREME_WITCH_HELMET = ITEMS.register("supreme_witch_helmet", () -> new SupremeWitchArmorItem(ArmorItem.Type.HELMET, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.HELMET.getDurability(19))));
    public static final DeferredHolder<Item, Item> SUPREME_WITCH_CHESTPLATE = ITEMS.register("supreme_witch_chestplate", () -> new SupremeWitchArmorItem(ArmorItem.Type.CHESTPLATE, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.CHESTPLATE.getDurability(19))));
    public static final DeferredHolder<Item, Item> SUPREME_WITCH_LEGGINGS = ITEMS.register("supreme_witch_leggings", () -> new SupremeWitchArmorItem(ArmorItem.Type.LEGGINGS, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.LEGGINGS.getDurability(19))));
    public static final DeferredHolder<Item, Item> SUPREME_WITCH_BOOTS = ITEMS.register("supreme_witch_boots", () -> new SupremeWitchArmorItem(ArmorItem.Type.BOOTS, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.BOOTS.getDurability(19))));

    //Supreme Witch Armor

    public static final DeferredHolder<Item, Item> CRYOGENIC_RULER_HELMET = ITEMS.register("cryogenic_ruler_helmet", () -> new CryogenicRulerArmorItem(ArmorItem.Type.HELMET, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.HELMET.getDurability(19))));
    public static final DeferredHolder<Item, Item> CRYOGENIC_RULER_CHESTPLATE = ITEMS.register("cryogenic_ruler_chestplate", () -> new CryogenicRulerArmorItem(ArmorItem.Type.CHESTPLATE, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.CHESTPLATE.getDurability(19))));
    public static final DeferredHolder<Item, Item> CRYOGENIC_RULER_LEGGINGS = ITEMS.register("cryogenic_ruler_leggings", () -> new CryogenicRulerArmorItem(ArmorItem.Type.LEGGINGS, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.LEGGINGS.getDurability(19))));
    public static final DeferredHolder<Item, Item> CRYOGENIC_RULER_BOOTS = ITEMS.register("cryogenic_ruler_boots", () -> new CryogenicRulerArmorItem(ArmorItem.Type.BOOTS, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.BOOTS.getDurability(19))));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
