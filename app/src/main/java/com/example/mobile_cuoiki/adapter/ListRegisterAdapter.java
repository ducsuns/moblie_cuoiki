package com.example.mobile_cuoiki.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.mobile_cuoiki.R;
import com.example.mobile_cuoiki.model.StudentClass;

import java.util.List;

//đéo cần dùng nữa :))

// tương tự ListClassAdapter, tuy nhiên ở đây chỉ định nghĩa hiển thị view item, k xử lí sự kiện onclick item
public class ListRegisterAdapter extends ArrayAdapter<StudentClass> {
    public ListRegisterAdapter(@NonNull Context context, @NonNull List<StudentClass> studentClass) {
        super(context,R.layout.item_register, studentClass);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        StudentClass studentClass=getItem(position);

        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_register,parent,false);
        }

        TextView id=convertView.findViewById(R.id.tvID);
        TextView idStudent=convertView.findViewById(R.id.tvIdStudent);
        TextView idClass=convertView.findViewById(R.id.tvIdClass);
        TextView kihoc=convertView.findViewById(R.id.tvKihoc);
        TextView tinchi=convertView.findViewById(R.id.tvTinchi);


        id.setText(""+studentClass.getId());
        idStudent.setText(""+studentClass.getIdStudent());
        idClass.setText(""+ studentClass.getIdClass());
        kihoc.setText(studentClass.getSemester());
        tinchi.setText(""+studentClass.getCredit());

        return convertView;
    }

}
