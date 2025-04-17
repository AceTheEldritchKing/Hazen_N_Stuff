package net.hazen.hazennstuff.entity.armor;

import io.redspace.ironsspellbooks.IronsSpellbooks;
import mod.azure.azurelib.common.api.client.model.GeoModel;
import net.hazen.hazennstuff.HazenNStuff;
import net.hazen.hazennstuff.item.armor.SupremeWitchArmorItem;
import net.minecraft.resources.ResourceLocation;

public class SupremeWitchArmorModel extends GeoModel<SupremeWitchArmorItem> {
    @Override
    public ResourceLocation getModelResource(SupremeWitchArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, "geo/supreme_witch_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(SupremeWitchArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, "textures/models/armor/supreme_witch_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(SupremeWitchArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, "animations/supreme_witch_armor.animation.json");
    }
}