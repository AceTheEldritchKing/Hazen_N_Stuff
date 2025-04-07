package net.hazen.hazennstuff.item.armor;

import io.redspace.ironsspellbooks.api.registry.AttributeRegistry;
import io.redspace.ironsspellbooks.entity.armor.GenericCustomArmorRenderer;
import io.redspace.ironsspellbooks.item.weapons.AttributeContainer;
import net.hazen.hazennstuff.effect.ModEffects;
import net.hazen.hazennstuff.entity.armor.CreakingSorcererArmorModel;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class CreakingSorcererArmorItem extends ImbuableModArmorItem {
    public CreakingSorcererArmorItem(Type type, Properties settings) {
        // Add in your armor tier + additional attributes for your item
        super(ModArmorMaterials.CREAKING_SORCERER_MATERIAL, type, settings,
                new AttributeContainer(AttributeRegistry.MAX_MANA, 150.0, AttributeModifier.Operation.ADD_VALUE),
                new AttributeContainer(AttributeRegistry.NATURE_SPELL_POWER, .15, AttributeModifier.Operation.ADD_VALUE),
                new AttributeContainer(AttributeRegistry.ELDRITCH_SPELL_POWER, .05, AttributeModifier.Operation.ADD_VALUE),
                new AttributeContainer(AttributeRegistry.SPELL_POWER, .5, AttributeModifier.Operation.ADD_VALUE)
        );
    }

    // Just supply the armor model here; you don't have to worry about making a new renderer
    // ISS already has a custom renderer used for armor models
    @Override
    @OnlyIn(Dist.CLIENT)
    public GeoArmorRenderer<?> supplyRenderer() {
        return new GenericCustomArmorRenderer<>(new CreakingSorcererArmorModel());
    }

    @Override
    public void inventoryTick(ItemStack stack, Level level, Entity entity, int slotId, boolean isSelected) {
        if (entity instanceof Player player && !level.isClientSide() && isWearingFullSet(player)) {
            evaluateArmorEffects(player);
        }
    }

    private void evaluateArmorEffects(Player player) {
        if (!player.hasEffect(ModEffects.CALL_OF_THE_GARDEN_EFFECT)) {
            player.addEffect(new MobEffectInstance(ModEffects.CALL_OF_THE_GARDEN_EFFECT, 200, 0, false, false, true));
        }
    }

    private boolean isWearingFullSet(Player player) {
        return player.getItemBySlot(ArmorItem.Type.HELMET.getSlot()).getItem() instanceof CreakingSorcererArmorItem &&
                player.getItemBySlot(ArmorItem.Type.CHESTPLATE.getSlot()).getItem() instanceof CreakingSorcererArmorItem &&
                player.getItemBySlot(ArmorItem.Type.LEGGINGS.getSlot()).getItem() instanceof CreakingSorcererArmorItem &&
                player.getItemBySlot(ArmorItem.Type.BOOTS.getSlot()).getItem() instanceof CreakingSorcererArmorItem;
    }
}