
package com.retrofit1.Model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.retrofit1.Datum;

public class DataModel {


    @SerializedName("title")
    @Expose
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Datum> getRows() {
        return rows;
    }

    public void setRows(List<Datum> rows) {
        this.rows = rows;
    }

    @SerializedName("rows")
    @Expose
    private List<Datum> rows = null;

}
