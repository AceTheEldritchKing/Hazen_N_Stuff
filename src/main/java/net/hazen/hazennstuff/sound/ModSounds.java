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

    public static final Holder<SoundEvent> SOUL_FLAME_EQUIP_1 = registerSoundEvent("soul_flame_equip_1");
    public static final Holder<SoundEvent> SOUL_FLAME_EQUIP_2 = registerSoundEvent("soul_flame_equip_2");
    public static final Holder<SoundEvent> SOUL_FLAME_EQUIP_3 = registerSoundEvent("soul_flame_equip_3");
    public static final Holder<SoundEvent> SOUL_FLAME_EQUIP_4 = registerSoundEvent("soul_flame_equip_4");
    public static final Holder<SoundEvent> SOUL_FLAME_EQUIP_5 = registerSoundEvent("soul_flame_equip_5");

    public static final Holder<SoundEvent> SOUL_FLAME_EQUIP = registerSoundEvent("soul_flame_equip");

    private static DeferredHolder<SoundEvent, SoundEvent> registerSoundEvent(String name)
    {
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent
                (ResourceLocation.fromNamespaceAndPath(HazenNStuff.MOD_ID, name)));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
