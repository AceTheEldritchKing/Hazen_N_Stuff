package net.hazen.hazennstuff;

import net.hazen.hazennstuff.block.ModBlocks;
import net.hazen.hazennstuff.effect.ModEffects;
import net.hazen.hazennstuff.item.ModCreativeModeTabs;
import net.hazen.hazennstuff.item.armor.ModArmorMaterials;
import net.hazen.hazennstuff.registries.ModItems;
import net.hazen.hazennstuff.sound.ModSounds;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.minecraft.client.Minecraft;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import net.neoforged.neoforge.registries.DeferredRegister;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(HazenNStuff.MOD_ID)
public class HazenNStuff
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "hazennstuff";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    // Create a Deferred Register to hold Blocks which will all be registered under the "examplemod" namespace
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MOD_ID);
    // Create a Deferred Register to hold Items which will all be registered under the "examplemod" namespace
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MOD_ID);
    // Create a Deferred Register to hold CreativeModeTabs which will all be registered under the "examplemod" namespace
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MOD_ID);

    // The constructor for the mod class is the first code that is run when your mod is loaded.
    // FML will recognize some parameter types like IEventBus or ModContainer and pass them in automatically.
    public HazenNStuff(IEventBus modEventBus, ModContainer modContainer)
    {
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register the Deferred Register to the mod event bus so blocks get registered
        BLOCKS.register(modEventBus);
        // Register the Deferred Register to the mod event bus so items get registered
        ITEMS.register(modEventBus);
        // Register the Deferred Register to the mod event bus so tabs get registered
        CREATIVE_MODE_TABS.register(modEventBus);

        // Register ourselves for server and other game events we are interested in.
        // Note that this is necessary if and only if we want *this* class (ExampleMod) to respond directly to events.
        // Do not add this line if there are no @SubscribeEvent-annotated functions in this class, like onServerStarting() below.
        NeoForge.EVENT_BUS.register(this);

        ModCreativeModeTabs.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModArmorMaterials.register(modEventBus);

        ModEffects.register(modEventBus);
        ModSounds.register(modEventBus);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);

        // Register our mod's ModConfigSpec so that FML can create and load the config file for us
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        // Some common setup code
        LOGGER.info("HELLO FROM COMMON SETUP");

        if (Config.logDirtBlock)
            LOGGER.info("DIRT BLOCK >> {}", BuiltInRegistries.BLOCK.getKey(Blocks.DIRT));

        LOGGER.info(Config.magicNumberIntroduction + Config.magicNumber);

        Config.items.forEach((item) -> LOGGER.info("ITEM >> {}", item.toString()));
    }

    // Add the example block item to the building blocks tab
    // You don't need this btw, remove it when you want to
    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {
        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS)
            event.accept(ModItems.ZENALITE);
        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS)
            event.accept(ModItems.RAWZENALITE);
        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS)
            event.accept(ModItems.STARKISSEDZENALITE);

        if (event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS)
            event.accept (ModBlocks.ZENALITE_ABYSSLATE_ORE);
        if (event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS)
            event.accept (ModBlocks.ZENALITE_BRICKS);
        if (event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS)
            event.accept (ModBlocks.PHANTASMIUM);
        if (event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS)
            event.accept (ModBlocks.BLOCK_OF_ZENALITE);
        if (event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS)
            event.accept (ModBlocks.ABYSSLATE);
        if (event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS)
            event.accept (ModBlocks.ZENALITE_DEEPSLATE_ORE);
        if (event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS)
            event.accept (ModBlocks.ZENALITE_STONE_ORE);


        /*if (event.getTabKey() == CreativeModeTabs.COMBAT)
            event.accept(ModItems.CREAKING_MASK);
        if (event.getTabKey() == CreativeModeTabs.COMBAT)
            event.accept(ModItems.CREAKING_CHESTPLATE);
        if (event.getTabKey() == CreativeModeTabs.COMBAT)
            event.accept(ModItems.CREAKING_LEGGINGS);
        if (event.getTabKey() == CreativeModeTabs.COMBAT)
            event.accept(ModItems.CREAKING_BOOTS);*/

    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        // Do something when the server starts
        LOGGER.info("Amogus");
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @EventBusSubscriber(modid = MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            // Some client setup code
            LOGGER.info("HELLO FROM CLIENT SETUP");
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
        }
    }

    public static ResourceLocation id(@NotNull String path)
    {
        return ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, path);
    }
}
