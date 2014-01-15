package com.devmix.mars.rovers.test;

import android.test.ActivityInstrumentationTestCase2;
import android.test.UiThreadTest;
import android.widget.Button;
import android.widget.EditText;

import com.devmix.mars.rovers.MainActivity;
import com.devmix.mars.rovers.MainActivity.Rover;
import com.devmix.mars.rovers.R;

public class MainActivityUnitTest extends
		ActivityInstrumentationTestCase2<MainActivity> {

	EditText edSquareW;
	EditText edSquareH;
	EditText edRoverX;
	EditText edRoverY;
	EditText edRoverP;
	EditText edComando;
	Button btnBuildSquare;
	Button btnAddRover;
	Button btnRunCommand;

	public MainActivityUnitTest(Class<MainActivity> activityClass) {
		super(activityClass);
	}

	public MainActivityUnitTest() {
		super(MainActivity.class);
	}

	@Override
	protected void setUp() throws Exception {
		super.setUp();

		edSquareW = (EditText) getActivity().findViewById(R.id.edSquareW);
		edSquareH = (EditText) getActivity().findViewById(R.id.edSquareH);
		edRoverX = (EditText) getActivity().findViewById(R.id.edRoverX);
		edRoverY = (EditText) getActivity().findViewById(R.id.edRoverY);
		edRoverP = (EditText) getActivity().findViewById(R.id.edRoverP);
		edComando = (EditText) getActivity().findViewById(R.id.edComando);

		btnBuildSquare = (Button) getActivity().findViewById(
				R.id.btnBuildSquare);
		btnAddRover = (Button) getActivity().findViewById(R.id.btnAddRover);
		btnRunCommand = (Button) getActivity().findViewById(R.id.btnRunCommand);
	}

	@Override
	public void tearDown() throws Exception {
		super.tearDown();
	}

	@UiThreadTest
	public void testRovers() throws Exception {

		edSquareW.setText("5");
        edSquareH.setText("5");
        
        getActivity().btnBuildSquare_onClick(null);
        
        
        edRoverX.setText("1");
        edRoverY.setText("2");
        edRoverP.setText(String.valueOf(Rover.POSITION_NORTH));
        
        getActivity().btnAddRover_onClick(null);
        
        edComando.setText(new String(new char[] {
				MainActivity.leftRotate, MainActivity.move,
				MainActivity.leftRotate, MainActivity.move,
				MainActivity.leftRotate, MainActivity.move,
				MainActivity.leftRotate, MainActivity.move,
				MainActivity.move }));
        
        getActivity().btnRunCommand_onClick(null);
        
        edRoverX.setText("3");
        edRoverY.setText("3");
        edRoverP.setText(String.valueOf(Rover.POSITION_EAST));
        
        getActivity().btnAddRover_onClick(null);
        
        edComando.setText(new String(new char[] { MainActivity.move,
				MainActivity.move, MainActivity.rightRotate,
				MainActivity.move, MainActivity.move,
				MainActivity.rightRotate, MainActivity.move,
				MainActivity.rightRotate, MainActivity.rightRotate,
				MainActivity.move }));
        
        getActivity().btnRunCommand_onClick(null);
        
        
        /*getActivity().runOnUiThread(new Runnable() {
			public void run() {
				edSquareW.setText("5");
				edSquareH.setText("5");
			}
		});
	
		TouchUtils.clickView(this, btnBuildSquare);
	
		getActivity().runOnUiThread(new Runnable() {
			public void run() {
				edRoverX.setText("1");
				edRoverY.setText("2");
				edRoverP.setText(String.valueOf(Rover.POSITION_NORTH));
			}
		});
	
		TouchUtils.clickView(this, btnAddRover);
	
		getActivity().runOnUiThread(new Runnable() {
			public void run() {
				edComando.setText(new String(new char[] {
						MainActivity.leftRotate, MainActivity.move,
						MainActivity.leftRotate, MainActivity.move,
						MainActivity.leftRotate, MainActivity.move,
						MainActivity.leftRotate, MainActivity.move,
						MainActivity.move }));
			}
		});
	
		TouchUtils.clickView(this, btnRunCommand);
		
		getActivity().runOnUiThread(new Runnable() {
			public void run() {
				getActivity().exibeResultado();
			}
		});
	
		getActivity().runOnUiThread(new Runnable() {
			public void run() {
				edRoverX.setText("3");
				edRoverY.setText("3");
				edRoverP.setText(String.valueOf(Rover.POSITION_EAST));
			}
		});
	
		TouchUtils.clickView(this, btnAddRover);
	
		getActivity().runOnUiThread(new Runnable() {
			public void run() {
				edComando.setText(new String(new char[] { MainActivity.move,
						MainActivity.move, MainActivity.rightRotate,
						MainActivity.move, MainActivity.move,
						MainActivity.rightRotate, MainActivity.move,
						MainActivity.rightRotate, MainActivity.rightRotate,
						MainActivity.move }));
	
			}
		});
		
		TouchUtils.clickView(this, btnRunCommand);
		
		getActivity().runOnUiThread(new Runnable() {
			public void run() {
				getActivity().exibeResultado();
			}
		});*/
		
	}

}
