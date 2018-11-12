package yuma140902.uptodatemod;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import yuma140902.uptodatemod.client.renderer.RenderModBoat;
import yuma140902.uptodatemod.entity.item.EntityBoatAcacia;
import yuma140902.uptodatemod.entity.item.EntityBoatBirch;
import yuma140902.uptodatemod.entity.item.EntityBoatDarkOak;
import yuma140902.uptodatemod.entity.item.EntityBoatJungle;
import yuma140902.uptodatemod.entity.item.EntityBoatSpruce;
import yuma140902.uptodatemod.entity.item.EntityModBoatBase.Type;

public class MyEntities {
	private MyEntities() {}
	
	public static int id = 0;
	
	public static void register() {
		EntityRegistry.registerModEntity(EntityBoatAcacia.class, "boat_acacia", id++, ModUpToDateMod.INSTANCE, 128, 5, true);
		RenderingRegistry.registerEntityRenderingHandler(EntityBoatAcacia.class, new RenderModBoat(Type.ACACIA));
		
		EntityRegistry.registerModEntity(EntityBoatBirch.class, "boat_birch", id++, ModUpToDateMod.INSTANCE, 128, 5, true);
		RenderingRegistry.registerEntityRenderingHandler(EntityBoatBirch.class, new RenderModBoat(Type.BIRCH));
		
		EntityRegistry.registerModEntity(EntityBoatDarkOak.class, "boat_dark_oak", id++, ModUpToDateMod.INSTANCE, 128, 5, true);
		RenderingRegistry.registerEntityRenderingHandler(EntityBoatDarkOak.class, new RenderModBoat(Type.DARK_OAK));
		
		EntityRegistry.registerModEntity(EntityBoatJungle.class, "boat_jungle", id++, ModUpToDateMod.INSTANCE, 128, 5, true);
		RenderingRegistry.registerEntityRenderingHandler(EntityBoatJungle.class, new RenderModBoat(Type.JUNGLE));
		
		EntityRegistry.registerModEntity(EntityBoatSpruce.class, "boat_spruce", id++, ModUpToDateMod.INSTANCE, 128, 5, true);
		RenderingRegistry.registerEntityRenderingHandler(EntityBoatSpruce.class, new RenderModBoat(Type.SPRUCE));
	}
}