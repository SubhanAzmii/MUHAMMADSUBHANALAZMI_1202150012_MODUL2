package com.example.android.subhan_1202150012_modul2;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Kizuna on 18-Feb-18.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    //deklarasi varibale
    private ArrayList<String> Dname, Dharga;
    private ArrayList<Integer> DImage;


    RecyclerViewAdapter(ArrayList<String> Dname, ArrayList<String> Dharga, ArrayList<Integer> DImage) {
        this.Dname = Dname;
        this.Dharga = Dharga;
        this.DImage = DImage;

    }

    class ViewHolder extends RecyclerView.ViewHolder {
        //deklarasi variable
        private TextView nMakanan, nharga;
        private ImageView img;
        private LinearLayout Itemlist;

        public ViewHolder(View itemView) {
            super(itemView);
            //deklarasi variable pada komponen id
            nMakanan = itemView.findViewById(R.id.txMenu);
            nharga = itemView.findViewById(R.id.txHarga);
            img = itemView.findViewById(R.id.image_view);
            Itemlist = itemView.findViewById(R.id.itemlist);

            //fungsi onclick untuk kondisi pemilihan menu
            Itemlist.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(view.getContext(), detailmenu.class);
                    String komposisi;
                    //pemilihan kondisi
                    if (getAdapterPosition()==0){
                        intent.putExtra("makanan",Dname.get(getAdapterPosition()));
                        intent.putExtra("harga", Dharga.get(getAdapterPosition()));
                        intent.putExtra("imgae", DImage.get(getAdapterPosition()));
                        komposisi = "lontong, sayur rebung, telur";
                        intent.putExtra("komposisi",komposisi);
                        view.getContext().startActivity(intent);
                    }
                    else if (getAdapterPosition()==1){
                        intent.putExtra("makanan",Dname.get(getAdapterPosition()));
                        intent.putExtra("harga", Dharga.get(getAdapterPosition()));
                        intent.putExtra("imgae", DImage.get(getAdapterPosition()));
                        komposisi = "Mie, sayur , ayam suir, cuka, micin, kuah bakso, bakso 2 buah";
                        intent.putExtra("komposisi",komposisi);
                        view.getContext().startActivity(intent);
                    }
                    else if (getAdapterPosition()==2){
                        intent.putExtra("makanan",Dname.get(getAdapterPosition()));
                        intent.putExtra("harga", Dharga.get(getAdapterPosition()));
                        intent.putExtra("imgae", DImage.get(getAdapterPosition()));
                        komposisi = "Nasi, kuah gulai , daging kambing, sambal, brambang goreng";
                        intent.putExtra("komposisi",komposisi);
                        view.getContext().startActivity(intent);
                    }
                    else if (getAdapterPosition()==3){
                        intent.putExtra("makanan",Dname.get(getAdapterPosition()));
                        intent.putExtra("harga", Dharga.get(getAdapterPosition()));
                        intent.putExtra("imgae", DImage.get(getAdapterPosition()));
                        komposisi = "Nasi, kecap, saos, sosis, micin, garam, telur, sosis";
                        intent.putExtra("komposisi",komposisi);
                        view.getContext().startActivity(intent);
                    }
                    else if (getAdapterPosition()==4){
                        intent.putExtra("makanan",Dname.get(getAdapterPosition()));
                        intent.putExtra("harga", Dharga.get(getAdapterPosition()));
                        intent.putExtra("imgae", DImage.get(getAdapterPosition()));
                        komposisi = "nasi, santan, kunir, kering tempe kentang, telur, sambal";
                        intent.putExtra("komposisi",komposisi);
                        view.getContext().startActivity(intent);
                    }
                    else if (getAdapterPosition()==5){
                        intent.putExtra("makanan",Dname.get(getAdapterPosition()));
                        intent.putExtra("harga", Dharga.get(getAdapterPosition()));
                        intent.putExtra("imgae", DImage.get(getAdapterPosition()));
                        komposisi = "nasi, sambal kacang, peyek, kering tempe kentang, telur, sayur tela";
                        intent.putExtra("komposisi",komposisi);
                        view.getContext().startActivity(intent);
                    }
                }
            });
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View a = LayoutInflater.from(parent.getContext()).inflate(R.layout.listmenu, parent, false);
        ViewHolder vh = new ViewHolder(a);
        return vh;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        final String nama = Dname.get(position);
        final String harga = Dharga.get(position);
        final Integer gambar = DImage.get(position);

        holder.nMakanan.setText(nama);
        holder.nharga.setText(harga);
        holder.img.setImageResource(gambar);

    }

    @Override
    public int getItemCount() {
        return Dname.size();
    }
}
