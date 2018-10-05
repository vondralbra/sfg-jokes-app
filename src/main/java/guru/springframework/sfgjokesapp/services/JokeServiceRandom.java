package guru.springframework.sfgjokesapp.services;

import org.springframework.stereotype.Component;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Component
public class JokeServiceRandom implements JokeService {

	ChuckNorrisQuotes chuckNorrisQuotes = new ChuckNorrisQuotes();

	@Override
	public String getJoke() {
		return chuckNorrisQuotes.getRandomQuote();
	}

}
