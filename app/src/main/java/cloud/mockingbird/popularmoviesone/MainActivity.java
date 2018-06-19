package cloud.mockingbird.popularmoviesone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    ArrayList<MoviePoster> movies = new ArrayList<>();
    movies.add(new MoviePoster(R.drawable.wonder_woman_poster, "Wonder Woman", "4.5", "A bad ass chick from an island of beauties, comes to America and opens up a can"));
    movies.add(new MoviePoster(R.drawable.wonder_woman_poster, "Wonder Woman", "4.5", "A bad ass chick from an island of beauties, comes to America and opens up a can"));
    movies.add(new MoviePoster(R.drawable.wonder_woman_poster, "Wonder Woman", "4.5", "A bad ass chick from an island of beauties, comes to America and opens up a can"));
    movies.add(new MoviePoster(R.drawable.wonder_woman_poster, "Wonder Woman", "4.5", "A bad ass chick from an island of beauties, comes to America and opens up a can"));
    movies.add(new MoviePoster(R.drawable.wonder_woman_poster, "Wonder Woman", "4.5", "A bad ass chick from an island of beauties, comes to America and opens up a can"));
    movies.add(new MoviePoster(R.drawable.wonder_woman_poster, "Wonder Woman", "4.5", "A bad ass chick from an island of beauties, comes to America and opens up a can"));
    movies.add(new MoviePoster(R.drawable.wonder_woman_poster, "Wonder Woman", "4.5", "A bad ass chick from an island of beauties, comes to America and opens up a can"));
    movies.add(new MoviePoster(R.drawable.wonder_woman_poster, "Wonder Woman", "4.5", "A bad ass chick from an island of beauties, comes to America and opens up a can"));

    ArrayAdapter<MoviePoster> moviePosterAdapter = new ArrayAdapter<>(this, R.layout.gi_poster_image, movies);

    ImageView movieImage = (ImageView) findViewById(R.id.iv_movie_poster_image);

    final GridView gridView = (GridView) findViewById(R.id.gv_movies_main);
    gridView.setAdapter(new MovieAdapter(this, movies));

    gridView.setOnItemClickListener(new OnItemClickListener() {
      @Override
      public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        launchActivity(i);
      }
    });

  }

  private void launchActivity(int position){
    Intent intent = new Intent(this, DetailActivity.class);
    intent.putExtra(DetailActivity.EXTRA_POSITION, position);
    startActivity(intent);
  }

}
