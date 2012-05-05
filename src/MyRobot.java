import simbad.sim.*;
import javax.vecmath.Vector3d;

public class MyRobot extends Agent {

	//class member variables
	DifferentialKinematic kinematic; //kinematic model
	double vl=0.0; //speed in m/s on left wheel
	double vr=0.0; //speed in m/s on right wheel
	double cur_angle=0; //current angle in radians
	double L=0.6; //wheel base width in m.
	double h=0.05; //time between simulation steps in s. (50 ms)

	//Robot's constructor
	public MyRobot (Vector3d position, String name) {
		super(position,name);

		//Change kinematic model to differential drive kinematics
		kinematic = new DifferentialKinematic(L);
        	setKinematicModel(kinematic);
	}

	public void initBehavior() {}

	//Main loop
	public void performBehavior() {
		//L is wheel base width
		//vr - speed on right wheel, vl - speed on left wheel (in m/s)
		double v = (vr + vl) / 2.0; //linear speed
		double w = (vl - vr) / L; //angular speed


		kinematic.setWheelsVelocity(vl,vr); //use memeber variables vl, vr to set speed on both wheels
	}
}