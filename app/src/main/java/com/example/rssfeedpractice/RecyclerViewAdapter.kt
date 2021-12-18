package com.example.rssfeedpractice


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.rssfeedpractice.databinding.RowRecyclerviewBinding


class RecyclerViewAdapter(private var topicsList: List<Topics>): RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder>() {
    class RecyclerViewHolder(val binding: RowRecyclerviewBinding) :
        RecyclerView.ViewHolder(binding.root)


    fun setQuestionsList(topicsList: List<Topics>) {
        this.topicsList = topicsList
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        return RecyclerViewHolder(RowRecyclerviewBinding.inflate(
            LayoutInflater.from(parent.context),
            parent, false))
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        var currentTopic = topicsList[position]
        holder.binding.apply {
            titleTV.text = "${currentTopic.title}"

        }
    }
    override fun getItemCount() = topicsList.size
}
