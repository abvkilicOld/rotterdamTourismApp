package com.example.rotterdamtourism;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Recyclerview_Config {
    private Context mContext;
    private HotelsAdapter mHotelsAdapter;
    public void setConfig(RecyclerView recyclerView, Context context, List<Hotel> hotels, List<String> keys){
        mContext = context;
        mHotelsAdapter = new HotelsAdapter(hotels, keys);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setAdapter(mHotelsAdapter);
    }

    class HotelItemView extends RecyclerView.ViewHolder {
        private TextView mAdress;
        private TextView mName;

        private String key;

        public HotelItemView(ViewGroup parent) {
            super(LayoutInflater.from(mContext).
            inflate(R.layout.hotel_item, parent, false));

            mAdress = (TextView) itemView.findViewById(R.id.adres_textView);
            mName = (TextView) itemView.findViewById(R.id.name_txtView);

        }

        public void bind(Hotel hotel, String key) {
            mAdress.setText(hotel.getAdres());
            mName.setText(hotel.getName());
            this.key = key;
        }
    }

    class HotelsAdapter extends RecyclerView.Adapter<HotelItemView> {
        private List<Hotel> mHotelList;
        private List<String> mKeys;

        public HotelsAdapter(List<Hotel> mHotelList, List<String> mKeys) {
            this.mHotelList = mHotelList;
            this.mKeys = mKeys;
        }

        @NonNull
        @Override
        public HotelItemView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new HotelItemView(parent);
        }

        @Override
        public void onBindViewHolder(@NonNull HotelItemView holder, int position) {
            holder.bind(mHotelList.get(position), mKeys.get(position));

        }

        @Override
        public int getItemCount() {
            return mHotelList.size();
        }
    }
}
