
/**
 * IMPORTANT: Add your package below. Package name can be found in the project's AndroidManifest.xml file.
 * This is the package name our example uses:
 *
 * package com.example.android.justjava;
 *
 */
package com.example.epcarter.justjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    int numOrdered=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        disPrice(numOrdered);
    }
    public void increase(View view) {
        display(true);
    }
    public void decrease(View view) {
        display(false);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(boolean increase) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        if(increase)
            numOrdered++;
        else
            numOrdered--;
        quantityTextView.setText("" + numOrdered);
    }
    private void disPrice(int number){
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText("$" + numOrdered*5);
    }
}
