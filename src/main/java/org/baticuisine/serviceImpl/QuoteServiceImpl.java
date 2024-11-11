package org.baticuisine.serviceImpl;

import org.baticuisine.entities.Quote;
import org.baticuisine.repositoryImpl.QuoteRepositoryImpl;
import org.baticuisine.service.QuoteService;

import java.util.List;
import java.util.stream.Collectors;

public class QuoteServiceImpl implements QuoteService {

    private QuoteRepositoryImpl quoteRepository;

    public QuoteServiceImpl(){
        this.quoteRepository = new QuoteRepositoryImpl();
    }

    @Override
    public void addQuote(Quote quote){
        quoteRepository.addQuote(quote);
    }

    public List<String> getNoms(List<Quote> quotes){
        return quotes.stream().map(devis->devis.getProject().getClient().getName()).collect(Collectors.toList());
    }
}
