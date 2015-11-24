package com.perqin.smsbackup;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

public class AllSMSRecyclerAdapter extends RecyclerView.Adapter<AllSMSRecyclerAdapter.ViewHolder> {
    private SMSDataModel mDataModel;

    public AllSMSRecyclerAdapter() {
        mDataModel = SMSDataModel.getInstance();
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(View itemView) {
            super(itemView);
        }
    }
}
