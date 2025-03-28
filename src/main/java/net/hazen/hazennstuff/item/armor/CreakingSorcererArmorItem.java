package net.hazen.hazennstuff.item.armor;

import io.redspace.ironsspellbooks.api.registry.AttributeRegistry;
import io.redspace.ironsspellbooks.entity.armor.GenericCustomArmorRenderer;
import net.hazen.hazennstuff.entity.armor.CreakingSorcererArmorModel;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class CreakingSorcererArmorItem extends ImbuableModArmorItem {
    public CreakingSorcererArmorItem(Type type, Properties properties) {
        // Add in your armor tier + additional attributes for your item
        super(ModArmorMaterials.CREAKING_SORCERER_MATERIAL, type, properties, schoolAttributesWithResistance(AttributeRegistry.ELDRITCH_SPELL_POWER, AttributeRegistry.NATURE_SPELL_POWER, 150, 0.10F, 0.10F, 0.05F));
    }

    // Just supply the armor model here; you don't have to worry about making a new renderer
    // ISS already has a custom renderer used for armor models
    @Override
    @OnlyIn(Dist.CLIENT)
    public GeoArmorRenderer<?> supplyRenderer() {
        return new GenericCustomArmorRenderer<>(new CreakingSorcererArmorModel());
    }
}
