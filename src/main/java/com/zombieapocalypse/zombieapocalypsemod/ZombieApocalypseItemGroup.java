package com.zombieapocalypse.zombieapocalypsemod;

import com.zombieapocalypse.zombieapocalypsemod.init.ZombieApocalypseItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ZombieApocalypseItemGroup extends ItemGroup {

    public ZombieApocalypseItemGroup() {
        super("Zombie Apocalypse");
    }


    @Override
    public ItemStack createIcon() {
        return new ItemStack(ZombieApocalypseItems.zombieapocalypse_entity_egg);
    }
}
