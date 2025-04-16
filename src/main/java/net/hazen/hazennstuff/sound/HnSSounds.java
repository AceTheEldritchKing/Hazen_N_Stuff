package net.hazen.hazennstuff.sound;

import net.hazen.hazennstuff.HazenNStuff;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class HnSSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(BuiltInRegistries.SOUND_EVENT, HazenNStuff.MOD_ID);

    //Soul Flame Equip
    public static final Holder<SoundEvent> SOUL_FLAME_EQUIP_1 = registerSoundEvent("soul_flame_equip_1");
    public static final Holder<SoundEvent> SOUL_FLAME_EQUIP_2 = registerSoundEvent("soul_flame_equip_2");
    public static final Holder<SoundEvent> SOUL_FLAME_EQUIP_3 = registerSoundEvent("soul_flame_equip_3");
    public static final Holder<SoundEvent> SOUL_FLAME_EQUIP_4 = registerSoundEvent("soul_flame_equip_4");

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

    //Flesh Mass Equip

    public static final Holder<SoundEvent> FLESH_MASS_EQUIP_1 = registerSoundEvent("flesh_mass_equip_1");
    public static final Holder<SoundEvent> FLESH_MASS_EQUIP_2 = registerSoundEvent("flesh_mass_equip_2");
    public static final Holder<SoundEvent> FLESH_MASS_EQUIP_3 = registerSoundEvent("flesh_mass_equip_3");
    public static final Holder<SoundEvent> FLESH_MASS_EQUIP_4 = registerSoundEvent("flesh_mass_equip_4");
    public static final Holder<SoundEvent> FLESH_MASS_EQUIP_5 = registerSoundEvent("flesh_mass_equip_5");
    public static final Holder<SoundEvent> FLESH_MASS_EQUIP_6 = registerSoundEvent("flesh_mass_equip_6");
    public static final Holder<SoundEvent> FLESH_MASS_EQUIP_7 = registerSoundEvent("flesh_mass_equip_7");

    public static final Holder<SoundEvent> FLESH_MASS_EQUIP = registerSoundEvent("flesh_mass_equip");

    //Cryogenic Ruler Equip

    public static final Holder<SoundEvent> CRYOGENIC_RULER_EQUIP_1 = registerSoundEvent("cryogenic_ruler_equip_1");
    public static final Holder<SoundEvent> CRYOGENIC_RULER_EQUIP_2 = registerSoundEvent("cryogenic_ruler_equip_2");
    public static final Holder<SoundEvent> CRYOGENIC_RULER_EQUIP_3 = registerSoundEvent("cryogenic_ruler_equip_3");
    public static final Holder<SoundEvent> CRYOGENIC_RULER_EQUIP_4 = registerSoundEvent("cryogenic_ruler_equip_4");

    public static final Holder<SoundEvent> CRYOGENIC_RULER_EQUIP = registerSoundEvent("cryogenic_ruler_equip");


    //Ender Dragon Equip

    public static final Holder<SoundEvent> ENDER_DRAGON_EQUIP_1 = registerSoundEvent("ender_dragon_equip_1");
    public static final Holder<SoundEvent> ENDER_DRAGON_EQUIP_2 = registerSoundEvent("ender_dragon_equip_2");
    public static final Holder<SoundEvent> ENDER_DRAGON_EQUIP_3 = registerSoundEvent("ender_dragon_equip_3");
    public static final Holder<SoundEvent> ENDER_DRAGON_EQUIP_4 = registerSoundEvent("ender_dragon_equip_4");

    public static final Holder<SoundEvent> ENDER_DRAGON_EQUIP = registerSoundEvent("ender_dragon_equip");




    private static DeferredHolder<SoundEvent, SoundEvent> registerSoundEvent(String name)
    {
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent
                (ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, name)));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
