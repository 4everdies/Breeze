package rip.breeze;

import java.awt.Color;

public interface IRenderer {
   void executeOnRenderThread(Runnable var1);

   void executeWithAlpha(float var1, Runnable var2);

   void beginFrame();

   void endFrame();

   void drawRect(float var1, float var2, float var3, float var4, Color var5);

   void fillRect(LicenseState var1, Color var2);

   void strokeRect(float var1, float var2, float var3, float var4, float var5, Color var6);

   void fillRoundedRect(LicenseState var1, float var2, Color var3);

   void strokeRoundedRect(LicenseState var1, float var2, Color var3);

   void fillRoundedRectFull(float var1, float var2, float var3, float var4, float var5, Color var6);

   void fillGradientRectHoriz(float var1, float var2, float var3, float var4, float var5, Color var6, Color var7);

   void fillGradientRectCustom(float var1, float var2, float var3, float var4, float var5, float var6, float var7, Color var8);

   void setupTransform(float var1, float var2, float var3, float var4, float var5, float var6);

   void fillGradientRect(LicenseState var1, float[] var2, Color var3);

   void fillGradientRectSimple(float var1, float var2, float var3, float var4, float[] var5, Color var6);

   void fillRoundedRectGradient(float var1, float var2, float var3, float var4, float var5, float var6, Color var7);

   void fillGradientRoundedRect(LicenseState var1, float[] var2, float var3, Color var4);

   void fillRoundedRectTwoColor(LicenseState var1, float var2, float var3, Color var4);

   void fillComplexGradient(float var1, float var2, float var3, float var4, float[] var5, float var6, Color var7);

   void fillRoundedRectColor(float var1, float var2, float var3, float var4, float var5, float var6, Color var7);

   void fillCircle(float var1, float var2, float var3, Color var4);

   void strokeCircle(float var1, float var2, float var3, float var4, Color var5);

   void drawTextSimple(String var1, float var2, float var3, float var4, float var5);

   void drawTextColored(String var1, float var2, float var3, float var4, float var5, Color var6);

   void drawTextWrapped(String var1, float var2, float var3, float var4, float var5, float var6, boolean var7);

   boolean drawTextInput(String var1, float var2, float var3, float var4, float var5, boolean var6, Color var7);

   boolean drawTextInputSelected(String var1, float var2, float var3, float var4, float var5, float var6, boolean var7);

   boolean loadFont(String var1);

   boolean isFontLoaded(String var1);

   void loadFontBytes(String var1, byte[] var2);

   void drawTextAt(String var1, float var2, float var3, float var4, Color var5);

   void renderWithBounds(LicenseState var1, Runnable var2);

   void renderInRect(float var1, float var2, float var3, float var4, Runnable var5);

   void frameBegin();

   void frameEnd();

   void scheduleRender(Runnable var1);

   void setDimensions(float var1, float var2);

   void setScale(float var1);

   void setAlpha(float var1);

   void rotate(float var1, float var2, float var3);

   void setGlobalAlpha(float var1);

   float getGlobalAlpha();

   void drawText(String var1, float var2, float var3, Color var4, EnumType32 var5, float var6);

   void drawTextShadow(String var1, float var2, float var3, Color var4, EnumType32 var5, float var6, boolean var7);

   void drawTextOutline(String var1, float var2, float var3, Color var4, EnumType32 var5, float var6, float var7);

   void drawTextCentered(String var1, float var2, float var3, Color var4, EnumType32 var5, float var6);

   float measureText(String var1, EnumType32 var2, float var3);

   float measureTextHeight(String var1, EnumType32 var2, float var3);

   float measureTextSimple(String var1, float var2);

   void postRender(Runnable var1);

   void fillRectSimple(float var1, float var2, float var3, float var4, Color var5);

   void drawLine(float var1, float var2, float var3, float var4, float var5, float var6);

   void clipRect(LicenseState var1, float var2);

   void fillClipRect(LicenseState var1, float var2, Color var3);

   void drawGlow(float var1, float var2, Color var3, float var4);

   void drawGlowCircle(float var1, float var2, float var3, Color var4, float var5);

   void fillRoundedRectSix(float var1, float var2, float var3, float var4, float var5, float var6, Color var7);

   void drawAnimatedIcon(float var1, float var2, Color var3, float var4);

   void drawIcon(float var1, float var2, Color var3, float var4);

   void drawGradientIcon(float var1, float var2, Color var3, Color var4, float var5);

   void resetState();
}
