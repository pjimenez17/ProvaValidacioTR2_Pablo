package com.example.provavalidaciotr2_pablo;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import javax.xml.namespace.QName;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {
    private List<ListElement> mData;
    private LayoutInflater mInflater;
    private Context context;

    public ListAdapter(List<ListElement> itemList, Context context){
        this.mInflater = LayoutInflater.from(context);
        this.context = context;
        this.mData = itemList;
    }

    @Override
    public int getItemCount(){return mData.size();}

    public ListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int ViewType){
        View view = mInflater.inflate(R.layout.list_element, null);
        return new ListAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ListAdapter.ViewHolder holder, final int position){
        holder.bindData(mData.get(position));
        holder.cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int clickedPosition = holder.getAbsoluteAdapterPosition();
                String nombreUsuario = mData.get(clickedPosition).getName();

                Toast.makeText(context, context.getResources().getString(R.string.me_has_clicado) + nombreUsuario,  Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void setItems(List <ListElement> items){mData= items;}

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView iconImage;
        TextView name, lobby, status;
        CardView cv;

        ViewHolder(View ItemView){
            super(ItemView);
            iconImage = itemView.findViewById(R.id.iconImageView);
            name = itemView.findViewById(R.id.nameTextView);
            lobby = itemView.findViewById(R.id.cityTextView);
            cv = itemView.findViewById(R.id.cv);
        }
        void bindData(final ListElement item){
            iconImage.setColorFilter(Color.parseColor(item.getColor()), PorterDuff.Mode.SRC_IN);
            name.setText(item.getName());
            lobby.setText(item.getLobby());
        }
    }

}