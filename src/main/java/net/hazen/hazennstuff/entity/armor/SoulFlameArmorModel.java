package net.hazen.hazennstuff.entity.armor;

import io.redspace.ironsspellbooks.IronsSpellbooks;
import mod.azure.azurelib.common.api.client.model.GeoModel;
import net.hazen.hazennstuff.HazenNStuff;
import net.hazen.hazennstuff.item.armor.*;
import net.minecraft.resources.ResourceLocation;

public class SoulFlameArmorModel extends GeoModel<SoulFlameArmorItem> {
    @Override
    public ResourceLocation getModelResource(SoulFlameArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, "geo/soul_flame_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(SoulFlameArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, "textures/models/armor/soul_flame_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(SoulFlameArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, "animations/soul_flame_armor.animation.json");
    }
}