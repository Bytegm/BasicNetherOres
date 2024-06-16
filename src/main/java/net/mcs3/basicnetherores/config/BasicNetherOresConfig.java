package net.mcs3.basicnetherores.config;

import net.mcs3.basicnetherores.BasicNetherOres;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.config.ModConfigEvent;

import java.util.Arrays;
import java.util.List;

@Mod.EventBusSubscriber(modid = BasicNetherOres.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class BasicNetherOresConfig {

    private static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();

    private static ForgeConfigSpec.BooleanValue PIGLIN_GUARD = BUILDER
            .comment("If set to 'true' Piglins will protect Nether Ores")
            .define("ore_protector.piglinGuard", true);

    private static ForgeConfigSpec.BooleanValue SILK_EFFECT = BUILDER
            .comment("Set to false if you want the Piglins to attack when using Silk Touch Tools")
            .define("ore_protector.silkEffect", true);

    private static ForgeConfigSpec.IntValue PROTECTION_RANGE = BUILDER
            .comment("Set range that Piglins will aggro when mining ores(Default = 16)")
            .defineInRange("ore_protector.protectionRange", 16, 0, 64);

    private static ForgeConfigSpec.ConfigValue<List<? extends String>> PROTECTED_BLOCKS = BUILDER
            .comment("Add Blocks to be protected by Piglins (Example: 'minecraft:glowstone')")
            .defineList("ore_protector.protectedBlocks", Arrays.asList(new String[]
                    {
                            "bno:nether_emerald_ore",
                            "bno:nether_diamond_ore",
                            "bno:nether_lapis_ore",
                            "bno:nether_redstone_ore",
                            "minecraft:nether_gold_ore",
                            "bno:nether_silver_ore",
                            "bno:nether_iron_ore",
                            "bno:nether_lead_ore",
                            "bno:nether_nickel_ore",
                            "bno:nether_coal_ore",
                            "bno:nether_copper_ore",
                            "bno:nether_aluminum_ore",
                            "bno:nether_tin_ore",
                            "bno:nether_osmium_ore",
                            "bno:nether_uranium_ore",
                            "bno:nether_zinc_ore",
                            "minecraft:glowstone",
                            "minecraft:nether_quartz_ore"
                    }), (obj) -> obj instanceof String ? true : false);


    public static final ForgeConfigSpec COMMON_SPEC = BUILDER.build();

    public static boolean piglinGuard;
    public static boolean silkEffect;
    public static int protectionRange;
    public static List<? extends String> protectedBlocks;


    @SubscribeEvent
    static void onLoad(final ModConfigEvent event)
    {
        piglinGuard = PIGLIN_GUARD.get();
        silkEffect = SILK_EFFECT.get();
        protectionRange = PROTECTION_RANGE.get();
        protectedBlocks = PROTECTED_BLOCKS.get();
    }
}
