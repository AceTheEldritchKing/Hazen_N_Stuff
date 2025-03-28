package net.hazen.hazennstuff.item;

import io.redspace.ironsspellbooks.IronsSpellbooks;
import net.hazen.hazennstuff.HazenNStuff;
import net.hazen.hazennstuff.block.ModBlocks;
import net.hazen.hazennstuff.registries.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, HazenNStuff.MOD_ID);

    public static final Supplier<CreativeModeTab> HAZEN_N_STUFF_MATERIALS = CREATIVE_MODE_TAB.register("hazennstuff_materials",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ZENALITE.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(IronsSpellbooks.MODID, "spell_materials_tab"))
                    .title(Component.translatable("creativetab.hazennstuff.hazennstuff_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.ZENALITE);
                        output.accept(ModItems.RAWZENALITE);
                        output.accept(ModItems.STARKISSEDZENALITE);
                        output.accept(ModItems.OMINOUSALLOY);
                    }).build());

    public static final Supplier<CreativeModeTab> HAZEN_N_STUFF_BLOCKS = CREATIVE_MODE_TAB.register("hazennstuff_blocks",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.ZENALITE_ORE.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(IronsSpellbooks.MODID, "spell_materials_tab"))
                    .title(Component.translatable("creativetab.hazennstuff.hazennstuff_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.BLOCK_OF_ZENALITE);
                        output.accept(ModBlocks.ZENALITE_BRICKS);
                        output.accept(ModBlocks.ZENALITE_ORE);
                        output.accept(ModBlocks.ABYSSLATE);
                        output.accept(ModBlocks.PHANTASMIUM);
                    }).build());

    public static final Supplier<CreativeModeTab> HAZEN_N_STUFF_EQUIPMENT = CREATIVE_MODE_TAB.register("hazennstuff_equipment",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CREAKIN_MASK.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(IronsSpellbooks.MODID, "blocks_tab"))
                    .title(Component.translatable("creativetab.hazennstuff.hazennstuff_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        // Creaking
                        output.accept(ModItems.CREAKIN_MASK.get());
                        output.accept(ModItems.CREAKIN_CHESTPLATE.get());
                        output.accept(ModItems.CREAKIN_LEGGINGS.get());
                        output.accept(ModItems.CREAKIN_BOOTS.get());
                        // Legionnaire
                        // Seraph
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }

}
