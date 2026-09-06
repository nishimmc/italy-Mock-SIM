# Italy Mock SIM — Fixed GitHub Build

This version removes the unnecessary AppCompat/Kotlin dependency that caused the duplicate Kotlin stdlib classes shown in the previous build log.

Upload all files to the GitHub repository, keeping `.github/workflows/build.yml` exactly at that path. Then Actions → Build APK → Run workflow.

The APK is a testing-only mock UI and does not modify system TelephonyManager, real SIM, ICCID/IMSI, network, SMS, calls, or other apps.
