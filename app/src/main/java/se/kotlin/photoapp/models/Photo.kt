package se.kotlin.photoapp.models

import java.io.Serializable

/** * Created by Paulo Vila Nova on 2017-07-12.
 */
data class Photo(val id : String,
                 val likes : Int,
                 val favorites : Int,
                 val tags : String,
                 val previewURL : String,
                 val webformatURL : String) : Serializable {
}