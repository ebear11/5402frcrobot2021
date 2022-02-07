package frc.robot.subsystems;
import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
public class TurretSubsystem extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
  public TurretSubsystem() {}
  // gets distance from object
  // returns distance value
  public double getLimelightDistance(){
    // gets networktable values from limelight
    NetworkTable table = NetworkTableInstance.getDefault().getTable("limelight");
    NetworkTableEntry ty = table.getEntry("ty");
    // gets y value from limelight
    double y = ty.getDouble(0);
    // uses equation to estimate distance 
    // d = (h2-h1) / tan(a1+a2)
    double last_part = Math.tan(Math.toRadians(46) + Math.toRadians(y));
    double distance = 94/last_part;
    // prints distance for debugging purposes
    System.out.println(distance);
    //h1 6 inch
    // A1 46 degrees
    // H2 100 inches
    return distance;
  }
  // gets limelight x 
  // returns x value
  public double getLimelightX(){
    NetworkTable table = NetworkTableInstance.getDefault().getTable("limelight");
    NetworkTableEntry tx = table.getEntry("tx");
    double x = tx.getDouble(0);
    return x;
  }
}
