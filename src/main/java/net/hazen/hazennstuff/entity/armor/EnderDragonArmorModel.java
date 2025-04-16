package net.hazen.hazennstuff.entity.armor;

import io.redspace.ironsspellbooks.IronsSpellbooks;
import mod.azure.azurelib.common.api.client.model.GeoModel;
import net.hazen.hazennstuff.HazenNStuff;
import net.hazen.hazennstuff.item.armor.CreakingSorcererArmorItem;
import net.hazen.hazennstuff.item.armor.CryogenicRulerArmorItem;
import net.hazen.hazennstuff.item.armor.EnderDragonArmorItem;
import net.minecraft.resources.ResourceLocation;

public class EnderDragonArmorModel extends GeoModel<EnderDragonArmorItem> {
    @Override
    public ResourceLocation getModelResource(EnderDragonArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, "geo/ender_dragon_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(EnderDragonArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, "textures/models/armor/ender_dragon_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(EnderDragonArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(IronsSpellbooks.MODID, "animations/wizard_armor_animation.animation.json");
    }
}