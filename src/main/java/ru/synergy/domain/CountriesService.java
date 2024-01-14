package ru.synergy.domain;

import ru.synergy.data_sources.CountriesApiDataSource;

import java.util.List;
import java.io.IOException;
import retrofit2.Call;
import retrofit2.Response;
import ru.synergy.model.v3.v31.Country;

public class CountriesService {
    final CountriesApiDataSource countriesApiDataSource;

    public CountriesService(CountriesApiDataSource countriesApiDataSource) {
        this.countriesApiDataSource = countriesApiDataSource;
    }

    public List<Country> getCountriesByName(String name) throws IOException {
        Call<List<Country>> call =  countriesApiDataSource.getCountriesByName(name);
        Response<List<Country>> res = call.execute();
        //    System.out.println(res.code());
        //    System.out.println(res.body());
        return res.body();
    }

    public List<Country> getCountriesByFullName(String name, boolean fullText) throws IOException {
        return countriesApiDataSource.getCountriesByFullName(name, fullText).execute().body();
    }

    public List<Country> getCountriesByCode(int code) throws IOException {
        return countriesApiDataSource.getCountriesByCode(code).execute().body();
    }

    public List<Country> getCountriesByCodes(int[] codes) throws IOException {
        return countriesApiDataSource.getCountriesByCodes(codes).execute().body();
    }

    public List<Country> getCountriesByCurrency(String currency) throws IOException {
        return countriesApiDataSource.getCountriesByCurrency(currency).execute().body();
    }

    public List<Country> getCountriesByDemonym(String demonym) throws IOException {
        return countriesApiDataSource.getCountriesByDemonym(demonym).execute().body();
    }

    public List<Country> getCountriesByLanguage(String language) throws IOException {
        return countriesApiDataSource.getCountriesByLanguage(language).execute().body();
    }

    public List<Country> getCountriesByCapital(String capital) throws IOException {
        return countriesApiDataSource.getCountriesByCapital(capital).execute().body();
    }

    public List<Country> getCountriesByRegion(String region) throws IOException {
        return countriesApiDataSource.getCountriesByRegion(region).execute().body();
    }

    public List<Country> getCountriesBySubregion(String subregion) throws IOException {
        return countriesApiDataSource.getCountriesBySubregion(subregion).execute().body();
    }

    public List<Country> getCountriesByTranslation(String translation) throws IOException {
        return countriesApiDataSource.getCountriesByTranslation(translation).execute().body();
    }
}
