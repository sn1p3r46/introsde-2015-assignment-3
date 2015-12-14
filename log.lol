Buildfile: /home/alexander/Documents/unitn/introSDE/assignments/introsde-2015-assignment-3/build.xml

start.test:
     [echo] app start introsde.Test in build
     [java] [EL Finest]: jpa: 2015-12-09 17:15:43.823--ServerSession(391447681)--Thread(Thread[main,5,main])--Begin predeploying Persistence Unit lifecoach-jpa; session file:/home/alexander/Documents/unitn/introSDE/assignments/introsde-2015-assignment-3/build/_lifecoach-jpa; state Initial; factoryCount 0
     [java] [EL Finest]: properties: 2015-12-09 17:15:43.85--ServerSession(391447681)--Thread(Thread[main,5,main])--property=eclipselink.orm.throw.exceptions; default value=true
     [java] [EL Finest]: properties: 2015-12-09 17:15:43.852--ServerSession(391447681)--Thread(Thread[main,5,main])--property=eclipselink.multitenant.tenants-share-emf; default value=true
     [java] [EL Finest]: properties: 2015-12-09 17:15:43.852--ServerSession(391447681)--Thread(Thread[main,5,main])--property=eclipselink.multitenant.tenants-share-cache; default value=false
     [java] [EL Finer]: metadata: 2015-12-09 17:15:43.884--ServerSession(391447681)--Thread(Thread[main,5,main])--Searching for default mapping file in file:/home/alexander/Documents/unitn/introSDE/assignments/introsde-2015-assignment-3/build/ (There is no English translation for this message.)
     [java] [EL Finer]: metadata: 2015-12-09 17:15:43.888--ServerSession(391447681)--Thread(Thread[main,5,main])--Searching for default mapping file in file:/home/alexander/Documents/unitn/introSDE/assignments/introsde-2015-assignment-3/build/ (There is no English translation for this message.)
     [java] [EL Config]: metadata: 2015-12-09 17:15:44.103--ServerSession(391447681)--Thread(Thread[main,5,main])--The access type for the persistent class [class introsde.models.MeasureDefinition] is set to [FIELD].
     [java] [EL Config]: metadata: 2015-12-09 17:15:44.143--ServerSession(391447681)--Thread(Thread[main,5,main])--The access type for the persistent class [class introsde.models.Person] is set to [FIELD].
     [java] [EL Config]: metadata: 2015-12-09 17:15:44.146--ServerSession(391447681)--Thread(Thread[main,5,main])--The alias name for the entity class [class introsde.models.MeasureDefinition] is being defaulted to: MeasureDefinition.
     [java] [EL Config]: metadata: 2015-12-09 17:15:44.23--ServerSession(391447681)--Thread(Thread[main,5,main])--The column name for element [idMeasureDefinition] is being defaulted to: IDMEASUREDEFINITION.
     [java] [EL Config]: metadata: 2015-12-09 17:15:44.232--ServerSession(391447681)--Thread(Thread[main,5,main])--The alias name for the entity class [class introsde.models.Person] is being defaulted to: Person.
     [java] [EL Finest]: jpa: 2015-12-09 17:15:44.533--ServerSession(391447681)--Thread(Thread[main,5,main])--End predeploying Persistence Unit lifecoach-jpa; session file:/home/alexander/Documents/unitn/introSDE/assignments/introsde-2015-assignment-3/build/_lifecoach-jpa; state Predeployed; factoryCount 0
     [java] [EL Finer]: weaver: 2015-12-09 17:15:44.534--Thread(Thread[main,5,main])--JavaSECMPInitializer - transformer is null.
     [java] [EL Finest]: jpa: 2015-12-09 17:15:44.534--ServerSession(391447681)--Thread(Thread[main,5,main])--Begin predeploying Persistence Unit lifecoach-jpa; session file:/home/alexander/Documents/unitn/introSDE/assignments/introsde-2015-assignment-3/build/_lifecoach-jpa; state Predeployed; factoryCount 0
     [java] [EL Finest]: jpa: 2015-12-09 17:15:44.534--ServerSession(391447681)--Thread(Thread[main,5,main])--End predeploying Persistence Unit lifecoach-jpa; session file:/home/alexander/Documents/unitn/introSDE/assignments/introsde-2015-assignment-3/build/_lifecoach-jpa; state Predeployed; factoryCount 1
     [java] [EL Finest]: jpa: 2015-12-09 17:15:44.541--ServerSession(391447681)--Thread(Thread[main,5,main])--Begin deploying Persistence Unit lifecoach-jpa; session file:/home/alexander/Documents/unitn/introSDE/assignments/introsde-2015-assignment-3/build/_lifecoach-jpa; state Predeployed; factoryCount 1
     [java] [EL Finer]: 2015-12-09 17:15:44.557--ServerSession(391447681)--Thread(Thread[main,5,main])--Could not initialize Validation Factory. Encountered following exception: javax.validation.ValidationException: Unable to create a Configuration, because no Bean Validation provider could be found. Add a provider like Hibernate Validator (RI) to your classpath.
     [java] [EL Finest]: properties: 2015-12-09 17:15:44.561--ServerSession(391447681)--Thread(Thread[main,5,main])--property=eclipselink.logging.level; value=ALL; translated value=ALL
     [java] [EL Finest]: properties: 2015-12-09 17:15:44.561--ServerSession(391447681)--Thread(Thread[main,5,main])--property=eclipselink.logging.level; value=ALL; translated value=ALL
     [java] [EL Finest]: properties: 2015-12-09 17:15:44.563--ServerSession(391447681)--Thread(Thread[main,5,main])--property=javax.persistence.jdbc.driver; value=org.sqlite.JDBC
     [java] [EL Finest]: properties: 2015-12-09 17:15:44.563--ServerSession(391447681)--Thread(Thread[main,5,main])--property=javax.persistence.jdbc.url; value=jdbc:sqlite:db.sqlite
     [java] [EL Info]: 2015-12-09 17:15:44.566--ServerSession(391447681)--Thread(Thread[main,5,main])--EclipseLink, version: Eclipse Persistence Services - 2.5.2.v20140319-9ad6abd
     [java] [EL Finest]: connection: 2015-12-09 17:15:44.825--Thread(Thread[main,5,main])--Database platform: org.eclipse.persistence.platform.database.oracle.Oracle11Platform, regular expression: (?i)oracle.*12
     [java] [EL Finest]: connection: 2015-12-09 17:15:44.826--Thread(Thread[main,5,main])--Database platform: org.eclipse.persistence.platform.database.oracle.Oracle11Platform, regular expression: (?i)oracle.*11
     [java] [EL Finest]: connection: 2015-12-09 17:15:44.826--Thread(Thread[main,5,main])--Database platform: org.eclipse.persistence.platform.database.oracle.Oracle10Platform, regular expression: (?i)oracle.*10
     [java] [EL Finest]: connection: 2015-12-09 17:15:44.826--Thread(Thread[main,5,main])--Database platform: org.eclipse.persistence.platform.database.oracle.Oracle9Platform, regular expression: (?i)oracle.*9
     [java] [EL Finest]: connection: 2015-12-09 17:15:44.826--Thread(Thread[main,5,main])--Database platform: org.eclipse.persistence.platform.database.oracle.OraclePlatform, regular expression: (?i)oracle.*
     [java] [EL Finest]: connection: 2015-12-09 17:15:44.827--Thread(Thread[main,5,main])--Database platform: org.eclipse.persistence.platform.database.SQLAnywherePlatform, regular expression: SQL\ Anywhere.*
     [java] [EL Finest]: connection: 2015-12-09 17:15:44.827--Thread(Thread[main,5,main])--Database platform: org.eclipse.persistence.platform.database.SybasePlatform, regular expression: (?i)(sybase.*)|(adaptive\ server\ enterprise.*)|(SQL\ Server.*)
     [java] [EL Finest]: connection: 2015-12-09 17:15:44.827--Thread(Thread[main,5,main])--Database platform: org.eclipse.persistence.platform.database.SQLServerPlatform, regular expression: (?i)microsoft.*
     [java] [EL Finest]: connection: 2015-12-09 17:15:44.828--Thread(Thread[main,5,main])--Database platform: org.eclipse.persistence.platform.database.JavaDBPlatform, regular expression: (?i).*derby.*
     [java] [EL Finest]: connection: 2015-12-09 17:15:44.828--Thread(Thread[main,5,main])--Database platform: org.eclipse.persistence.platform.database.DB2Platform, regular expression: (?i).*db2.*
     [java] [EL Finest]: connection: 2015-12-09 17:15:44.828--Thread(Thread[main,5,main])--Database platform: org.eclipse.persistence.platform.database.PointBasePlatform, regular expression: (?i)pointbase.*
     [java] [EL Finest]: connection: 2015-12-09 17:15:44.828--Thread(Thread[main,5,main])--Database platform: org.eclipse.persistence.platform.database.MySQLPlatform, regular expression: (?i)mysql.*
     [java] [EL Finest]: connection: 2015-12-09 17:15:44.828--Thread(Thread[main,5,main])--Database platform: org.eclipse.persistence.platform.database.InformixPlatform, regular expression: (?i)informix.*
     [java] [EL Finest]: connection: 2015-12-09 17:15:44.829--Thread(Thread[main,5,main])--Database platform: org.eclipse.persistence.platform.database.PostgreSQLPlatform, regular expression: (?i)postgresql.*
     [java] [EL Finest]: connection: 2015-12-09 17:15:44.829--Thread(Thread[main,5,main])--Database platform: org.eclipse.persistence.platform.database.H2Platform, regular expression: (?i)h2.*
     [java] [EL Finest]: connection: 2015-12-09 17:15:44.829--Thread(Thread[main,5,main])--Database platform: org.eclipse.persistence.platform.database.HSQLPlatform, regular expression: (?i)hsql.*
     [java] [EL Finest]: connection: 2015-12-09 17:15:44.829--Thread(Thread[main,5,main])--Database platform: org.eclipse.persistence.platform.database.FirebirdPlatform, regular expression: (?i)firebird.*
     [java] [EL Finest]: connection: 2015-12-09 17:15:44.829--Thread(Thread[main,5,main])--Database platform: org.eclipse.persistence.platform.database.SymfowarePlatform, regular expression: (?i).*symfoware.*
     [java] [EL Finest]: connection: 2015-12-09 17:15:44.83--Thread(Thread[main,5,main])--Database platform: org.eclipse.persistence.platform.database.AccessPlatform, regular expression: (?i)access.*
     [java] [EL Finest]: connection: 2015-12-09 17:15:44.83--Thread(Thread[main,5,main])--Database platform: org.eclipse.persistence.platform.database.MaxDBPlatform, regular expression: SAP\ DB.*
     [java] [EL Finest]: connection: 2015-12-09 17:15:44.83--Thread(Thread[main,5,main])--Database platform: org.eclipse.persistence.platform.database.HANAPlatform, regular expression: HDB.*
     [java] [EL Fine]: connection: 2015-12-09 17:15:44.842--Thread(Thread[main,5,main])--Detected database platform: null
     [java] [EL Info]: connection: 2015-12-09 17:15:44.842--Thread(Thread[main,5,main])--Not able to detect platform for vendor name [SQLite3]. Defaulting to [org.eclipse.persistence.platform.database.DatabasePlatform]. The database dialect used may not match with the database you are using. Please explicitly provide a platform using property eclipselink.platform.class.name.
     [java] [EL Config]: connection: 2015-12-09 17:15:44.855--ServerSession(391447681)--Connection(587153993)--Thread(Thread[main,5,main])--connecting(DatabaseLogin(
     [java] 	platform=>DatabasePlatform
     [java] 	user name=> ""
     [java] 	datasource URL=> "jdbc:sqlite:db.sqlite"
     [java] ))
     [java] [EL Config]: connection: 2015-12-09 17:15:44.86--ServerSession(391447681)--Connection(757004314)--Thread(Thread[main,5,main])--Connected: jdbc:sqlite:db.sqlite
     [java] 	User: null
     [java] 	Database: SQLite  Version: 3.7.2
     [java] 	Driver: SQLiteJDBC  Version: native
     [java] [EL Finest]: connection: 2015-12-09 17:15:44.863--ServerSession(391447681)--Connection(757004314)--Thread(Thread[main,5,main])--Connection acquired from connection pool [default].
     [java] [EL Finest]: connection: 2015-12-09 17:15:44.863--ServerSession(391447681)--Connection(757004314)--Thread(Thread[main,5,main])--Connection released to connection pool [default].
     [java] [EL Finest]: sequencing: 2015-12-09 17:15:44.894--ServerSession(391447681)--Thread(Thread[main,5,main])--sequencing connected, state is Preallocation_Transaction_NoAccessor_State
     [java] [EL Finest]: sequencing: 2015-12-09 17:15:44.894--ServerSession(391447681)--Thread(Thread[main,5,main])--sequence MeasureDefinition: preallocation size 1
     [java] [EL Finest]: sequencing: 2015-12-09 17:15:44.894--ServerSession(391447681)--Thread(Thread[main,5,main])--sequence Person: preallocation size 1
     [java] [EL Info]: connection: 2015-12-09 17:15:45.072--ServerSession(391447681)--Thread(Thread[main,5,main])--file:/home/alexander/Documents/unitn/introSDE/assignments/introsde-2015-assignment-3/build/_lifecoach-jpa login successful
     [java] [EL Finest]: query: 2015-12-09 17:15:45.106--ServerSession(391447681)--Connection(757004314)--Thread(Thread[main,5,main])--query column meta data (null.null.Person.null)
     [java] [EL Finest]: query: 2015-12-09 17:15:45.108--ServerSession(391447681)--Connection(757004314)--Thread(Thread[main,5,main])--query column meta data (null.null.MeasureDefinition.null)
     [java] [EL Finest]: query: 2015-12-09 17:15:45.111--ServerSession(391447681)--Thread(Thread[main,5,main])--Execute query DataReadQuery(sql="SELECT * FROM sqlite_sequence WHERE name = 'MeasureDefinition'")
     [java] [EL Finest]: connection: 2015-12-09 17:15:45.111--ServerSession(391447681)--Connection(757004314)--Thread(Thread[main,5,main])--Connection acquired from connection pool [default].
     [java] [EL Fine]: sql: 2015-12-09 17:15:45.111--ServerSession(391447681)--Connection(757004314)--Thread(Thread[main,5,main])--SELECT * FROM sqlite_sequence WHERE name = MeasureDefinition
     [java] [EL Finest]: connection: 2015-12-09 17:15:45.112--ServerSession(391447681)--Connection(757004314)--Thread(Thread[main,5,main])--Connection released to connection pool [default].
     [java] [EL Finest]: query: 2015-12-09 17:15:45.113--ServerSession(391447681)--Thread(Thread[main,5,main])--Execute query DataReadQuery(sql="SELECT * FROM sqlite_sequence WHERE name = 'Person'")
     [java] [EL Finest]: connection: 2015-12-09 17:15:45.113--ServerSession(391447681)--Connection(757004314)--Thread(Thread[main,5,main])--Connection acquired from connection pool [default].
     [java] [EL Fine]: sql: 2015-12-09 17:15:45.113--ServerSession(391447681)--Connection(757004314)--Thread(Thread[main,5,main])--SELECT * FROM sqlite_sequence WHERE name = Person
     [java] [EL Finest]: connection: 2015-12-09 17:15:45.113--ServerSession(391447681)--Connection(757004314)--Thread(Thread[main,5,main])--Connection released to connection pool [default].
     [java] [EL Finest]: query: 2015-12-09 17:15:45.114--ServerSession(391447681)--Thread(Thread[main,5,main])--Execute query DataReadQuery(sql="SELECT * FROM sqlite_sequence WHERE name = 'Person'")
     [java] [EL Finest]: connection: 2015-12-09 17:15:45.114--ServerSession(391447681)--Connection(757004314)--Thread(Thread[main,5,main])--Connection acquired from connection pool [default].
     [java] [EL Fine]: sql: 2015-12-09 17:15:45.114--ServerSession(391447681)--Connection(757004314)--Thread(Thread[main,5,main])--SELECT * FROM sqlite_sequence WHERE name = Person
     [java] [EL Finest]: connection: 2015-12-09 17:15:45.115--ServerSession(391447681)--Connection(757004314)--Thread(Thread[main,5,main])--Connection released to connection pool [default].
     [java] [EL Finest]: query: 2015-12-09 17:15:45.115--ServerSession(391447681)--Thread(Thread[main,5,main])--Execute query DataReadQuery(sql="SELECT * FROM sqlite_sequence WHERE name = 'MeasureDefinition'")
     [java] [EL Finest]: connection: 2015-12-09 17:15:45.115--ServerSession(391447681)--Connection(757004314)--Thread(Thread[main,5,main])--Connection acquired from connection pool [default].
     [java] [EL Fine]: sql: 2015-12-09 17:15:45.116--ServerSession(391447681)--Connection(757004314)--Thread(Thread[main,5,main])--SELECT * FROM sqlite_sequence WHERE name = MeasureDefinition
     [java] [EL Finest]: connection: 2015-12-09 17:15:45.116--ServerSession(391447681)--Connection(757004314)--Thread(Thread[main,5,main])--Connection released to connection pool [default].
     [java] [EL Finer]: metamodel: 2015-12-09 17:15:45.142--ServerSession(391447681)--Thread(Thread[main,5,main])--Canonical Metamodel class [introsde.models.MeasureDefinition_] not found during initialization.
     [java] [EL Finer]: metamodel: 2015-12-09 17:15:45.143--ServerSession(391447681)--Thread(Thread[main,5,main])--Canonical Metamodel class [introsde.models.Person_] not found during initialization.
     [java] [EL Finest]: jpa: 2015-12-09 17:15:45.143--ServerSession(391447681)--Thread(Thread[main,5,main])--End deploying Persistence Unit lifecoach-jpa; session file:/home/alexander/Documents/unitn/introSDE/assignments/introsde-2015-assignment-3/build/_lifecoach-jpa; state Deployed; factoryCount 1
     [java] [EL Finer]: connection: 2015-12-09 17:15:45.168--ServerSession(391447681)--Thread(Thread[main,5,main])--client acquired: 1110031167
     [java] [EL Finer]: transaction: 2015-12-09 17:15:45.182--ClientSession(1110031167)--Thread(Thread[main,5,main])--acquire unit of work: 1825738663
     [java] [EL Finest]: transaction: 2015-12-09 17:15:45.183--UnitOfWork(1825738663)--Thread(Thread[main,5,main])--persist() operation called on: introsde.models.Person@614ca7df.
     [java] [EL Finest]: query: 2015-12-09 17:15:45.184--ClientSession(1110031167)--Thread(Thread[main,5,main])--Execute query DataModifyQuery(name="Person" sql="UPDATE sqlite_sequence SET seq = seq + #PREALLOC_SIZE WHERE name = #name")
     [java] [EL Finest]: connection: 2015-12-09 17:15:45.186--ServerSession(391447681)--Connection(757004314)--Thread(Thread[main,5,main])--Connection acquired from connection pool [default].
     [java] [EL Finer]: transaction: 2015-12-09 17:15:45.186--ClientSession(1110031167)--Connection(757004314)--Thread(Thread[main,5,main])--begin transaction
     [java] [EL Fine]: sql: 2015-12-09 17:15:45.187--ClientSession(1110031167)--Connection(757004314)--Thread(Thread[main,5,main])--UPDATE sqlite_sequence SET seq = seq + ? WHERE name = ?
     [java] 	bind => [1, Person]
     [java] [EL Finest]: query: 2015-12-09 17:15:45.187--ClientSession(1110031167)--Thread(Thread[main,5,main])--Execute query ValueReadQuery(name="Person" sql="SELECT seq FROM sqlite_sequence WHERE name = #name")
     [java] [EL Fine]: sql: 2015-12-09 17:15:45.188--ClientSession(1110031167)--Connection(757004314)--Thread(Thread[main,5,main])--SELECT seq FROM sqlite_sequence WHERE name = ?
     [java] 	bind => [Person]
     [java] [EL Finer]: transaction: 2015-12-09 17:15:45.189--ClientSession(1110031167)--Connection(757004314)--Thread(Thread[main,5,main])--commit transaction
     [java] [EL Finest]: connection: 2015-12-09 17:15:45.196--ServerSession(391447681)--Connection(757004314)--Thread(Thread[main,5,main])--Connection released to connection pool [default].
     [java] [EL Finest]: sequencing: 2015-12-09 17:15:45.197--UnitOfWork(1825738663)--Thread(Thread[main,5,main])--assign sequence to the object (6 -> introsde.models.Person@614ca7df)
     [java] [EL Finer]: transaction: 2015-12-09 17:15:45.206--UnitOfWork(1825738663)--Thread(Thread[main,5,main])--begin unit of work commit
     [java] [EL Finest]: query: 2015-12-09 17:15:45.215--UnitOfWork(1825738663)--Thread(Thread[main,5,main])--Execute query InsertObjectQuery(introsde.models.Person@614ca7df)
     [java] [EL Finest]: connection: 2015-12-09 17:15:45.223--ServerSession(391447681)--Connection(757004314)--Thread(Thread[main,5,main])--Connection acquired from connection pool [default].
     [java] [EL Finer]: transaction: 2015-12-09 17:15:45.224--ClientSession(1110031167)--Connection(757004314)--Thread(Thread[main,5,main])--begin transaction
     [java] [EL Fine]: sql: 2015-12-09 17:15:45.224--ClientSession(1110031167)--Connection(757004314)--Thread(Thread[main,5,main])--INSERT INTO Person (idPerson, birthday, firstname, lastname) VALUES (?, ?, ?, ?)
     [java] 	bind => [6, null, Giacomo, Menestò]
     [java] [EL Finer]: transaction: 2015-12-09 17:15:45.255--ClientSession(1110031167)--Connection(757004314)--Thread(Thread[main,5,main])--commit transaction
     [java] [EL Finest]: connection: 2015-12-09 17:15:45.259--ServerSession(391447681)--Connection(757004314)--Thread(Thread[main,5,main])--Connection released to connection pool [default].
     [java] [EL Finer]: transaction: 2015-12-09 17:15:45.262--UnitOfWork(1825738663)--Thread(Thread[main,5,main])--end unit of work commit
     [java] [EL Finer]: transaction: 2015-12-09 17:15:45.264--UnitOfWork(1825738663)--Thread(Thread[main,5,main])--resume unit of work
     [java] [EL Finer]: transaction: 2015-12-09 17:15:45.267--UnitOfWork(1825738663)--Thread(Thread[main,5,main])--release unit of work
     [java] [EL Finer]: connection: 2015-12-09 17:15:45.267--ClientSession(1110031167)--Thread(Thread[main,5,main])--client released
     [java] Giacomo
     [java] [EL Finer]: connection: 2015-12-09 17:15:45.288--ServerSession(391447681)--Thread(Thread[main,5,main])--client acquired: 252553541
     [java] [EL Finer]: transaction: 2015-12-09 17:15:45.289--ClientSession(252553541)--Thread(Thread[main,5,main])--acquire unit of work: 1208203046
     [java] [EL Finest]: query: 2015-12-09 17:15:45.289--UnitOfWork(1208203046)--Thread(Thread[main,5,main])--Execute query ReadAllQuery(name="Person.findAll" referenceClass=Person sql="SELECT idPerson, birthday, firstname, lastname FROM Person")
     [java] [EL Finest]: connection: 2015-12-09 17:15:45.29--ServerSession(391447681)--Connection(757004314)--Thread(Thread[main,5,main])--Connection acquired from connection pool [default].
     [java] [EL Fine]: sql: 2015-12-09 17:15:45.291--ServerSession(391447681)--Connection(757004314)--Thread(Thread[main,5,main])--SELECT idPerson, birthday, firstname, lastname FROM Person
     [java] [EL Finest]: connection: 2015-12-09 17:15:45.292--ServerSession(391447681)--Connection(757004314)--Thread(Thread[main,5,main])--Connection released to connection pool [default].
     [java] [EL Finer]: transaction: 2015-12-09 17:15:45.294--UnitOfWork(1208203046)--Thread(Thread[main,5,main])--release unit of work
     [java] [EL Finer]: connection: 2015-12-09 17:15:45.295--ClientSession(252553541)--Thread(Thread[main,5,main])--client released
     [java] andrea
     [java] edoardo
     [java] guido
     [java] Giacomo
     [java] Giacomo
     [java] Giacomo
     [java] [EL Finer]: connection: 2015-12-09 17:15:45.296--ServerSession(391447681)--Thread(Thread[main,5,main])--client acquired: 1304117943
     [java] [EL Finer]: transaction: 2015-12-09 17:15:45.296--ClientSession(1304117943)--Thread(Thread[main,5,main])--acquire unit of work: 1727361096
     [java] [EL Finest]: query: 2015-12-09 17:15:45.296--UnitOfWork(1727361096)--Thread(Thread[main,5,main])--Execute query ReadAllQuery(name="MeasureDefinition.findAll" referenceClass=MeasureDefinition sql="SELECT IDMEASUREDEFINITION, measureName, measureType FROM MeasureDefinition")
     [java] [EL Finest]: connection: 2015-12-09 17:15:45.296--ServerSession(391447681)--Connection(757004314)--Thread(Thread[main,5,main])--Connection acquired from connection pool [default].
     [java] [EL Fine]: sql: 2015-12-09 17:15:45.297--ServerSession(391447681)--Connection(757004314)--Thread(Thread[main,5,main])--SELECT IDMEASUREDEFINITION, measureName, measureType FROM MeasureDefinition
     [java] [EL Finest]: connection: 2015-12-09 17:15:45.297--ServerSession(391447681)--Connection(757004314)--Thread(Thread[main,5,main])--Connection released to connection pool [default].
     [java] [EL Finer]: transaction: 2015-12-09 17:15:45.298--UnitOfWork(1727361096)--Thread(Thread[main,5,main])--release unit of work
     [java] [EL Finer]: connection: 2015-12-09 17:15:45.298--ClientSession(1304117943)--Thread(Thread[main,5,main])--client released
     [java] height integer 1
     [java] weight double 2
     [java] bmi double 3

BUILD SUCCESSFUL
Total time: 3 seconds
