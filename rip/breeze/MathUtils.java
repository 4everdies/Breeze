package rip.breeze;

import net.minecraft.entity.Entity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Vec3;
import org.mozilla.javascript.annotations.JSFunction;
import rip.breeze.client.BlockUtil7;
import rip.breeze.client.BreezeClient;
import rip.breeze.client.MinecraftAccessor;

@ScriptNamespace(
   name = "math",
   description = "The math namespace, the same helpers breeze uses internally for tick interpolation, clamping and visibility checks.",
   remarks = "Entity positions only move once per tick. Anything you draw in a render event should use the interpolated variants here, otherwise it will visibly stutter.",
   example = "script.addListener(\"Render3DEvent\", (event) => {\n  if (mc.pointedEntity === null) return;\n  const box = math.interpolateEntityBB(mc.pointedEntity, event.getPartialTicks());\n  renderer.boundingESPBox(box, new Color(255, 0, 0), 2, false);\n});"
)
public class MathUtils {
   @JSFunction(
      value = "clamp",
      description = "Clamps a value so it never leaves the given range.",
      params = {"The value to clamp.", "The lowest value the result can be.", "The highest value the result can be."},
      returns = "The value, limited to the range between min and max.",
      example = "math.clamp(health, 0, 20);"
   )
   public static double getDouble(double var0, double var2, double var4) {
      return BlockUtil7.clamp_3(var0, var2, var4);
   }

   @JSFunction(
      value = "interpolateLastTickPos",
      description = "Interpolates a single coordinate between its previous and current tick value, using the current render partial ticks.",
      params = {"The coordinate as of this tick.", "The coordinate as of the previous tick."},
      returns = "The coordinate where it should be drawn this frame.",
      remarks = "Use this when you track positions yourself. For entities prefer interpolateEntityPosition."
   )
   public static double getDouble_2(double var0, double var2) {
      return BlockUtil7.calculateDouble(var0, var2);
   }

   @JSFunction(
      value = "interpolateEntityPosition",
      description = "The position of an entity interpolated to this frame, using the current render partial ticks.",
      params = "The entity to interpolate.",
      returns = "The entity's position this frame, or null when no entity was given."
   )
   public static VecUtil1 getBreezeUtil81(RotationUtils var0) {
      return getBreezeUtil81_2(var0, MinecraftAccessor.getTimer(BreezeClient.CONST_A).renderPartialTicks);
   }

   @JSFunction(
      value = "interpolateEntityPosition",
      description = "The position of an entity interpolated to this frame.",
      params = {"The entity to interpolate.", "The partial ticks, as given by a render event."},
      returns = "The entity's position this frame, or null when no entity was given.",
      example = "math.interpolateEntityPosition(mc.pointedEntity, event.getPartialTicks());"
   )
   public static VecUtil1 getBreezeUtil81_2(RotationUtils var0, double var1) {
      return var0 == null ? null : (VecUtil1)VecUtil1.b(BlockUtil7.getVec3((Entity)var0.b(), var1));
   }

   @JSFunction(
      value = "interpolateEntityBB",
      description = "The bounding box of an entity interpolated to this frame, using the current render partial ticks.",
      params = "The entity to interpolate.",
      returns = "The entity's bounding box this frame, or null when no entity was given."
   )
   public static WorldUtil2 getBreezeUtil55(RotationUtils var0) {
      return getBreezeUtil55_2(var0, MinecraftAccessor.getTimer(BreezeClient.CONST_A).renderPartialTicks);
   }

   @JSFunction(
      value = "interpolateEntityBB",
      description = "The bounding box of an entity interpolated to this frame.",
      params = {"The entity to interpolate.", "The partial ticks, as given by a render event."},
      returns = "The entity's bounding box this frame, or null when no entity was given.",
      remarks = "The box is expanded slightly, so an ESP drawn around it does not clip into the entity's model."
   )
   public static WorldUtil2 getBreezeUtil55_2(RotationUtils var0, double var1) {
      return var0 == null ? null : (WorldUtil2)WorldUtil2.b(BlockUtil7.getHitbox((Entity)var0.b(), var1));
   }

   @JSFunction(
      value = "getCenter",
      description = "The point in the middle of a bounding box.",
      params = "The bounding box to take the center of.",
      returns = "The center of the box, or null when no box was given."
   )
   public static VecUtil1 getBreezeUtil81_3(WorldUtil2 var0) {
      return var0 == null ? null : (VecUtil1)VecUtil1.b(BlockUtil7.getVec3_2((AxisAlignedBB)var0.b()));
   }

   @JSFunction(
      value = "findBestVisiblePoint",
      description = "Finds the closest point on a bounding box that can be seen from the given eye position without a block in the way.",
      params = {"The position to look from, usually the local player's eyes.", "The bounding box to look at."},
      returns = "The nearest unobstructed point, or null when every point is blocked.",
      remarks = "Points along the vertical center of the box are preferred over its corners. This raytraces blocks, so it is not free, call it once per target per tick rather than per frame.",
      example = "const target = mc.pointedEntity;\nconst point = math.findBestVisiblePoint(mc.player.getPositionEyes(), target.getEntityBoundingBox());\nif (point !== null) script.log(\"visible at \" + point.getY());"
   )
   public static VecUtil1 getBreezeUtil81_4(VecUtil1 var0, WorldUtil2 var1) {
      if (var0 != null && var1 != null && BreezeClient.CONST_A.theWorld != null) {
         Vec3 var2 = BlockUtil7.rayTrace((Vec3)var0.b(), (AxisAlignedBB)var1.b());
         return (VecUtil1)VecUtil1.b(var2);
      } else {
         return null;
      }
   }
}
