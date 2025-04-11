package net.hazen.hazennstuff.entity.armor;

import io.redspace.ironsspellbooks.IronsSpellbooks;
import net.hazen.hazennstuff.HazenNStuff;
import net.hazen.hazennstuff.item.armor.CreakingSorcererArmorItem;
import net.hazen.hazennstuff.item.armor.CryogenicRulerArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

public class CryogenicRulerArmorModel extends DefaultedEntityGeoModel<CryogenicRulerArmorItem> {
    public CryogenicRulerArmorModel() {
        super(ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, ""));
    }

    // Just replace where the path is with the file path of your texture, EZ PZ
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
        return ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, "animations/cryogenic_ruler_armor_geckolib.animation.json");

    }
}
