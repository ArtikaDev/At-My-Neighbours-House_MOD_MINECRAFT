package github.artikadev.amnh.registry;

import github.artikadev.amnh.AmnhMod;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, AmnhMod.MOD_ID);

    public static final RegistryObject<Block> TITANIUM_BLOCK = BLOCKS.register("titanium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OBSIDIAN)
                    .instrument(NoteBlockInstrument.BASS)
                    .sound(SoundRegistry.TITANIUM_SOUNDS)));

    public static final RegistryObject<Block> RUTILE_ORE = BLOCKS.register("rutile_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)
                    .sound(SoundType.SAND)
                    ,UniformInt.of(9, 15)));

}
