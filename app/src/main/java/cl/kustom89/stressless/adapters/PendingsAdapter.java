package cl.kustom89.stressless.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import java.util.List;

import cl.kustom89.stressless.R;
import cl.kustom89.stressless.data.Queries;
import cl.kustom89.stressless.models.Pending;

/**
 * Created by kustom89 on 14-04-2018.
 */

public class PendingsAdapter extends RecyclerView.Adapter<PendingsAdapter.ViewHolder>{
    private List<Pending> pendings=new Queries().pendings();


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent,int viewType) {
        View view= LayoutInflater.from( parent.getContext() ).inflate( R.layout.list_item_pending,parent,false );
        ViewHolder viewHolder=new ViewHolder( view );
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder,int position) {

        Pending pending= pendings.get( position );
        holder.textView.setText( pending.getName() );
        holder.checkBox.setChecked( pending.isDone() );

        holder.checkBox.setOnCheckedChangeListener( new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView,boolean isChecked) {



            }
        } );
        holder.textView.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        } );



    }

    @Override
    public int getItemCount() {
        return pendings.size();
    }

    public static  class ViewHolder extends RecyclerView.ViewHolder{
        private CheckBox checkBox;
        private TextView textView;

        public ViewHolder(View itemView) {
            super( itemView );

            checkBox=itemView.findViewById( R.id.pendingCb );
            textView=itemView.findViewById( R.id.pendingTv );
        }
    }


}
