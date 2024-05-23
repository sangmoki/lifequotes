package com.sangmoki.lifequotes

import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class ListViewAdapter(val List: MutableList<String>) : BaseAdapter() {
    override fun getCount(): Int {
        return List.size
    }

    override fun getItem(position: Int): Any {
        return List[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        var convertView = convertView

        if (convertView == null) {
            convertView = View.inflate(parent!!.context, R.layout.list_view_item, null)
        }

        val listviewText = convertView?.findViewById<TextView>(R.id.listViewItemTextView)
        listviewText!!.text = List[position]

        return convertView!!
    }

}