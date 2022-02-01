package example.repository;

import org.springframework.stereotype.Repository;
import example.model.Greeting;

@Repository
class GreetRepositoryImpl : GreetRepository {
  override fun say(): String {
    val c = Greeting("hello world")
    return c.hi
  }
}
