# AutoWfuzz

This is a course project to fullfill the requirement of ECE653 of University of Waterloo. AutoWfuzz is an automated web fuzzer built based on Wfuzz. It currently supports searching for vulnerabilities including potential information leak (directoris and files with common names), common user-password pair, SQL injection, and XSS injection. 

## Run
python auto_wfuzzer.py "home URL of the website to test" command_option

The command option currently supports "-e", which is used to show only the ouput with error messages. 
