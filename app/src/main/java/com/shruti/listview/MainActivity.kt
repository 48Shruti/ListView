package com.shruti.listview

import android.content.AbstractThreadedSyncAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.core.view.get
import com.shruti.listview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var items = arrayListOf("ria", "vanshika", "shruti","roma","ridham")
    lateinit var binding : ActivityMainBinding
    lateinit var adapter: ArrayAdapter<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1, items)
       binding.list.adapter = adapter
        //items.add("simran")
        //items.removeAt(3)
        binding.list.setOnItemClickListener { parent, position,  id, view ->
           System.out.println("parent $parent,postion $position,view $view,id $id")
            items.add("daviet")
            adapter.notifyDataSetChanged()
        }
        binding.fab.setOnClickListener {
            items.add("simran")
            items.add("mansi")
            adapter.notifyDataSetChanged()
        }

    }
}