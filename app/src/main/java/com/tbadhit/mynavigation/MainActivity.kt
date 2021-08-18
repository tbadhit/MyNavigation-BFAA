package com.tbadhit.mynavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

// in gradle.properties add "android.enableJetifier=true"
// Add navigation library and binding (build.gradle modul) (1)
// Create new fragment "HomeFragment" ( New → Fragment → Fragment (Blank))
// Update layout "fragment_home.xml"

// Create navigation :
// (klik kanan di folder res → New → Android resource file) name it "main_navigation", change type to "Navigation"
// add new navigation choose "fragment_home"

// update "activity_main.xml"
// Create new fragment "CategoryFragment" (dalam main_navigation pada tab design. klik icon Add Destination dan pilih Create new destination.)
// update "fragment_category.xml"
// Create new activity "ProfileActivity"
// update layout "activity_profile"
// add "activity_profile" to "main_navigation"
// Create action from "homeFragment" to "categoryFragment" & "profileactivity"
// call action use NavController at HomeFragment (1)

// SEND DATA WITH BUNDLE :
// update "fragment_category" (2)
// Create new fragment "DetailCategoryFragment" (dalam main_navigation pada tab design. klik icon Add Destination dan pilih Create new destination.)
// Create action from "categoryFragment" to "DetailCategoryFragment"
// update fragment_detail_category (1)
// start the process of sending data with bundle, add code "CategoryFragment" (1)
// for get data go to "DetailCategoryFragment" add code (1)

// SEND DATA WITH SafeArgs:
// Click icon "add arguments" in main_navigation
// Fill the field
// add library safeargs (build.gradle project)(1) "will create 2 file HomeFragmentDestination and HomeFragmentArgs"
// update code in (build.gradle module) (2) "will create 2 file HomeFragmentDestination and HomeFragmentArgs"
// update CategoryFragment (SafeArgs)
// update DetailCategoryFragment (SafeArgs)

// DEEPLINK :
// Go to "main_navigation" choose "profileActivity"
// in attribute panel click Add Deep Link and add "https://www.dicoding.com/profile"
// Go to AndroidManifest add code (1)
// For Try:
// App -> Edit Configurations
// Klik icon Add New Configurations → Android App → Isi nama dengan “DeepLinkProfile” →
// Pilih module dengan “app” → Pilih launch dengan “URL” → Isi URL dengan “https://www.dicoding.com/profile” → OK.
// Run App

// DEEPLINK WITH PARAMETER DATA:
// Go to main_navigation choose detailCategoryFragment
// in attribute panel click Add Deep Link and add "https://www.dicoding.com/detail/{name}"
// For Try:
// App -> Edit Configurations
// Klik icon Add New Configurations → Android App → Isi nama dengan “DeepLinkDetail” →
// Pilih module dengan “app” → Pilih launch dengan “URL” → Isi URL dengan “https://www.dicoding.com/detail/electronic” → OK.
// Run App

// POP UP BEHAVIOUR:
// Pop Up Behaviour adalah tingkah laku aplikasi ketika ditekan tombol back
// add button in "fragment_detail_category"
// add action from "detailCategoryFragment" to "homeFragment"
// add code "DetailCategoryFragment" (2)
// go to main_navigation, at detailCategoryFragment click "action_detailCategoryFragment_to_homeFragment"
// fill Pop to with "homeFragment" and checklist inclusive (berfungsi seperti Intent.FLAG_ACTIVITY_CLEAR_TOP)

// ANIMATION:
// click action and add Animations
// custom animation :
// Klik kanan pada res → New → Android Resource File..
// Kemudian berilah nama slide_in_right dan ganti Resource Type menjadi Animation.
// add code "slide_in_right.xml"
// Klik kanan pada res → New → Android Resource File..
// Kemudian berilah nama slide_out_left dan ganti Resource Type menjadi Animation.
// add code "slide_out_left.xml"
// click action and add Animations and add animation Enter & Exit

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}