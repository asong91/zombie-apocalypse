package com.zombieapocalypse.zombieapocalypsemod.client.renders;

import com.zombieapocalypse.zombieapocalypsemod.client.models.ZAZombieModel;
import com.zombieapocalypse.zombieapocalypsemod.entities.ZAZombieEntity;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.IRenderFactory;

@OnlyIn(Dist.CLIENT)
public class ZAZombieRenderer extends MobRenderer<ZAZombieEntity, ZAZombieModel> {

    public static final ResourceLocation texture = new ResourceLocation("minecraft:textures/entity/zombie/zombie.png");


    public ZAZombieRenderer(EntityRendererManager manager) {
        super(manager, new ZAZombieModel(1.0f, true), 0f);
    }


    @Override
    public ResourceLocation getEntityTexture(ZAZombieEntity entity) {
        return texture;
    }

    public static class RenderFactory implements IRenderFactory<ZAZombieEntity> {

        @Override
        public EntityRenderer<? super ZAZombieEntity> createRenderFor(EntityRendererManager manager)
        {
            return new ZAZombieRenderer(manager);
        }

    }
}
