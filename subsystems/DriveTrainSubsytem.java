<<<<<<< HEAD
package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
// TalonFX for our motors and ControlMode to use a percent for our motors
import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.ctre.phoenix.motorcontrol.ControlMode;
// Class name needs to be same as file 
public class DriveTrainSubsytem extends SubsystemBase {
  public DriveTrainSubsytem() {}
  private TalonFX BackLeft = new TalonFX(0);
  private TalonFX BackRight = new TalonFX(2);
  private TalonFX FrontLeft = new TalonFX(3);
  private TalonFX FrontRight = new TalonFX(1);
  // the drive function Gets 2 inputs to control the left and right motors
  public void drive(double leftJoystick, double rightJoystick) {
  BackLeft.set(ControlMode.PercentOutput, leftJoystick);
  FrontLeft.set(ControlMode.PercentOutput, leftJoystick);
  BackRight.set(ControlMode.PercentOutput, rightJoystick);  
  FrontRight.set(ControlMode.PercentOutput, rightJoystick);
}
  // sets robot to go straight left
  public void leftMec(){
    BackLeft.set(ControlMode.PercentOutput, -.1);
    FrontLeft.set(ControlMode.PercentOutput, .1);
    BackRight.set(ControlMode.PercentOutput, -.1);
    FrontRight.set(ControlMode.PercentOutput, .1);
  }
  // sets robot to go straight right
  public void rightMec(){
    BackLeft.set(ControlMode.PercentOutput, .1);
    FrontLeft.set(ControlMode.PercentOutput, -.1);
    BackRight.set(ControlMode.PercentOutput, .1);
    FrontRight.set(ControlMode.PercentOutput, -.1);
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
=======
package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.ctre.phoenix.motorcontrol.ControlMode;
public class DriveTrainSubsytem extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
  public DriveTrainSubsytem() {}
  private TalonFX BackLeft = new TalonFX(0);
  private TalonFX BackRight = new TalonFX(2);
  private TalonFX FrontLeft = new TalonFX(3);
  private TalonFX FrontRight = new TalonFX(1);
//@Override
  public void drive(double leftJoystick, double rightJoystick) {
  BackLeft.set(ControlMode.PercentOutput, leftJoystick);
  FrontLeft.set(ControlMode.PercentOutput, leftJoystick);
  BackRight.set(ControlMode.PercentOutput, rightJoystick);  
  FrontRight.set(ControlMode.PercentOutput, rightJoystick);
}
  public void leftMec(){
    BackLeft.set(ControlMode.PercentOutput, -.1);
    FrontLeft.set(ControlMode.PercentOutput, .1);
    BackRight.set(ControlMode.PercentOutput, -.1);
    FrontRight.set(ControlMode.PercentOutput, .1);
  }
  public void rightMec(){
    BackLeft.set(ControlMode.PercentOutput, .1);
    FrontLeft.set(ControlMode.PercentOutput, -.1);
    BackRight.set(ControlMode.PercentOutput, .1);
    FrontRight.set(ControlMode.PercentOutput, -.1);
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
>>>>>>> 7ae0e7ae39154a560722c9c474f8bb5cddfbe8a0
