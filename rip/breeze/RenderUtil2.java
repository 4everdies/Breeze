package rip.breeze;

import org.mozilla.javascript.annotations.JSGetter;

@ScriptNamespace(name = "formatting", description = "Can be used for manipulating the color formatting of strings that are being rendered by breeze.")
public class RenderUtil2 {
   @JSGetter("RED")
   public static String getString() {
      return RenderUtil18_x.RED.toString();
   }

   @JSGetter("BLACK")
   public static String getString_2() {
      return RenderUtil18_x.BLACK.toString();
   }

   @JSGetter("DARK_BLUE")
   public static String getString_3() {
      return RenderUtil18_x.DARK_BLUE.toString();
   }

   @JSGetter("DARK_GREEN")
   public static String getString_4() {
      return RenderUtil18_x.DARK_GREEN.toString();
   }

   @JSGetter("DARK_AQUA")
   public static String getString_5() {
      return RenderUtil18_x.DARK_AQUA.toString();
   }

   @JSGetter("DARK_RED")
   public static String getString_6() {
      return RenderUtil18_x.DARK_RED.toString();
   }

   @JSGetter("DARK_PURPLE")
   public static String getString_7() {
      return RenderUtil18_x.DARK_PURPLE.toString();
   }

   @JSGetter("GOLD")
   public static String getString_8() {
      return RenderUtil18_x.GOLD.toString();
   }

   @JSGetter("GRAY")
   public static String getString_9() {
      return RenderUtil18_x.GRAY.toString();
   }

   @JSGetter("DARK_GRAY")
   public static String getString_10() {
      return RenderUtil18_x.DARK_GRAY.toString();
   }

   @JSGetter("BLUE")
   public static String getString_11() {
      return RenderUtil18_x.BLUE.toString();
   }

   @JSGetter("GREEN")
   public static String getString_12() {
      return RenderUtil18_x.GREEN.toString();
   }

   @JSGetter("AQUA")
   public static String getString_13() {
      return RenderUtil18_x.AQUA.toString();
   }

   @JSGetter("LIGHT_PURPLE")
   public static String getString_14() {
      return RenderUtil18_x.LIGHT_PURPLE.toString();
   }

   @JSGetter("YELLOW")
   public static String getString_15() {
      return RenderUtil18_x.YELLOW.toString();
   }

   @JSGetter("WHITE")
   public static String getString_16() {
      return RenderUtil18_x.WHITE.toString();
   }

   @JSGetter(value = "GLOW", description = "Adds a slight glow effect to the text.")
   public static String getString_17() {
      return RenderUtil18_x.GLOW.toString();
   }

   @JSGetter(value = "ACCENT", description = "Colors the text with the accent color defined by the theme.")
   public static String getString_18() {
      return RenderUtil18_x.ACCENT.toString();
   }

   @JSGetter(value = "PRIMARY", description = "The primary text color defined by the theme.")
   public static String getString_19() {
      return RenderUtil18_x.PRIMARY.toString();
   }

   @JSGetter(value = "SECONDARY", description = "The secondary text color defined by the theme.")
   public static String getString_20() {
      return RenderUtil18_x.SECONDARY.toString();
   }

   @JSGetter(value = "TERTIARY", description = "The tertiary text color defined by the theme.")
   public static String getString_21() {
      return RenderUtil18_x.TERTIARY.toString();
   }

   @JSGetter(value = "RESET", description = "Resets all previous color formatting.")
   public static String getString_22() {
      return RenderUtil18_x.RESET.toString();
   }
}
