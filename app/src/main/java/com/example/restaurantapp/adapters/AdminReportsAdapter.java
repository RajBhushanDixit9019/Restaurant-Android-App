package com.example.restaurantapp.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.restaurantapp.R;


public class AdminReportsAdapter extends RecyclerView.Adapter<AdminReportsAdapter.ReportViewHolder> {

    // Replace with your actual report data model
    private String[] reportData;

    public AdminReportsAdapter(String[] reportData) {
        this.reportData = reportData;
    }

    @Override
    public ReportViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_report, parent, false);
        return new ReportViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ReportViewHolder holder, int position) {
        holder.reportTitle.setText(reportData[position]);
    }

    @Override
    public int getItemCount() {
        return reportData.length;
    }

    public class ReportViewHolder extends RecyclerView.ViewHolder {

        TextView reportTitle;

        public ReportViewHolder(View itemView) {
            super(itemView);
            reportTitle = itemView.findViewById(R.id.txtReportTitle);
        }
    }
}
