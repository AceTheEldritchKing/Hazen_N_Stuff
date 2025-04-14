package net.hazen.hazennstuff.item;

import net.hazen.hazennstuff.HazenNStuff;
import net.hazen.hazennstuff.block.ModBlocks;
import net.hazen.hazennstuff.item.item.HnSItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class HnSCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, HazenNStuff.MOD_ID);

    public static final Supplier<CreativeModeTab> HAZEN_N_STUFF_MATERIALS = CREATIVE_MODE_TAB.register("hazennstuff_materials",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(HnSItems.ZENALITE.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, "hazennstuff_blocks"))
                    .title(Component.translatable("creativetab.hazennstuff.hazennstuff_materials"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(HnSItems.ZENALITE);
                        output.accept(HnSItems.RAWZENALITE);
                        output.accept(HnSItems.STARKISSEDZENALITE);
                        output.accept(HnSItems.DIVINE_MOLD);
                    }).build());

    public static final Supplier<CreativeModeTab> HAZEN_N_STUFF_BLOCKS = CREATIVE_MODE_TAB.register("hazennstuff_blocks",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.ZENALITE_ABYSSLATE_ORE.get()))
                    .title(Component.translatable("creativetab.hazennstuff.hazennstuff_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.BLOCK_OF_ZENALITE);
                        output.accept(ModBlocks.ZENALITE_BRICKS);
                        output.accept(ModBlocks.ZENALITE_DEEPSLATE_ORE);
                        output.accept(ModBlocks.ZENALITE_STONE_ORE);
                        output.accept(ModBlocks.ZENALITE_ABYSSLATE_ORE);
                        output.accept(ModBlocks.ABYSSLATE);
                        output.accept(ModBlocks.PHANTASMIUM);
                    }).build());

    public static final Supplier<CreativeModeTab> HAZEN_N_STUFF_EQUIPMENT = CREATIVE_MODE_TAB.register("hazennstuff_equipment",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(HnSItems.RADIANCE.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, "hazennstuff_materials"))
                    .title(Component.translatable("creativetab.hazennstuff.hazennstuff_equipment"))
                    .displayItems((itemDisplayParameters, output) -> {
                        // Creaking
                        output.accept(HnSItems.CREAKING_HELMET.get());
                        output.accept(HnSItems.CREAKING_CHESTPLATE.get());
                        output.accept(HnSItems.CREAKING_LEGGINGS.get());
                        output.accept(HnSItems.CREAKING_BOOTS.get());
                        // Legionnaire
                        output.accept(HnSItems.LEGIONNAIRE_HELMET.get());
                        output.accept(HnSItems.LEGIONNAIRE_CHESTPLATE.get());
                        output.accept(HnSItems.LEGIONNAIRE_LEGGINGS.get());
                        output.accept(HnSItems.LEGIONNAIRE_BOOTS.get());
                        // Seraph
                        output.accept(HnSItems.SERAPH_HELMET.get());
                        output.accept(HnSItems.SERAPH_CHESTPLATE.get());
                        output.accept(HnSItems.SERAPH_LEGGINGS.get());
                        output.accept(HnSItems.SERAPH_BOOTS.get());
                        // Scourge
                        output.accept(HnSItems.CHARGED_SCOURGE_HELMET.get());
                        output.accept(HnSItems.CHARGED_SCOURGE_CHESTPLATE.get());
                        output.accept(HnSItems.CHARGED_SCOURGE_LEGGINGS.get());
                        output.accept(HnSItems.CHARGED_SCOURGE_BOOTS.get());
                        // Soul Flamed
                        output.accept(HnSItems.SOUL_FLAME_HELMET.get());
                        output.accept(HnSItems.SOUL_FLAME_CHESTPLATE.get());
                        output.accept(HnSItems.SOUL_FLAME_LEGGINGS.get());
                        output.accept(HnSItems.SOUL_FLAME_BOOTS.get());
                        // Supreme Witch
                        output.accept(HnSItems.SUPREME_WITCH_HELMET.get());
                        output.accept(HnSItems.SUPREME_WITCH_CHESTPLATE.get());
                        output.accept(HnSItems.SUPREME_WITCH_LEGGINGS.get());
                        output.accept(HnSItems.SUPREME_WITCH_BOOTS.get());
                        // Supreme Witch
                        output.accept(HnSItems.CRYOGENIC_RULER_HELMET.get());
                        output.accept(HnSItems.CRYOGENIC_RULER_CHESTPLATE.get());
                        output.accept(HnSItems.CRYOGENIC_RULER_LEGGINGS.get());
                        output.accept(HnSItems.CRYOGENIC_RULER_BOOTS.get());
                        // Supreme Witch
                        output.accept(HnSItems.FLESH_MASS_HELMET.get());
                        output.accept(HnSItems.FLESH_MASS_CHESTPLATE.get());
                        output.accept(HnSItems.FLESH_MASS_LEGGINGS.get());
                        output.accept(HnSItems.FLESH_MASS_BOOTS.get());
                        // Supreme Witch
                        output.accept(HnSItems.ENDER_DRAGON_HELMET.get());
                        output.accept(HnSItems.ENDER_DRAGON_CHESTPLATE.get());
                        output.accept(HnSItems.ENDER_DRAGON_LEGGINGS.get());
                        output.accept(HnSItems.ENDER_DRAGON_BOOTS.get());


                        //Curios
                        output.accept(HnSItems.RUPTURED.get());
                        output.accept(HnSItems.REFINED.get());
                        output.accept(HnSItems.REINFORCED.get());
                        output.accept(HnSItems.RADIANCE.get());

                        //Weapons
                        output.accept(HnSItems.ICE_PIKE.get());
                    }).build());



    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }

}
