package com.github.teocci.recyclerviewdemo.adapter;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.github.teocci.recyclerviewdemo.R;

/**
 * Created by teocci.
 *
 * @author teocci@yandex.com on 2017/Mar/13
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.BaseViewHolder>
{
    private String[] dataSet;

    // Provide a suitable constructor (depends on the kind of dataSet)
    public RecyclerViewAdapter(String[] dataSet)
    {
        this.dataSet = dataSet;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        // create a new view
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item, parent, false);
        // set the view's size, margins, paddings and layout parameters
        BaseViewHolder viewHolder = new BaseViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position)
    {
        holder.mTextView.setText(dataSet[position]);
    }

    @Override
    public int getItemCount()
    {
        return dataSet.length;
    }

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class BaseViewHolder extends RecyclerView.ViewHolder
    {
        public CardView mCardView;
        public TextView mTextView;

        public BaseViewHolder(View v)
        {
            super(v);

            mCardView = (CardView) v.findViewById(R.id.card_view);
            mTextView = (TextView) v.findViewById(R.id.tv_text);
        }
    }
}