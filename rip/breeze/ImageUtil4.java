package rip.breeze;

import java.awt.Color;
import net.minecraft.util.AxisAlignedBB;
import org.mozilla.javascript.annotations.JSFunction;

@ScriptNamespace(name = "renderer", description = "The renderer object, used for drawing 3d shapes.")
public class ImageUtil4 {
   @JSFunction(
      value = "boundingESPBoxFilled",
      description = "Draws a filled ESP box using the specified bounding box, color and depth testing",
      params = {"The bounding box to draw, has to be given in world coordinates.", "The color of the bounding box.", "Use depth for rendering the box."}
   )
   public static void processAll(WorldUtil2 var0, RenderUtil4_x var1, boolean var2) {
      rip.breeze.client.RenderUtil31.calculate_2((AxisAlignedBB)var0.b(), (Color)var1.b(), var2);
   }

   @JSFunction(
      value = "boundingESPBox",
      description = "Draws an outline ESP box using the specified bounding box, color and depth testing",
      params = {
            "The bounding box to draw, has to be given in world coordinates.",
            "The color of the bounding box.",
            "The width of the bounding box outline.",
            "Use depth for rendering the box."
      }
   )
   public static void update(WorldUtil2 var0, RenderUtil4_x var1, float var2, boolean var3) {
      rip.breeze.client.RenderUtil31.getHitbox_4((AxisAlignedBB)var0.b(), (Color)var1.b(), var2, var3);
   }
}
