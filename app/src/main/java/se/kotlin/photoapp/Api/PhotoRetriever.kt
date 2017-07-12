package se.kotlin.photoapp.Api

import retrofit2.Callback
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import se.kotlin.photoapp.models.PhotoList

/** * Created by Paulo Vila Nova on 2017-07-12.
 */
class PhotoRetriever {

    private val service : PhotoApi;

    init{
        val retrofit = Retrofit.Builder()
                .baseUrl("https://pixabay.com/api")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        service = retrofit.create(PhotoApi :: class.java);
    }

    fun getPhotos(callback: Callback<PhotoList>){
        val call = service.getPhotos();
        call.enqueue(callback);
    }


}