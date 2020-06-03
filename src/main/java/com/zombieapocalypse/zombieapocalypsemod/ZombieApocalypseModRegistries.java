package com.zombieapocalypse.zombieapocalypsemod;

import com.zombieapocalypse.zombieapocalypsemod.init.ZombieApocalypseEntities;
import com.zombieapocalypse.zombieapocalypsemod.init.ZombieApocalypseItems;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
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

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event)
    {
        event.getRegistry().registerAll
                (
                        ZombieApocalypseItems.zombieapocalypse_entity_egg = new Item(new Item.Properties().group(ITEM_GROUP)).setRegistryName(location("zombieapocalypse_entity_egg"))
                );

        LOGGER.info("Items registered.");
    }

    @SubscribeEvent
    public static void registerEntities(final RegistryEvent.Register<EntityType<?>> event)
    {
        event.getRegistry().registerAll
                (
                        ZombieApocalypseEntities.zombie_entity
                );

        //TutorialEntities.registerEntityWorldSpawns();
    }


}
