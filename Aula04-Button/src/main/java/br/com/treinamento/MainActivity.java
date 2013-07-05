package br.com.treinamento;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends Activity {

    private Button mButton;
    private ToggleButton mTgButton;
    private ImageButton mImgButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.main);

        mButton = (Button) findViewById(  R.id.btn_simple );
        mTgButton = (ToggleButton) findViewById(  R.id.btn_toggle );
        mImgButton = (ImageButton) findViewById(  R.id.btn_imgBtn );

    }

    public void onClick(View view){

        if( view.getId() == R.id.btn_simple ){

            Toast.makeText( this, "Button" + mButton.getId() , Toast.LENGTH_SHORT ).show();

        }else if( view.getId() == R.id.btn_toggle ){

            Toast.makeText( this, "Tootle Button" + mTgButton.getText() , Toast.LENGTH_SHORT ).show();

        }else if( view.getId() == R.id.btn_imgBtn ){

            Toast.makeText( this, "Image Button" + mImgButton.getId() , Toast.LENGTH_SHORT ).show();

        }

    }

}
