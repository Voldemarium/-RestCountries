package ru.synergy;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import ru.synergy.data_sources.CountriesApiDataSource;
import ru.synergy.domain.CountriesService;
import ru.synergy.model.v3.v31.Country;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://restcountries.com/v3.1/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        CountriesApiDataSource countriesApiDataSource = retrofit.create(CountriesApiDataSource.class);
        CountriesService countriesService = new CountriesService(countriesApiDataSource);
        try {
          List<Country> countryList = countriesService.getCountriesByName("Russia");
            System.out.println(countryList);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}