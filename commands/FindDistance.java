<<<<<<< HEAD
package frc.robot.commands;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.TurretSubsystem;
import frc.robot.subsystems.DriveTrainSubsytem;
import frc.robot.Constants;
/** An example command that uses an example subsystem. */
public class FindDistance extends CommandBase {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private TurretSubsystem m_turretSubsystem;
  private DriveTrainSubsytem m_drivetrainSubsystem;


  /**
   * Creates a new ExampleCommand.
   *
   * @param subsystem The subsystem used by this command.
   */
  // requires drivetrain and turret subsystems
  public FindDistance(TurretSubsystem turretSubsystem, DriveTrainSubsytem drivetrainSubsystem) {
    m_turretSubsystem = turretSubsystem;
    m_drivetrainSubsystem = drivetrainSubsystem;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(turretSubsystem);
    addRequirements(drivetrainSubsystem);
  }
  @Override
  public void execute() {
    // sets distance the the value returned by the getlimelightdistance function found in turret subsystem
      double distance = m_turretSubsystem.getLimelightDistance();
    // sets x the the value returned by the getlimelightx function found in turret subsystem
      double x = m_turretSubsystem.getLimelightX();
      // posts X for debugging purposes
      System.out.println(x);
      // moves robot left or right based on x value of limelight to straigten it
      if (x > Constants.aimErrorTolerance) {
        System.out.println("moving right");
        m_drivetrainSubsystem.drive(.15, .15);
      }
      else if (x < -Constants.aimErrorTolerance){
        System.out.println("moving left");
        m_drivetrainSubsystem.drive(-.15, -.15);
      }

      // moves robot back or forward based on distance value 
      else if (distance > 160-Constants.distanceErrorTolerance) {
        System.out.println("forward");
        m_drivetrainSubsystem.drive(.15, -.15);
       }
      else if (distance < 160+Constants.distanceErrorTolerance) {
        System.out.println("backward");
        m_drivetrainSubsystem.drive(-.15, .15);
      }
    }
}

=======
package frc.robot.commands;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.TurretSubsystem;
import frc.robot.subsystems.DriveTrainSubsytem;
import frc.robot.Constants;
/** An example command that uses an example subsystem. */
public class FindDistance extends CommandBase {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private TurretSubsystem m_turretSubsystem;
  private DriveTrainSubsytem m_drivetrainSubsystem;


  /**
   * Creates a new ExampleCommand.
   *
   * @param subsystem The subsystem used by this command.
   */
  public FindDistance(TurretSubsystem turretSubsystem, DriveTrainSubsytem drivetrainSubsystem) {
    m_turretSubsystem = turretSubsystem;
    m_drivetrainSubsystem = drivetrainSubsystem;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(turretSubsystem);
    addRequirements(drivetrainSubsystem);
  }
  @Override
  public void execute() {
      double distance = m_turretSubsystem.getLimelightDistance();
      double x = m_turretSubsystem.getLimelightX();
      System.out.println(x);
      if (x > Constants.aimErrorTolerance) {
        System.out.println("moving right");
        m_drivetrainSubsystem.drive(.15, .15);
      }
      else if (x < -Constants.aimErrorTolerance){
        System.out.println("moving left");
        m_drivetrainSubsystem.drive(-.15, -.15);
      }
      else if (distance > 160-Constants.distanceErrorTolerance) {
        System.out.println("forward");
        m_drivetrainSubsystem.drive(.15, -.15);
       }
      else if (distance < 160+Constants.distanceErrorTolerance) {
        System.out.println("backward");
        m_drivetrainSubsystem.drive(-.15, .15);
      }
    }
}

>>>>>>> 7ae0e7ae39154a560722c9c474f8bb5cddfbe8a0
