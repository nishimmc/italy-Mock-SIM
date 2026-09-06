# Italy Mock SIM — GitHub Actions Build

এই project Android Studio ছাড়াই GitHub Actions দিয়ে APK build করার জন্য প্রস্তুত।

## সবচেয়ে সহজ পদ্ধতি

1. GitHub-এ একটি নতুন **public/private repository** তৈরি করো।
2. এই ZIP extract করে এর ভেতরের সব ফাইল repository-তে upload করো।
3. **Actions** tab → **Build APK** workflow → **Run workflow** চাপো।
4. Build শেষ হলে workflow run খুলে **Artifacts** থেকে `ItalyMockSIM-debug` ZIP download করো।
5. ZIP extract করলে `app-debug.apk` পাবে।
6. APK LDPlayer-এ drag & drop করে install করো।

## গুরুত্বপূর্ণ

এটি testing-only mock app। এটি নিজের UI-তে Italy SIM profile দেখায়:
- SIM present: YES (mock)
- Country: Italy
- ISO: IT
- MCC: 222

সাধারণ APK হিসেবে এটি Android-এর system TelephonyManager, ICCID/IMSI,
real SIM state, cellular network, SMS বা অন্য apps-এর SIM information পরিবর্তন করে না।
