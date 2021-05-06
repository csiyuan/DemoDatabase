package sg.edu.rpc346.id19016011.demodatabase;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class TaskAdapter  extends ArrayAdapter<Task> {
    private ArrayList<Task> item;
    private Context context;
    private TextView tvID, tvDesc, tvDate;

    public TaskAdapter(Context context, int resource, ArrayList<Task> objects) {
        super(context, resource, objects);
        item = objects;
        this.context = context;
    }
    @Override
    public View getView(int position, @Nullable View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.row, parent, false);

        tvID = rowView.findViewById(R.id.tvID);
        tvDesc = rowView.findViewById(R.id.tvDesc);
        tvDate = rowView.findViewById(R.id.tvDate);

        Task currentItem = item.get(position);

        tvID.setText("Item: " + currentItem.getId());
        tvDesc.setText("Desc: " + currentItem.getDescription());
        tvDate.setText("Date: " + currentItem.getDate());

        return rowView;
    }
}

