package net.hazen.hazennstuff.entity.armor;

import io.redspace.ironsspellbooks.IronsSpellbooks;
import mod.azure.azurelib.common.api.client.model.GeoModel;
import net.hazen.hazennstuff.HazenNStuff;
import net.hazen.hazennstuff.item.armor.DarkRitualTemplarArmorItem;
import net.minecraft.resources.ResourceLocation;

public class DarkRitualTemplarArmorModel extends GeoModel<DarkRitualTemplarArmorItem> {
    @Override
    public ResourceLocation getModelResource(DarkRitualTemplarArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, "geo/dark_ritual_templar_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(DarkRitualTemplarArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, "textures/models/armor/dark_ritual_templar_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(DarkRitualTemplarArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(IronsSpellbooks.MODID, "animations/wizard_armor_animation.animation.json");
    }
}