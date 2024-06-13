package net.mcs3.basicnetherores.data.models;

import net.mcs3.basicnetherores.Constants;
import net.mcs3.basicnetherores.init.BNOBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.model.ModelTemplate;
import net.minecraft.data.models.model.TextureMapping;
import net.minecraft.data.models.model.TextureSlot;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

import static net.mcs3.basicnetherores.util.helper.ResourceLocationHelper.prefix;

import java.util.Optional;

public class ForgeBlockStateGenerator extends BlockStateProvider {

    public ForgeBlockStateGenerator(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Constants.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        createSimpleOreBlocks(BNOBlocks.NETHER_EMERALD_ORE);
        createSimpleOreBlocks(BNOBlocks.NETHER_DIAMOND_ORE);
        createSimpleOreBlocks(BNOBlocks.NETHER_REDSTONE_ORE);
        createSimpleOreBlocks(BNOBlocks.NETHER_LAPIS_ORE);
        createSimpleOreBlocks(BNOBlocks.NETHER_COAL_ORE);
        createSimpleOreBlocks(BNOBlocks.NETHER_SILVER_ORE);
        createSimpleOreBlocks(BNOBlocks.NETHER_IRON_ORE);
        createSimpleOreBlocks(BNOBlocks.NETHER_LEAD_ORE);
        createSimpleOreBlocks(BNOBlocks.NETHER_NICKEL_ORE);
        createSimpleOreBlocks(BNOBlocks.NETHER_COPPER_ORE);
        createSimpleOreBlocks(BNOBlocks.NETHER_ALUMINUM_ORE);
        createSimpleOreBlocks(BNOBlocks.NETHER_TIN_ORE);
        createSimpleOreBlocks(BNOBlocks.NETHER_OSMIUM_ORE);
        createSimpleOreBlocks(BNOBlocks.NETHER_URANIUM_ORE);
        createSimpleOreBlocks(BNOBlocks.NETHER_ZINC_ORE);

        simpleBlock(BNOBlocks.ALUMINUM_BLOCK);
        simpleBlock(BNOBlocks.LEAD_BLOCK);
        simpleBlock(BNOBlocks.NICKEL_BLOCK);
        simpleBlock(BNOBlocks.SILVER_BLOCK);
        simpleBlock(BNOBlocks.TIN_BLOCK);
        simpleBlock(BNOBlocks.OSMIUM_BLOCK);
        simpleBlock(BNOBlocks.URANIUM_BLOCK);
        simpleBlock(BNOBlocks.ZINC_BLOCK);

        simpleBlock(BNOBlocks.RAW_ALUMINUM_BLOCK);
        simpleBlock(BNOBlocks.RAW_LEAD_BLOCK);
        simpleBlock(BNOBlocks.RAW_NICKEL_BLOCK);
        simpleBlock(BNOBlocks.RAW_SILVER_BLOCK);
        simpleBlock(BNOBlocks.RAW_TIN_BLOCK);
        simpleBlock(BNOBlocks.RAW_OSMIUM_BLOCK);
        simpleBlock(BNOBlocks.RAW_URANIUM_BLOCK);
        simpleBlock(BNOBlocks.RAW_ZINC_BLOCK);

    }

    public void createSimpleOreBlocks(Block block) {
        ModelFile blockModel = models().withExistingParent(block.asItem().toString(), prefix("block/cube_overlay_all")).texture("all", mcLoc("block/" + Blocks.NETHERRACK.asItem().toString())).texture("overlay", prefix("block/" + block.asItem().toString()));
        simpleBlock(block, blockModel);
    }
}
