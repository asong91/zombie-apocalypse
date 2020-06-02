package com.zombieapocalypse.zombieapocalypsemod.entities;

import net.minecraft.entity.EntityType;
import net.minecraft.world.World;

public class ZAZombieEntity extends net.minecraft.entity.monster.ZombieEntity {

    public ZAZombieEntity(EntityType<? extends ZAZombieEntity> type, World worldIn) {
        super(type, worldIn);

        //super((EntityType<? extends MonsterEntity>) ZombieApocalypseEntities.zombie_entity, worldIn);
    }

    /*@Override
    protected void registerAttributes() {
        super.registerAttributes();

        this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(2.2d);
    }*/

    /*@Override
    protected void registerGoals() {
        this.goalSelector.addGoal(0, new SwimGoal(this));
        this.goalSelector.addGoal(1, new RandomWalkingGoal(this, 1.2d));
        this.goalSelector.addGoal(2, new MeleeAttackGoal(this, 1.2d, true));

    }*/

}
