package net.hazen.hazennstuff.entity.armor;

import io.redspace.ironsspellbooks.IronsSpellbooks;
import mod.azure.azurelib.common.api.client.model.GeoModel;
import net.hazen.hazennstuff.HazenNStuff;
import net.hazen.hazennstuff.item.armor.CreakingSorcererArmorItem;
import net.hazen.hazennstuff.item.armor.CryogenicRulerArmorItem;
import net.minecraft.resources.ResourceLocation;

public class CryogenicRulerArmorModel extends GeoModel<CryogenicRulerArmorItem> {
    @Override
    public ResourceLocation getModelResource(CryogenicRulerArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, "geo/cryogenic_ruler_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(CryogenicRulerArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, "textures/models/armor/cryogenic_ruler_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(CryogenicRulerArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(IronsSpellbooks.MODID, "animations/wizard_armor_animation.animation.json");
    }
}