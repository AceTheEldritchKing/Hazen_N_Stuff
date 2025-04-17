package net.hazen.hazennstuff.entity.armor;

import io.redspace.ironsspellbooks.IronsSpellbooks;
import mod.azure.azurelib.common.api.client.model.GeoModel;
import net.hazen.hazennstuff.HazenNStuff;
import net.hazen.hazennstuff.item.armor.CreakingSorcererArmorItem;
import net.minecraft.resources.ResourceLocation;

public class CreakingSorcererArmorModel extends GeoModel<CreakingSorcererArmorItem> {
    @Override
    public ResourceLocation getModelResource(CreakingSorcererArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, "geo/creaking_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(CreakingSorcererArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, "textures/models/armor/creaking_sorcerer_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(CreakingSorcererArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, "animations/creaking_armor.animation.json");
    }
}