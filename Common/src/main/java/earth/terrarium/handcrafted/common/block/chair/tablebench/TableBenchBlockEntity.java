package earth.terrarium.handcrafted.common.block.chair.tablebench;

import earth.terrarium.handcrafted.common.registry.ModBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class TableBenchBlockEntity extends BlockEntity {
    public TableBenchBlockEntity(BlockPos blockPos, BlockState blockState) {
        super(ModBlockEntities.TABLE_BENCH.get(), blockPos, blockState);
    }
}