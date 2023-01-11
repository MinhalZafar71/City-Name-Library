# City-Name-Library
A simple library to get City Name
When getting name from google map some time we don't properly get cities name so I have adjust the name of some UAE country city name from better results.
How to use 
To get a Git project into your build:

Step 1. Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.MinhalZafar71:City-Name-Library:Tag'
	}
