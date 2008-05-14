package jetbrains.mps.idea.license;

import com.intellij.ide.license.LicenseManager;
import com.intellij.ide.license.LicenseFactory;
import com.intellij.ide.license.impl.LicenseFactoryImpl;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Calendar;

public class MPSLicenseManager extends LicenseManager {
  public boolean supportsRegistration() {
    return false;
  }

  public void register() {
  }

  public void startUp(StartupAction action) {
    action.proceed();
  }

  public String licensedToMessage() {
    return "MPS EAP User";
  }

  public String licensedRestrictionsMessage() {
    return "license.restriction.message";
  }

  public LicenseFactory createLicenseFactory() {
    return new LicenseFactoryImpl();
  }

  public boolean isEvaluationLicense() {
    return true;
  }

  public Date getEvaluationExpirationDate() {
    GregorianCalendar calendar = new GregorianCalendar(2008, Calendar.AUGUST, 31);
    return new Date(calendar.getTimeInMillis());
  }

  public boolean shouldCheckForUpdates() {
    return false;
  }

  public boolean willLicenseExpire() {
    return true;
  }
}
