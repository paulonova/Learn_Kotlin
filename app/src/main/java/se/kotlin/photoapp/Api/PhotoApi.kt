package se.kotlin.photoapp.Api

import retrofit2.Call
import retrofit2.http.GET
import se.kotlin.photoapp.models.PhotoList

/** * Created by Paulo Vila Nova on 2017-07-12.
 *
 * Retrofit uses interfaces for creating the REST service
 */
interface PhotoApi {
    @GET("?key=5878215-6d89a2b3d8674f053f3d0c4c7&q=nature&image=photo")
    fun getPhotos() : Call<PhotoList>
}