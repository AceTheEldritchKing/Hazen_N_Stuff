package net.hazen.hazennstuff.item.armor;

import io.redspace.ironsspellbooks.api.spells.IPresetSpellContainer;
import io.redspace.ironsspellbooks.api.spells.ISpellContainer;
import io.redspace.ironsspellbooks.item.weapons.AttributeContainer;
import io.redspace.ironsspellbooks.registries.ComponentRegistry;
import net.minecraft.core.Holder;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;

public class ImbuableModArmorItem extends ModArmorItem implements IPresetSpellContainer {
    public ImbuableModArmorItem(Holder<ArmorMaterial> material, Type type, Properties properties, AttributeContainer... attributeContainers) {
        super(material, type, properties, attributeContainers);
    }

    @Override
    public void initializeSpellContainer(ItemStack itemStack) {
        if (itemStack == null)
        {
            return;
        }

        // This makes it so that helmets and chestplates can be imbued
        // If you only want chestplates to be imbued, remove the || section of the if statement
        if (itemStack.getItem() instanceof ArmorItem armorItem)
        {
            if (armorItem.getType() == Type.CHESTPLATE || armorItem.getType() == Type.HELMET)
            {
                if (!ISpellContainer.isSpellContainer(itemStack))
                {
                    var spellContainer = ISpellContainer.create(1, true, true);
                    itemStack.set(ComponentRegistry.SPELL_CONTAINER, spellContainer);
                }
            }
        }
    }
}
