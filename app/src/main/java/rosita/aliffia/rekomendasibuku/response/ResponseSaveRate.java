package rosita.aliffia.rekomendasibuku.response;

import com.google.gson.annotations.SerializedName;

public class ResponseSaveRate {
    @SerializedName("message")
    String message;

    public String getMessage() {
        return message;
    }
}
