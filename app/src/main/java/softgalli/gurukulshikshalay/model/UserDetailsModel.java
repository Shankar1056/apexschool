package softgalli.gurukulshikshalay.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class UserDetailsModel {
    @SerializedName("status")
    String status;
    @SerializedName("msg")
    String msg;
    @SerializedName("data")
    ArrayList<UserDetailsDataModel> data;

    public String getStatus() {
        return status;
    }

    public String getMsg() {
        return msg;
    }

    public ArrayList<UserDetailsDataModel> getData() {
        return data;
    }
}
