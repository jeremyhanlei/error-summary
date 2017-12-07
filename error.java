1.错误：Error:Attribute application@icon value=(@mipmap/ic_launcher)
  描述：导入第三方module后，moudle中的ic_launcher.png与主项目中的发生冲突。
  地点：学点项目在导入展视互动时遇到的。
  解决：在主项目的AndroidManifest.xml中的顶部加入xmlns:tools="http://schemas.android.com/tools"，
       在<application>中加入tools:replace="android:icon, android:theme"
       例如：
       <manifest xmlns:android="http://schemas.android.com/apk/res/android"
                 xmlns:tools="http://schemas.android.com/tools"
                 package="com.xd.xuedian">
                 
       <application
            android:allowBackup="true"
            android:icon="@mipmap/ic_launcher"
            android:label="@string/app_name"
            android:supportsRtl="true"
            android:theme="@style/AppTheme"
            tools:replace="android:icon, android:theme">

2.
