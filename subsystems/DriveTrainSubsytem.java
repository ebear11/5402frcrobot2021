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
