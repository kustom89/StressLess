package cl.kustom89.stressless.data;

import java.util.ArrayList;
import java.util.List;

import cl.kustom89.stressless.models.Pending;

/**
 * Created by kustom89 on 14-04-2018.
 */

public class Queries {

    public List<Pending> pendings(){
        List<Pending> pendings= new ArrayList<>(  );
        List<Pending> pendingList=Pending.listAll( Pending.class );
        if(pendingList !=null && pendingList.size()>0){

            pendings.addAll( pendingList);
        }
        return pendings;
    }
}
