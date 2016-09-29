= MLBParks backend application
This application is a backend that provides geolocation information about MLBParks. The information is stored in a mongodb


== Installation

Assuming you're using the project <roadshow>:

----
oc new-project roadshow
oc create -f ./ose3/application-template.json
oc new-app mlbparks
----

There's some options that can be parameterized:

* APPLICATION_NAME: Name of the application
* MAVEN_MIRROR_URL: Url of a maven mirror 
* APPLICATION_HOSTNAME: Hostname/route to access your application

Example:

----
oc new-app mlbparks -p APPLICATION_HOSTNAME=mlbparks-roadshow.127.0.0.1.xip.io -p MAVEN_MIRROR_URL=http://nexus.ci:8081/content/groups/public
----
