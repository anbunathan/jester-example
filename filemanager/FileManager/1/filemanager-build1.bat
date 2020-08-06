set root="C:\VTEWS2\filemanager"
CD /d %root%
call android.bat update project --path .
call ant clean
call ant debug
set root="C:\VTEWS2\filemanagertest"
CD /d %root%
call android.bat update test-project --path . -m ../filemanager
call ant -Dadb.device.arg="-s emulator-5554" debug install test