package example.repository;

import org.springframework.stereotype.Repository;

@Repository("greetRepository")
interface GreetRepository {

  fun say(): String

}
