package com.zombieapocalypse.zombieapocalypsemod;

import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.Logger;

@Mod.EventBusSubscriber(bus= Mod.EventBusSubscriber.Bus.MOD)
public class ZombieApocalypseModRegistries {
    public static final ItemGroup ITEM_GROUP = ZombieApocalypseMod.ITEM_GROUP;
    public static final Logger LOGGER = ZombieApocalypseMod.LOGGER;
    public static final String MODID = ZombieApocalypseMod.MODID;


    public static ResourceLocation location(String name)
    {
        return new ResourceLocation(MODID, name);
    }


}
