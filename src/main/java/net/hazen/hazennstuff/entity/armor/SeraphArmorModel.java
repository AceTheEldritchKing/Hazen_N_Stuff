package net.hazen.hazennstuff.entity.armor;

import io.redspace.ironsspellbooks.IronsSpellbooks;
import mod.azure.azurelib.common.api.client.model.GeoModel;
import net.hazen.hazennstuff.HazenNStuff;
import net.hazen.hazennstuff.item.armor.CreakingSorcererArmorItem;
import net.hazen.hazennstuff.item.armor.CryogenicRulerArmorItem;
import net.hazen.hazennstuff.item.armor.EnderDragonArmorItem;
import net.hazen.hazennstuff.item.armor.SeraphArmorItem;
import net.minecraft.resources.ResourceLocation;

public class SeraphArmorModel extends GeoModel<SeraphArmorItem> {
    @Override
    public ResourceLocation getModelResource(SeraphArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, "geo/seraph_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(SeraphArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, "textures/models/armor/seraph_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(SeraphArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(IronsSpellbooks.MODID, "animations/wizard_armor_animation.animation.json");
    }
}