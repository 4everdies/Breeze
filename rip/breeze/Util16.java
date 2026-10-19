package rip.breeze;

import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

final class Util16 implements X509TrustManager {
   @Override
   public X509Certificate[] getAcceptedIssuers() {
      return new X509Certificate[0];
   }

   @Override
   public void checkClientTrusted(X509Certificate[] var1, String var2) {
   }

   @Override
   public void checkServerTrusted(X509Certificate[] var1, String var2) {
   }
}
