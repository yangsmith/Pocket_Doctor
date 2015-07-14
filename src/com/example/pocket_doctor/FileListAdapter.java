package com.example.pocket_doctor;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class FileListAdapter extends ArrayAdapter<FileInfo> {

	private LayoutInflater mInflater;
	private int resourceid;

	public FileListAdapter(Context context, int resource, List<FileInfo> objects) {
		super(context, resource, objects);
		mInflater = LayoutInflater.from(context);
		resourceid = resource;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		FileInfo fileInfo = getItem(position);
		View view = null;
		ViewHolder viewHolder;
		if (convertView != null) {
			view = convertView;
			viewHolder = (ViewHolder) convertView.getTag();
		} else {
			viewHolder = new ViewHolder();
			view = mInflater.inflate(resourceid, parent);
			viewHolder.imageView = (ImageView) view.findViewById(R.id.icon);
			viewHolder.textViewName = (TextView) view
					.findViewById(R.id.text_name);
			viewHolder.textViewArr = (TextView) view
					.findViewById(R.id.text_arr);
		}

		return view;
	}

	class ViewHolder {
		ImageView imageView;
		TextView textViewName;
		TextView textViewArr;
	}
}
