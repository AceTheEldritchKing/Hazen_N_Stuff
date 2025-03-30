package net.hazen.hazennstuff.item.armor;

import io.redspace.ironsspellbooks.api.registry.AttributeRegistry;
import io.redspace.ironsspellbooks.entity.armor.GenericCustomArmorRenderer;
import io.redspace.ironsspellbooks.item.weapons.AttributeContainer;
import net.hazen.hazennstuff.entity.armor.LegionnaireArmorModel;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import org.w3c.dom.Attr;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

// Halp, how make this one not Imbueable. qwq
// Halp, how make this one not Imbueable. qwq
// Halp, how make this one not Imbueable. qwq
// Halp, how make this one not Imbueable. qwq
// Halp, how make this one not Imbueable. qwq
// Halp, how make this one not Imbueable. qwq
// Halp, how make this one not Imbueable. qwq
// Halp, how make this one not Imbueable. qwq
// Halp, how make this one not Imbueable. qwq
// Halp, how make this one not Imbueable. qwq

public class LegionnaireArmorItem extends ModArmorItem {
    public LegionnaireArmorItem(Type type, Properties settings) {
        super(ModArmorMaterials.LEGIONNAIRE_MATERIAL, type, settings,
                new AttributeContainer(AttributeRegistry.SPELL_RESIST, .05, AttributeModifier.Operation.ADD_VALUE),
                new AttributeContainer(AttributeRegistry.FIRE_SPELL_POWER, .05, AttributeModifier.Operation.ADD_VALUE),
                new AttributeContainer(AttributeRegistry.CASTING_MOVESPEED, .15, AttributeModifier.Operation.ADD_VALUE)
        );
    }

    // Just supply the armor model here; you don't have to worry about making a new renderer
    // ISS already has a custom renderer used for armor models
    @Override
    @OnlyIn(Dist.CLIENT)
    public GeoArmorRenderer<?> supplyRenderer() {
        return new GenericCustomArmorRenderer<>(new LegionnaireArmorModel());
    }
}