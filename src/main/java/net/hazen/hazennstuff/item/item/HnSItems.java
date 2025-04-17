package net.hazen.hazennstuff.item.item;

import io.redspace.ironsspellbooks.api.item.weapons.ExtendedSwordItem;
import io.redspace.ironsspellbooks.api.item.weapons.MagicSwordItem;
import io.redspace.ironsspellbooks.api.registry.SpellDataRegistryHolder;
import io.redspace.ironsspellbooks.api.registry.SpellRegistry;
import io.redspace.ironsspellbooks.util.ItemPropertiesHelper;
import net.hazen.hazennstuff.HazenNStuff;
import net.hazen.hazennstuff.item.armor.*;
import net.hazen.hazennstuff.item.armor.Geckolib.*;
import net.hazen.hazennstuff.item.curios.*;
import net.hazen.hazennstuff.item.weapons.HNSExtendedWeaponTiers;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class HnSItems {
    // Ace comment here, but as a tip for organization, leave some comments for whatever section of
    // Items you want to be organized
    // In DTE, I use comment blocks to organize between different types of items I have (armor, weapons, staves, etc.)
    // Just a little info for you!
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(HazenNStuff.MOD_ID);


    //Materials
    public static final DeferredItem<Item> ZENALITE_INGOT = ITEMS.register("zenalite_ingot",
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

    //Elf Ears
    public static final DeferredItem<EarsACurio> EARS_A = ITEMS.register("ears_a", EarsACurio::new);

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

    //Charged Scourge Armor

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

    //Cryogenic Ruler Armor

    public static final DeferredHolder<Item, Item> CRYOGENIC_RULER_HELMET = ITEMS.register("cryogenic_ruler_helmet", () -> new CryogenicRulerArmorItem(ArmorItem.Type.HELMET, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.HELMET.getDurability(19))));
    public static final DeferredHolder<Item, Item> CRYOGENIC_RULER_CHESTPLATE = ITEMS.register("cryogenic_ruler_chestplate", () -> new CryogenicRulerArmorItem(ArmorItem.Type.CHESTPLATE, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.CHESTPLATE.getDurability(19))));
    public static final DeferredHolder<Item, Item> CRYOGENIC_RULER_LEGGINGS = ITEMS.register("cryogenic_ruler_leggings", () -> new CryogenicRulerArmorItem(ArmorItem.Type.LEGGINGS, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.LEGGINGS.getDurability(19))));
    public static final DeferredHolder<Item, Item> CRYOGENIC_RULER_BOOTS = ITEMS.register("cryogenic_ruler_boots", () -> new CryogenicRulerArmorItem(ArmorItem.Type.BOOTS, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.BOOTS.getDurability(19))));

    //Flesh Mass Armor

    public static final DeferredHolder<Item, Item> FLESH_MASS_HELMET = ITEMS.register("flesh_mass_helmet", () -> new FleshMassArmorItem(ArmorItem.Type.HELMET, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.HELMET.getDurability(19))));
    public static final DeferredHolder<Item, Item> FLESH_MASS_CHESTPLATE = ITEMS.register("flesh_mass_chestplate", () -> new FleshMassArmorItem(ArmorItem.Type.CHESTPLATE, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.CHESTPLATE.getDurability(19))));
    public static final DeferredHolder<Item, Item> FLESH_MASS_LEGGINGS = ITEMS.register("flesh_mass_leggings", () -> new FleshMassArmorItem(ArmorItem.Type.LEGGINGS, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.LEGGINGS.getDurability(19))));
    public static final DeferredHolder<Item, Item> FLESH_MASS_BOOTS = ITEMS.register("flesh_mass_boots", () -> new FleshMassArmorItem(ArmorItem.Type.BOOTS, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.BOOTS.getDurability(19))));

    //Ender Dragon Armor

    public static final DeferredHolder<Item, Item> ENDER_DRAGON_HELMET = ITEMS.register("ender_dragon_helmet", () -> new EnderDragonArmorItem(ArmorItem.Type.HELMET, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.HELMET.getDurability(19))));
    public static final DeferredHolder<Item, Item> ENDER_DRAGON_CHESTPLATE = ITEMS.register("ender_dragon_chestplate", () -> new EnderDragonArmorItem(ArmorItem.Type.CHESTPLATE, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.CHESTPLATE.getDurability(19))));
    public static final DeferredHolder<Item, Item> ENDER_DRAGON_LEGGINGS = ITEMS.register("ender_dragon_leggings", () -> new EnderDragonArmorItem(ArmorItem.Type.LEGGINGS, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.LEGGINGS.getDurability(19))));
    public static final DeferredHolder<Item, Item> ENDER_DRAGON_BOOTS = ITEMS.register("ender_dragon_boots", () -> new EnderDragonArmorItem(ArmorItem.Type.BOOTS, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.BOOTS.getDurability(19))));

    //Dark Ritual Templar Armor

    public static final DeferredHolder<Item, Item> DARK_RITUAL_TEMPLAR_HELMET = ITEMS.register("dark_ritual_templar_helmet", () -> new DarkRitualTemplarArmorItem(ArmorItem.Type.HELMET, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.HELMET.getDurability(19))));
    public static final DeferredHolder<Item, Item> DARK_RITUAL_TEMPLAR_CHESTPLATE = ITEMS.register("dark_ritual_templar_chestplate", () -> new DarkRitualTemplarArmorItem(ArmorItem.Type.CHESTPLATE, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.CHESTPLATE.getDurability(19))));
    public static final DeferredHolder<Item, Item> DARK_RITUAL_TEMPLAR_LEGGINGS = ITEMS.register("dark_ritual_templar_leggings", () -> new DarkRitualTemplarArmorItem(ArmorItem.Type.LEGGINGS, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.LEGGINGS.getDurability(19))));
    public static final DeferredHolder<Item, Item> DARK_RITUAL_TEMPLAR_BOOTS = ITEMS.register("dark_ritual_templar_boots", () -> new DarkRitualTemplarArmorItem(ArmorItem.Type.BOOTS, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.BOOTS.getDurability(19))));

    // Geckolib

    //Frieren Armor

    public static final DeferredHolder<Item, Item> FRIEREN_HELMET = ITEMS.register("frieren_helmet", () -> new GeckolibFrierenArmorItem(ArmorItem.Type.HELMET, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.HELMET.getDurability(19))));
    public static final DeferredHolder<Item, Item> FRIEREN_CHESTPLATE = ITEMS.register("frieren_chestplate", () -> new GeckolibFrierenArmorItem(ArmorItem.Type.CHESTPLATE, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.CHESTPLATE.getDurability(19))));
    public static final DeferredHolder<Item, Item> FRIEREN_LEGGINGS = ITEMS.register("frieren_leggings", () -> new GeckolibFrierenArmorItem(ArmorItem.Type.LEGGINGS, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.LEGGINGS.getDurability(19))));
    public static final DeferredHolder<Item, Item> FRIEREN_BOOTS = ITEMS.register("frieren_boots", () -> new GeckolibFrierenArmorItem(ArmorItem.Type.BOOTS, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.BOOTS.getDurability(19))));

    //Legionnaire Armor

    public static final DeferredHolder<Item, Item> LEGIONNAIRE_HELMET = ITEMS.register("legionnaire_helmet", () -> new GeckolibLegionnaireArmorItem(ArmorItem.Type.HELMET, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.HELMET.getDurability(19))));
    public static final DeferredHolder<Item, Item> LEGIONNAIRE_CHESTPLATE = ITEMS.register("legionnaire_chestplate", () -> new GeckolibLegionnaireArmorItem(ArmorItem.Type.CHESTPLATE, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.CHESTPLATE.getDurability(19))));
    public static final DeferredHolder<Item, Item> LEGIONNAIRE_LEGGINGS = ITEMS.register("legionnaire_leggings", () -> new GeckolibLegionnaireArmorItem(ArmorItem.Type.LEGGINGS, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.LEGGINGS.getDurability(19))));
    public static final DeferredHolder<Item, Item> LEGIONNAIRE_BOOTS = ITEMS.register("legionnaire_boots", () -> new GeckolibLegionnaireArmorItem(ArmorItem.Type.BOOTS, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.BOOTS.getDurability(19))));

    //Synthesizer V Armor

    public static final DeferredHolder<Item, Item> SYNTHESIZER_V_HELMET = ITEMS.register("synthesizer_v_helmet", () -> new GeckolibSynthesizerVArmorItem(ArmorItem.Type.HELMET, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.HELMET.getDurability(19))));
    public static final DeferredHolder<Item, Item> SYNTHESIZER_V_CHESTPLATE = ITEMS.register("synthesizer_v_chestplate", () -> new GeckolibSynthesizerVArmorItem(ArmorItem.Type.CHESTPLATE, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.CHESTPLATE.getDurability(19))));
    public static final DeferredHolder<Item, Item> SYNTHESIZER_V_LEGGINGS = ITEMS.register("synthesizer_v_leggings", () -> new GeckolibSynthesizerVArmorItem(ArmorItem.Type.LEGGINGS, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.LEGGINGS.getDurability(19))));
    public static final DeferredHolder<Item, Item> SYNTHESIZER_V_BOOTS = ITEMS.register("synthesizer_v_boots", () -> new GeckolibSynthesizerVArmorItem(ArmorItem.Type.BOOTS, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.BOOTS.getDurability(19))));

    //Utau Armor

    public static final DeferredHolder<Item, Item> UTAU_HELMET = ITEMS.register("utau_helmet", () -> new GeckolibUtauArmorItem(ArmorItem.Type.HELMET, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.HELMET.getDurability(19))));
    public static final DeferredHolder<Item, Item> UTAU_CHESTPLATE = ITEMS.register("utau_chestplate", () -> new GeckolibUtauArmorItem(ArmorItem.Type.CHESTPLATE, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.CHESTPLATE.getDurability(19))));
    public static final DeferredHolder<Item, Item> UTAU_LEGGINGS = ITEMS.register("utau_leggings", () -> new GeckolibUtauArmorItem(ArmorItem.Type.LEGGINGS, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.LEGGINGS.getDurability(19))));
    public static final DeferredHolder<Item, Item> UTAU_BOOTS = ITEMS.register("utau_boots", () -> new GeckolibUtauArmorItem(ArmorItem.Type.BOOTS, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.BOOTS.getDurability(19))));


    //Geckolib Dark Ritual Templar Armor

    public static final DeferredHolder<Item, Item> GECKOLIB_DARK_RITUAL_TEMPLAR_HELMET = ITEMS.register("geckolib_dark_ritual_templar_helmet", () -> new GeckolibDarkRitualTemplarArmorItem(ArmorItem.Type.HELMET, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.HELMET.getDurability(19))));
    public static final DeferredHolder<Item, Item> GECKOLIB_DARK_RITUAL_TEMPLAR_CHESTPLATE = ITEMS.register("geckolib_dark_ritual_templar_chestplate", () -> new GeckolibDarkRitualTemplarArmorItem(ArmorItem.Type.CHESTPLATE, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.CHESTPLATE.getDurability(19))));
    public static final DeferredHolder<Item, Item> GECKOLIB_DARK_RITUAL_TEMPLAR_LEGGINGS = ITEMS.register("geckolib_dark_ritual_templar_leggings", () -> new GeckolibDarkRitualTemplarArmorItem(ArmorItem.Type.LEGGINGS, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.LEGGINGS.getDurability(19))));
    public static final DeferredHolder<Item, Item> GECKOLIB_DARK_RITUAL_TEMPLAR_BOOTS = ITEMS.register("geckolib_dark_ritual_templar_boots", () -> new GeckolibDarkRitualTemplarArmorItem(ArmorItem.Type.BOOTS, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.BOOTS.getDurability(19))));

    //Geckolib Creaking Armor

    public static final DeferredHolder<Item, Item> GECKOLIB_CREAKING_HELMET = ITEMS.register("geckolib_creaking_helmet", () -> new GeckolibCreakingSorcererArmorItem(ArmorItem.Type.HELMET, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.HELMET.getDurability(19))));
    public static final DeferredHolder<Item, Item> GECKOLIB_CREAKING_CHESTPLATE = ITEMS.register("geckolib_creaking_chestplate", () -> new GeckolibCreakingSorcererArmorItem(ArmorItem.Type.CHESTPLATE, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.CHESTPLATE.getDurability(19))));
    public static final DeferredHolder<Item, Item> GECKOLIB_CREAKING_LEGGINGS = ITEMS.register("geckolib_creaking_leggings", () -> new GeckolibCreakingSorcererArmorItem(ArmorItem.Type.LEGGINGS, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.LEGGINGS.getDurability(19))));
    public static final DeferredHolder<Item, Item> GECKOLIB_CREAKING_BOOTS = ITEMS.register("geckolib_creaking_boots", () -> new GeckolibCreakingSorcererArmorItem(ArmorItem.Type.BOOTS, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.BOOTS.getDurability(19))));

    //Geckolib Seraph Armor

    public static final DeferredHolder<Item, Item> GECKOLIB_SERAPH_HELMET = ITEMS.register("geckolib_seraph_helmet", () -> new GeckolibSeraphArmorItem(ArmorItem.Type.HELMET, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.HELMET.getDurability(19))));
    public static final DeferredHolder<Item, Item> GECKOLIB_SERAPH_CHESTPLATE = ITEMS.register("geckolib_seraph_chestplate", () -> new GeckolibSeraphArmorItem(ArmorItem.Type.CHESTPLATE, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.CHESTPLATE.getDurability(19))));
    public static final DeferredHolder<Item, Item> GECKOLIB_SERAPH_LEGGINGS = ITEMS.register("geckolib_seraph_leggings", () -> new GeckolibSeraphArmorItem(ArmorItem.Type.LEGGINGS, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.LEGGINGS.getDurability(19))));
    public static final DeferredHolder<Item, Item> GECKOLIB_SERAPH_BOOTS = ITEMS.register("geckolib_seraph_boots", () -> new GeckolibSeraphArmorItem(ArmorItem.Type.BOOTS, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.BOOTS.getDurability(19))));

    //Geckolib Charged Scourge Armor

    public static final DeferredHolder<Item, Item> GECKOLIB_CHARGED_SCOURGE_HELMET = ITEMS.register("geckolib_charged_scourge_helmet", () -> new GeckolibChargedScourgeArmorItem(ArmorItem.Type.HELMET, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.HELMET.getDurability(19))));
    public static final DeferredHolder<Item, Item> GECKOLIB_CHARGED_SCOURGE_CHESTPLATE = ITEMS.register("geckolib_charged_scourge_chestplate", () -> new GeckolibChargedScourgeArmorItem(ArmorItem.Type.CHESTPLATE, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.CHESTPLATE.getDurability(19))));
    public static final DeferredHolder<Item, Item> GECKOLIB_CHARGED_SCOURGE_LEGGINGS = ITEMS.register("geckolib_charged_scourge_leggings", () -> new GeckolibChargedScourgeArmorItem(ArmorItem.Type.LEGGINGS, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.LEGGINGS.getDurability(19))));
    public static final DeferredHolder<Item, Item> GECKOLIB_CHARGED_SCOURGE_BOOTS = ITEMS.register("geckolib_charged_scourge_boots", () -> new GeckolibChargedScourgeArmorItem(ArmorItem.Type.BOOTS, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.BOOTS.getDurability(19))));


    //Geckolib Soul Flame Armor

    public static final DeferredHolder<Item, Item> GECKOLIB_SOUL_FLAME_HELMET = ITEMS.register("geckolib_soul_flame_helmet", () -> new GeckolibSoulFlameArmorItem(ArmorItem.Type.HELMET, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.HELMET.getDurability(19))));
    public static final DeferredHolder<Item, Item> GECKOLIB_SOUL_FLAME_CHESTPLATE = ITEMS.register("geckolib_soul_flame_chestplate", () -> new GeckolibSoulFlameArmorItem(ArmorItem.Type.CHESTPLATE, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.CHESTPLATE.getDurability(19))));
    public static final DeferredHolder<Item, Item> GECKOLIB_SOUL_FLAME_LEGGINGS = ITEMS.register("geckolib_soul_flame_leggings", () -> new GeckolibSoulFlameArmorItem(ArmorItem.Type.LEGGINGS, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.LEGGINGS.getDurability(19))));
    public static final DeferredHolder<Item, Item> GECKOLIB_SOUL_FLAME_BOOTS = ITEMS.register("geckolib_soul_flame_boots", () -> new GeckolibSoulFlameArmorItem(ArmorItem.Type.BOOTS, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.BOOTS.getDurability(19))));

    //Geckolib Supreme Witch Armor

    public static final DeferredHolder<Item, Item> GECKOLIB_SUPREME_WITCH_HELMET = ITEMS.register("geckolib_supreme_witch_helmet", () -> new GeckolibSupremeWitchArmorItem(ArmorItem.Type.HELMET, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.HELMET.getDurability(19))));
    public static final DeferredHolder<Item, Item> GECKOLIB_SUPREME_WITCH_CHESTPLATE = ITEMS.register("geckolib_supreme_witch_chestplate", () -> new GeckolibSupremeWitchArmorItem(ArmorItem.Type.CHESTPLATE, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.CHESTPLATE.getDurability(19))));
    public static final DeferredHolder<Item, Item> GECKOLIB_SUPREME_WITCH_LEGGINGS = ITEMS.register("geckolib_supreme_witch_leggings", () -> new GeckolibSupremeWitchArmorItem(ArmorItem.Type.LEGGINGS, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.LEGGINGS.getDurability(19))));
    public static final DeferredHolder<Item, Item> GECKOLIB_SUPREME_WITCH_BOOTS = ITEMS.register("geckolib_supreme_witch_boots", () -> new GeckolibSupremeWitchArmorItem(ArmorItem.Type.BOOTS, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.BOOTS.getDurability(19))));

    //Geckolib Cryogenic Ruler Armor

    public static final DeferredHolder<Item, Item> GECKOLIB_CRYOGENIC_RULER_HELMET = ITEMS.register("geckolib_cryogenic_ruler_helmet", () -> new GeckolibCryogenicRulerArmorItem(ArmorItem.Type.HELMET, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.HELMET.getDurability(19))));
    public static final DeferredHolder<Item, Item> GECKOLIB_CRYOGENIC_RULER_CHESTPLATE = ITEMS.register("geckolib_cryogenic_ruler_chestplate", () -> new GeckolibCryogenicRulerArmorItem(ArmorItem.Type.CHESTPLATE, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.CHESTPLATE.getDurability(19))));
    public static final DeferredHolder<Item, Item> GECKOLIB_CRYOGENIC_RULER_LEGGINGS = ITEMS.register("geckolib_cryogenic_ruler_leggings", () -> new GeckolibCryogenicRulerArmorItem(ArmorItem.Type.LEGGINGS, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.LEGGINGS.getDurability(19))));
    public static final DeferredHolder<Item, Item> GECKOLIB_CRYOGENIC_RULER_BOOTS = ITEMS.register("geckolib_cryogenic_ruler_boots", () -> new GeckolibCryogenicRulerArmorItem(ArmorItem.Type.BOOTS, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.BOOTS.getDurability(19))));

    //Geckolib Flesh Mass Armor

    public static final DeferredHolder<Item, Item> GECKOLIB_FLESH_MASS_HELMET = ITEMS.register("geckolib_flesh_mass_helmet", () -> new GeckolibFleshMassArmorItem(ArmorItem.Type.HELMET, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.HELMET.getDurability(19))));
    public static final DeferredHolder<Item, Item> GECKOLIB_FLESH_MASS_CHESTPLATE = ITEMS.register("geckolib_flesh_mass_chestplate", () -> new GeckolibFleshMassArmorItem(ArmorItem.Type.CHESTPLATE, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.CHESTPLATE.getDurability(19))));
    public static final DeferredHolder<Item, Item> GECKOLIB_FLESH_MASS_LEGGINGS = ITEMS.register("geckolib_flesh_mass_leggings", () -> new GeckolibFleshMassArmorItem(ArmorItem.Type.LEGGINGS, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.LEGGINGS.getDurability(19))));
    public static final DeferredHolder<Item, Item> GECKOLIB_FLESH_MASS_BOOTS = ITEMS.register("geckolib_flesh_mass_boots", () -> new GeckolibFleshMassArmorItem(ArmorItem.Type.BOOTS, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.BOOTS.getDurability(19))));


    //Geckolib Ender Dragon Armor

    public static final DeferredHolder<Item, Item> GECKOLIB_ENDER_DRAGON_HELMET = ITEMS.register("geckolib_ender_dragon_helmet", () -> new GeckolibEnderDragonArmorItem(ArmorItem.Type.HELMET, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.HELMET.getDurability(19))));
    public static final DeferredHolder<Item, Item> GECKOLIB_ENDER_DRAGON_CHESTPLATE = ITEMS.register("geckolib_ender_dragon_chestplate", () -> new GeckolibEnderDragonArmorItem(ArmorItem.Type.CHESTPLATE, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.CHESTPLATE.getDurability(19))));
    public static final DeferredHolder<Item, Item> GECKOLIB_ENDER_DRAGON_LEGGINGS = ITEMS.register("geckolib_ender_dragon_leggings", () -> new GeckolibEnderDragonArmorItem(ArmorItem.Type.LEGGINGS, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.LEGGINGS.getDurability(19))));
    public static final DeferredHolder<Item, Item> GECKOLIB_ENDER_DRAGON_BOOTS = ITEMS.register("geckolib_ender_dragon_boots", () -> new GeckolibEnderDragonArmorItem(ArmorItem.Type.BOOTS, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.BOOTS.getDurability(19))));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
