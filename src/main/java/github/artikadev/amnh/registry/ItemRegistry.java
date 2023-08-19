package github.artikadev.amnh.registry;

import github.artikadev.amnh.AmnhMod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AmnhMod.MOD_ID);

    // Items
    public static final RegistryObject<Item> RAW_RUTILE = ITEMS.register("raw_rutile",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TITANIUM_DIOXIDE = ITEMS.register("titanium_dioxide",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot",
            () -> new Item(new Item.Properties()));



    // Block Items
    public static final RegistryObject<BlockItem> RUTILE_ORE_BLOCK_ITEM = ITEMS.register("rutile_ore",
            () -> new BlockItem(BlockRegistry.RUTILE_ORE.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> TITANIUM_BLOCK_ITEM = ITEMS.register("titanium_block",
            () -> new BlockItem(BlockRegistry.TITANIUM_BLOCK.get(), new Item.Properties()));

}
