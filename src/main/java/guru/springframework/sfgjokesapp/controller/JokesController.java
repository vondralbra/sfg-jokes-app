package guru.springframework.sfgjokesapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import guru.springframework.sfgjokesapp.services.JokeService;

@Controller
public class JokesController {

	private JokeService jokeService;

	public JokesController(JokeService jokesService) {
		super();
		this.jokeService = jokesService;
	}

	@GetMapping("/")
	public String getJoke(Model model) {
		model.addAttribute("joke", jokeService.getJoke());
		return "chucknorris"; // forward to view jokes
	}
}
