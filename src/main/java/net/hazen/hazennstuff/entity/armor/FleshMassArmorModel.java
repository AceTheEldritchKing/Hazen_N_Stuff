package net.hazen.hazennstuff.entity.armor;

import io.redspace.ironsspellbooks.IronsSpellbooks;
import mod.azure.azurelib.common.api.client.model.GeoModel;
import net.hazen.hazennstuff.HazenNStuff;
import net.hazen.hazennstuff.item.armor.CreakingSorcererArmorItem;
import net.hazen.hazennstuff.item.armor.CryogenicRulerArmorItem;
import net.hazen.hazennstuff.item.armor.EnderDragonArmorItem;
import net.hazen.hazennstuff.item.armor.FleshMassArmorItem;
import net.minecraft.resources.ResourceLocation;

public class FleshMassArmorModel extends GeoModel<FleshMassArmorItem> {
    @Override
    public ResourceLocation getModelResource(FleshMassArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, "geo/flesh_mass_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(FleshMassArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, "textures/models/armor/flesh_mass_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(FleshMassArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(IronsSpellbooks.MODID, "animations/wizard_armor_animation.animation.json");
    }
}