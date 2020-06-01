package com.zombieapocalypse.zombieapocalypsemod.entities;

import com.zombieapocalypse.zombieapocalypsemod.init.ZombieApocalypseEntities;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.ai.goal.RandomWalkingGoal;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.world.World;

public class ZombieEntity extends net.minecraft.entity.monster.ZombieEntity {

    public ZombieEntity(EntityType<? extends ZombieEntity> type, World worldIn) {
        super(type, worldIn);

        //super((EntityType<? extends MonsterEntity>) ZombieApocalypseEntities.zombie_entity, worldIn);
    }

    @Override
    protected void registerAttributes() {
        super.registerAttributes();

        this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(2.2d);
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(0, new SwimGoal(this));
        this.goalSelector.addGoal(1, new RandomWalkingGoal(this, 1.2d));
        this.goalSelector.addGoal(2, new MeleeAttackGoal(this, 1.2d, true));

    }

}
