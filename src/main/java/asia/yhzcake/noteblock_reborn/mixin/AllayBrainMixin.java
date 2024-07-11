package asia.yhzcake.noteblock_reborn.mixin;

import net.minecraft.block.NoteBlock;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.brain.Brain;
import net.minecraft.entity.ai.brain.MemoryModuleType;
import net.minecraft.entity.passive.AllayBrain;
import net.minecraft.util.math.GlobalPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Optional;

@Mixin(AllayBrain.class)
public class AllayBrainMixin {
    @Inject(method = "shouldGoTowardsNoteBlock" , at = @At("RETURN"),cancellable = true)
    private static void shouldGoTowardsNoteBlock(LivingEntity allay, Brain<?> brain, GlobalPos pos, CallbackInfoReturnable<Boolean> cir) {
        Optional<Integer> optional = brain.getOptionalRegisteredMemory(MemoryModuleType.LIKED_NOTEBLOCK_COOLDOWN_TICKS);
        World world = allay.getWorld();
        cir.setReturnValue(world.getRegistryKey() == pos.getDimension() && world.getBlockState(pos.getPos()).getBlock() instanceof NoteBlock && optional.isPresent());
    }
}
