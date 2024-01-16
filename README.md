**search localhost:(portNumber)(additional number that you may add)**

for changing web server paste this to src/main/resources/application.yml
if you don't have it new file and nae it "application.yml"
server :
  port : (the number of port you want to have it)


if you wan tto disable the server paste this to the src/main/resources/application.yml
if you don't have it new file and nae it "application.yml"

BE CAREFUL DON'T HAVE EXTRA SPACES BEFORE WORDS
spring :
main:
web-application-type : none

    servlet //it is default if you paste it ou nut it would run
    none //for disabling server and if you have its method server would not run
    reactive //