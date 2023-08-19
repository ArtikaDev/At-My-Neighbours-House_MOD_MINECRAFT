package github.artikadev.amnh.registry;

import github.artikadev.amnh.AmnhMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = AmnhMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CreativeTabRegistry {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AmnhMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> AMNH_TAB = CREATIVE_TABS.register("amnh_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.amnh_tab"))
                    .icon(ItemRegistry.RAW_RUTILE.get()::getDefaultInstance)
                    .displayItems((displayParameters, output) -> {
                        output.accept(ItemRegistry.RUTILE_ORE_BLOCK_ITEM.get());
                        output.accept(ItemRegistry.RAW_RUTILE.get());
                        output.accept(ItemRegistry.TITANIUM_DIOXIDE.get());
                        output.accept(ItemRegistry.TITANIUM_INGOT.get());
                        output.accept(ItemRegistry.TITANIUM_BLOCK_ITEM.get());
                    })
                    .build()
    );
}
