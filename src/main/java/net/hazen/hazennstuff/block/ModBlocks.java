package net.hazen.hazennstuff.block;

import net.hazen.hazennstuff.HazenNStuff;
import net.hazen.hazennstuff.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(HazenNStuff.MOD_ID);

    public static final DeferredBlock<Block> ZENALITE_ORE = registerBlock("zenalite_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.ANCIENT_DEBRIS)));
    public static final DeferredBlock<Block> PHANTASMIUM = registerBlock("phantasmium",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.ANCIENT_DEBRIS)));
    public static final DeferredBlock<Block> ZENALITE_BRICKS = registerBlock("zenalite_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));
    public static final DeferredBlock<Block> BLOCK_OF_ZENALITE = registerBlock("block_of_zenalite",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.COPPER_GRATE)));
    public static final DeferredBlock<Block> ABYSSLATE = registerBlock("abysslate",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.ANCIENT_DEBRIS)));



    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
