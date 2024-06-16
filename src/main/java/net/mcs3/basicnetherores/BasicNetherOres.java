package net.mcs3.basicnetherores;

import com.mojang.logging.LogUtils;
import net.mcs3.basicnetherores.config.BasicNetherOresConfig;
import net.mcs3.basicnetherores.init.BNOBlocks;
import net.mcs3.basicnetherores.init.BNOItems;
import net.mcs3.basicnetherores.worldgen.item.ModCreativeModeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;


@Mod(BasicNetherOres.MODID)
public class BasicNetherOres
{
    // Define mod id in a common place for everything to reference
    public static final String MODID = "bno";
    // Directly reference a slf4j logger
    public static final Logger LOG = LogUtils.getLogger();


    public BasicNetherOres()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register the Deferred Register to the mod event bus so blocks get registered
        BNOBlocks.BLOCKS.register(modEventBus);
        // Register the Deferred Register to the mod event bus so items get registered
        BNOItems.ITEMS.register(modEventBus);
        // Register the Deferred Register to the mod event bus so tabs get registered
        ModCreativeModeTabs.BNO_CREATIVE_MODE_TABS.register(modEventBus);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        // Register our mod's ForgeConfigSpec so that Forge can create and load the config file for us
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, BasicNetherOresConfig.COMMON_SPEC);
    }

}
