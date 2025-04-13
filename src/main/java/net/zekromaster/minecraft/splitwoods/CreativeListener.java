package net.zekromaster.minecraft.splitwoods;

import net.mine_diver.unsafeevents.listener.EventListener;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import paulevs.bhcreative.api.CreativeTab;
import paulevs.bhcreative.api.SimpleTab;
import paulevs.bhcreative.registry.TabRegistryEvent;

public class CreativeListener {
    public static CreativeTab tabSplitWoods;

    @EventListener
    public void onTabInit(TabRegistryEvent event){
        tabSplitWoods = new SimpleTab(SplitWoods.namespace.id("birch_planks"), SplitWoods.BIRCH_PLANKS.asItem());
        event.register(tabSplitWoods);
        for (Block block : SplitWoods.blocks){
            tabSplitWoods.addItem(new ItemStack(block.asItem(), 1));
        }

    }
}