package net.hazen.hazennstuff.entity.armor;

import io.redspace.ironsspellbooks.IronsSpellbooks;
import net.hazen.hazennstuff.HazenNStuff;
import net.hazen.hazennstuff.item.armor.ChargedScourgeArmorItem;
import net.hazen.hazennstuff.item.armor.SupremeWitchArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

public class SupremeWitchArmorModel extends DefaultedEntityGeoModel<SupremeWitchArmorItem> {
    public SupremeWitchArmorModel() {
        super(ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, ""));
    }

    // Just replace where the path is with the file path of your texture, EZ PZ
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
        return ResourceLocation.fromNamespaceAndPath(IronsSpellbooks.MODID, "animations/wizard_armor_animation.json");
    }
}
