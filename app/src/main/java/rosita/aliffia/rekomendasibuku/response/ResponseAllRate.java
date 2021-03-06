package rosita.aliffia.rekomendasibuku.response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import rosita.aliffia.rekomendasibuku.data.Review;

public class ResponseAllRate {
    @SerializedName("data")
    List<Review> reviews;
    @SerializedName("message")
    String message;

    public List<Review> getReviews() {
        return reviews;
    }

    public String getMessage() {
        return message;
    }
}
