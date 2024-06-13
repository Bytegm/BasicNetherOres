package net.mcs3.basicnetherores.data.model;

import net.mcs3.basicnetherores.Constants;
import net.mcs3.basicnetherores.init.BNOBlocks;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.function.Supplier;

import static net.mcs3.basicnetherores.util.helper.ResourceLocationHelper.prefix;

public class NeoBlockStateGenerator extends BlockStateProvider {

    public NeoBlockStateGenerator(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Constants.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        createSimpleOreBlocks(BNOBlocks.NETHER_EMERALD_ORE, "nether_emerald_ore");
        createSimpleOreBlocks(BNOBlocks.NETHER_DIAMOND_ORE, "nether_diamond_ore");
        createSimpleOreBlocks(BNOBlocks.NETHER_REDSTONE_ORE, "nether_redstone_ore");
        createSimpleOreBlocks(BNOBlocks.NETHER_LAPIS_ORE, "nether_lapis_ore");
        createSimpleOreBlocks(BNOBlocks.NETHER_COAL_ORE, "nether_coal_ore");
        createSimpleOreBlocks(BNOBlocks.NETHER_SILVER_ORE, "nether_silver_ore");
        createSimpleOreBlocks(BNOBlocks.NETHER_IRON_ORE, "nether_iron_ore");
        createSimpleOreBlocks(BNOBlocks.NETHER_LEAD_ORE, "nether_lead_ore");
        createSimpleOreBlocks(BNOBlocks.NETHER_NICKEL_ORE, "nether_nickel_ore");
        createSimpleOreBlocks(BNOBlocks.NETHER_COPPER_ORE, "nether_copper_ore");
        createSimpleOreBlocks(BNOBlocks.NETHER_ALUMINUM_ORE, "nether_aluminum_ore");
        createSimpleOreBlocks(BNOBlocks.NETHER_TIN_ORE, "nether_tin_ore");
        createSimpleOreBlocks(BNOBlocks.NETHER_OSMIUM_ORE, "nether_osmium_ore");
        createSimpleOreBlocks(BNOBlocks.NETHER_URANIUM_ORE, "nether_uranium_ore");
        createSimpleOreBlocks(BNOBlocks.NETHER_ZINC_ORE, "nether_zinc_ore");

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

    public void createSimpleOreBlocks(Block block, String textureKey) {
        ModelFile blockModel = models().withExistingParent("block/" + textureKey, prefix("block/cube_overlay_all"))
                .texture("all", mcLoc("block/" + BuiltInRegistries.BLOCK.getKey(Blocks.NETHERRACK).getPath()))
                .texture("overlay", prefix("block/" + textureKey));
        simpleBlock(block, blockModel);
    }
}
