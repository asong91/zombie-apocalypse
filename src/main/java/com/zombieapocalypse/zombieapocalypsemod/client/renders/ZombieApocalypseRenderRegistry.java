package com.zombieapocalypse.zombieapocalypsemod.client.renders;

import com.zombieapocalypse.zombieapocalypsemod.entities.ZAZombieEntity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

@OnlyIn(Dist.CLIENT)
public class ZombieApocalypseRenderRegistry {

    public static void registryEntityRenders()
    {
        RenderingRegistry.registerEntityRenderingHandler(ZAZombieEntity.class, new ZAZombieRenderer.RenderFactory());
    }
}
