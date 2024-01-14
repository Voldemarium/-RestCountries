package ru.synergy.data_sources;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import ru.synergy.model.v3.v31.Country;
import java.util.List;

public interface CountriesApiDataSource {
    @GET("name/{name}")
    Call<List<Country>> getCountriesByName(@Path("name") String name);

    @GET("name/{name}")
    Call<List<Country>> getCountriesByFullName(@Query("name") String name, @Query("fullText") boolean fullText);

    @GET("alpha/{code}")
    Call<List<Country>> getCountriesByCode(@Path("code") int code);

    @GET("alpha")
    Call<List<Country>> getCountriesByCodes(@Query("codes") int[] codes);

    @GET("currency/{currency}")
    Call<List<Country>> getCountriesByCurrency(@Path("currency") String currency);

    @GET("demonym/{demonym}")
    Call<List<Country>> getCountriesByDemonym(@Path("demonym") String demonym);

    @GET("language/{language}")
    Call<List<Country>> getCountriesByLanguage(@Path("language") String language);

    @GET("capital/{capital}")
    Call<List<Country>> getCountriesByCapital(@Path("capital") String capital);

    @GET("region/{region}")
    Call<List<Country>> getCountriesByRegion(@Path("region") String region);

    @GET("subregion/{subregion}")
    Call<List<Country>> getCountriesBySubregion(@Path("subregion") String subregion);

    @GET("translation/{translation}")
    Call<List<Country>> getCountriesByTranslation(@Path("translation") String translation);





}
