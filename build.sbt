name := "nn_douga_media"
 
version := "1.0" 
      
lazy val `nn_douga_media` = (project in file(".")).enablePlugins(PlayScala)

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"
      
resolvers += "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/"
      
scalaVersion := "2.12.2"

libraryDependencies ++= Seq( jdbc , ehcache , ws , specs2 % Test , guice )
libraryDependencies ++= Seq("com.pauldijou" %% "jwt-core" % "2.1.0")
libraryDependencies ++= Seq("org.scalikejdbc" %% "scalikejdbc"  % "3.2.0")
libraryDependencies ++= Seq("org.scalikejdbc" %% "scalikejdbc-config" % "3.2.0")
libraryDependencies ++= Seq("org.scalikejdbc" %% "scalikejdbc-play-dbapi-adapter" % "2.6.0-scalikejdbc-3.2")
libraryDependencies ++= Seq("mysql" % "mysql-connector-java" % "5.1.36")

unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )  

      