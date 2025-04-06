package net.hazen.hazennstuff.entity.armor;

import io.redspace.ironsspellbooks.IronsSpellbooks;
import net.hazen.hazennstuff.HazenNStuff;
import net.hazen.hazennstuff.item.armor.SoulFlameArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

public class SoulFlameArmorModel extends DefaultedEntityGeoModel<SoulFlameArmorItem> {
    public SoulFlameArmorModel() {
        super(ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, ""));
    }

    // Just replace where the path is with the file path of your texture, EZ PZ
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
        return ResourceLocation.fromNamespaceAndPath(IronsSpellbooks.MODID, "animations/wizard_armor_animation.json");
    }
}

