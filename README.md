# Surprise
A fun prank for windows made in java when i was bored

To kill it go to task manager and kill java process.
Harmless, safe to run.
Just wants to say Hello World!
The exe file is more difficult to stop. You need to kill java too. Run in CMD or Powershell as admin. I provide the command here:
```batch
@echo off
echo Stopping surprise.exe and Java Runtime processes...

:: Kill the surprise.exe process
taskkill /f /im surprise.exe

:: Kill Java processes (java.exe, javaw.exe)
taskkill /f /im java.exe
taskkill /f /im javaw.exe

echo Processes terminated.
pause

```
