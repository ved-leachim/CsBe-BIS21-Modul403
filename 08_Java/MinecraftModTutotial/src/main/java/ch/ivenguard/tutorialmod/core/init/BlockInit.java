package ch.ivenguard.tutorialmod.core.init;

import ch.ivenguard.tutorialmod.Tutorialmod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {


    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Tutorialmod.MOD_ID);


    public  static final RegistryObject<Block> TEST_BLOCK = BLOCKS.register("test_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.IRON, MaterialColor.GRAY).hardnessAndResistance(1.5f, 6).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE)));
}
