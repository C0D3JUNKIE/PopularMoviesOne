package cloud.mockingbird.popularmoviesone;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import java.util.ArrayList;

public class MovieAdapter extends ArrayAdapter<MoviePoster> {

  private static final String LOG_TAG = MovieAdapter.class.getSimpleName();

  public MovieAdapter(@NonNull Context context, ArrayList<MoviePoster> moviePosterArrayList) {
    super(context, 0, moviePosterArrayList);
  }

  @NonNull
  @Override
  public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

    View listItemView = convertView;

    if(listItemView == null){
      listItemView = LayoutInflater.from(getContext()).inflate(R.layout.gi_poster_image, parent, false);
    }

    MoviePoster  currentMoviePoster = getItem(position);

    ImageView movieImageView = (ImageView) listItemView.findViewById(R.id.iv_movie_poster_image);

    return listItemView;

  }


}
