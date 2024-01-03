package net.spamco.create_seals.entity.Seal.Seal_entity;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.ForgeMod;
import net.spamco.create_seals.entity.Seal.Seal_init.Seal_init;
import org.jetbrains.annotations.Nullable;


public class Seal_entity extends Animal {


    public Seal_entity(EntityType<? extends Animal> type, Level level) {
        super(type, level);
    }


    @Nullable
    @Override
    public AgeableMob getBreedOffspring( ServerLevel level, AgeableMob mob) {
        return Seal_init.SEAL.get().create(level);
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(0, new PanicGoal(this, 2.0));
        this.goalSelector.addGoal(1, new BreedGoal(this, 1.0));
        this.goalSelector.addGoal(2, new FollowParentGoal(this, 1.25));
        this.goalSelector.addGoal(3, new WaterAvoidingRandomStrollGoal(this, 1.0));
        this.goalSelector.addGoal(4, new LookAtPlayerGoal(this, Player.class, 6.0F));
        this.goalSelector.addGoal(5, new RandomLookAroundGoal(this));
    }
    public static AttributeSupplier.Builder getSealAttributes()
    {
        return Mob.createMobAttributes()
                .add(ForgeMod.ENTITY_GRAVITY.get(), 0.5f)
                .add(ForgeMod.SWIM_SPEED.get(), 0.5)
                .add(Attributes.MAX_HEALTH, 25.00)
                .add(Attributes.MOVEMENT_SPEED, 0.15);
    }
}
