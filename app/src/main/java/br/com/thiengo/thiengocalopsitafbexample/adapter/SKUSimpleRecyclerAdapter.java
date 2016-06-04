package br.com.thiengo.thiengocalopsitafbexample.adapter;

import com.firebase.client.Query;
import com.firebase.ui.FirebaseRecyclerAdapter;

import br.com.thiengo.thiengocalopsitafbexample.domain.SKU;

/**
 * Created by Vitor on 03/06/2016.
 */
public class SKUSimpleRecyclerAdapter extends FirebaseRecyclerAdapter<SKU,SKUSimpleViewHolder> {

    public SKUSimpleRecyclerAdapter(
            Class<SKU> modelClass,
            int modelLayout,
            Class<SKUSimpleViewHolder> viewHolderClass,
            Query ref) {

        super(modelClass, modelLayout, viewHolderClass, ref);
    }

    @Override
    protected void populateViewHolder(
            SKUSimpleViewHolder skuSimpleViewHolder,
            SKU sku,
            int i) {
        skuSimpleViewHolder.text1.setText( sku.getNome() );
        //skuSimpleViewHolder.text2.setText(sku.getPrecoAtualString());
    }
}
