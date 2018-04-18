package cl.kustom89.stressless;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import cl.kustom89.stressless.adapters.PendingsAdapter;
import cl.kustom89.stressless.models.Pending;

/**
 * A placeholder fragment containing a simple view.
 */
public class PendingsFragments extends Fragment implements PendingClickListener {
    private PendingsAdapter adapter;

    public PendingsFragments() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate( R.layout.fragment_main,container,false );
    }

    @Override
    public void onViewCreated(View view,@Nullable Bundle savedInstanceState) {
        super.onViewCreated( view,savedInstanceState );

        RecyclerView recyclerView= view.findViewById(R.id.pendingRv );
        recyclerView.setHasFixedSize( true );

        LinearLayoutManager layoutManager= new LinearLayoutManager( getContext() );
        recyclerView.setLayoutManager( layoutManager );

        adapter= new PendingsAdapter(this);
        recyclerView.setAdapter( adapter );
    }

    public  void updateList(Pending pending){
        adapter.update(pending);
        Log.d("pending",pending.getName());

    }

    @Override
    public void clickedID(long id) {
        Toast.makeText(getContext(), String.valueOf(id), Toast.LENGTH_SHORT).show();

    }
}
