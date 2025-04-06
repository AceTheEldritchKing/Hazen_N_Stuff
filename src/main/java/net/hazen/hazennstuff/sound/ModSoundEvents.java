package net.hazen.hazennstuff.sound;

import com.google.common.collect.ImmutableList;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;

import java.util.stream.IntStream;

public class ModSoundEvents {

    public static final Holder<SoundEvent> SOUL_FLAME_EQUIP = registerForHolder("item.armor.equip_netherite");

    private static Holder<SoundEvent> register(ResourceLocation name, ResourceLocation location, float range) {
        return Registry.registerForHolder(BuiltInRegistries.SOUND_EVENT, name, SoundEvent.createFixedRangeEvent(location, range));
    }

    private static SoundEvent register(String name) {
        return register(ResourceLocation.withDefaultNamespace(name));
    }

    private static SoundEvent register(ResourceLocation name) {
        return register(name, name);
    }

    private static Holder.Reference<SoundEvent> registerForHolder(String name) {
        return registerForHolder(ResourceLocation.withDefaultNamespace(name));
    }

    private static Holder.Reference<SoundEvent> registerForHolder(ResourceLocation name) {
        return registerForHolder(name, name);
    }

    private static SoundEvent register(ResourceLocation name, ResourceLocation location) {
        return (SoundEvent)Registry.register(BuiltInRegistries.SOUND_EVENT, name, SoundEvent.createVariableRangeEvent(location));
    }

    private static Holder.Reference<SoundEvent> registerForHolder(ResourceLocation name, ResourceLocation location) {
        return Registry.registerForHolder(BuiltInRegistries.SOUND_EVENT, name, SoundEvent.createVariableRangeEvent(location));
    }

    private static ImmutableList<Holder.Reference<SoundEvent>> registerGoatHornSoundVariants() {
        return (ImmutableList) IntStream.range(0, 8).mapToObj((p_215784_) -> registerForHolder("item.goat_horn.sound." + p_215784_)).collect(ImmutableList.toImmutableList());
    }

}
