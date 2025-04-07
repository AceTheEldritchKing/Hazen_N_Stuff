package net.hazen.hazennstuff.sound;

import net.hazen.hazennstuff.HazenNStuff;
import net.minecraft.client.resources.sounds.Sound;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.util.DeferredSoundType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(BuiltInRegistries.SOUND_EVENT, HazenNStuff.MOD_ID);

    //Soul Flame Equip
    public static final Holder<SoundEvent> SOUL_FLAME_EQUIP_1 = registerSoundEvent("soul_flame_equip_1");
    public static final Holder<SoundEvent> SOUL_FLAME_EQUIP_2 = registerSoundEvent("soul_flame_equip_2");
    public static final Holder<SoundEvent> SOUL_FLAME_EQUIP_3 = registerSoundEvent("soul_flame_equip_3");
    public static final Holder<SoundEvent> SOUL_FLAME_EQUIP_4 = registerSoundEvent("soul_flame_equip_4");
    public static final Holder<SoundEvent> SOUL_FLAME_EQUIP_5 = registerSoundEvent("soul_flame_equip_5");

    public static final Holder<SoundEvent> SOUL_FLAME_EQUIP = registerSoundEvent("soul_flame_equip");

    //Supreme Witch Equip

    public static final Holder<SoundEvent> SUPREME_WITCH_EQUIP_1 = registerSoundEvent("supreme_witch_equip_1");
    public static final Holder<SoundEvent> SUPREME_WITCH_EQUIP_2 = registerSoundEvent("supreme_witch_equip_2");
    public static final Holder<SoundEvent> SUPREME_WITCH_EQUIP_3 = registerSoundEvent("supreme_witch_equip_3");
    public static final Holder<SoundEvent> SUPREME_WITCH_EQUIP_4 = registerSoundEvent("supreme_witch_equip_4");

    public static final Holder<SoundEvent> SUPREME_WITCH_EQUIP = registerSoundEvent("supreme_witch_equip");

    //Seraph Equip

    public static final Holder<SoundEvent> SERAPH_EQUIP_1 = registerSoundEvent("seraph_equip_1");
    public static final Holder<SoundEvent> SERAPH_EQUIP_2 = registerSoundEvent("seraph_equip_2");
    public static final Holder<SoundEvent> SERAPH_EQUIP_3 = registerSoundEvent("seraph_equip_3");
    public static final Holder<SoundEvent> SERAPH_EQUIP_4 = registerSoundEvent("seraph_equip_4");

    public static final Holder<SoundEvent> SERAPH_EQUIP = registerSoundEvent("seraph_equip");

    //Charged Scourge Equip

    public static final Holder<SoundEvent> CHARGED_SCOURGE_EQUIP_1 = registerSoundEvent("charged_scourge_equip_1");
    public static final Holder<SoundEvent> CHARGED_SCOURGE_EQUIP_2 = registerSoundEvent("charged_scourge_equip_2");
    public static final Holder<SoundEvent> CHARGED_SCOURGE_EQUIP_3 = registerSoundEvent("charged_scourge_equip_3");
    public static final Holder<SoundEvent> CHARGED_SCOURGE_EQUIP_4 = registerSoundEvent("charged_scourge_equip_4");

    public static final Holder<SoundEvent> CHARGED_SCOURGE_EQUIP = registerSoundEvent("charged_scourge_equip");

    //Creaking Sorcerer Equip

    public static final Holder<SoundEvent> CREAKING_SORCERER_EQUIP_1 = registerSoundEvent("creaking_sorcerer_equip_1");
    public static final Holder<SoundEvent> CREAKING_SORCERER_EQUIP_2 = registerSoundEvent("creaking_sorcerer_equip_2");
    public static final Holder<SoundEvent> CREAKING_SORCERER_EQUIP_3 = registerSoundEvent("creaking_sorcerer_equip_3");
    public static final Holder<SoundEvent> CREAKING_SORCERER_EQUIP_4 = registerSoundEvent("creaking_sorcerer_equip_4");

    public static final Holder<SoundEvent> CREAKING_SORCERER_EQUIP = registerSoundEvent("creaking_sorcerer_equip");



    private static DeferredHolder<SoundEvent, SoundEvent> registerSoundEvent(String name)
    {
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent
                (ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, name)));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
