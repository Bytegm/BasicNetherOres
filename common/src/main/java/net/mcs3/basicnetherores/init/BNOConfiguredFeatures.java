package net.mcs3.basicnetherores.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;

import java.util.List;

import static net.mcs3.basicnetherores.util.helper.ResourceLocationHelper.prefix;

public class BNOConfiguredFeatures {

    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_EMERALD_CONFIGURED_FEATURE = registerKey("ore_emerald_nether");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_DIAMOND_CONFIGURED_FEATURE = registerKey("ore_diamond_nether");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_REDSTONE_CONFIGURED_FEATURE = registerKey("ore_redstone_nether");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_LAPIS_CONFIGURED_FEATURE = registerKey("ore_lapis_nether");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_COAL_CONFIGURED_FEATURE = registerKey("ore_coal_nether");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_SILVER_CONFIGURED_FEATURE = registerKey("ore_silver_nether");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_IRON_CONFIGURED_FEATURE = registerKey("ore_iron_nether");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_LEAD_CONFIGURED_FEATURE = registerKey("ore_lead_nether");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_NICKEL_CONFIGURED_FEATURE = registerKey("ore_nickel_nether");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_COPPER_CONFIGURED_FEATURE = registerKey("ore_copper_nether");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_ALUMINUM_CONFIGURED_FEATURE = registerKey("ore_aluminum_nether");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_TIN_CONFIGURED_FEATURE = registerKey("ore_tin_nether");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_OSMIUM_CONFIGURED_FEATURE = registerKey("ore_osmium_nether");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_URANIUM_CONFIGURED_FEATURE = registerKey("ore_uranium_nether");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_ZINC_CONFIGURED_FEATURE = registerKey("ore_zinc_nether");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {

        RuleTest netherrackTest = new BlockMatchTest(Blocks.NETHERRACK);
        RuleTest basaltTest = new BlockMatchTest(Blocks.BASALT);
        RuleTest soulTest = new BlockMatchTest(Blocks.SOUL_SOIL);

        List<OreConfiguration.TargetBlockState> emeraldList = List.of(OreConfiguration.target(netherrackTest, BNOBlocks.NETHER_EMERALD_ORE.defaultBlockState()),
                OreConfiguration.target(basaltTest, BNOBlocks.BASALT_EMERALD_ORE.defaultBlockState()),
                OreConfiguration.target(soulTest, BNOBlocks.SOUL_EMERALD_ORE.defaultBlockState()));

        List<OreConfiguration.TargetBlockState> diamondList = List.of(OreConfiguration.target(netherrackTest, BNOBlocks.NETHER_DIAMOND_ORE.defaultBlockState()),
                OreConfiguration.target(basaltTest, BNOBlocks.BASALT_DIAMOND_ORE.defaultBlockState()),
                OreConfiguration.target(soulTest, BNOBlocks.SOUL_DIAMOND_ORE.defaultBlockState()));

        List<OreConfiguration.TargetBlockState> redstoneList = List.of(OreConfiguration.target(netherrackTest, BNOBlocks.NETHER_REDSTONE_ORE.defaultBlockState()),
                OreConfiguration.target(basaltTest, BNOBlocks.BASALT_REDSTONE_ORE.defaultBlockState()),
                OreConfiguration.target(soulTest, BNOBlocks.SOUL_REDSTONE_ORE.defaultBlockState()));

        List<OreConfiguration.TargetBlockState> lapisList = List.of(OreConfiguration.target(netherrackTest, BNOBlocks.NETHER_LAPIS_ORE.defaultBlockState()),
                OreConfiguration.target(basaltTest, BNOBlocks.BASALT_LAPIS_ORE.defaultBlockState()),
                OreConfiguration.target(soulTest, BNOBlocks.SOUL_LAPIS_ORE.defaultBlockState()));

        List<OreConfiguration.TargetBlockState> coalList = List.of(OreConfiguration.target(netherrackTest, BNOBlocks.NETHER_COAL_ORE.defaultBlockState()),
                OreConfiguration.target(basaltTest, BNOBlocks.BASALT_COAL_ORE.defaultBlockState()),
                OreConfiguration.target(soulTest, BNOBlocks.SOUL_COAL_ORE.defaultBlockState()));

        List<OreConfiguration.TargetBlockState> silverList = List.of(OreConfiguration.target(netherrackTest, BNOBlocks.NETHER_SILVER_ORE.defaultBlockState()),
                OreConfiguration.target(basaltTest, BNOBlocks.BASALT_SILVER_ORE.defaultBlockState()),
                OreConfiguration.target(soulTest, BNOBlocks.SOUL_SILVER_ORE.defaultBlockState()));

        List<OreConfiguration.TargetBlockState> ironList = List.of(OreConfiguration.target(netherrackTest, BNOBlocks.NETHER_IRON_ORE.defaultBlockState()),
                OreConfiguration.target(basaltTest, BNOBlocks.BASALT_IRON_ORE.defaultBlockState()),
                OreConfiguration.target(soulTest, BNOBlocks.SOUL_IRON_ORE.defaultBlockState()));

        List<OreConfiguration.TargetBlockState> leadList = List.of(OreConfiguration.target(netherrackTest, BNOBlocks.NETHER_LEAD_ORE.defaultBlockState()),
                OreConfiguration.target(basaltTest, BNOBlocks.BASALT_LEAD_ORE.defaultBlockState()),
                OreConfiguration.target(soulTest, BNOBlocks.SOUL_LEAD_ORE.defaultBlockState()));

        List<OreConfiguration.TargetBlockState> nickelList = List.of(OreConfiguration.target(netherrackTest, BNOBlocks.NETHER_NICKEL_ORE.defaultBlockState()),
                OreConfiguration.target(basaltTest, BNOBlocks.BASALT_NICKEL_ORE.defaultBlockState()),
                OreConfiguration.target(soulTest, BNOBlocks.SOUL_NICKEL_ORE.defaultBlockState()));

        List<OreConfiguration.TargetBlockState> copperList = List.of(OreConfiguration.target(netherrackTest, BNOBlocks.NETHER_COPPER_ORE.defaultBlockState()),
                OreConfiguration.target(basaltTest, BNOBlocks.BASALT_COPPER_ORE.defaultBlockState()),
                OreConfiguration.target(soulTest, BNOBlocks.SOUL_COPPER_ORE.defaultBlockState()));

        List<OreConfiguration.TargetBlockState> aluminumList = List.of(OreConfiguration.target(netherrackTest, BNOBlocks.NETHER_ALUMINUM_ORE.defaultBlockState()),
                OreConfiguration.target(basaltTest, BNOBlocks.BASALT_ALUMINUM_ORE.defaultBlockState()),
                OreConfiguration.target(soulTest, BNOBlocks.SOUL_ALUMINUM_ORE.defaultBlockState()));

        List<OreConfiguration.TargetBlockState> tinList = List.of(OreConfiguration.target(netherrackTest, BNOBlocks.NETHER_TIN_ORE.defaultBlockState()),
                OreConfiguration.target(basaltTest, BNOBlocks.BASALT_TIN_ORE.defaultBlockState()),
                OreConfiguration.target(soulTest, BNOBlocks.SOUL_TIN_ORE.defaultBlockState()));

        List<OreConfiguration.TargetBlockState> osmiumList = List.of(OreConfiguration.target(netherrackTest, BNOBlocks.NETHER_OSMIUM_ORE.defaultBlockState()),
                OreConfiguration.target(basaltTest, BNOBlocks.BASALT_OSMIUM_ORE.defaultBlockState()),
                OreConfiguration.target(soulTest, BNOBlocks.SOUL_OSMIUM_ORE.defaultBlockState()));

        List<OreConfiguration.TargetBlockState> uraniumList = List.of(OreConfiguration.target(netherrackTest, BNOBlocks.NETHER_URANIUM_ORE.defaultBlockState()),
                OreConfiguration.target(basaltTest, BNOBlocks.BASALT_URANIUM_ORE.defaultBlockState()),
                OreConfiguration.target(soulTest, BNOBlocks.SOUL_URANIUM_ORE.defaultBlockState()));

        List<OreConfiguration.TargetBlockState> zincList = List.of(OreConfiguration.target(netherrackTest, BNOBlocks.NETHER_ZINC_ORE.defaultBlockState()),
                OreConfiguration.target(basaltTest, BNOBlocks.BASALT_ZINC_ORE.defaultBlockState()),
                OreConfiguration.target(soulTest, BNOBlocks.SOUL_ZINC_ORE.defaultBlockState()));

        register(context, ORE_EMERALD_CONFIGURED_FEATURE, Feature.ORE, new OreConfiguration(emeraldList, 4));
        register(context, ORE_DIAMOND_CONFIGURED_FEATURE, Feature.ORE, new OreConfiguration(diamondList, 8));
        register(context, ORE_REDSTONE_CONFIGURED_FEATURE, Feature.ORE, new OreConfiguration(redstoneList, 8));
        register(context, ORE_LAPIS_CONFIGURED_FEATURE, Feature.ORE, new OreConfiguration(lapisList, 7));
        register(context, ORE_COAL_CONFIGURED_FEATURE, Feature.ORE, new OreConfiguration(coalList, 17));
        register(context, ORE_SILVER_CONFIGURED_FEATURE, Feature.ORE, new OreConfiguration(silverList, 9));
        register(context, ORE_IRON_CONFIGURED_FEATURE, Feature.ORE, new OreConfiguration(ironList, 8));
        register(context, ORE_LEAD_CONFIGURED_FEATURE, Feature.ORE, new OreConfiguration(leadList, 8));
        register(context, ORE_NICKEL_CONFIGURED_FEATURE, Feature.ORE, new OreConfiguration(nickelList, 4));
        register(context, ORE_COPPER_CONFIGURED_FEATURE, Feature.ORE, new OreConfiguration(copperList, 8));
        register(context, ORE_ALUMINUM_CONFIGURED_FEATURE, Feature.ORE, new OreConfiguration(aluminumList, 8));
        register(context, ORE_TIN_CONFIGURED_FEATURE, Feature.ORE, new OreConfiguration(tinList, 8));
        register(context, ORE_OSMIUM_CONFIGURED_FEATURE, Feature.ORE, new OreConfiguration(osmiumList, 8));
        register(context, ORE_URANIUM_CONFIGURED_FEATURE, Feature.ORE, new OreConfiguration(uraniumList, 4));
        register(context, ORE_ZINC_CONFIGURED_FEATURE, Feature.ORE, new OreConfiguration(zincList, 12));
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, prefix(name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }

    public static void initialize() {};
}
