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

    public static final DeferredHolder<Item, Item> CREAKING_MASK = ITEMS.register("creaking_mask", () -> new CreakingSorcererArmorItem(ArmorItem.Type.HELMET, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.HELMET.getDurability(19))));
    public static final DeferredHolder<Item, Item> CREAKING_CHESTPLATE = ITEMS.register("creaking_chestplate", () -> new CreakingSorcererArmorItem(ArmorItem.Type.CHESTPLATE, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.CHESTPLATE.getDurability(19))));
    public static final DeferredHolder<Item, Item> CREAKING_LEGGINGS = ITEMS.register("creaking_leggings", () -> new CreakingSorcererArmorItem(ArmorItem.Type.LEGGINGS, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.LEGGINGS.getDurability(19))));
    public static final DeferredHolder<Item, Item> CREAKING_BOOTS = ITEMS.register("creaking_boots", () -> new CreakingSorcererArmorItem(ArmorItem.Type.BOOTS, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.BOOTS.getDurability(19))));

    //Seraph Armor

    public static final DeferredHolder<Item, Item> SERAPH_VISOR = ITEMS.register("seraph_visor", () -> new SeraphArmorItem(ArmorItem.Type.HELMET, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.HELMET.getDurability(19))));
    public static final DeferredHolder<Item, Item> SERAPH_BREASTPLATE = ITEMS.register("seraph_breastplate", () -> new SeraphArmorItem(ArmorItem.Type.CHESTPLATE, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.CHESTPLATE.getDurability(19))));
    public static final DeferredHolder<Item, Item> SERAPH_LEGGINGS = ITEMS.register("seraph_leggings", () -> new SeraphArmorItem(ArmorItem.Type.LEGGINGS, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.LEGGINGS.getDurability(19))));
    public static final DeferredHolder<Item, Item> SERAPH_TRACERS = ITEMS.register("seraph_tracers", () -> new SeraphArmorItem(ArmorItem.Type.BOOTS, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.BOOTS.getDurability(19))));

    //Legionnaire Armor

    public static final DeferredHolder<Item, Item> LEGIONNAIRE_CROWN = ITEMS.register("legionnaire_crown", () -> new LegionnaireArmorItem(ArmorItem.Type.HELMET, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.HELMET.getDurability(19))));
    public static final DeferredHolder<Item, Item> LEGIONNAIRE_BREASTPLATE = ITEMS.register("legionnaire_breastplate", () -> new LegionnaireArmorItem(ArmorItem.Type.CHESTPLATE, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.CHESTPLATE.getDurability(19))));
    public static final DeferredHolder<Item, Item> LEGIONNAIRE_LEGGINGS = ITEMS.register("legionnaire_leggings", () -> new LegionnaireArmorItem(ArmorItem.Type.LEGGINGS, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.LEGGINGS.getDurability(19))));
    public static final DeferredHolder<Item, Item> LEGIONNAIRE_BOOTS = ITEMS.register("legionnaire_boots", () -> new LegionnaireArmorItem(ArmorItem.Type.BOOTS, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.BOOTS.getDurability(19))));


    public static final DeferredHolder<Item, Item> CHARGED_SCOURGE_MASK = ITEMS.register("charged_scourge_mask", () -> new ChargedScourgeArmorItem(ArmorItem.Type.HELMET, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.HELMET.getDurability(19))));
    public static final DeferredHolder<Item, Item> CHARGED_SCOURGE_SCALE_MAIL = ITEMS.register("charged_scourge_scale_mail", () -> new ChargedScourgeArmorItem(ArmorItem.Type.CHESTPLATE, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.CHESTPLATE.getDurability(19))));
    public static final DeferredHolder<Item, Item> CHARGED_SCOURGE_KNEEPADS = ITEMS.register("charged_scourge_kneepads", () -> new ChargedScourgeArmorItem(ArmorItem.Type.LEGGINGS, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.LEGGINGS.getDurability(19))));
    public static final DeferredHolder<Item, Item> CHARGED_SCOURGE_TREADS = ITEMS.register("charged_scourge_treads", () -> new ChargedScourgeArmorItem(ArmorItem.Type.BOOTS, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.BOOTS.getDurability(19))));


    //Soul Flame Armor

    public static final DeferredHolder<Item, Item> SOUL_FLAME_MASK = ITEMS.register("soul_flame_mask", () -> new SoulFlameArmorItem(ArmorItem.Type.HELMET, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.HELMET.getDurability(19))));
    public static final DeferredHolder<Item, Item> SOUL_FLAME_CHESTPLATE = ITEMS.register("soul_flame_chestplate", () -> new SoulFlameArmorItem(ArmorItem.Type.CHESTPLATE, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.CHESTPLATE.getDurability(19))));
    public static final DeferredHolder<Item, Item> SOUL_FLAME_LEGGINGS = ITEMS.register("soul_flame_leggings", () -> new SoulFlameArmorItem(ArmorItem.Type.LEGGINGS, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.LEGGINGS.getDurability(19))));
    public static final DeferredHolder<Item, Item> SOUL_FLAME_TRACERS = ITEMS.register("soul_flame_tracers", () -> new SoulFlameArmorItem(ArmorItem.Type.BOOTS, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.BOOTS.getDurability(19))));

    //Supreme Witch Armor

    public static final DeferredHolder<Item, Item> SUPREME_WITCH_HAT = ITEMS.register("supreme_witch_hat", () -> new SupremeWitchArmorItem(ArmorItem.Type.HELMET, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.HELMET.getDurability(19))));
    public static final DeferredHolder<Item, Item> SUPREME_WITCH_ROBES = ITEMS.register("supreme_witch_robes", () -> new SupremeWitchArmorItem(ArmorItem.Type.CHESTPLATE, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.CHESTPLATE.getDurability(19))));
    public static final DeferredHolder<Item, Item> SUPREME_WITCH_LEGGINGS = ITEMS.register("supreme_witch_leggings", () -> new SupremeWitchArmorItem(ArmorItem.Type.LEGGINGS, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.LEGGINGS.getDurability(19))));
    public static final DeferredHolder<Item, Item> SUPREME_WITCH_BOOTS = ITEMS.register("supreme_witch_boots", () -> new SupremeWitchArmorItem(ArmorItem.Type.BOOTS, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.BOOTS.getDurability(19))));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
