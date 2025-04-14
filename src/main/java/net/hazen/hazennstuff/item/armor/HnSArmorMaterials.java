package net.hazen.hazennstuff.item.armor;

import net.hazen.hazennstuff.HazenNStuff;
import net.hazen.hazennstuff.item.item.HnSItems;
import net.hazen.hazennstuff.sound.ModSounds;
import net.minecraft.Util;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class HnSArmorMaterials {
    private static final DeferredRegister<ArmorMaterial> ARMOR_MATERIALS = DeferredRegister.create(Registries.ARMOR_MATERIAL, HazenNStuff.MOD_ID);

    public static DeferredHolder<ArmorMaterial, ArmorMaterial> CREAKING_SORCERER_MATERIAL = register("creaking",
            warlockArmorMap(),
            16,
            ModSounds.CREAKING_SORCERER_EQUIP,
            () -> Ingredient.of(HnSItems.ZENALITE.get()),
            2,
            0.1F);

    public static DeferredHolder<ArmorMaterial, ArmorMaterial> SERAPH_MATERIAL = register("seraph",
            warlockArmorMap(),
            16,
            ModSounds.SERAPH_EQUIP,
            () -> Ingredient.of(HnSItems.ZENALITE.get()),
            2,
            0.1F);

    public static DeferredHolder<ArmorMaterial, ArmorMaterial> LEGIONNAIRE_MATERIAL = register("legionnaire",
            warlockArmorMap(),
            16,
            SoundEvents.ARMOR_EQUIP_NETHERITE,
            () -> Ingredient.of(HnSItems.ZENALITE.get()),
            2,
            0.1F);

    public static DeferredHolder<ArmorMaterial, ArmorMaterial> CHARGED_SCOURGE_MATERIAL = register("scourge",
            warlockArmorMap(),
            16,
            ModSounds.CHARGED_SCOURGE_EQUIP,
            () -> Ingredient.of(HnSItems.ZENALITE.get()),
            2,
            0.1F);

    public static DeferredHolder<ArmorMaterial, ArmorMaterial> SOUL_FLAME_MATERIAL = register("soul_flame",
            warlockArmorMap(),
            16,
            ModSounds.SOUL_FLAME_EQUIP,
            () -> Ingredient.of(HnSItems.ZENALITE.get()),
            2,
            0.1F);

    public static DeferredHolder<ArmorMaterial, ArmorMaterial> SUPREME_WITCH_MATERIAL = register("supreme_witch",
            warlockArmorMap(),
            16,
            ModSounds.SUPREME_WITCH_EQUIP,
            () -> Ingredient.of(HnSItems.ZENALITE.get()),
            2,
            0.1F);

    public static DeferredHolder<ArmorMaterial, ArmorMaterial> CRYOGENIC_RULER_MATERIAL = register("cryogenic_ruler",
            warlockArmorMap(),
            16,
            ModSounds.CRYOGENIC_RULER_EQUIP,
            () -> Ingredient.of(HnSItems.ZENALITE.get()),
            2,
            0.1F);

    public static DeferredHolder<ArmorMaterial, ArmorMaterial> FLESH_MASS_MATERIAL = register("flesh_mass",
            warlockArmorMap(),
            16,
            ModSounds.FLESH_MASS_EQUIP,
            () -> Ingredient.of(HnSItems.ZENALITE.get()),
            2,
            0.1F);

    public static DeferredHolder<ArmorMaterial, ArmorMaterial> ENDER_DRAGON_MATERIAL = register("ender_dragon",
            warlockArmorMap(),
            16,
            ModSounds.ENDER_DRAGON_EQUIP,
            () -> Ingredient.of(HnSItems.ZENALITE.get()),
            2,
            0.1F);

    private static DeferredHolder<ArmorMaterial, ArmorMaterial> register(
            String name,
            EnumMap<ArmorItem.Type, Integer> defense,
            int enchantmentValue,
            Holder<SoundEvent> equipSound,
            Supplier<Ingredient> repairIngredient,
            float toughness,
            float knockbackResistance
    )
    {
        List<ArmorMaterial.Layer> list = List.of(new ArmorMaterial.Layer(HazenNStuff.id(name)));
        return ARMOR_MATERIALS.register(name, () -> new ArmorMaterial(defense, enchantmentValue, equipSound, repairIngredient, list, toughness, knockbackResistance));
    }

    public static EnumMap<ArmorItem.Type, Integer> makeArmorMap(int helmet, int chestplate, int leggings, int boots)
    {
        return Util.make(new EnumMap<>(ArmorItem.Type.class), (typeIntegerEnumMap) -> {
            typeIntegerEnumMap.put(ArmorItem.Type.HELMET, helmet);
            typeIntegerEnumMap.put(ArmorItem.Type.CHESTPLATE, chestplate);
            typeIntegerEnumMap.put(ArmorItem.Type.LEGGINGS, leggings);
            typeIntegerEnumMap.put(ArmorItem.Type.BOOTS, boots);
        });
    }

    public static EnumMap<ArmorItem.Type, Integer> warlockArmorMap()
    {
        return makeArmorMap(6, 10, 8, 6);
    }

    public static void register(IEventBus eventBus)
    {
        ARMOR_MATERIALS.register(eventBus);
    }
}