
# Introsde 2015 Assignment 3 (server part)

**Student:** Andrea Galloni ([Twitter](https://twitter.com/andreagalloni92))

**E-Mail:** andrea [dot] galloni [at] studenti [dot] unitn [dot] it

**Organization:** [UniTN](http://www.unitn.it/en)

**Course:** [Introduction to Service Design and Engineering](https://sites.google.com/site/introsdeunitn/)

<p align="center">
  <img src="http://www.cliparthut.com/clip-arts/512/cartoon-soap-bar-512266.png"  width="300">
</p>


This project implements a server that exposes a SOAP web service. The client to execute requests can be found here: ([introsde-assignment-3-client](https://github.com/sn1p3r46/introsde-2015-assignment-3-client)).

This server is developed to receive requests from the [client](https://github.com/sn1p3r46/introsde-2015-assignment-3-client). part of the project. All the [client](https://github.com/sn1p3r46/introsde-2015-assignment-3-client) server interactions make use of the [SOAP](https://en.wikipedia.org/wiki/SOAP)  ([w3c](http://www.w3schools.com/xml/xml_soap.asp)) protocol.

The project is totally developed in [Java](https://en.wikipedia.org/wiki/Java_(programming_language), making use of [Java-ws](https://en.wikipedia.org/wiki/Java_API_for_XML_Web_Services) and [JPA](https://en.wikipedia.org/wiki/Java_Persistence_API) for the persistency  


## Premises

For this project I decided to go deeper rewriting the database initialization script. The `dbinit.sql` file can be found inside the project root folder it contains some table definitions and some database population commands.

**The key** of this part of **implementation** is to threat the `CurrentHealth` model in the database as a view. In facts, the view can not be written. It is nothing more than a table generated realtime by the database system with only the newest measurements.

**This implementation has at least the following advantages:**

+ **No redundancy** in the database, only the necessary information is stored (no duplicates).
+ **Data always updated** while inserting or updating some measurements the latest ones will  always properly appear in the view.
+ **Simplicity** no extra work from the Java code is needed to update and store the `CurrentHealth` models into the database.

Here the `SQL` code snippet to create the view using `sqlite3`:

```sql
CREATE VIEW CurrentHealth AS SELECT
  idMeasureHistory, idPerson, idMeasureDefinition,
  measureType, measureValue, measureValueType, MAX(dateRegistered)
  AS dateRegistered
  FROM Measure NATURAL JOIN MeasureDefinition
  GROUP BY idPerson, idMeasureDefinition;

```

## Requirements:
`Apache Ant, OpenJDK, JRE and an Internet Connection;`


## Project Structure

The project is divided in the following packages:

`introsde.dao`: it contains the `LifeCoachDb_Dao` ([Data Access Object](https://en.wikipedia.org/wiki/Data_access_object)) class responsible of the data storing management, it provides an abstract interface to the database. ([link](https://github.com/sn1p3r46/introsde-2015-assignment-3/blob/master/src/instrosde/dao/LifeCoachDb_Dao.java))

`introsde.models`: it contains the all classes describing our application models, their behavior, their methods and their ([JPA](https://en.wikipedia.org/wiki/Java_Persistence_API)) annotations.   ([link](https://github.com/sn1p3r46/introsde-2015-assignment-3/blob/master/src/instrosde/models))

`introsde.ws`: it contains an interface `HealthServiceInterface` describing all web methods exposed by the [web service](https://en.wikipedia.org/wiki/Web_service) and the `HealthServiceImplementation` class that implements it.
In this package is also contained the `Test` class used to perform some preliminary [Human Driven Tests](https://en.wikipedia.org/wiki/Unit_testing).    ([link](https://github.com/sn1p3r46/introsde-2015-assignment-3/tree/master/src/introsde/ws))

`introsde.ws.jaxws`: contains the ([JAX-WS](https://en.wikipedia.org/wiki/Java_API_for_XML_Web_Services)) portable artifacts classes used from the web services generate with the command `wsgen` tool  ([doc](https://docs.oracle.com/javase/6/docs/technotes/tools/share/wsgen.html)). This tool reads the [web service](https://en.wikipedia.org/wiki/Web_service) endpoint class and generates all the required artifacts for the [web sevice](https://en.wikipedia.org/wiki/Web_service) deployment, and invocation. ([link](https://github.com/sn1p3r46/introsde-2015-assignment-3/tree/master/src/introsde/ws/jaxws))

`introsde.endpoint`: it contains the `HealthServiceImplementationService` class that is responsible to create the web service instance (`HealthServiceImplementation`) and the entry point of the service. ([link](https://github.com/sn1p3r46/introsde-2015-assignment-3/tree/master/src/introsde/endpoint))

`introsde.test`: it contains two classes wrote to perform some Automatic [Unit Tests](https://en.wikipedia.org/wiki/Unit_testing) those classes are build on the [JUnit](https://en.wikipedia.org/wiki/JUnit) framework. ([link](https://github.com/sn1p3r46/introsde-2015-assignment-3/tree/master/src/introsde/endpoint))


## Other Files and Folders:

The project contains some additional files and folders.

`init.sh`: contains some commands to generate the database.

`dbinit.sql`: is the initialization `SQL` script for the database, it can be executed by the `ant initDB`this command will run the `init.sh` bash script delegated to do the job.

`build.xml`: this file ran by `ant`. It will download all the required dependencies using [Apache Ivy](http://ant.apache.org/ivy/). It will also download [Ivy](http://ant.apache.org/ivy/) if it is not installed.

`ivy.xml`: this file contains all libraries version and names that are needed to rin the server those libraries will be downloaded by [Apache Ivy](http://ant.apache.org/ivy/).



## Execution


To execute the web service enter:
```
ant start.ws
```
To execute Automatic Unit Tests enter:
```
ant start.JuniTest
```
To execute Human Driven Unit Tests enter:
```
ant start.test
```


`PLEASE:  If you are running the server locally MIND to change the server address on the client and launch the server application  and before running the client`

<p align="center">
  <br/>**[Editor Used](https://atom.io/:)**<br/>
  <a href="https://atom.io/">
  <img src="https://cloud.githubusercontent.com/assets/72919/2874231/3af1db48-d3dd-11e3-98dc-6066f8bc766f.png" width="200">
  </a>
</p>

<p align="center">
  <a href="http://unitn.it/en">
  <img src="https://raw.githubusercontent.com/sn1p3r46/introsde-2015-assignment-3-client/master/images/LogoUniTn.png" width="300">
  </a>
</p>
