package example.service;

import org.springframework.stereotype.Service;

@Service
interface GreetService {
  fun say(): String;
}
