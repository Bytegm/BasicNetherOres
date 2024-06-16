package net.mcs3.basicnetherores.init;

import net.mcs3.basicnetherores.BasicNetherOres;
import net.mcs3.basicnetherores.worldgen.level.block.ModOreBlock;
import net.mcs3.basicnetherores.worldgen.level.block.ModRedstoneOreBlock;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;
import java.util.function.ToIntFunction;

public class BNOBlocks {

    // Create a Deferred Register to hold Blocks which will all be registered under the "examplemod" namespace
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BasicNetherOres.MODID);

    public static final BlockBehaviour.Properties NETHER_ORES_PROPERTIES = BlockBehaviour.Properties.of().mapColor(MapColor.NETHER).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.NETHER_GOLD_ORE);
    public static final BlockBehaviour.Properties REDSTONE_ORE_PROPERTIES = BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().randomTicks().lightLevel(litBlockEmission(9)).strength(3.0F, 3.0F).sound(SoundType.NETHER_GOLD_ORE);
    public static final BlockBehaviour.Properties METAL_BLOCKS = BlockBehaviour.Properties.of().mapColor(MapColor.METAL).instrument(NoteBlockInstrument.XYLOPHONE).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL);
    public static final BlockBehaviour.Properties RAW_ORE_BLOCKS = BlockBehaviour.Properties.of().mapColor(MapColor.RAW_IRON).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(5.0F, 6.0F);


    // Creates a new Block with the id "examplemod:example_block", combining the namespace and path
//    public static final RegistryObject<Block> EXAMPLE_BLOCK = BLOCKS.register("example_block", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE)));
    public static final RegistryObject<Block> NETHER_EMERALD_ORE = register("nether_emerald_ore", () -> new ModOreBlock(NETHER_ORES_PROPERTIES, UniformInt.of(3, 7)));
    public static final RegistryObject<Block> NETHER_DIAMOND_ORE = register("nether_diamond_ore", () -> new ModOreBlock(NETHER_ORES_PROPERTIES, UniformInt.of(3,7)));
    public static final RegistryObject<Block> NETHER_REDSTONE_ORE = register("nether_redstone_ore", () -> new ModRedstoneOreBlock(REDSTONE_ORE_PROPERTIES));
    public static final RegistryObject<Block> NETHER_LAPIS_ORE = register("nether_lapis_ore", () -> new ModOreBlock(NETHER_ORES_PROPERTIES, UniformInt.of(2,5)));
    public static final RegistryObject<Block> NETHER_COAL_ORE = register("nether_coal_ore", () -> new ModOreBlock(NETHER_ORES_PROPERTIES, UniformInt.of(0,2)));
    public static final RegistryObject<Block> NETHER_SILVER_ORE = register("nether_silver_ore", () -> new ModOreBlock(NETHER_ORES_PROPERTIES));
    public static final RegistryObject<Block> NETHER_IRON_ORE = register("nether_iron_ore", () -> new ModOreBlock(NETHER_ORES_PROPERTIES));
    public static final RegistryObject<Block> NETHER_LEAD_ORE = register("nether_lead_ore", () -> new ModOreBlock(NETHER_ORES_PROPERTIES));
    public static final RegistryObject<Block> NETHER_NICKEL_ORE = register("nether_nickel_ore", () -> new ModOreBlock(NETHER_ORES_PROPERTIES));
    public static final RegistryObject<Block> NETHER_COPPER_ORE = register("nether_copper_ore", () -> new ModOreBlock(NETHER_ORES_PROPERTIES));
    public static final RegistryObject<Block> NETHER_ALUMINUM_ORE = register("nether_aluminum_ore", () -> new ModOreBlock(NETHER_ORES_PROPERTIES));
    public static final RegistryObject<Block> NETHER_TIN_ORE = register("nether_tin_ore", () -> new ModOreBlock(NETHER_ORES_PROPERTIES));
    public static final RegistryObject<Block> NETHER_OSMIUM_ORE = register("nether_osmium_ore", () -> new ModOreBlock(NETHER_ORES_PROPERTIES));
    public static final RegistryObject<Block> NETHER_URANIUM_ORE = register("nether_uranium_ore", () -> new ModOreBlock(NETHER_ORES_PROPERTIES));
    public static final RegistryObject<Block> NETHER_ZINC_ORE = register("nether_zinc_ore", () -> new ModOreBlock(NETHER_ORES_PROPERTIES));

    public static final RegistryObject<Block> ALUMINUM_BLOCK = register("aluminum_block", () -> new Block(METAL_BLOCKS));
    public static final RegistryObject<Block> LEAD_BLOCK = register("lead_block", () -> new Block(METAL_BLOCKS));
    public static final RegistryObject<Block> NICKEL_BLOCK = register("nickel_block", () -> new Block(METAL_BLOCKS));
    public static final RegistryObject<Block> SILVER_BLOCK = register("silver_block", () -> new Block(METAL_BLOCKS));
    public static final RegistryObject<Block> TIN_BLOCK = register("tin_block", () -> new Block(METAL_BLOCKS));
    public static final RegistryObject<Block> OSMIUM_BLOCK = register("osmium_block", () -> new Block(METAL_BLOCKS));
    public static final RegistryObject<Block> URANIUM_BLOCK = register("uranium_block", () -> new Block(METAL_BLOCKS));
    public static final RegistryObject<Block> ZINC_BLOCK = register("zinc_block", () -> new Block(METAL_BLOCKS));

    public static final RegistryObject<Block> RAW_ALUMINUM_BLOCK = register("raw_aluminum_block", () -> new Block(RAW_ORE_BLOCKS));
    public static final RegistryObject<Block> RAW_LEAD_BLOCK = register("raw_lead_block", () -> new Block(RAW_ORE_BLOCKS));
    public static final RegistryObject<Block> RAW_NICKEL_BLOCK = register("raw_nickel_block", () -> new Block(RAW_ORE_BLOCKS));
    public static final RegistryObject<Block> RAW_SILVER_BLOCK = register("raw_silver_block", () -> new Block(RAW_ORE_BLOCKS));
    public static final RegistryObject<Block> RAW_TIN_BLOCK = register("raw_tin_block", () -> new Block(RAW_ORE_BLOCKS));
    public static final RegistryObject<Block> RAW_OSMIUM_BLOCK = register("raw_osmium_block", () -> new Block(RAW_ORE_BLOCKS));
    public static final RegistryObject<Block> RAW_URANIUM_BLOCK = register("raw_uranium_block", () -> new Block(RAW_ORE_BLOCKS));
    public static final RegistryObject<Block> RAW_ZINC_BLOCK = register("raw_zinc_block", () -> new Block(RAW_ORE_BLOCKS));

    private static RegistryObject<Block> register(String id, Supplier<Block> block) {
        RegistryObject<Block> toReturn = BLOCKS.register(id, block);
        BNOItems.ITEMS.register(id, () -> new BlockItem(toReturn.get(), new Item.Properties()));
        return toReturn;
    }

    private static ToIntFunction<BlockState> litBlockEmission(int $$0) {
        return ($$1) -> $$1.getValue(BlockStateProperties.LIT) ? $$0 : 0;
    }
}
