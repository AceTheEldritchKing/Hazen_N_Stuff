package net.hazen.hazennstuff.entity.armor;

import io.redspace.ironsspellbooks.IronsSpellbooks;
import mod.azure.azurelib.common.api.client.model.GeoModel;
import net.hazen.hazennstuff.HazenNStuff;
import net.hazen.hazennstuff.item.armor.ChargedScourgeArmorItem;
import net.hazen.hazennstuff.item.armor.CreakingSorcererArmorItem;
import net.minecraft.resources.ResourceLocation;

public class ChargedScourgeArmorModel extends GeoModel<ChargedScourgeArmorItem> {
    @Override
    public ResourceLocation getModelResource(ChargedScourgeArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, "geo/charged_scourge_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ChargedScourgeArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, "textures/models/armor/charged_scourge_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(ChargedScourgeArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, "animations/charged_scourge_armor.animation.json");
    }
}