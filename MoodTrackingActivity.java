public class MoodTrackingActivity extends AppCompatActivity {
    private RadioGroup radioGroupMood;
    private Button buttonSubmitMood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mood_tracking);

        radioGroupMood = findViewById(R.id.radioGroupMood);
        buttonSubmitMood = findViewById(R.id.buttonSubmitMood);

        buttonSubmitMood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get selected mood
                int selectedId = radioGroupMood.getCheckedRadioButtonId();
                RadioButton selectedRadioButton = findViewById(selectedId);
                String mood = selectedRadioButton.getText().toString();

                // Save mood to SharedPreferences or database
                saveMood(mood);

                // Optionally, navigate to next activity or perform other actions
            }
        });
    }

    private void saveMood(String mood) {
        // Implement logic to save mood data to SharedPreferences or database
    }
}
