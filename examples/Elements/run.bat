@echo off
SET PATH=/apache-maven-3.6.1/bin;/webdrivers;C:/Windows/System32

call mvn exec:java
call mvn test

taskkill /im chromedriver.exe /f
pause

