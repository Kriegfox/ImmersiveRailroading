package cam72cam.immersiverailroading.entity;

import java.util.ArrayList;
import java.util.List;

import cam72cam.immersiverailroading.library.GuiTypes;
import cam72cam.immersiverailroading.registry.DefinitionManager;
import cam72cam.immersiverailroading.registry.TenderDefinition;
import net.minecraft.world.World;
import net.minecraftforge.fluids.*;
import net.minecraftforge.fluids.capability.IFluidHandler;

public class Tender extends CarTank implements IFluidHandler {
	
	public Tender(World world) {
		this(world, null);
	}

	public Tender(World world, String defID) {
		super(world, defID);
	}
	
	public TenderDefinition getDefinition() {
		return (TenderDefinition) DefinitionManager.getDefinition(defID);
	}
	
	@Override
	public GuiTypes guiType() {
		return GuiTypes.TENDER;
	}

	@Override
	public List<Fluid> getFluidFilter() {
		List<Fluid> filter = new ArrayList<Fluid>();
		filter.add(FluidRegistry.WATER);
		return filter;
	}

	@Override
	public int getInventorySize() {
		return this.getDefinition().getInventorySize() + 2;
	}
	
	public int getInventoryWidth() {
		return this.getDefinition().getInventoryWidth();
	}
	
	@Override
	protected int[] getContainerInputSlots() {
		return new int[] { getInventorySize()-2 };
	}
	@Override
	protected int[] getContainertOutputSlots() {
		return new int[] { getInventorySize()-1 };
	}
}