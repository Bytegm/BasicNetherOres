package net.mcs3.basicnetherores.helpers;

import java.io.File;

public class FabricBiomeChecker {

    public static boolean checkPlacedFeature(String name) {



        File file = new File("/data/bno/worldgen/placed_feature/" + name + ".json");
        if(file.isFile()) {
            return true;
        } else
            return false;
    }
}
