package coventry.project.chapter4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.Map;

public class CountryActivity extends AppCompatActivity {

    public static final String countries[] = {
            "Nepal","Kathmandu",
            "India","Delhi",
            "China","Bejing",
            "Japan","Tokyo",
            "Bhutan","Thimpu"
    };

    private Map<String,String> dictionary;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country);
        ListView Country = findViewById(R.id.Country);

        ArrayAdapter countryAdapter = new ArrayAdapter<>(
            this,
            android.R.layout.simple_list_item_1,
            countries
        );
        Country.setAdapter(countryAdapter);
    }
}
