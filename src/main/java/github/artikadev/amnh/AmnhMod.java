package github.artikadev.amnh;

import github.artikadev.amnh.registry.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(AmnhMod.MOD_ID)
public class AmnhMod {
    public static final String MOD_ID = "amnh";

    public AmnhMod(){
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemRegistry.ITEMS.register(bus);
        BlockRegistry.BLOCKS.register(bus);
        CreativeTabRegistry.CREATIVE_TABS.register(bus);
        SoundRegistry.SOUND_EVENT.register(bus);
    }
}
