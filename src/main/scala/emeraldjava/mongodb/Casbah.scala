package emeraldjava.mongodb

import com.mongodb.casbah.Imports._

/**
 * Mongo DB Casbah
 * 
 * http://mongodb.github.io/casbah/tutorial.html
 */
object Casbah {
  
  def main(args: Array[String]) {
    
    println("Hello Mongodb")
    val mongoClient = MongoClient("localhost", 27017)
    val db = mongoClient("local")
    db.collectionNames
    
    val allDocs = db("system.indexes")
    println( allDocs )
    for(doc <- allDocs) println( doc )
    
    val a = MongoDBObject("hello" -> "world")
    val coll = db("poc")
    coll.insert( a )
    
    db.collectionNames
  }
}