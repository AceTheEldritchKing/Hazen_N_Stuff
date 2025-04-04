package net.hazen.hazennstuff.item.armor;

import io.redspace.ironsspellbooks.api.registry.AttributeRegistry;
import io.redspace.ironsspellbooks.entity.armor.GenericCustomArmorRenderer;
import io.redspace.ironsspellbooks.item.weapons.AttributeContainer;
import net.hazen.hazennstuff.effect.ModEffects;
import net.hazen.hazennstuff.entity.armor.ChargedScourgeArmorModel;
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

public class ChargedScourgeArmorItem extends ImbuableModArmorItem {
    public ChargedScourgeArmorItem(Type type, Properties settings) {
        // Add in your armor tier + additional attributes for your item
        super(ModArmorMaterials.CHARGED_SCOURGE_MATERIAL, type, settings,
                new AttributeContainer(AttributeRegistry.MAX_MANA, 150.0, AttributeModifier.Operation.ADD_VALUE),
                new AttributeContainer(AttributeRegistry.LIGHTNING_SPELL_POWER, .15, AttributeModifier.Operation.ADD_VALUE),
                new AttributeContainer(AttributeRegistry.ELDRITCH_SPELL_POWER, .05, AttributeModifier.Operation.ADD_VALUE),
                new AttributeContainer(AttributeRegistry.SPELL_POWER, .10, AttributeModifier.Operation.ADD_VALUE)
        );
    }

    // Just supply the armor model here; you don't have to worry about making a new renderer
    // ISS already has a custom renderer used for armor models
    @Override
    @OnlyIn(Dist.CLIENT)
    public GeoArmorRenderer<?> supplyRenderer() {
        return new GenericCustomArmorRenderer<>(new ChargedScourgeArmorModel());
    }

    @Override
    public void inventoryTick(ItemStack stack, Level level, Entity entity, int slotId, boolean isSelected) {
        if (entity instanceof Player player && !level.isClientSide() && isWearingFullSet(player)) {
            evaluateArmorEffects(player);
        }
    }

    private void evaluateArmorEffects(Player player) {
        if (!player.hasEffect(ModEffects.SCOURGES_GORGE_EFFECT)) {
            player.addEffect(new MobEffectInstance(ModEffects.SCOURGES_GORGE_EFFECT, 200, 0, false, false, true));
        }
    }

    private boolean isWearingFullSet(Player player) {
        return player.getItemBySlot(ArmorItem.Type.HELMET.getSlot()).getItem() instanceof ChargedScourgeArmorItem &&
                player.getItemBySlot(ArmorItem.Type.CHESTPLATE.getSlot()).getItem() instanceof ChargedScourgeArmorItem &&
                player.getItemBySlot(ArmorItem.Type.LEGGINGS.getSlot()).getItem() instanceof ChargedScourgeArmorItem &&
                player.getItemBySlot(ArmorItem.Type.BOOTS.getSlot()).getItem() instanceof ChargedScourgeArmorItem;
    }
}