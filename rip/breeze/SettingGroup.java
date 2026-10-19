package rip.breeze;

import java.util.List;

public interface SettingGroup {
   int getOrder();

   int getCount();

   void apply();

   boolean isEnabled();

   String getTitle();

   String getSubtitle();

   String getDescription();

   void setTitle(String var1);

   void setSubtitle(String var1);

   void setDescription(String var1);

   void setStrings(String var1, String var2, String var3);

   void addEntry(String var1);

   void removeEntry(String var1);

   String getOrDefault(String var1, String... var2);

   List<Util141> getEntries();

   void clearEntry(String var1);
}
