package guru.springframework.sfgjokesapp.services;

import org.springframework.stereotype.Component;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Component
public class JokeServiceRandom implements JokeService {

	private ChuckNorrisQuotes chuckNorrisQuotes;

	public JokeServiceRandom(ChuckNorrisQuotes chuckNorrisQuotes) {
		super();
		this.chuckNorrisQuotes = chuckNorrisQuotes;
	}

	@Override
	public String getJoke() {
		return chuckNorrisQuotes.getRandomQuote();
	}

}
