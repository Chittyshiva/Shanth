set projectLocation=C:\Users\Chitt\eclipse-workspace\Frame_works
cd %projectLocation%
set classpath=%projectLocation%\bin;%projecLocation%\lib\*
java org.TestNG %projectLocation%\testng.xml
pause