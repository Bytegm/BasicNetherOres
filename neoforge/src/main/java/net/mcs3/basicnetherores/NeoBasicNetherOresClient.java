package net.mcs3.basicnetherores;

import net.mcs3.basicnetherores.client.ShippedResourcePack;
import net.mcs3.basicnetherores.client.renderer.BlockRenderLayers;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = Constants.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class NeoBasicNetherOresClient {

    @SubscribeEvent
    public static void clientInit(FMLClientSetupEvent evt) {
        ShippedResourcePack.extractFiles("Basic Nether Ores 32x");
        BlockRenderLayers.registerRenderLayers(ItemBlockRenderTypes::setRenderLayer);
    }
}
