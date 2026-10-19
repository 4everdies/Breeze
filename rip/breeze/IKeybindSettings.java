package rip.breeze;

import java.util.List;

public interface IKeybindSettings {
   float getX();

   float getY();

   boolean isToggle();

   boolean getWidth();

   boolean getHeight();

   @KeepParameters
   KeyBind getMode();

   List<GenericSetting<?>> getKeyName();

   List<DateUtil> isHeld();

   DateUtil getKeyBinding();
}
