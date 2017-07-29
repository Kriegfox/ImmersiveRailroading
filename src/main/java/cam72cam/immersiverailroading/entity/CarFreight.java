package cam72cam.immersiverailroading.entity;

import cam72cam.immersiverailroading.entity.registry.CarFreightDefinition;
import cam72cam.immersiverailroading.entity.registry.DefinitionManager;
import net.minecraft.world.World;

public class CarFreight extends Freight {
	public CarFreight(World world) {
		this(world, null);
	}
	
	public CarFreight(World world, String defID) {
		super(world, defID);
	}
	
	protected CarFreightDefinition getDefinition() {
		return (CarFreightDefinition) DefinitionManager.getDefinition(defID);
	}

	@Override
	public int getInventorySize() {
		return this.getDefinition().getInventorySize();
	}
	
	//TODO filter inventory
}
