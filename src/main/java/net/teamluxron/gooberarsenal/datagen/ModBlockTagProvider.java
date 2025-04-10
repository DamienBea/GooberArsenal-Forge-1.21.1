package net.teamluxron.gooberarsenal.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.teamluxron.gooberarsenal.GooberArsenal;
import net.teamluxron.gooberarsenal.block.ModBlocks;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, GooberArsenal.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.KEVIN_ORE.get())
                .add(ModBlocks.KEVIN_BLOCK.get())
                .add(ModBlocks.DEEPSLATE_KEVIN_ORE.get())
                .add(ModBlocks.ANCIENT_CAGITE.get())
                .add(ModBlocks.CAGITE_BLOCK.get());

        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.KEVIN_ORE.get())
                .add(ModBlocks.KEVIN_BLOCK.get())
                .add(ModBlocks.DEEPSLATE_KEVIN_ORE.get());

        tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.ANCIENT_CAGITE.get())
                .add(ModBlocks.CAGITE_BLOCK.get());
    }
}
