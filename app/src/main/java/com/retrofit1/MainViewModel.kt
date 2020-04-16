package com.retrofit1

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.retrofit1.Clients.APIClient
import com.retrofit1.Interfaces.ApiInterface
import com.retrofit1.Model.DataModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainViewModel(application: Application) : AndroidViewModel(application) {
    var dataList: ArrayList<Datum> = ArrayList()
    private val mutablePostList: MutableLiveData<ArrayList<Datum>> = MutableLiveData()

        fun getProjectList(): MutableLiveData<ArrayList<Datum>> {

            //TODO:  DO this in repository

        var apiServices = APIClient.client.create(ApiInterface::class.java)
        val call = apiServices.getProjectList()

        call.enqueue(object : Callback<DataModel> {
            override fun onResponse(call: Call<DataModel>, response: Response<DataModel>) {

                val jsonResponse = response.body()
                dataList = jsonResponse?.rows!!  as ArrayList<Datum>

                mutablePostList.postValue(dataList)
            }

            override fun onFailure(call: Call<DataModel>?, t: Throwable?) {
                Log.d("ERROR : ", " ")

            }
        })

        return mutablePostList


    }

}