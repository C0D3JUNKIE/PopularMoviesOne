package cloud.mockingbird.popularmoviesone;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import org.json.JSONException;
import org.json.JSONObject;

public class DetailActivity extends AppCompatActivity {

  public static final String EXTRA_POSITION = "extra_position";
  public static final int DEFAULT_POSITION = -1;

  private ImageView moviePosterImage;
  private TextView moviePosterTitle;
  private TextView moviePosterRating;
  private TextView moviePosterDescription;

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_detail);

    moviePosterImage = (ImageView) findViewById(R.id.iv_movie_poster_image);
    moviePosterImage.setImageResource(R.drawable.wonder_woman_poster);

    moviePosterTitle = (TextView) findViewById(R.id.tv_movie_title);
    moviePosterRating = (TextView) findViewById(R.id.tv_movie_rating);
    moviePosterDescription = (TextView) findViewById(R.id.tv_movie_description);

    Intent intent = getIntent();
    if(intent == null){
      closeOnError();
    }

    int position = intent.getIntExtra(EXTRA_POSITION, DEFAULT_POSITION);

    if(position == DEFAULT_POSITION){
      closeOnError();
      return;
    }

////    String[] movies = ;
////    String json = movies[position];
//    MoviePoster movie = null;
//
//    try{
//      movie = JsonUtil.parseMoviePosterJson(json);
//    }catch(JSONException e){
//      e.printStackTrace();
//    }
//
//    if(movie == null){
//      closeOnError();
//      return;
//    }
//
//    populateUI(movie);


  }

  private void closeOnError(){
    finish();
    Toast.makeText(this, "ERROR", Toast.LENGTH_SHORT).show();
  }

  private void populateUI(MoviePoster movie){

  }


}
