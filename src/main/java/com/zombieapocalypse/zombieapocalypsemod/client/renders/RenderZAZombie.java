package com.zombieapocalypse.zombieapocalypsemod.client.renders;

import com.zombieapocalypse.zombieapocalypsemod.entities.ZAZombieEntity;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.model.ZombieModel;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderZAZombie extends MobRenderer<ZAZombieEntity, ZAZombieModel> {

    public static final ResourceLocation texture = new ResourceLocation("minecraft:textures/entity/zombie/zombie.png");

    public RenderZAZombie(EntityRendererManager renderManagerIn, ZAZombieModel entityModelIn, float shadowSizeIn) {
        super(renderManagerIn, entityModelIn, shadowSizeIn);
    }


    @Override
    public ResourceLocation getEntityTexture(ZAZombieEntity entity) {
        return texture;
    }

    public static class RenderFactory implements IRenderFactory<ZAZombieEntity>
    {
        @Override
        public EntityRenderer<? super ZAZombieEntity> createRenderFor(EntityRendererManager manager)
        {
            return new RenderZAZombie(manager, new ZAZombieModel(1.0f, true), 1.0f);
        }

    }
}
