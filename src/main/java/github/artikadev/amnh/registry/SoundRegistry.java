package github.artikadev.amnh.registry;

import github.artikadev.amnh.AmnhMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class SoundRegistry {

    public static final DeferredRegister<SoundEvent> SOUND_EVENT = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, AmnhMod.MOD_ID);

    public static final RegistryObject<SoundEvent> TITANIUM_BREAK = registerSoundEvent("titanium_break");
    public static final RegistryObject<SoundEvent> TITANIUM_WALK = registerSoundEvent("titanium_walk");
    public static final RegistryObject<SoundEvent> TITANIUM_PLACE = registerSoundEvent("titanium_place");
    public static final RegistryObject<SoundEvent> TITANIUM_HIT = registerSoundEvent("titanium_hit");

    public static final ForgeSoundType TITANIUM_SOUNDS = new ForgeSoundType(1F, 1F,
            TITANIUM_BREAK, TITANIUM_WALK, TITANIUM_PLACE, TITANIUM_HIT, TITANIUM_WALK);

    private static RegistryObject<SoundEvent> registerSoundEvent(String name){
        ResourceLocation id = new ResourceLocation(AmnhMod.MOD_ID, name);
        return SOUND_EVENT.register(name, () -> SoundEvent.createVariableRangeEvent(id));
    }
}
