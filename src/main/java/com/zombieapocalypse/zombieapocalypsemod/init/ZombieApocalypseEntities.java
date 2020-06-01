package com.zombieapocalypse.zombieapocalypsemod.init;

import com.example.examplemod.ExampleMod;
import com.zombieapocalypse.zombieapocalypsemod.ZombieApocalypseMod;
import com.zombieapocalypse.zombieapocalypsemod.ZombieApocalypseModRegistries;
import com.zombieapocalypse.zombieapocalypsemod.entities.ZombieEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraftforge.event.RegistryEvent;

public class ZombieApocalypseEntities {
    public static EntityType<?> zombie_entity = EntityType.Builder.create(ZombieEntity::new, EntityClassification.MONSTER)
            .build(ZombieApocalypseModRegistries.MODID + ":tutorial_entity")
            .setRegistryName(ZombieApocalypseModRegistries.location("zombie_entity"));

    public static void registerEntitySpawnEggs(final RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
                ZombieApocalypseItems.zombieapocalypse_entity_egg = registerEntitySpawnEgg(zombie_entity, 0x185e32, 0x4f3e0c, "zombieapocalypse_entity_egg")
        );
    }

    public static Item registerEntitySpawnEgg(EntityType<?> type, int color1, int color2, String name)
    {
        SpawnEggItem item = new SpawnEggItem(type, color1, color2, new Item.Properties().group(ZombieApocalypseModRegistries.ITEM_GROUP));
        item.setRegistryName(ZombieApocalypseModRegistries.location(name));

        return item;
    }
}
