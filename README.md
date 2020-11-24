# mobile_automation

##Appium Modbile Framework
A Maven framework in which to build appium tests written in Java.

##Getting Started
Copy the repo into your local machine.

##Installing Appium
Appium can be installed in one of two ways: via NPM or by downloading Appium Desktop, which is a graphical, desktop-based way to launch the Appium server.

##Installation via NPM
If you want to run Appium via an npm install, you will need Node.js and NPM (use nvm, n, or brew install node to install Node.js.

npm install -g appium
##Installation via Desktop App Download
Simply download the latest version of Appium Desktop from the releases page.

##Verifying the Installation
To verify that all of Appium's dependencies are met you can use appium-doctor.
Install it with npm install -g appium-doctor, then run the appium-doctor command, supplying the --ios or --android flags to verify that all of the dependencies are set up correctly.

##Starting Appium
Now we can kick up an Appium server, either by running it from the command line like so (assuming the NPM install was successful):

appium 

##Run tests locally
Right click the feature file and select "Run" or "Debug" to start the tests.

##Run tests through the commandline
As this project uses Maven, we can invoke the tests using Maven goals.
To run the test, use your CI or point Maven to the project and use the goals:
clean
validate
compile
test

IMPORTANT FILES
src/main/resources -- This folder contains Android,IOS apps that will be tested locally.

##Test result
