package query

import io.gatling.core.Predef._
import io.gatling.http.Predef._

object GoogleQuery {
  val query = http("Google")
    .get("/search")
     .pause(5)
    .check(status.is(200))

}