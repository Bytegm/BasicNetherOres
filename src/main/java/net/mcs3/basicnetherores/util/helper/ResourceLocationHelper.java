package net.mcs3.basicnetherores.util.helper;

import net.mcs3.basicnetherores.BasicNetherOres;
import net.minecraft.resources.ResourceLocation;

public class ResourceLocationHelper {
    public static ResourceLocation prefix(String path) {
        return new ResourceLocation(BasicNetherOres.MODID, path);
    }
}
