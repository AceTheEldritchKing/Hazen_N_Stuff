package net.hazen.hazennstuff.entity.armor.Geckolib;

import io.redspace.ironsspellbooks.IronsSpellbooks;
import net.hazen.hazennstuff.HazenNStuff;
import net.hazen.hazennstuff.item.armor.Geckolib.GeckolibSupremeWitchArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

public class GeckolibSupremeWitchArmorModel extends DefaultedEntityGeoModel<GeckolibSupremeWitchArmorItem> {
    public GeckolibSupremeWitchArmorModel() {
        super(ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, ""));
    }

    // Just replace where the path is with the file path of your texture, EZ PZ
    @Override
    public ResourceLocation getModelResource(GeckolibSupremeWitchArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, "geo/supreme_witch_armor_geckolib.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(GeckolibSupremeWitchArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, "textures/models/armor/geckolib/supreme_witch_armor_geckolib.png");
    }

    @Override
    public ResourceLocation getAnimationResource(GeckolibSupremeWitchArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(IronsSpellbooks.MODID, "animations/wizard_armor_animation.json");
    }
}
