package example.service;

import example.repository.*;

import org.springframework.stereotype.Service;

@Service
class GreetServiceImpl : GreetService {

  val greetRepository: GreetRepository = GreetRepositoryImpl()

  override fun say(): String = greetRepository.say()

}
