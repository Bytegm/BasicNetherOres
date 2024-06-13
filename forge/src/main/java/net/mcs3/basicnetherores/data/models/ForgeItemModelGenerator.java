package net.mcs3.basicnetherores.data.models;

import net.mcs3.basicnetherores.Constants;
import net.mcs3.basicnetherores.init.BNOBlocks;
import net.mcs3.basicnetherores.init.BNOItems;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import static net.mcs3.basicnetherores.util.helper.ResourceLocationHelper.prefix;

public class ForgeItemModelGenerator extends ItemModelProvider {

    public ForgeItemModelGenerator(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Constants.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {


        existingParentBlockItem(BNOBlocks.NETHER_EMERALD_ORE);
        existingParentBlockItem(BNOBlocks.NETHER_DIAMOND_ORE);
        existingParentBlockItem(BNOBlocks.NETHER_REDSTONE_ORE);
        existingParentBlockItem(BNOBlocks.NETHER_LAPIS_ORE);
        existingParentBlockItem(BNOBlocks.NETHER_COAL_ORE);
        existingParentBlockItem(BNOBlocks.NETHER_SILVER_ORE);
        existingParentBlockItem(BNOBlocks.NETHER_IRON_ORE);
        existingParentBlockItem(BNOBlocks.NETHER_LEAD_ORE);
        existingParentBlockItem(BNOBlocks.NETHER_NICKEL_ORE);
        existingParentBlockItem(BNOBlocks.NETHER_COPPER_ORE);
        existingParentBlockItem(BNOBlocks.NETHER_ALUMINUM_ORE);
        existingParentBlockItem(BNOBlocks.NETHER_TIN_ORE);
        existingParentBlockItem(BNOBlocks.NETHER_OSMIUM_ORE);
        existingParentBlockItem(BNOBlocks.NETHER_URANIUM_ORE);
        existingParentBlockItem(BNOBlocks.NETHER_ZINC_ORE);

        existingParentBlockItem(BNOBlocks.ALUMINUM_BLOCK);
        existingParentBlockItem(BNOBlocks.LEAD_BLOCK);
        existingParentBlockItem(BNOBlocks.NICKEL_BLOCK);
        existingParentBlockItem(BNOBlocks.SILVER_BLOCK);
        existingParentBlockItem(BNOBlocks.TIN_BLOCK);
        existingParentBlockItem(BNOBlocks.OSMIUM_BLOCK);
        existingParentBlockItem(BNOBlocks.URANIUM_BLOCK);
        existingParentBlockItem(BNOBlocks.ZINC_BLOCK);

        existingParentBlockItem(BNOBlocks.RAW_ALUMINUM_BLOCK);
        existingParentBlockItem(BNOBlocks.RAW_LEAD_BLOCK);
        existingParentBlockItem(BNOBlocks.RAW_NICKEL_BLOCK);
        existingParentBlockItem(BNOBlocks.RAW_SILVER_BLOCK);
        existingParentBlockItem(BNOBlocks.RAW_TIN_BLOCK);
        existingParentBlockItem(BNOBlocks.RAW_OSMIUM_BLOCK);
        existingParentBlockItem(BNOBlocks.RAW_URANIUM_BLOCK);
        existingParentBlockItem(BNOBlocks.RAW_ZINC_BLOCK);

        basicItem(BNOItems.ALUMINUM_INGOT);
        basicItem(BNOItems.LEAD_INGOT);
        basicItem(BNOItems.NICKEL_INGOT);
        basicItem(BNOItems.SILVER_INGOT);
        basicItem(BNOItems.TIN_INGOT);
        basicItem(BNOItems.OSMIUM_INGOT);
        basicItem(BNOItems.URANIUM_INGOT);
        basicItem(BNOItems.ZINC_INGOT);

        basicItem(BNOItems.ALUMINUM_NUGGET);
        basicItem(BNOItems.COPPER_NUGGET);
        basicItem(BNOItems.LEAD_NUGGET);
        basicItem(BNOItems.NICKEL_NUGGET);
        basicItem(BNOItems.SILVER_NUGGET);
        basicItem(BNOItems.TIN_NUGGET);
        basicItem(BNOItems.OSMIUM_NUGGET);
        basicItem(BNOItems.ZINC_NUGGET);

        basicItem(BNOItems.RAW_ALUMINUM);
        basicItem(BNOItems.RAW_LEAD);
        basicItem(BNOItems.RAW_NICKEL);
        basicItem(BNOItems.RAW_SILVER);
        basicItem(BNOItems.RAW_TIN);
        basicItem(BNOItems.RAW_OSMIUM);
        basicItem(BNOItems.RAW_URANIUM);
        basicItem(BNOItems.RAW_ZINC);
    }

    public void existingParentBlockItem(Block block) {
        withExistingParent(block.asItem().toString(), prefix("block/" + block.asItem()));
    }
}
