package com.example.project_eventvox

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.project_eventvox.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

const val BASE_URL = "https://jsonplaceholder.typicode.com/"

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class FirstFragment : Fragment() {

    private lateinit var adapter: MyAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var newsArrayList: ArrayList<News>

    lateinit var imageId : Array<Int>
    lateinit var judul : Array<String>
    lateinit var keterangan : Array<String>
    lateinit var tanggal : Array<String>

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            binding = ActivityMainBinding.inflate(layoutInflater)
            val view = binding.root
            (view)

            getMyData()

        }

    }

    private fun getMyData() {
        val retrofitBuilder = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
            .create(ApiInterface::class.java)

        val retrofitData = retrofitBuilder.getData()

        retrofitData.enqueue(object : Callback<List<MyDataItem>?> {
            override fun onResponse(
                call: Call<List<MyDataItem>?>,
                response: Response<List<MyDataItem>?>
            ) {
                val responseBody = response.body()!!

                val myStringBuilder = StringBuilder()

                for (myData in responseBody){
                    myStringBuilder.append(myData.userId)
                    myStringBuilder.append(myData.id)
                    myStringBuilder.append(myData.title)
                    myStringBuilder.append(myData.body)
                }
                val textview = view!!.findViewById<TextView>(R.id.txt)
                textview!!.text = myStringBuilder

            }

            override fun onFailure(call: Call<List<MyDataItem>?>, t: Throwable) {
                Log.d("FirstFragment", "onFailure: "+t.message)
            }
        })
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataInitialize()

        val layoutManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(R.id.txt)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        adapter = MyAdapter(newsArrayList)
        recyclerView.adapter = adapter

    }

    private fun dataInitialize(){
        newsArrayList = arrayListOf<News>()

        imageId = arrayOf(
            R.drawable.party,
            R.drawable.party_2
        )
        judul = arrayOf(
            getString(R.string.Judul_1),
            getString(R.string.Judul_2)
        )
        keterangan = arrayOf(
            getString(R.string.keterangan_1),
            getString(R.string.keterangan_2)
        )
        tanggal = arrayOf(
            getString(R.string.tanggal_1),
            getString(R.string.tanggal_2)
        )

        for (i in imageId.indices){
            val news = News(imageId[i],judul[i],keterangan[i],tanggal[i])
            newsArrayList.add(news)
        }
    }

}