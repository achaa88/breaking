package br.com.thiengo.thiengocalopsitafbexample.adapter;

import com.firebase.client.Query;
import com.firebase.ui.FirebaseRecyclerAdapter;

import br.com.thiengo.thiengocalopsitafbexample.domain.PDV;

/**
 * Created by Vitor on 03/06/2016.
 */
public class PDVRecyclerAdapter extends FirebaseRecyclerAdapter<PDV, PDVViewHolder> {

    public PDVRecyclerAdapter(
            Class<PDV> modelClass,
            int modelLayout,
            Class<PDVViewHolder> viewHolderClass,
            Query ref) {

        super(modelClass, modelLayout, viewHolderClass, ref);
    }


    @Override
    protected void populateViewHolder(PDVViewHolder pdvViewHolder, PDV pdv, int i) {
        pdvViewHolder.titulo.setText( pdv.getnome() );
        pdvViewHolder.endereco.setText(pdv.getFullEndereco());
    }
}
