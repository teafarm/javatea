@echo off
SET PATH=/apache-maven-3.6.1/bin;/webdrivers;C:/Windows/System32

call mvn exec:java@javat
call mvn test-compile
call mvn exec:java@testng

taskkill /im chromedriver.exe /f
pause
