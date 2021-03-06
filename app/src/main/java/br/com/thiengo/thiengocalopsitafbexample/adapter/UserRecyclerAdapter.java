package br.com.thiengo.thiengocalopsitafbexample.adapter;

import com.firebase.client.Query;
import com.firebase.ui.FirebaseRecyclerAdapter;

import br.com.thiengo.thiengocalopsitafbexample.domain.User;

public class UserRecyclerAdapter extends FirebaseRecyclerAdapter<User, UserViewHolder> {

    public UserRecyclerAdapter(
            Class<User> modelClass,
            int modelLayout,
            Class<UserViewHolder> viewHolderClass,
            Query ref ){

        super( modelClass, modelLayout, viewHolderClass, ref );
    }

    @Override
    protected void populateViewHolder(
            UserViewHolder userViewHolder,
            User user, int i) {

        userViewHolder.text1.setText( user.getName() );
        userViewHolder.text2.setText( user.getEmail() );
    }
}
