package net.hazen.hazennstuff.item.armor;

import net.hazen.hazennstuff.HazenNStuff;
import net.hazen.hazennstuff.registries.ModItems;
import net.hazen.hazennstuff.sound.ModSoundEvents;
import net.hazen.hazennstuff.sound.ModSounds;
import net.minecraft.Util;
import net.minecraft.client.resources.sounds.Sound;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class ModArmorMaterials {
    public static final Holder<ArmorMaterial> CREAKING_SORCERER_MATERIAL = register("creaking",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 6);
                attribute.put(ArmorItem.Type.LEGGINGS, 8);
                attribute.put(ArmorItem.Type.CHESTPLATE, 10);
                attribute.put(ArmorItem.Type.HELMET, 6);
                attribute.put(ArmorItem.Type.BODY, 12);
            }), 16, 2f, 0.1f, () -> ModItems.ZENALITE.get());


    public static final Holder<ArmorMaterial> SERAPH_MATERIAL = register("seraph",
                Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                    attribute.put(ArmorItem.Type.BOOTS, 6);
                    attribute.put(ArmorItem.Type.LEGGINGS, 8);
                    attribute.put(ArmorItem.Type.CHESTPLATE, 10);
                    attribute.put(ArmorItem.Type.HELMET, 6);
                    attribute.put(ArmorItem.Type.BODY, 12);
                }), 16, 2f, 0.1f, () -> ModItems.ZENALITE.get());



    public static final Holder<ArmorMaterial> LEGIONNAIRE_MATERIAL = register("legionnaire",
                    Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                        attribute.put(ArmorItem.Type.BOOTS, 6);
                        attribute.put(ArmorItem.Type.LEGGINGS, 8);
                        attribute.put(ArmorItem.Type.CHESTPLATE, 10);
                        attribute.put(ArmorItem.Type.HELMET, 6);
                        attribute.put(ArmorItem.Type.BODY, 12);
                    }), 16, 2f, 0.1f, () -> ModItems.ZENALITE.get());


    public static final Holder<ArmorMaterial> CHARGED_SCOURGE_MATERIAL = register("scourge",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 6);
                attribute.put(ArmorItem.Type.LEGGINGS, 8);
                attribute.put(ArmorItem.Type.CHESTPLATE, 10);
                attribute.put(ArmorItem.Type.HELMET, 6);
                attribute.put(ArmorItem.Type.BODY, 12);
            }), 16, 2f, 0.1f, () -> ModItems.ZENALITE.get());

    public static final Holder<ArmorMaterial> SOUL_FLAME_MATERIAL = register("soul_flame",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 6);
                attribute.put(ArmorItem.Type.LEGGINGS, 8);
                attribute.put(ArmorItem.Type.CHESTPLATE, 10);
                attribute.put(ArmorItem.Type.HELMET, 6);
                attribute.put(ArmorItem.Type.BODY, 12);
            }), 16, 2f, 0.1f, () -> ModItems.ZENALITE.get());

    private static Holder<ArmorMaterial> register(String name, EnumMap<ArmorItem.Type, Integer> typeProtection,
                                                  int enchantability, float toughness, float knockbackResistance,
                                                  Supplier<Item> ingredientItem) {
        ResourceLocation location = ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, name);
        Holder<SoundEvent> equipSound = SoundEvents.ARMOR_EQUIP_NETHERITE;
        Supplier<Ingredient> ingredient = () -> Ingredient.of(ingredientItem.get());
        List<ArmorMaterial.Layer> layers = List.of(new ArmorMaterial.Layer(location));

        EnumMap<ArmorItem.Type, Integer> typeMap = new EnumMap<>(ArmorItem.Type.class);
        for (ArmorItem.Type type : ArmorItem.Type.values()) {
            typeMap.put(type, typeProtection.get(type));
        }

        return Registry.registerForHolder(BuiltInRegistries.ARMOR_MATERIAL, location,
                new ArmorMaterial(typeProtection, enchantability, equipSound, ingredient, layers, toughness, knockbackResistance));
    }
}